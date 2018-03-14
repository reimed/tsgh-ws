/**
 * Query_OPSCH_AND_CLOCASED_LIST_from_DB2.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_OPSCH_AND_CLOCASED_LIST_from_DB2  implements java.io.Serializable {
    private java.lang.String taiwan_Date1;

    private java.lang.String taiwan_Date2;

    private java.lang.String cno;

    private java.lang.String HCURSVCL;

    private java.lang.String user;

    private java.lang.String passwd;

    public Query_OPSCH_AND_CLOCASED_LIST_from_DB2() {
    }

    public Query_OPSCH_AND_CLOCASED_LIST_from_DB2(
           java.lang.String taiwan_Date1,
           java.lang.String taiwan_Date2,
           java.lang.String cno,
           java.lang.String HCURSVCL,
           java.lang.String user,
           java.lang.String passwd) {
           this.taiwan_Date1 = taiwan_Date1;
           this.taiwan_Date2 = taiwan_Date2;
           this.cno = cno;
           this.HCURSVCL = HCURSVCL;
           this.user = user;
           this.passwd = passwd;
    }


    /**
     * Gets the taiwan_Date1 value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @return taiwan_Date1
     */
    public java.lang.String getTaiwan_Date1() {
        return taiwan_Date1;
    }


    /**
     * Sets the taiwan_Date1 value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @param taiwan_Date1
     */
    public void setTaiwan_Date1(java.lang.String taiwan_Date1) {
        this.taiwan_Date1 = taiwan_Date1;
    }


    /**
     * Gets the taiwan_Date2 value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @return taiwan_Date2
     */
    public java.lang.String getTaiwan_Date2() {
        return taiwan_Date2;
    }


    /**
     * Sets the taiwan_Date2 value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @param taiwan_Date2
     */
    public void setTaiwan_Date2(java.lang.String taiwan_Date2) {
        this.taiwan_Date2 = taiwan_Date2;
    }


    /**
     * Gets the cno value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @return cno
     */
    public java.lang.String getCno() {
        return cno;
    }


    /**
     * Sets the cno value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @param cno
     */
    public void setCno(java.lang.String cno) {
        this.cno = cno;
    }


    /**
     * Gets the HCURSVCL value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @return HCURSVCL
     */
    public java.lang.String getHCURSVCL() {
        return HCURSVCL;
    }


    /**
     * Sets the HCURSVCL value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @param HCURSVCL
     */
    public void setHCURSVCL(java.lang.String HCURSVCL) {
        this.HCURSVCL = HCURSVCL;
    }


    /**
     * Gets the user value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the passwd value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @return passwd
     */
    public java.lang.String getPasswd() {
        return passwd;
    }


    /**
     * Sets the passwd value for this Query_OPSCH_AND_CLOCASED_LIST_from_DB2.
     * 
     * @param passwd
     */
    public void setPasswd(java.lang.String passwd) {
        this.passwd = passwd;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_OPSCH_AND_CLOCASED_LIST_from_DB2)) return false;
        Query_OPSCH_AND_CLOCASED_LIST_from_DB2 other = (Query_OPSCH_AND_CLOCASED_LIST_from_DB2) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taiwan_Date1==null && other.getTaiwan_Date1()==null) || 
             (this.taiwan_Date1!=null &&
              this.taiwan_Date1.equals(other.getTaiwan_Date1()))) &&
            ((this.taiwan_Date2==null && other.getTaiwan_Date2()==null) || 
             (this.taiwan_Date2!=null &&
              this.taiwan_Date2.equals(other.getTaiwan_Date2()))) &&
            ((this.cno==null && other.getCno()==null) || 
             (this.cno!=null &&
              this.cno.equals(other.getCno()))) &&
            ((this.HCURSVCL==null && other.getHCURSVCL()==null) || 
             (this.HCURSVCL!=null &&
              this.HCURSVCL.equals(other.getHCURSVCL()))) &&
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
        if (getTaiwan_Date1() != null) {
            _hashCode += getTaiwan_Date1().hashCode();
        }
        if (getTaiwan_Date2() != null) {
            _hashCode += getTaiwan_Date2().hashCode();
        }
        if (getCno() != null) {
            _hashCode += getCno().hashCode();
        }
        if (getHCURSVCL() != null) {
            _hashCode += getHCURSVCL().hashCode();
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
        new org.apache.axis.description.TypeDesc(Query_OPSCH_AND_CLOCASED_LIST_from_DB2.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_AND_CLOCASED_LIST_from_DB2"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("cno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Cno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HCURSVCL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "HCURSVCL"));
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
