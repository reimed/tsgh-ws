/**
 * Query_RIS_Patient_Info2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_RIS_Patient_Info2  implements java.io.Serializable {
    private java.lang.String CHARTNO;

    private java.lang.String accessionNo;

    private java.lang.String PATIENT_SOURCE;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_RIS_Patient_Info2() {
    }

    public Query_RIS_Patient_Info2(
           java.lang.String CHARTNO,
           java.lang.String accessionNo,
           java.lang.String PATIENT_SOURCE,
           java.lang.String user,
           java.lang.String passwd) {
           this.CHARTNO = CHARTNO;
           this.accessionNo = accessionNo;
           this.PATIENT_SOURCE = PATIENT_SOURCE;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the CHARTNO value for this Query_RIS_Patient_Info2.
     * 
     * @return CHARTNO
     */
    public java.lang.String getCHARTNO() {
        return CHARTNO;
    }


    /**
     * Sets the CHARTNO value for this Query_RIS_Patient_Info2.
     * 
     * @param CHARTNO
     */
    public void setCHARTNO(java.lang.String CHARTNO) {
        this.CHARTNO = CHARTNO;
    }


    /**
     * Gets the accessionNo value for this Query_RIS_Patient_Info2.
     * 
     * @return accessionNo
     */
    public java.lang.String getAccessionNo() {
        return accessionNo;
    }


    /**
     * Sets the accessionNo value for this Query_RIS_Patient_Info2.
     * 
     * @param accessionNo
     */
    public void setAccessionNo(java.lang.String accessionNo) {
        this.accessionNo = accessionNo;
    }


    /**
     * Gets the PATIENT_SOURCE value for this Query_RIS_Patient_Info2.
     * 
     * @return PATIENT_SOURCE
     */
    public java.lang.String getPATIENT_SOURCE() {
        return PATIENT_SOURCE;
    }


    /**
     * Sets the PATIENT_SOURCE value for this Query_RIS_Patient_Info2.
     * 
     * @param PATIENT_SOURCE
     */
    public void setPATIENT_SOURCE(java.lang.String PATIENT_SOURCE) {
        this.PATIENT_SOURCE = PATIENT_SOURCE;
    }


    /**
     * Gets the user value for this Query_RIS_Patient_Info2.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_RIS_Patient_Info2.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_RIS_Patient_Info2.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_RIS_Patient_Info2.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_RIS_Patient_Info2)) return false;
        Query_RIS_Patient_Info2 other = (Query_RIS_Patient_Info2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CHARTNO==null && other.getCHARTNO()==null) || 
             (this.CHARTNO!=null &&
              this.CHARTNO.equals(other.getCHARTNO()))) &&
            ((this.accessionNo==null && other.getAccessionNo()==null) || 
             (this.accessionNo!=null &&
              this.accessionNo.equals(other.getAccessionNo()))) &&
            ((this.PATIENT_SOURCE==null && other.getPATIENT_SOURCE()==null) || 
             (this.PATIENT_SOURCE!=null &&
              this.PATIENT_SOURCE.equals(other.getPATIENT_SOURCE()))) &&
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
        if (getCHARTNO() != null) {
            _hashCode += getCHARTNO().hashCode();
        }
        if (getAccessionNo() != null) {
            _hashCode += getAccessionNo().hashCode();
        }
        if (getPATIENT_SOURCE() != null) {
            _hashCode += getPATIENT_SOURCE().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_RIS_Patient_Info2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CHARTNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CHARTNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessionNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AccessionNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_SOURCE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_SOURCE"));
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
