/**
 * EricWebServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface EricWebServices extends javax.xml.rpc.Service {
    public java.lang.String getEricWebServicesSoapAddress();

    public org.tempuri.EricWebServicesSoap getEricWebServicesSoap() throws javax.xml.rpc.ServiceException;

    public org.tempuri.EricWebServicesSoap getEricWebServicesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
