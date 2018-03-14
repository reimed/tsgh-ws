/**
 * DeleteCRCTabooDrug.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class DeleteCRCTabooDrug  implements java.io.Serializable {
    private java.lang.String CNO;

    private java.lang.String INDATE;

    private java.lang.String OUTDATE;

    private java.lang.String ORDERCODE;

    private java.lang.String user;

    private java.lang.String passwd;

    public DeleteCRCTabooDrug() {
    }

    public DeleteCRCTabooDrug(
           java.lang.String CNO,
           java.lang.String INDATE,
           java.lang.String OUTDATE,
           java.lang.String ORDERCODE,
           java.lang.String user,
           java.lang.String passwd) {
           this.CNO = CNO;
           this.INDATE = INDATE;
           this.OUTDATE = OUTDATE;
           this.ORDERCODE = ORDERCODE;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the CNO value for this DeleteCRCTabooDrug.
     * 
     * @return CNO
     */
    public java.lang.String getCNO() {
        return CNO;
    }


    /**
     * Sets the CNO value for this DeleteCRCTabooDrug.
     * 
     * @param CNO
     */
    public void setCNO(java.lang.String CNO) {
        this.CNO = CNO;
    }


    /**
     * Gets the INDATE value for this DeleteCRCTabooDrug.
     * 
     * @return INDATE
     */
    public java.lang.String getINDATE() {
        return INDATE;
    }


    /**
     * Sets the INDATE value for this DeleteCRCTabooDrug.
     * 
     * @param INDATE
     */
    public void setINDATE(java.lang.String INDATE) {
        this.INDATE = INDATE;
    }


    /**
     * Gets the OUTDATE value for this DeleteCRCTabooDrug.
     * 
     * @return OUTDATE
     */
    public java.lang.String getOUTDATE() {
        return OUTDATE;
    }


    /**
     * Sets the OUTDATE value for this DeleteCRCTabooDrug.
     * 
     * @param OUTDATE
     */
    public void setOUTDATE(java.lang.String OUTDATE) {
        this.OUTDATE = OUTDATE;
    }


    /**
     * Gets the ORDERCODE value for this DeleteCRCTabooDrug.
     * 
     * @return ORDERCODE
     */
    public java.lang.String getORDERCODE() {
        return ORDERCODE;
    }


    /**
     * Sets the ORDERCODE value for this DeleteCRCTabooDrug.
     * 
     * @param ORDERCODE
     */
    public void setORDERCODE(java.lang.String ORDERCODE) {
        this.ORDERCODE = ORDERCODE;
    }


    /**
     * Gets the user value for this DeleteCRCTabooDrug.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this DeleteCRCTabooDrug.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this DeleteCRCTabooDrug.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this DeleteCRCTabooDrug.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DeleteCRCTabooDrug)) return false;
        DeleteCRCTabooDrug other = (DeleteCRCTabooDrug) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CNO==null && other.getCNO()==null) || 
             (this.CNO!=null &&
              this.CNO.equals(other.getCNO()))) &&
            ((this.INDATE==null && other.getINDATE()==null) || 
             (this.INDATE!=null &&
              this.INDATE.equals(other.getINDATE()))) &&
            ((this.OUTDATE==null && other.getOUTDATE()==null) || 
             (this.OUTDATE!=null &&
              this.OUTDATE.equals(other.getOUTDATE()))) &&
            ((this.ORDERCODE==null && other.getORDERCODE()==null) || 
             (this.ORDERCODE!=null &&
              this.ORDERCODE.equals(other.getORDERCODE()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.passwd==null && other.getPasswd()==null) || 
             (this.passwd!=null &&
              this.passwd.equals(other.getPasswd())));
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
        if (getCNO() != null) {
            _hashCode += getCNO().hashCode();
        }
        if (getINDATE() != null) {
            _hashCode += getINDATE().hashCode();
        }
        if (getOUTDATE() != null) {
            _hashCode += getOUTDATE().hashCode();
        }
        if (getORDERCODE() != null) {
            _hashCode += getORDERCODE().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getPasswd() != null) {
            _hashCode += getPasswd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DeleteCRCTabooDrug.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCRCTabooDrug"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("INDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "INDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OUTDATE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OUTDATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORDERCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ORDERCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"));
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
