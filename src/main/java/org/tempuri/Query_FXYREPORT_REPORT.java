/**
 * Query_FXYREPORT_REPORT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_FXYREPORT_REPORT  implements java.io.Serializable {
    private java.lang.String ACCESSION_NUM;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_FXYREPORT_REPORT() {
    }

    public Query_FXYREPORT_REPORT(
           java.lang.String ACCESSION_NUM,
           java.lang.String user,
           java.lang.String passwd) {
           this.ACCESSION_NUM = ACCESSION_NUM;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the ACCESSION_NUM value for this Query_FXYREPORT_REPORT.
     * 
     * @return ACCESSION_NUM
     */
    public java.lang.String getACCESSION_NUM() {
        return ACCESSION_NUM;
    }


    /**
     * Sets the ACCESSION_NUM value for this Query_FXYREPORT_REPORT.
     * 
     * @param ACCESSION_NUM
     */
    public void setACCESSION_NUM(java.lang.String ACCESSION_NUM) {
        this.ACCESSION_NUM = ACCESSION_NUM;
    }


    /**
     * Gets the user value for this Query_FXYREPORT_REPORT.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_FXYREPORT_REPORT.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_FXYREPORT_REPORT.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_FXYREPORT_REPORT.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_FXYREPORT_REPORT)) return false;
        Query_FXYREPORT_REPORT other = (Query_FXYREPORT_REPORT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ACCESSION_NUM==null && other.getACCESSION_NUM()==null) || 
             (this.ACCESSION_NUM!=null &&
              this.ACCESSION_NUM.equals(other.getACCESSION_NUM()))) &&
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
        if (getACCESSION_NUM() != null) {
            _hashCode += getACCESSION_NUM().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_FXYREPORT_REPORT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_REPORT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCESSION_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCESSION_NUM"));
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
