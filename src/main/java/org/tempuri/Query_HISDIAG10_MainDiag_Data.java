/**
 * Query_HISDIAG10_MainDiag_Data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_HISDIAG10_MainDiag_Data  implements java.io.Serializable {
    private java.lang.String medno;

    private java.lang.String visitseq;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_HISDIAG10_MainDiag_Data() {
    }

    public Query_HISDIAG10_MainDiag_Data(
           java.lang.String medno,
           java.lang.String visitseq,
           java.lang.String user,
           java.lang.String passwd) {
           this.medno = medno;
           this.visitseq = visitseq;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the medno value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @return medno
     */
    public java.lang.String getMedno() {
        return medno;
    }


    /**
     * Sets the medno value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @param medno
     */
    public void setMedno(java.lang.String medno) {
        this.medno = medno;
    }


    /**
     * Gets the visitseq value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @return visitseq
     */
    public java.lang.String getVisitseq() {
        return visitseq;
    }


    /**
     * Sets the visitseq value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @param visitseq
     */
    public void setVisitseq(java.lang.String visitseq) {
        this.visitseq = visitseq;
    }


    /**
     * Gets the user value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_HISDIAG10_MainDiag_Data.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_HISDIAG10_MainDiag_Data)) return false;
        Query_HISDIAG10_MainDiag_Data other = (Query_HISDIAG10_MainDiag_Data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.medno==null && other.getMedno()==null) || 
             (this.medno!=null &&
              this.medno.equals(other.getMedno()))) &&
            ((this.visitseq==null && other.getVisitseq()==null) || 
             (this.visitseq!=null &&
              this.visitseq.equals(other.getVisitseq()))) &&
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
        if (getMedno() != null) {
            _hashCode += getMedno().hashCode();
        }
        if (getVisitseq() != null) {
            _hashCode += getVisitseq().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_HISDIAG10_MainDiag_Data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_HISDIAG10_MainDiag_Data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("medno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Medno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visitseq");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "visitseq"));
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
