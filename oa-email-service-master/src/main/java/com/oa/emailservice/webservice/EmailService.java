/**
 * EmailService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oa.emailservice.webservice;

public interface EmailService extends javax.xml.rpc.Service {
    public String getEmailServiceHttpPortAddress();

    public EmailServicePortType getEmailServiceHttpPort() throws javax.xml.rpc.ServiceException;

    public EmailServicePortType getEmailServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
