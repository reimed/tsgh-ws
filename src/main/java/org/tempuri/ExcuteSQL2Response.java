/**
 * ExcuteSQL2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class ExcuteSQL2Response  implements java.io.Serializable {
    private int excuteSQL2Result;

    public ExcuteSQL2Response() {
    }

    public ExcuteSQL2Response(
           int excuteSQL2Result) {
           this.excuteSQL2Result = excuteSQL2Result;
    }


    /**
     * Gets the excuteSQL2Result value for this ExcuteSQL2Response.
     * 
     * @return excuteSQL2Result
     */
    public int getExcuteSQL2Result() {
        return excuteSQL2Result;
    }


    /**
     * Sets the excuteSQL2Result value for this ExcuteSQL2Response.
     * 
     * @param excuteSQL2Result
     */
    public void setExcuteSQL2Result(int excuteSQL2Result) {
        this.excuteSQL2Result = excuteSQL2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExcuteSQL2Response)) return false;
        ExcuteSQL2Response other = (ExcuteSQL2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.excuteSQL2Result == other.getExcuteSQL2Result();
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
        _hashCode += getExcuteSQL2Result();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExcuteSQL2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">ExcuteSQL2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excuteSQL2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ExcuteSQL2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
