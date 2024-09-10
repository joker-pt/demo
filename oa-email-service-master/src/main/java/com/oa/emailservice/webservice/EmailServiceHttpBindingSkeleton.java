/**
 * EmailServiceHttpBindingSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.oa.emailservice.webservice;

public class EmailServiceHttpBindingSkeleton implements EmailServicePortType, org.apache.axis.wsdl.Skeleton {
    private EmailServicePortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "in0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "in1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "in2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "in3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "in4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "in5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "in6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false),
        };
        _oper = new org.apache.axis.description.OperationDesc("sendInternalMail", _params, new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "out"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        _oper.setElementQName(new javax.xml.namespace.QName("webservice.email.weaver.com.cn", "sendInternalMail"));
        _oper.setSoapAction("");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sendInternalMail") == null) {
            _myOperations.put("sendInternalMail", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sendInternalMail")).add(_oper);
    }

    public EmailServiceHttpBindingSkeleton() {
        this.impl = new EmailServiceHttpBindingImpl();
    }

    public EmailServiceHttpBindingSkeleton(EmailServicePortType impl) {
        this.impl = impl;
    }
    public String sendInternalMail(String in0, String in1, String in2, String in3, String in4, String in5, String in6) throws java.rmi.RemoteException
    {
        String ret = impl.sendInternalMail(in0, in1, in2, in3, in4, in5, in6);
        return ret;
    }

}
