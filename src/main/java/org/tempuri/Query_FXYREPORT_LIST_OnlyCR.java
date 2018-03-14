/**
 * Query_FXYREPORT_LIST_OnlyCR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_FXYREPORT_LIST_OnlyCR  implements java.io.Serializable {
    private java.lang.String CNO;

    private java.lang.String PERFRMD_START_DATEyyyyMMdd1;

    private java.lang.String PERFRMD_START_DATEyyyyMMdd2;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_FXYREPORT_LIST_OnlyCR() {
    }

    public Query_FXYREPORT_LIST_OnlyCR(
           java.lang.String CNO,
           java.lang.String PERFRMD_START_DATEyyyyMMdd1,
           java.lang.String PERFRMD_START_DATEyyyyMMdd2,
           java.lang.String user,
           java.lang.String passwd) {
           this.CNO = CNO;
           this.PERFRMD_START_DATEyyyyMMdd1 = PERFRMD_START_DATEyyyyMMdd1;
           this.PERFRMD_START_DATEyyyyMMdd2 = PERFRMD_START_DATEyyyyMMdd2;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the CNO value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @return CNO
     */
    public java.lang.String getCNO() {
        return CNO;
    }


    /**
     * Sets the CNO value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @param CNO
     */
    public void setCNO(java.lang.String CNO) {
        this.CNO = CNO;
    }


    /**
     * Gets the PERFRMD_START_DATEyyyyMMdd1 value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @return PERFRMD_START_DATEyyyyMMdd1
     */
    public java.lang.String getPERFRMD_START_DATEyyyyMMdd1() {
        return PERFRMD_START_DATEyyyyMMdd1;
    }


    /**
     * Sets the PERFRMD_START_DATEyyyyMMdd1 value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @param PERFRMD_START_DATEyyyyMMdd1
     */
    public void setPERFRMD_START_DATEyyyyMMdd1(java.lang.String PERFRMD_START_DATEyyyyMMdd1) {
        this.PERFRMD_START_DATEyyyyMMdd1 = PERFRMD_START_DATEyyyyMMdd1;
    }


    /**
     * Gets the PERFRMD_START_DATEyyyyMMdd2 value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @return PERFRMD_START_DATEyyyyMMdd2
     */
    public java.lang.String getPERFRMD_START_DATEyyyyMMdd2() {
        return PERFRMD_START_DATEyyyyMMdd2;
    }


    /**
     * Sets the PERFRMD_START_DATEyyyyMMdd2 value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @param PERFRMD_START_DATEyyyyMMdd2
     */
    public void setPERFRMD_START_DATEyyyyMMdd2(java.lang.String PERFRMD_START_DATEyyyyMMdd2) {
        this.PERFRMD_START_DATEyyyyMMdd2 = PERFRMD_START_DATEyyyyMMdd2;
    }


    /**
     * Gets the user value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_FXYREPORT_LIST_OnlyCR.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_FXYREPORT_LIST_OnlyCR)) return false;
        Query_FXYREPORT_LIST_OnlyCR other = (Query_FXYREPORT_LIST_OnlyCR) obj;
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
            ((this.PERFRMD_START_DATEyyyyMMdd1==null && other.getPERFRMD_START_DATEyyyyMMdd1()==null) || 
             (this.PERFRMD_START_DATEyyyyMMdd1!=null &&
              this.PERFRMD_START_DATEyyyyMMdd1.equals(other.getPERFRMD_START_DATEyyyyMMdd1()))) &&
            ((this.PERFRMD_START_DATEyyyyMMdd2==null && other.getPERFRMD_START_DATEyyyyMMdd2()==null) || 
             (this.PERFRMD_START_DATEyyyyMMdd2!=null &&
              this.PERFRMD_START_DATEyyyyMMdd2.equals(other.getPERFRMD_START_DATEyyyyMMdd2()))) &&
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
        if (getPERFRMD_START_DATEyyyyMMdd1() != null) {
            _hashCode += getPERFRMD_START_DATEyyyyMMdd1().hashCode();
        }
        if (getPERFRMD_START_DATEyyyyMMdd2() != null) {
            _hashCode += getPERFRMD_START_DATEyyyyMMdd2().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_FXYREPORT_LIST_OnlyCR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_LIST_OnlyCR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERFRMD_START_DATEyyyyMMdd1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATEyyyyMMdd1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERFRMD_START_DATEyyyyMMdd2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATEyyyyMMdd2"));
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
