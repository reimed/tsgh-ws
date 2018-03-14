/**
 * Query_REG_LIST.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_REG_LIST  implements java.io.Serializable {
    private java.lang.String cno;

    private java.lang.String DEPT;

    private java.lang.String taiwan_Date1;

    private java.lang.String taiwan_Date2;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_REG_LIST() {
    }

    public Query_REG_LIST(
           java.lang.String cno,
           java.lang.String DEPT,
           java.lang.String taiwan_Date1,
           java.lang.String taiwan_Date2,
           java.lang.String user,
           java.lang.String passwd) {
           this.cno = cno;
           this.DEPT = DEPT;
           this.taiwan_Date1 = taiwan_Date1;
           this.taiwan_Date2 = taiwan_Date2;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the cno value for this Query_REG_LIST.
     * 
     * @return cno
     */
    public java.lang.String getCno() {
        return cno;
    }


    /**
     * Sets the cno value for this Query_REG_LIST.
     * 
     * @param cno
     */
    public void setCno(java.lang.String cno) {
        this.cno = cno;
    }


    /**
     * Gets the DEPT value for this Query_REG_LIST.
     * 
     * @return DEPT
     */
    public java.lang.String getDEPT() {
        return DEPT;
    }


    /**
     * Sets the DEPT value for this Query_REG_LIST.
     * 
     * @param DEPT
     */
    public void setDEPT(java.lang.String DEPT) {
        this.DEPT = DEPT;
    }


    /**
     * Gets the taiwan_Date1 value for this Query_REG_LIST.
     * 
     * @return taiwan_Date1
     */
    public java.lang.String getTaiwan_Date1() {
        return taiwan_Date1;
    }


    /**
     * Sets the taiwan_Date1 value for this Query_REG_LIST.
     * 
     * @param taiwan_Date1
     */
    public void setTaiwan_Date1(java.lang.String taiwan_Date1) {
        this.taiwan_Date1 = taiwan_Date1;
    }


    /**
     * Gets the taiwan_Date2 value for this Query_REG_LIST.
     * 
     * @return taiwan_Date2
     */
    public java.lang.String getTaiwan_Date2() {
        return taiwan_Date2;
    }


    /**
     * Sets the taiwan_Date2 value for this Query_REG_LIST.
     * 
     * @param taiwan_Date2
     */
    public void setTaiwan_Date2(java.lang.String taiwan_Date2) {
        this.taiwan_Date2 = taiwan_Date2;
    }


    /**
     * Gets the user value for this Query_REG_LIST.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_REG_LIST.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_REG_LIST.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_REG_LIST.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_REG_LIST)) return false;
        Query_REG_LIST other = (Query_REG_LIST) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cno==null && other.getCno()==null) || 
             (this.cno!=null &&
              this.cno.equals(other.getCno()))) &&
            ((this.DEPT==null && other.getDEPT()==null) || 
             (this.DEPT!=null &&
              this.DEPT.equals(other.getDEPT()))) &&
            ((this.taiwan_Date1==null && other.getTaiwan_Date1()==null) || 
             (this.taiwan_Date1!=null &&
              this.taiwan_Date1.equals(other.getTaiwan_Date1()))) &&
            ((this.taiwan_Date2==null && other.getTaiwan_Date2()==null) || 
             (this.taiwan_Date2!=null &&
              this.taiwan_Date2.equals(other.getTaiwan_Date2()))) &&
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
        if (getCno() != null) {
            _hashCode += getCno().hashCode();
        }
        if (getDEPT() != null) {
            _hashCode += getDEPT().hashCode();
        }
        if (getTaiwan_Date1() != null) {
            _hashCode += getTaiwan_Date1().hashCode();
        }
        if (getTaiwan_Date2() != null) {
            _hashCode += getTaiwan_Date2().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_REG_LIST.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_REG_LIST"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Cno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DEPT");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DEPT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taiwan_Date1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taiwan_Date2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date2"));
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
