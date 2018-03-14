/**
 * Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB  implements java.io.Serializable {
    private java.lang.String CNO;

    private java.lang.String LASTUPDTESTDATEyyyyMMdd1;

    private java.lang.String LASTUPDTESTDATEyyyyMMdd2;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB() {
    }

    public Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB(
           java.lang.String CNO,
           java.lang.String LASTUPDTESTDATEyyyyMMdd1,
           java.lang.String LASTUPDTESTDATEyyyyMMdd2,
           java.lang.String user,
           java.lang.String passwd) {
           this.CNO = CNO;
           this.LASTUPDTESTDATEyyyyMMdd1 = LASTUPDTESTDATEyyyyMMdd1;
           this.LASTUPDTESTDATEyyyyMMdd2 = LASTUPDTESTDATEyyyyMMdd2;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the CNO value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @return CNO
     */
    public java.lang.String getCNO() {
        return CNO;
    }


    /**
     * Sets the CNO value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @param CNO
     */
    public void setCNO(java.lang.String CNO) {
        this.CNO = CNO;
    }


    /**
     * Gets the LASTUPDTESTDATEyyyyMMdd1 value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @return LASTUPDTESTDATEyyyyMMdd1
     */
    public java.lang.String getLASTUPDTESTDATEyyyyMMdd1() {
        return LASTUPDTESTDATEyyyyMMdd1;
    }


    /**
     * Sets the LASTUPDTESTDATEyyyyMMdd1 value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @param LASTUPDTESTDATEyyyyMMdd1
     */
    public void setLASTUPDTESTDATEyyyyMMdd1(java.lang.String LASTUPDTESTDATEyyyyMMdd1) {
        this.LASTUPDTESTDATEyyyyMMdd1 = LASTUPDTESTDATEyyyyMMdd1;
    }


    /**
     * Gets the LASTUPDTESTDATEyyyyMMdd2 value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @return LASTUPDTESTDATEyyyyMMdd2
     */
    public java.lang.String getLASTUPDTESTDATEyyyyMMdd2() {
        return LASTUPDTESTDATEyyyyMMdd2;
    }


    /**
     * Sets the LASTUPDTESTDATEyyyyMMdd2 value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @param LASTUPDTESTDATEyyyyMMdd2
     */
    public void setLASTUPDTESTDATEyyyyMMdd2(java.lang.String LASTUPDTESTDATEyyyyMMdd2) {
        this.LASTUPDTESTDATEyyyyMMdd2 = LASTUPDTESTDATEyyyyMMdd2;
    }


    /**
     * Gets the user value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB)) return false;
        Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB other = (Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB) obj;
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
            ((this.LASTUPDTESTDATEyyyyMMdd1==null && other.getLASTUPDTESTDATEyyyyMMdd1()==null) || 
             (this.LASTUPDTESTDATEyyyyMMdd1!=null &&
              this.LASTUPDTESTDATEyyyyMMdd1.equals(other.getLASTUPDTESTDATEyyyyMMdd1()))) &&
            ((this.LASTUPDTESTDATEyyyyMMdd2==null && other.getLASTUPDTESTDATEyyyyMMdd2()==null) || 
             (this.LASTUPDTESTDATEyyyyMMdd2!=null &&
              this.LASTUPDTESTDATEyyyyMMdd2.equals(other.getLASTUPDTESTDATEyyyyMMdd2()))) &&
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
        if (getLASTUPDTESTDATEyyyyMMdd1() != null) {
            _hashCode += getLASTUPDTESTDATEyyyyMMdd1().hashCode();
        }
        if (getLASTUPDTESTDATEyyyyMMdd2() != null) {
            _hashCode += getLASTUPDTESTDATEyyyyMMdd2().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTUPDTESTDATEyyyyMMdd1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LASTUPDTESTDATEyyyyMMdd1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("LASTUPDTESTDATEyyyyMMdd2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LASTUPDTESTDATEyyyyMMdd2"));
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
