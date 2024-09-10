package com.oa.emailservice.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.oa.emailservice.entity.CopyPOJO;
import com.oa.emailservice.entity.EmailEntity;
import com.oa.emailservice.entity.ParamDTO;
import com.oa.emailservice.mapper.CommonMapper;
import com.oa.emailservice.service.EmailSendService;
import com.oa.emailservice.webservice.EmailServicePortType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.rmi.RemoteException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 16:43
 */

@Service
public class EmailSendServiceImpl implements EmailSendService {
    private final static Logger logger = LoggerFactory.getLogger(EmailSendService.class);

    @Resource
    private CommonMapper commonMapper;
    @Autowired
    private EmailServicePortType emailServicePortType;

    /**
     * {
     * "moduleId":1,
     * "sendEmpNo":"GY004163",
     * "subject":"客户应回款报表",
     * "content":"暂无内容",
     * "dateDir":"2021-07-07"
     * }
     *
     * @param paramDTO
     * @return
     */
    @Override
    public List<String> sendEmail(ParamDTO paramDTO) {

        List<EmailEntity> eMailInfo = commonMapper.getEMailInfo(paramDTO.getDateDir(), paramDTO.getModuleId());

        List<String> results = sendEmailToOa(eMailInfo, paramDTO);

        return results;
    }

    @Override
    public Integer copy(CopyPOJO copyPOJO) {
        copyFolder(copyPOJO.getOldPath(), copyPOJO.getNewPath());
        return 1;
    }

    /**
     * 复制整个文件夹内容
     *
     * @param oldPath String 原文件路径 如：c:/fqf
     * @param newPath String 复制后路径 如：f:/fqf/ff
     * @return boolean
     */
    public void copyFolder(String oldPath, String newPath) {

        try {
            (new File(newPath)).mkdirs(); //如果文件夹不存在 则建立新文件夹
            File a = new File(oldPath);
            String[] file = a.list();
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }

                if (temp.isFile()) {
                    FileInputStream input = new FileInputStream(temp);
                    FileOutputStream output = new FileOutputStream(newPath + "/" +
                            (temp.getName()).toString());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();
                }
                if (temp.isDirectory()) {//如果是子文件夹
                    copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
                }
            }
        } catch (Exception e) {
            logger.error("复制整个文件夹内容操作出错");
            e.printStackTrace();

        }

    }

    @Override
    public List<String> sendEmailLong(ParamDTO paramDTO) {

        List<EmailEntity> eMailInfo = commonMapper.getEMailInfoLong(paramDTO.getDateDir(), paramDTO.getModuleId());
        List<EmailEntity> newEmail = new ArrayList<>();
        eMailInfo.forEach(a -> {

            if (a.getIsAttach()==1 && a.getFilePath() != null) {

                File file = new File(a.getFilePath());
                if (file.exists()) {
                    newEmail.add(a);
                }

            }
            if(a.getIsAttach()==0){
                newEmail.add(a);
            }

        });

        Map<String, List<EmailEntity>> collect = newEmail.stream().collect(
                Collectors.groupingBy(email -> email.getToEmpNo()));

        List<EmailEntity> sendEmail = new ArrayList<>();
        for (String key : collect.keySet()) {

            Object obj2 = JSONArray.toJSON(collect.get(key));
            String json2 = obj2.toString();
            logger.info("key:" + key + " " + "Value:" + json2);

            StringJoiner joiner = new StringJoiner(",");
            List<EmailEntity> emailEntities = collect.get(key);

            if (emailEntities.size() == 0) {
                logger.error("发送列表为空：emailEntities.size()==0");
                throw new NullPointerException("发送列表为空：emailEntities.size()==0");

            }

            emailEntities.forEach(a -> {

                joiner.add(a.getFilePath());

            });

            EmailEntity email = new EmailEntity();
            email.setToEmpNo(key);
            email.setCcEmpNos(emailEntities.get(0).getCcEmpNos());
            email.setBccEmpNos(emailEntities.get(0).getBccEmpNos());
            email.setModuleName(emailEntities.get(0).getModuleName());
            email.setModuleId(emailEntities.get(0).getModuleId());
            email.setIsAttach(emailEntities.get(0).getIsAttach());
            email.setFilePath(joiner.toString());
            sendEmail.add(email);

        }

        List<String> results = sendEmailToOa(sendEmail, paramDTO);
        return results;
    }

    private List<String> sendEmailToOa(List<EmailEntity> sendEmail, ParamDTO paramDTO) {
        logger.info("时间：" + new Date() + ",参数：" + paramDTO.toString());

        List<String> results = new ArrayList<>();
        sendEmail.forEach(send -> {

            String title = paramDTO.getSubject();
            String content = paramDTO.getContent();
            if (title == null || "null".equals(title)) {

                title = send.getModuleName();

            }

            if (content == null || "null".equals(content)) {

                content = "";

            }

            String filePath = send.getFilePath();
            if (send.getIsAttach() == null || send.getIsAttach() == 0) {

                filePath = ",";

            }


            try {
                String s = emailServicePortType.sendInternalMail(
                        paramDTO.getSendEmpNo(),
                        send.getToEmpNo(),
                        send.getCcEmpNos(),
                        send.getBccEmpNos(),
                        title,
                        content,
                        filePath);
                results.add(s);
            } catch (RemoteException e) {
                logger.error(e.getMessage());
                e.printStackTrace();
            }

        });
        return results;


    }


}
