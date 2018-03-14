/**
 * Query_IPD_PT_LIST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_IPD_PT_LIST  implements java.io.Serializable {
    private java.lang.String NRCODE;

    private java.lang.String CHARTNO;

    private java.lang.String VSDR;

    private java.lang.String yyyMMddINDATETIME1;

    private java.lang.String yyyMMddINDATETIME2;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_IPD_PT_LIST() {
    }

    public Query_IPD_PT_LIST(
           java.lang.String NRCODE,
           java.lang.String CHARTNO,
           java.lang.String VSDR,
           java.lang.String yyyMMddINDATETIME1,
           java.lang.String yyyMMddINDATETIME2,
           java.lang.String user,
           java.lang.String passwd) {
           this.NRCODE = NRCODE;
           this.CHARTNO = CHARTNO;
           this.VSDR = VSDR;
           this.yyyMMddINDATETIME1 = yyyMMddINDATETIME1;
           this.yyyMMddINDATETIME2 = yyyMMddINDATETIME2;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the NRCODE value for this Query_IPD_PT_LIST.
     * 
     * @return NRCODE
     */
    public java.lang.String getNRCODE() {
        return NRCODE;
    }


    /**
     * Sets the NRCODE value for this Query_IPD_PT_LIST.
     * 
     * @param NRCODE
     */
    public void setNRCODE(java.lang.String NRCODE) {
        this.NRCODE = NRCODE;
    }


    /**
     * Gets the CHARTNO value for this Query_IPD_PT_LIST.
     * 
     * @return CHARTNO
     */
    public java.lang.String getCHARTNO() {
        return CHARTNO;
    }


    /**
     * Sets the CHARTNO value for this Query_IPD_PT_LIST.
     * 
     * @param CHARTNO
     */
    public void setCHARTNO(java.lang.String CHARTNO) {
        this.CHARTNO = CHARTNO;
    }


    /**
     * Gets the VSDR value for this Query_IPD_PT_LIST.
     * 
     * @return VSDR
     */
    public java.lang.String getVSDR() {
        return VSDR;
    }


    /**
     * Sets the VSDR value for this Query_IPD_PT_LIST.
     * 
     * @param VSDR
     */
    public void setVSDR(java.lang.String VSDR) {
        this.VSDR = VSDR;
    }


    /**
     * Gets the yyyMMddINDATETIME1 value for this Query_IPD_PT_LIST.
     * 
     * @return yyyMMddINDATETIME1
     */
    public java.lang.String getYyyMMddINDATETIME1() {
        return yyyMMddINDATETIME1;
    }


    /**
     * Sets the yyyMMddINDATETIME1 value for this Query_IPD_PT_LIST.
     * 
     * @param yyyMMddINDATETIME1
     */
    public void setYyyMMddINDATETIME1(java.lang.String yyyMMddINDATETIME1) {
        this.yyyMMddINDATETIME1 = yyyMMddINDATETIME1;
    }


    /**
     * Gets the yyyMMddINDATETIME2 value for this Query_IPD_PT_LIST.
     * 
     * @return yyyMMddINDATETIME2
     */
    public java.lang.String getYyyMMddINDATETIME2() {
        return yyyMMddINDATETIME2;
    }


    /**
     * Sets the yyyMMddINDATETIME2 value for this Query_IPD_PT_LIST.
     * 
     * @param yyyMMddINDATETIME2
     */
    public void setYyyMMddINDATETIME2(java.lang.String yyyMMddINDATETIME2) {
        this.yyyMMddINDATETIME2 = yyyMMddINDATETIME2;
    }


    /**
     * Gets the user value for this Query_IPD_PT_LIST.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_IPD_PT_LIST.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_IPD_PT_LIST.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_IPD_PT_LIST.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_IPD_PT_LIST)) return false;
        Query_IPD_PT_LIST other = (Query_IPD_PT_LIST) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NRCODE==null && other.getNRCODE()==null) || 
             (this.NRCODE!=null &&
              this.NRCODE.equals(other.getNRCODE()))) &&
            ((this.CHARTNO==null && other.getCHARTNO()==null) || 
             (this.CHARTNO!=null &&
              this.CHARTNO.equals(other.getCHARTNO()))) &&
            ((this.VSDR==null && other.getVSDR()==null) || 
             (this.VSDR!=null &&
              this.VSDR.equals(other.getVSDR()))) &&
            ((this.yyyMMddINDATETIME1==null && other.getYyyMMddINDATETIME1()==null) || 
             (this.yyyMMddINDATETIME1!=null &&
              this.yyyMMddINDATETIME1.equals(other.getYyyMMddINDATETIME1()))) &&
            ((this.yyyMMddINDATETIME2==null && other.getYyyMMddINDATETIME2()==null) || 
             (this.yyyMMddINDATETIME2!=null &&
              this.yyyMMddINDATETIME2.equals(other.getYyyMMddINDATETIME2()))) &&
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
        if (getNRCODE() != null) {
            _hashCode += getNRCODE().hashCode();
        }
        if (getCHARTNO() != null) {
            _hashCode += getCHARTNO().hashCode();
        }
        if (getVSDR() != null) {
            _hashCode += getVSDR().hashCode();
        }
        if (getYyyMMddINDATETIME1() != null) {
            _hashCode += getYyyMMddINDATETIME1().hashCode();
        }
        if (getYyyMMddINDATETIME2() != null) {
            _hashCode += getYyyMMddINDATETIME2().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_IPD_PT_LIST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_IPD_PT_LIST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NRCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NRCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHARTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CHARTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VSDR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VSDR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yyyMMddINDATETIME1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yyyMMddINDATETIME1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yyyMMddINDATETIME2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yyyMMddINDATETIME2"));
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
