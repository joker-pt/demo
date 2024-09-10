/**
 * EmailServiceHttpBindingImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oa.emailservice.webservice;

public class EmailServiceHttpBindingImpl implements EmailServicePortType{
    private EmailServicePortType impl;

    public EmailServiceHttpBindingImpl() {
        this.impl = new EmailServiceHttpBindingImpl();
    }

    public String sendInternalMail(String in0, String in1, String in2, String in3, String in4, String in5, String in6) throws java.rmi.RemoteException {
        String ret = impl.sendInternalMail(in0, in1, in2, in3, in4, in5, in6);
        return ret;
    }

}
