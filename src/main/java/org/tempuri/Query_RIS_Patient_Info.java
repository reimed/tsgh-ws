/**
 * Query_RIS_Patient_Info.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_RIS_Patient_Info  implements java.io.Serializable {
    private java.lang.String CHARTNO;

    private java.lang.String accessionNo;

    private java.lang.String comefrom;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_RIS_Patient_Info() {
    }

    public Query_RIS_Patient_Info(
           java.lang.String CHARTNO,
           java.lang.String accessionNo,
           java.lang.String comefrom,
           java.lang.String user,
           java.lang.String passwd) {
           this.CHARTNO = CHARTNO;
           this.accessionNo = accessionNo;
           this.comefrom = comefrom;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the CHARTNO value for this Query_RIS_Patient_Info.
     * 
     * @return CHARTNO
     */
    public java.lang.String getCHARTNO() {
        return CHARTNO;
    }


    /**
     * Sets the CHARTNO value for this Query_RIS_Patient_Info.
     * 
     * @param CHARTNO
     */
    public void setCHARTNO(java.lang.String CHARTNO) {
        this.CHARTNO = CHARTNO;
    }


    /**
     * Gets the accessionNo value for this Query_RIS_Patient_Info.
     * 
     * @return accessionNo
     */
    public java.lang.String getAccessionNo() {
        return accessionNo;
    }


    /**
     * Sets the accessionNo value for this Query_RIS_Patient_Info.
     * 
     * @param accessionNo
     */
    public void setAccessionNo(java.lang.String accessionNo) {
        this.accessionNo = accessionNo;
    }


    /**
     * Gets the comefrom value for this Query_RIS_Patient_Info.
     * 
     * @return comefrom
     */
    public java.lang.String getComefrom() {
        return comefrom;
    }


    /**
     * Sets the comefrom value for this Query_RIS_Patient_Info.
     * 
     * @param comefrom
     */
    public void setComefrom(java.lang.String comefrom) {
        this.comefrom = comefrom;
    }


    /**
     * Gets the user value for this Query_RIS_Patient_Info.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_RIS_Patient_Info.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_RIS_Patient_Info.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_RIS_Patient_Info.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_RIS_Patient_Info)) return false;
        Query_RIS_Patient_Info other = (Query_RIS_Patient_Info) obj;
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
            ((this.comefrom==null && other.getComefrom()==null) || 
             (this.comefrom!=null &&
              this.comefrom.equals(other.getComefrom()))) &&
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
        if (getComefrom() != null) {
            _hashCode += getComefrom().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_RIS_Patient_Info.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info"));
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
        elemField.setFieldName("comefrom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Comefrom"));
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
