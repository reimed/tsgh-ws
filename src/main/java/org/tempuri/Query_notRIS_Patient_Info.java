/**
 * Query_notRIS_Patient_Info.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_notRIS_Patient_Info  implements java.io.Serializable {
    private java.lang.String hisdocpk;

    private java.lang.String sheetName;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_notRIS_Patient_Info() {
    }

    public Query_notRIS_Patient_Info(
           java.lang.String hisdocpk,
           java.lang.String sheetName,
           java.lang.String user,
           java.lang.String passwd) {
           this.hisdocpk = hisdocpk;
           this.sheetName = sheetName;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the hisdocpk value for this Query_notRIS_Patient_Info.
     * 
     * @return hisdocpk
     */
    public java.lang.String getHisdocpk() {
        return hisdocpk;
    }


    /**
     * Sets the hisdocpk value for this Query_notRIS_Patient_Info.
     * 
     * @param hisdocpk
     */
    public void setHisdocpk(java.lang.String hisdocpk) {
        this.hisdocpk = hisdocpk;
    }


    /**
     * Gets the sheetName value for this Query_notRIS_Patient_Info.
     * 
     * @return sheetName
     */
    public java.lang.String getSheetName() {
        return sheetName;
    }


    /**
     * Sets the sheetName value for this Query_notRIS_Patient_Info.
     * 
     * @param sheetName
     */
    public void setSheetName(java.lang.String sheetName) {
        this.sheetName = sheetName;
    }


    /**
     * Gets the user value for this Query_notRIS_Patient_Info.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_notRIS_Patient_Info.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_notRIS_Patient_Info.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_notRIS_Patient_Info.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_notRIS_Patient_Info)) return false;
        Query_notRIS_Patient_Info other = (Query_notRIS_Patient_Info) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hisdocpk==null && other.getHisdocpk()==null) || 
             (this.hisdocpk!=null &&
              this.hisdocpk.equals(other.getHisdocpk()))) &&
            ((this.sheetName==null && other.getSheetName()==null) || 
             (this.sheetName!=null &&
              this.sheetName.equals(other.getSheetName()))) &&
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
        if (getHisdocpk() != null) {
            _hashCode += getHisdocpk().hashCode();
        }
        if (getSheetName() != null) {
            _hashCode += getSheetName().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_notRIS_Patient_Info.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_notRIS_Patient_Info"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hisdocpk");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "hisdocpk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sheetName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sheetName"));
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
