/**
 * Query_RIS_MODALITY_IS_US_MG_BREASTS2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_RIS_MODALITY_IS_US_MG_BREASTS2  implements java.io.Serializable {
    private java.lang.String PATIENT_ID;

    private java.lang.String PERFRMD_START_DATE1;

    private java.lang.String PERFRMD_START_DATE2;

    private java.lang.String ACCESSION_NUM;

    private java.lang.String VERIFICATION_PHYSICIAN;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_RIS_MODALITY_IS_US_MG_BREASTS2() {
    }

    public Query_RIS_MODALITY_IS_US_MG_BREASTS2(
           java.lang.String PATIENT_ID,
           java.lang.String PERFRMD_START_DATE1,
           java.lang.String PERFRMD_START_DATE2,
           java.lang.String ACCESSION_NUM,
           java.lang.String VERIFICATION_PHYSICIAN,
           java.lang.String user,
           java.lang.String passwd) {
           this.PATIENT_ID = PATIENT_ID;
           this.PERFRMD_START_DATE1 = PERFRMD_START_DATE1;
           this.PERFRMD_START_DATE2 = PERFRMD_START_DATE2;
           this.ACCESSION_NUM = ACCESSION_NUM;
           this.VERIFICATION_PHYSICIAN = VERIFICATION_PHYSICIAN;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the PATIENT_ID value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @return PATIENT_ID
     */
    public java.lang.String getPATIENT_ID() {
        return PATIENT_ID;
    }


    /**
     * Sets the PATIENT_ID value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @param PATIENT_ID
     */
    public void setPATIENT_ID(java.lang.String PATIENT_ID) {
        this.PATIENT_ID = PATIENT_ID;
    }


    /**
     * Gets the PERFRMD_START_DATE1 value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @return PERFRMD_START_DATE1
     */
    public java.lang.String getPERFRMD_START_DATE1() {
        return PERFRMD_START_DATE1;
    }


    /**
     * Sets the PERFRMD_START_DATE1 value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @param PERFRMD_START_DATE1
     */
    public void setPERFRMD_START_DATE1(java.lang.String PERFRMD_START_DATE1) {
        this.PERFRMD_START_DATE1 = PERFRMD_START_DATE1;
    }


    /**
     * Gets the PERFRMD_START_DATE2 value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @return PERFRMD_START_DATE2
     */
    public java.lang.String getPERFRMD_START_DATE2() {
        return PERFRMD_START_DATE2;
    }


    /**
     * Sets the PERFRMD_START_DATE2 value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @param PERFRMD_START_DATE2
     */
    public void setPERFRMD_START_DATE2(java.lang.String PERFRMD_START_DATE2) {
        this.PERFRMD_START_DATE2 = PERFRMD_START_DATE2;
    }


    /**
     * Gets the ACCESSION_NUM value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @return ACCESSION_NUM
     */
    public java.lang.String getACCESSION_NUM() {
        return ACCESSION_NUM;
    }


    /**
     * Sets the ACCESSION_NUM value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @param ACCESSION_NUM
     */
    public void setACCESSION_NUM(java.lang.String ACCESSION_NUM) {
        this.ACCESSION_NUM = ACCESSION_NUM;
    }


    /**
     * Gets the VERIFICATION_PHYSICIAN value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @return VERIFICATION_PHYSICIAN
     */
    public java.lang.String getVERIFICATION_PHYSICIAN() {
        return VERIFICATION_PHYSICIAN;
    }


    /**
     * Sets the VERIFICATION_PHYSICIAN value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @param VERIFICATION_PHYSICIAN
     */
    public void setVERIFICATION_PHYSICIAN(java.lang.String VERIFICATION_PHYSICIAN) {
        this.VERIFICATION_PHYSICIAN = VERIFICATION_PHYSICIAN;
    }


    /**
     * Gets the user value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_RIS_MODALITY_IS_US_MG_BREASTS2)) return false;
        Query_RIS_MODALITY_IS_US_MG_BREASTS2 other = (Query_RIS_MODALITY_IS_US_MG_BREASTS2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PATIENT_ID==null && other.getPATIENT_ID()==null) || 
             (this.PATIENT_ID!=null &&
              this.PATIENT_ID.equals(other.getPATIENT_ID()))) &&
            ((this.PERFRMD_START_DATE1==null && other.getPERFRMD_START_DATE1()==null) || 
             (this.PERFRMD_START_DATE1!=null &&
              this.PERFRMD_START_DATE1.equals(other.getPERFRMD_START_DATE1()))) &&
            ((this.PERFRMD_START_DATE2==null && other.getPERFRMD_START_DATE2()==null) || 
             (this.PERFRMD_START_DATE2!=null &&
              this.PERFRMD_START_DATE2.equals(other.getPERFRMD_START_DATE2()))) &&
            ((this.ACCESSION_NUM==null && other.getACCESSION_NUM()==null) || 
             (this.ACCESSION_NUM!=null &&
              this.ACCESSION_NUM.equals(other.getACCESSION_NUM()))) &&
            ((this.VERIFICATION_PHYSICIAN==null && other.getVERIFICATION_PHYSICIAN()==null) || 
             (this.VERIFICATION_PHYSICIAN!=null &&
              this.VERIFICATION_PHYSICIAN.equals(other.getVERIFICATION_PHYSICIAN()))) &&
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
        if (getPATIENT_ID() != null) {
            _hashCode += getPATIENT_ID().hashCode();
        }
        if (getPERFRMD_START_DATE1() != null) {
            _hashCode += getPERFRMD_START_DATE1().hashCode();
        }
        if (getPERFRMD_START_DATE2() != null) {
            _hashCode += getPERFRMD_START_DATE2().hashCode();
        }
        if (getACCESSION_NUM() != null) {
            _hashCode += getACCESSION_NUM().hashCode();
        }
        if (getVERIFICATION_PHYSICIAN() != null) {
            _hashCode += getVERIFICATION_PHYSICIAN().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_RIS_MODALITY_IS_US_MG_BREASTS2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTS2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PATIENT_ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERFRMD_START_DATE1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PERFRMD_START_DATE2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCESSION_NUM");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ACCESSION_NUM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VERIFICATION_PHYSICIAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VERIFICATION_PHYSICIAN"));
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
