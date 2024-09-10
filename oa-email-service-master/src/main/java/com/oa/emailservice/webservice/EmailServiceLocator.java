/**
 * EmailServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oa.emailservice.webservice;

import com.oa.emailservice.comm.ConstantCodes;

public class EmailServiceLocator extends org.apache.axis.client.Service implements EmailService {

    public EmailServiceLocator() {
    }


    public EmailServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EmailServiceLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EmailServiceHttpPort
    private String EmailServiceHttpPort_address = ConstantCodes.getRequestServiceAddress();

    public String getEmailServiceHttpPortAddress() {
        return EmailServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private String EmailServiceHttpPortWSDDServiceName = "EmailServiceHttpPort";

    public String getEmailServiceHttpPortWSDDServiceName() {
        return EmailServiceHttpPortWSDDServiceName;
    }

    public void setEmailServiceHttpPortWSDDServiceName(String name) {
        EmailServiceHttpPortWSDDServiceName = name;
    }

    public EmailServicePortType getEmailServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EmailServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEmailServiceHttpPort(endpoint);
    }

    public EmailServicePortType getEmailServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            EmailServiceHttpBindingStub _stub = new EmailServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getEmailServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEmailServiceHttpPortEndpointAddress(String address) {
        EmailServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (EmailServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                EmailServiceHttpBindingStub _stub = new EmailServiceHttpBindingStub(new java.net.URL(EmailServiceHttpPort_address), this);
                _stub.setPortName(getEmailServiceHttpPortWSDDServiceName());
                return _stub;
            }
        }
        catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("EmailServiceHttpPort".equals(inputPortName)) {
            return getEmailServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "EmailService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "EmailServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {
        
if ("EmailServiceHttpPort".equals(portName)) {
            setEmailServiceHttpPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
