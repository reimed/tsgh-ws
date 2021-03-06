/**
 * Query_EKG_LIST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_EKG_LIST  implements java.io.Serializable {
    private java.lang.String CNO;

    private java.lang.String yyyyMMdd1;

    private java.lang.String yyyyMMdd2;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_EKG_LIST() {
    }

    public Query_EKG_LIST(
           java.lang.String CNO,
           java.lang.String yyyyMMdd1,
           java.lang.String yyyyMMdd2,
           java.lang.String user,
           java.lang.String passwd) {
           this.CNO = CNO;
           this.yyyyMMdd1 = yyyyMMdd1;
           this.yyyyMMdd2 = yyyyMMdd2;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the CNO value for this Query_EKG_LIST.
     * 
     * @return CNO
     */
    public java.lang.String getCNO() {
        return CNO;
    }


    /**
     * Sets the CNO value for this Query_EKG_LIST.
     * 
     * @param CNO
     */
    public void setCNO(java.lang.String CNO) {
        this.CNO = CNO;
    }


    /**
     * Gets the yyyyMMdd1 value for this Query_EKG_LIST.
     * 
     * @return yyyyMMdd1
     */
    public java.lang.String getYyyyMMdd1() {
        return yyyyMMdd1;
    }


    /**
     * Sets the yyyyMMdd1 value for this Query_EKG_LIST.
     * 
     * @param yyyyMMdd1
     */
    public void setYyyyMMdd1(java.lang.String yyyyMMdd1) {
        this.yyyyMMdd1 = yyyyMMdd1;
    }


    /**
     * Gets the yyyyMMdd2 value for this Query_EKG_LIST.
     * 
     * @return yyyyMMdd2
     */
    public java.lang.String getYyyyMMdd2() {
        return yyyyMMdd2;
    }


    /**
     * Sets the yyyyMMdd2 value for this Query_EKG_LIST.
     * 
     * @param yyyyMMdd2
     */
    public void setYyyyMMdd2(java.lang.String yyyyMMdd2) {
        this.yyyyMMdd2 = yyyyMMdd2;
    }


    /**
     * Gets the user value for this Query_EKG_LIST.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_EKG_LIST.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_EKG_LIST.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_EKG_LIST.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_EKG_LIST)) return false;
        Query_EKG_LIST other = (Query_EKG_LIST) obj;
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
            ((this.yyyyMMdd1==null && other.getYyyyMMdd1()==null) || 
             (this.yyyyMMdd1!=null &&
              this.yyyyMMdd1.equals(other.getYyyyMMdd1()))) &&
            ((this.yyyyMMdd2==null && other.getYyyyMMdd2()==null) || 
             (this.yyyyMMdd2!=null &&
              this.yyyyMMdd2.equals(other.getYyyyMMdd2()))) &&
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
        if (getYyyyMMdd1() != null) {
            _hashCode += getYyyyMMdd1().hashCode();
        }
        if (getYyyyMMdd2() != null) {
            _hashCode += getYyyyMMdd2().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_EKG_LIST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_EKG_LIST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yyyyMMdd1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yyyyMMdd2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd2"));
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
