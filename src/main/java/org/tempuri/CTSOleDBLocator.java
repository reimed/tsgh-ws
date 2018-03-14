/**
 * CTSOleDBLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CTSOleDBLocator extends org.apache.axis.client.Service implements org.tempuri.CTSOleDB {

    public CTSOleDBLocator() {
    }


    public CTSOleDBLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CTSOleDBLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CTSOleDBSoap
    private java.lang.String CTSOleDBSoap_address = "http://10.200.1.79/TsghSQL2008_ASE_Outsourcing/TSOleDB.asmx";

    public java.lang.String getCTSOleDBSoapAddress() {
        return CTSOleDBSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CTSOleDBSoapWSDDServiceName = "CTSOleDBSoap";

    public java.lang.String getCTSOleDBSoapWSDDServiceName() {
        return CTSOleDBSoapWSDDServiceName;
    }

    public void setCTSOleDBSoapWSDDServiceName(java.lang.String name) {
        CTSOleDBSoapWSDDServiceName = name;
    }

    public org.tempuri.CTSOleDBSoap getCTSOleDBSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CTSOleDBSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCTSOleDBSoap(endpoint);
    }

    public org.tempuri.CTSOleDBSoap getCTSOleDBSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.CTSOleDBSoapStub _stub = new org.tempuri.CTSOleDBSoapStub(portAddress, this);
            _stub.setPortName(getCTSOleDBSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCTSOleDBSoapEndpointAddress(java.lang.String address) {
        CTSOleDBSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.CTSOleDBSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.CTSOleDBSoapStub _stub = new org.tempuri.CTSOleDBSoapStub(new java.net.URL(CTSOleDBSoap_address), this);
                _stub.setPortName(getCTSOleDBSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CTSOleDBSoap".equals(inputPortName)) {
            return getCTSOleDBSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "CTSOleDB");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "CTSOleDBSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CTSOleDBSoap".equals(portName)) {
            setCTSOleDBSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
