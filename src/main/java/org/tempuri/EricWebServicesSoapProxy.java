package org.tempuri;

public class EricWebServicesSoapProxy implements org.tempuri.EricWebServicesSoap {
  private String _endpoint = null;
  private org.tempuri.EricWebServicesSoap ericWebServicesSoap = null;
  
  public EricWebServicesSoapProxy() {
    _initEricWebServicesSoapProxy();
  }
  
  public EricWebServicesSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initEricWebServicesSoapProxy();
  }
  
  private void _initEricWebServicesSoapProxy() {
    try {
      ericWebServicesSoap = (new org.tempuri.EricWebServicesLocator()).getEricWebServicesSoap();
      if (ericWebServicesSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)ericWebServicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)ericWebServicesSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (ericWebServicesSoap != null)
      ((javax.xml.rpc.Stub)ericWebServicesSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.EricWebServicesSoap getEricWebServicesSoap() {
    if (ericWebServicesSoap == null)
      _initEricWebServicesSoapProxy();
    return ericWebServicesSoap;
  }
  
  public java.lang.String insertIntoTempEMR(org.tempuri.EmrClass myClass) throws java.rmi.RemoteException{
    if (ericWebServicesSoap == null)
      _initEricWebServicesSoapProxy();
    return ericWebServicesSoap.insertIntoTempEMR(myClass);
  }
  
  public java.lang.String sendMail(org.tempuri.SendMailClass myClass) throws java.rmi.RemoteException{
    if (ericWebServicesSoap == null)
      _initEricWebServicesSoapProxy();
    return ericWebServicesSoap.sendMail(myClass);
  }
  
  public java.lang.String sendSMS(org.tempuri.SendSMSClass myClass) throws java.rmi.RemoteException{
    if (ericWebServicesSoap == null)
      _initEricWebServicesSoapProxy();
    return ericWebServicesSoap.sendSMS(myClass);
  }
  
  
}