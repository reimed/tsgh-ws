/**
 * Query2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query2  implements java.io.Serializable {
    private java.lang.String sql;

    private java.lang.String connString;

    private java.lang.String ouser;

    private java.lang.String passwd;

    public Query2() {
    }

    public Query2(
           java.lang.String sql,
           java.lang.String connString,
           java.lang.String ouser,
           java.lang.String passwd) {
           this.sql = sql;
           this.connString = connString;
           this.ouser = ouser;
           this.passwd = passwd;
    }


    /**
     * Gets the sql value for this Query2.
     * 
     * @return sql
     */
    public java.lang.String getSql() {
        return sql;
    }


    /**
     * Sets the sql value for this Query2.
     * 
     * @param sql
     */
    public void setSql(java.lang.String sql) {
        this.sql = sql;
    }


    /**
     * Gets the connString value for this Query2.
     * 
     * @return connString
     */
    public java.lang.String getConnString() {
        return connString;
    }


    /**
     * Sets the connString value for this Query2.
     * 
     * @param connString
     */
    public void setConnString(java.lang.String connString) {
        this.connString = connString;
    }


    /**
     * Gets the ouser value for this Query2.
     * 
     * @return ouser
     */
    public java.lang.String getOuser() {
        return ouser;
    }


    /**
     * Sets the ouser value for this Query2.
     * 
     * @param ouser
     */
    public void setOuser(java.lang.String ouser) {
        this.ouser = ouser;
    }


    /**
     * Gets the passwd value for this Query2.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query2.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query2)) return false;
        Query2 other = (Query2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sql==null && other.getSql()==null) || 
             (this.sql!=null &&
              this.sql.equals(other.getSql()))) &&
            ((this.connString==null && other.getConnString()==null) || 
             (this.connString!=null &&
              this.connString.equals(other.getConnString()))) &&
            ((this.ouser==null && other.getOuser()==null) || 
             (this.ouser!=null &&
              this.ouser.equals(other.getOuser()))) &&
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
        if (getSql() != null) {
            _hashCode += getSql().hashCode();
        }
        if (getConnString() != null) {
            _hashCode += getConnString().hashCode();
        }
        if (getOuser() != null) {
            _hashCode += getOuser().hashCode();
        }
        if (getPasswd() != null) {
            _hashCode += getPasswd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sql");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "sql"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connString");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "connString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ouser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ouser"));
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
