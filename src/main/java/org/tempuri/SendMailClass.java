/**
 * SendMailClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SendMailClass  implements java.io.Serializable {
    private java.lang.String senderAccount;

    private java.lang.String senderPassword;

    private java.lang.String reciverAddr;

    private java.lang.String subject;

    private java.lang.String msg;

    private java.lang.String mailServer;

    private java.lang.String CCAddr;

    public SendMailClass() {
    }

    public SendMailClass(
           java.lang.String senderAccount,
           java.lang.String senderPassword,
           java.lang.String reciverAddr,
           java.lang.String subject,
           java.lang.String msg,
           java.lang.String mailServer,
           java.lang.String CCAddr) {
           this.senderAccount = senderAccount;
           this.senderPassword = senderPassword;
           this.reciverAddr = reciverAddr;
           this.subject = subject;
           this.msg = msg;
           this.mailServer = mailServer;
           this.CCAddr = CCAddr;
    }


    /**
     * Gets the senderAccount value for this SendMailClass.
     * 
     * @return senderAccount
     */
    public java.lang.String getSenderAccount() {
        return senderAccount;
    }


    /**
     * Sets the senderAccount value for this SendMailClass.
     * 
     * @param senderAccount
     */
    public void setSenderAccount(java.lang.String senderAccount) {
        this.senderAccount = senderAccount;
    }


    /**
     * Gets the senderPassword value for this SendMailClass.
     * 
     * @return senderPassword
     */
    public java.lang.String getSenderPassword() {
        return senderPassword;
    }


    /**
     * Sets the senderPassword value for this SendMailClass.
     * 
     * @param senderPassword
     */
    public void setSenderPassword(java.lang.String senderPassword) {
        this.senderPassword = senderPassword;
    }


    /**
     * Gets the reciverAddr value for this SendMailClass.
     * 
     * @return reciverAddr
     */
    public java.lang.String getReciverAddr() {
        return reciverAddr;
    }


    /**
     * Sets the reciverAddr value for this SendMailClass.
     * 
     * @param reciverAddr
     */
    public void setReciverAddr(java.lang.String reciverAddr) {
        this.reciverAddr = reciverAddr;
    }


    /**
     * Gets the subject value for this SendMailClass.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this SendMailClass.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the msg value for this SendMailClass.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this SendMailClass.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }


    /**
     * Gets the mailServer value for this SendMailClass.
     * 
     * @return mailServer
     */
    public java.lang.String getMailServer() {
        return mailServer;
    }


    /**
     * Sets the mailServer value for this SendMailClass.
     * 
     * @param mailServer
     */
    public void setMailServer(java.lang.String mailServer) {
        this.mailServer = mailServer;
    }


    /**
     * Gets the CCAddr value for this SendMailClass.
     * 
     * @return CCAddr
     */
    public java.lang.String getCCAddr() {
        return CCAddr;
    }


    /**
     * Sets the CCAddr value for this SendMailClass.
     * 
     * @param CCAddr
     */
    public void setCCAddr(java.lang.String CCAddr) {
        this.CCAddr = CCAddr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendMailClass)) return false;
        SendMailClass other = (SendMailClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.senderAccount==null && other.getSenderAccount()==null) || 
             (this.senderAccount!=null &&
              this.senderAccount.equals(other.getSenderAccount()))) &&
            ((this.senderPassword==null && other.getSenderPassword()==null) || 
             (this.senderPassword!=null &&
              this.senderPassword.equals(other.getSenderPassword()))) &&
            ((this.reciverAddr==null && other.getReciverAddr()==null) || 
             (this.reciverAddr!=null &&
              this.reciverAddr.equals(other.getReciverAddr()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg()))) &&
            ((this.mailServer==null && other.getMailServer()==null) || 
             (this.mailServer!=null &&
              this.mailServer.equals(other.getMailServer()))) &&
            ((this.CCAddr==null && other.getCCAddr()==null) || 
             (this.CCAddr!=null &&
              this.CCAddr.equals(other.getCCAddr())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getSenderAccount() != null) {
            _hashCode += getSenderAccount().hashCode();
        }
        if (getSenderPassword() != null) {
            _hashCode += getSenderPassword().hashCode();
        }
        if (getReciverAddr() != null) {
            _hashCode += getReciverAddr().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        if (getMailServer() != null) {
            _hashCode += getMailServer().hashCode();
        }
        if (getCCAddr() != null) {
            _hashCode += getCCAddr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendMailClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SendMailClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("senderPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SenderPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reciverAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReciverAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Msg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailServer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MailServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CCAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CCAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
