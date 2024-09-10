package com.oa.emailservice.comm;

/**
 * @author jayson
 * @version 2.0
 * @date 2020-07-10 17:15
 */
public class ConstantCodes {

    public static final String REQUEST_OA_IP = "http://localhost:8080";


    public static String getRequestServiceAddress() {

        return REQUEST_OA_IP + "/services/EmailService";
    }


    public static String getRequestWsdlAddress() {

        return REQUEST_OA_IP + "/services/EmailService?wsdl";
    }


}
