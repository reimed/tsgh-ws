/**
 * EricWebServicesSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface EricWebServicesSoap extends java.rmi.Remote {
    public java.lang.String insertIntoTempEMR(org.tempuri.EmrClass myClass) throws java.rmi.RemoteException;
    public java.lang.String sendMail(org.tempuri.SendMailClass myClass) throws java.rmi.RemoteException;
    public java.lang.String sendSMS(org.tempuri.SendSMSClass myClass) throws java.rmi.RemoteException;
}
