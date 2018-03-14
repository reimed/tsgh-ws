/**
 * Query_Dischargenote_Data_and_Final_MainDiagICD10Code.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_Dischargenote_Data_and_Final_MainDiagICD10Code  implements java.io.Serializable {
    private java.lang.String HDISYMD_yyyMMdd1;

    private java.lang.String HDISYMD_yyyMMdd2;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_Dischargenote_Data_and_Final_MainDiagICD10Code() {
    }

    public Query_Dischargenote_Data_and_Final_MainDiagICD10Code(
           java.lang.String HDISYMD_yyyMMdd1,
           java.lang.String HDISYMD_yyyMMdd2,
           java.lang.String user,
           java.lang.String passwd) {
           this.HDISYMD_yyyMMdd1 = HDISYMD_yyyMMdd1;
           this.HDISYMD_yyyMMdd2 = HDISYMD_yyyMMdd2;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the HDISYMD_yyyMMdd1 value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @return HDISYMD_yyyMMdd1
     */
    public java.lang.String getHDISYMD_yyyMMdd1() {
        return HDISYMD_yyyMMdd1;
    }


    /**
     * Sets the HDISYMD_yyyMMdd1 value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @param HDISYMD_yyyMMdd1
     */
    public void setHDISYMD_yyyMMdd1(java.lang.String HDISYMD_yyyMMdd1) {
        this.HDISYMD_yyyMMdd1 = HDISYMD_yyyMMdd1;
    }


    /**
     * Gets the HDISYMD_yyyMMdd2 value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @return HDISYMD_yyyMMdd2
     */
    public java.lang.String getHDISYMD_yyyMMdd2() {
        return HDISYMD_yyyMMdd2;
    }


    /**
     * Sets the HDISYMD_yyyMMdd2 value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @param HDISYMD_yyyMMdd2
     */
    public void setHDISYMD_yyyMMdd2(java.lang.String HDISYMD_yyyMMdd2) {
        this.HDISYMD_yyyMMdd2 = HDISYMD_yyyMMdd2;
    }


    /**
     * Gets the user value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_Dischargenote_Data_and_Final_MainDiagICD10Code.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_Dischargenote_Data_and_Final_MainDiagICD10Code)) return false;
        Query_Dischargenote_Data_and_Final_MainDiagICD10Code other = (Query_Dischargenote_Data_and_Final_MainDiagICD10Code) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.HDISYMD_yyyMMdd1==null && other.getHDISYMD_yyyMMdd1()==null) || 
             (this.HDISYMD_yyyMMdd1!=null &&
              this.HDISYMD_yyyMMdd1.equals(other.getHDISYMD_yyyMMdd1()))) &&
            ((this.HDISYMD_yyyMMdd2==null && other.getHDISYMD_yyyMMdd2()==null) || 
             (this.HDISYMD_yyyMMdd2!=null &&
              this.HDISYMD_yyyMMdd2.equals(other.getHDISYMD_yyyMMdd2()))) &&
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
        if (getHDISYMD_yyyMMdd1() != null) {
            _hashCode += getHDISYMD_yyyMMdd1().hashCode();
        }
        if (getHDISYMD_yyyMMdd2() != null) {
            _hashCode += getHDISYMD_yyyMMdd2().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_Dischargenote_Data_and_Final_MainDiagICD10Code.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data_and_Final_MainDiagICD10Code"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HDISYMD_yyyMMdd1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HDISYMD_yyyMMdd1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HDISYMD_yyyMMdd2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HDISYMD_yyyMMdd2"));
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
