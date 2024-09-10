package com.oa.emailservice.config;


import com.oa.emailservice.comm.ConstantCodes;
import com.oa.emailservice.webservice.EmailServicePortType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author jayson
 * @version 2.0
 * @date 2021-07-07 18:46
 */

@Configuration
public class EmailServicePortTypeConfiguration {

    @Bean
    EmailServicePortType initEmailServicePortType() {

        //创建WSDL的URL，注意不是服务地址
        URL url = null;
        try {
            url = new URL(ConstantCodes.getRequestWsdlAddress());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        QName qname = new QName("webservice.email.weaver.com.cn", "EmailService");

        javax.xml.ws.Service service = javax.xml.ws.Service.create(url, qname);
        EmailServicePortType emailServicePortType = service.getPort(EmailServicePortType.class);
        return emailServicePortType;
    }
}
