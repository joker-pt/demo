package com.oa.emailservice.controller;

import com.oa.emailservice.comm.ConstantCodes;
import com.oa.emailservice.webservice.EmailServicePortType;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Random;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-03 9:35
 */
public class TestController {


    public static void main(String[] args) {

        String fromid = "GY004163";
        String toids = "GY006089@gy.com";
        String ccids = "";
        String bccids = "";
        Random random = new Random();
        String subject = "999944514519测试发起OA内部邮件" + random.nextInt(100);
        String content = "收到请回复";
        //String paths = "Z:\\Emailsendfiles\\XRW-173.jpg";

        String paths = "C:\\Users\\Administrator\\Desktop\\testImg\\homepage.png";

        //创建WSDL的URL，注意不是服务地址
        URL url = null;
        try {
            url = new URL(ConstantCodes.getRequestWsdlAddress());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        QName qname = new QName("webservice.email.weaver.com.cn", "EmailService");

        Service service = Service.create(url, qname);
        EmailServicePortType emailServicePortType = service.getPort(EmailServicePortType.class);
        //调用查询方法
        try {

            if(paths==null){
                paths=",";
            }


            String s = emailServicePortType.sendInternalMail(fromid,
                    toids,
                    ccids,
                    bccids,
                    subject,
                    content, paths);
            System.out.println("result:" + s);
            System.out.println("subject:" + subject);
        } catch (RemoteException e) {


        }

    }
}
