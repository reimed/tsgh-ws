/**
 * GET_PatientBascInfomationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GET_PatientBascInfomationResponse  implements java.io.Serializable {
    private org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult GET_PatientBascInfomationResult;

    public GET_PatientBascInfomationResponse() {
    }

    public GET_PatientBascInfomationResponse(
           org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult GET_PatientBascInfomationResult) {
           this.GET_PatientBascInfomationResult = GET_PatientBascInfomationResult;
    }


    /**
     * Gets the GET_PatientBascInfomationResult value for this GET_PatientBascInfomationResponse.
     * 
     * @return GET_PatientBascInfomationResult
     */
    public org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult getGET_PatientBascInfomationResult() {
        return GET_PatientBascInfomationResult;
    }


    /**
     * Sets the GET_PatientBascInfomationResult value for this GET_PatientBascInfomationResponse.
     * 
     * @param GET_PatientBascInfomationResult
     */
    public void setGET_PatientBascInfomationResult(org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult GET_PatientBascInfomationResult) {
        this.GET_PatientBascInfomationResult = GET_PatientBascInfomationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GET_PatientBascInfomationResponse)) return false;
        GET_PatientBascInfomationResponse other = (GET_PatientBascInfomationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GET_PatientBascInfomationResult==null && other.getGET_PatientBascInfomationResult()==null) || 
             (this.GET_PatientBascInfomationResult!=null &&
              this.GET_PatientBascInfomationResult.equals(other.getGET_PatientBascInfomationResult())));
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
        if (getGET_PatientBascInfomationResult() != null) {
            _hashCode += getGET_PatientBascInfomationResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GET_PatientBascInfomationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GET_PatientBascInfomationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GET_PatientBascInfomationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_PatientBascInfomationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_PatientBascInfomationResponse>GET_PatientBascInfomationResult"));
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
