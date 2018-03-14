/**
 * Query_BBK_Data.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_BBK_Data  implements java.io.Serializable {
    private java.lang.String MEDNO;

    private java.lang.String VISITSEQ;

    private java.lang.String VISITDATEyyymmdd;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_BBK_Data() {
    }

    public Query_BBK_Data(
           java.lang.String MEDNO,
           java.lang.String VISITSEQ,
           java.lang.String VISITDATEyyymmdd,
           java.lang.String user,
           java.lang.String passwd) {
           this.MEDNO = MEDNO;
           this.VISITSEQ = VISITSEQ;
           this.VISITDATEyyymmdd = VISITDATEyyymmdd;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the MEDNO value for this Query_BBK_Data.
     * 
     * @return MEDNO
     */
    public java.lang.String getMEDNO() {
        return MEDNO;
    }


    /**
     * Sets the MEDNO value for this Query_BBK_Data.
     * 
     * @param MEDNO
     */
    public void setMEDNO(java.lang.String MEDNO) {
        this.MEDNO = MEDNO;
    }


    /**
     * Gets the VISITSEQ value for this Query_BBK_Data.
     * 
     * @return VISITSEQ
     */
    public java.lang.String getVISITSEQ() {
        return VISITSEQ;
    }


    /**
     * Sets the VISITSEQ value for this Query_BBK_Data.
     * 
     * @param VISITSEQ
     */
    public void setVISITSEQ(java.lang.String VISITSEQ) {
        this.VISITSEQ = VISITSEQ;
    }


    /**
     * Gets the VISITDATEyyymmdd value for this Query_BBK_Data.
     * 
     * @return VISITDATEyyymmdd
     */
    public java.lang.String getVISITDATEyyymmdd() {
        return VISITDATEyyymmdd;
    }


    /**
     * Sets the VISITDATEyyymmdd value for this Query_BBK_Data.
     * 
     * @param VISITDATEyyymmdd
     */
    public void setVISITDATEyyymmdd(java.lang.String VISITDATEyyymmdd) {
        this.VISITDATEyyymmdd = VISITDATEyyymmdd;
    }


    /**
     * Gets the user value for this Query_BBK_Data.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_BBK_Data.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_BBK_Data.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_BBK_Data.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_BBK_Data)) return false;
        Query_BBK_Data other = (Query_BBK_Data) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MEDNO==null && other.getMEDNO()==null) || 
             (this.MEDNO!=null &&
              this.MEDNO.equals(other.getMEDNO()))) &&
            ((this.VISITSEQ==null && other.getVISITSEQ()==null) || 
             (this.VISITSEQ!=null &&
              this.VISITSEQ.equals(other.getVISITSEQ()))) &&
            ((this.VISITDATEyyymmdd==null && other.getVISITDATEyyymmdd()==null) || 
             (this.VISITDATEyyymmdd!=null &&
              this.VISITDATEyyymmdd.equals(other.getVISITDATEyyymmdd()))) &&
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
        if (getMEDNO() != null) {
            _hashCode += getMEDNO().hashCode();
        }
        if (getVISITSEQ() != null) {
            _hashCode += getVISITSEQ().hashCode();
        }
        if (getVISITDATEyyymmdd() != null) {
            _hashCode += getVISITDATEyyymmdd().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_BBK_Data.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_BBK_Data"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MEDNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MEDNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VISITSEQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VISITSEQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VISITDATEyyymmdd");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VISITDATEyyymmdd"));
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
