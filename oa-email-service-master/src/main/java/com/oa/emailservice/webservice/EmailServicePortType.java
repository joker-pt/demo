/**
 * EmailServicePortType.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oa.emailservice.webservice;
import javax.jws.WebService;

@WebService(targetNamespace = "webservice.email.weaver.com.cn")
public interface EmailServicePortType extends java.rmi.Remote {


    /**
     *
     * @param in0 发件人工号。发件人只有一个。必填。
     * @param in1 收件人工号，可以多个，逗号隔开。必填。
     * @param in2 抄送人工号，可以多个，逗号隔开，选填。
     * @param in3 密送人工号，可以多个，逗号隔开，选填。
     * @param in4 邮件标题，必填。
     * @param in5 邮件内容，选填。
     * @param in6 paths是附件数组。每个附件填写全路径，包含文件名。注意附件为OA服务器可访问的实体文件。
     * @return
     * @throws java.rmi.RemoteException
     */
    public String sendInternalMail(String in0,
                                   String in1,
                                   String in2,
                                   String in3,
                                   String in4,
                                   String in5,
                                   String in6) throws java.rmi.RemoteException;
}
