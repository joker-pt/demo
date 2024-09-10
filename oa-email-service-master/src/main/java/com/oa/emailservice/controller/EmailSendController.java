package com.oa.emailservice.controller;


import com.oa.emailservice.annotation.OperationLog;
import com.oa.emailservice.comm.AjaxResult;
import com.oa.emailservice.entity.CopyPOJO;
import com.oa.emailservice.entity.ParamDTO;
import com.oa.emailservice.service.EmailSendService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 16:32
 */
@Slf4j
@RestController
@RequestMapping(value = "/")
public class EmailSendController {

    @Autowired
    private EmailSendService emailSendService;

    @OperationLog
    @ApiOperation(value = "发送邮件", httpMethod = "POST")
    @PostMapping(value = "/sendEmail", consumes = "application/json", produces = "application/json;charset=UTF-8")
    public AjaxResult sendEmail(@RequestBody ParamDTO paramDTO) {

        log.info("开始发送邮件【sendEmail】：" + paramDTO.toString());
        List<String> results = emailSendService.sendEmailLong(paramDTO);
        return new AjaxResult().success(results);

    }

    @OperationLog
    @ApiOperation(value = "复制文件", httpMethod = "POST")
    @PostMapping(value = "/copyFile", consumes = "application/json", produces = "application/json;charset=UTF-8")
    public AjaxResult copyFile(@RequestBody CopyPOJO copyPOJO) {


        log.info("开始复制文件【copyFile】：" + copyPOJO.toString());
        if (copyPOJO.getOldPath() == null) {

            return new AjaxResult().error("原共享文件目录地址必填(参数名称：【oldPath】)，示例参数值:【Z:\\Emailsendfiles\\客户应回款报表\\2021-07-07】");

        }
        if (copyPOJO.getNewPath() == null) {
            return new AjaxResult().error("新的本地目录地址必填(参数名称：【newPath】)，示例参数值:【D:\\Emailsendfiles\\客户应回款报表\\2021-07-07】");

        }

        Integer copy = emailSendService.copy(copyPOJO);
        return new AjaxResult().success(copy);

    }

    @PostMapping(value = "/sendEmailLong", consumes = "application/json", produces = "application/json;charset=UTF-8")
    public AjaxResult sendEmailLong(@RequestBody ParamDTO paramDTO) {
        log.info("开始发送邮件【sendEmailLong】：" + paramDTO.toString());
        List<String> results = emailSendService.sendEmailLong(paramDTO);
        return new AjaxResult().success(results);

    }
}
