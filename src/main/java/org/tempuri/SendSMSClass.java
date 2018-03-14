/**
 * SendSMSClass.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class SendSMSClass  implements java.io.Serializable {
    private java.lang.String send_text;

    private java.lang.String phs;

    private java.lang.String full_phs;

    private java.lang.String send_unit;

    private java.lang.String system_name;

    public SendSMSClass() {
    }

    public SendSMSClass(
           java.lang.String send_text,
           java.lang.String phs,
           java.lang.String full_phs,
           java.lang.String send_unit,
           java.lang.String system_name) {
           this.send_text = send_text;
           this.phs = phs;
           this.full_phs = full_phs;
           this.send_unit = send_unit;
           this.system_name = system_name;
    }


    /**
     * Gets the send_text value for this SendSMSClass.
     * 
     * @return send_text
     */
    public java.lang.String getSend_text() {
        return send_text;
    }


    /**
     * Sets the send_text value for this SendSMSClass.
     * 
     * @param send_text
     */
    public void setSend_text(java.lang.String send_text) {
        this.send_text = send_text;
    }


    /**
     * Gets the phs value for this SendSMSClass.
     * 
     * @return phs
     */
    public java.lang.String getPhs() {
        return phs;
    }


    /**
     * Sets the phs value for this SendSMSClass.
     * 
     * @param phs
     */
    public void setPhs(java.lang.String phs) {
        this.phs = phs;
    }


    /**
     * Gets the full_phs value for this SendSMSClass.
     * 
     * @return full_phs
     */
    public java.lang.String getFull_phs() {
        return full_phs;
    }


    /**
     * Sets the full_phs value for this SendSMSClass.
     * 
     * @param full_phs
     */
    public void setFull_phs(java.lang.String full_phs) {
        this.full_phs = full_phs;
    }


    /**
     * Gets the send_unit value for this SendSMSClass.
     * 
     * @return send_unit
     */
    public java.lang.String getSend_unit() {
        return send_unit;
    }


    /**
     * Sets the send_unit value for this SendSMSClass.
     * 
     * @param send_unit
     */
    public void setSend_unit(java.lang.String send_unit) {
        this.send_unit = send_unit;
    }


    /**
     * Gets the system_name value for this SendSMSClass.
     * 
     * @return system_name
     */
    public java.lang.String getSystem_name() {
        return system_name;
    }


    /**
     * Sets the system_name value for this SendSMSClass.
     * 
     * @param system_name
     */
    public void setSystem_name(java.lang.String system_name) {
        this.system_name = system_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SendSMSClass)) return false;
        SendSMSClass other = (SendSMSClass) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.send_text==null && other.getSend_text()==null) || 
             (this.send_text!=null &&
              this.send_text.equals(other.getSend_text()))) &&
            ((this.phs==null && other.getPhs()==null) || 
             (this.phs!=null &&
              this.phs.equals(other.getPhs()))) &&
            ((this.full_phs==null && other.getFull_phs()==null) || 
             (this.full_phs!=null &&
              this.full_phs.equals(other.getFull_phs()))) &&
            ((this.send_unit==null && other.getSend_unit()==null) || 
             (this.send_unit!=null &&
              this.send_unit.equals(other.getSend_unit()))) &&
            ((this.system_name==null && other.getSystem_name()==null) || 
             (this.system_name!=null &&
              this.system_name.equals(other.getSystem_name())));
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
        if (getSend_text() != null) {
            _hashCode += getSend_text().hashCode();
        }
        if (getPhs() != null) {
            _hashCode += getPhs().hashCode();
        }
        if (getFull_phs() != null) {
            _hashCode += getFull_phs().hashCode();
        }
        if (getSend_unit() != null) {
            _hashCode += getSend_unit().hashCode();
        }
        if (getSystem_name() != null) {
            _hashCode += getSystem_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SendSMSClass.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "SendSMSClass"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "send_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "phs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("full_phs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "full_phs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send_unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "send_unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("system_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "system_name"));
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
