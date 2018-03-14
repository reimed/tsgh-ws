/**
 * GET_PatientBascInfomation_by_IDNOResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GET_PatientBascInfomation_by_IDNOResponse  implements java.io.Serializable {
    private org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult GET_PatientBascInfomation_by_IDNOResult;

    public GET_PatientBascInfomation_by_IDNOResponse() {
    }

    public GET_PatientBascInfomation_by_IDNOResponse(
           org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult GET_PatientBascInfomation_by_IDNOResult) {
           this.GET_PatientBascInfomation_by_IDNOResult = GET_PatientBascInfomation_by_IDNOResult;
    }


    /**
     * Gets the GET_PatientBascInfomation_by_IDNOResult value for this GET_PatientBascInfomation_by_IDNOResponse.
     * 
     * @return GET_PatientBascInfomation_by_IDNOResult
     */
    public org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult getGET_PatientBascInfomation_by_IDNOResult() {
        return GET_PatientBascInfomation_by_IDNOResult;
    }


    /**
     * Sets the GET_PatientBascInfomation_by_IDNOResult value for this GET_PatientBascInfomation_by_IDNOResponse.
     * 
     * @param GET_PatientBascInfomation_by_IDNOResult
     */
    public void setGET_PatientBascInfomation_by_IDNOResult(org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult GET_PatientBascInfomation_by_IDNOResult) {
        this.GET_PatientBascInfomation_by_IDNOResult = GET_PatientBascInfomation_by_IDNOResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GET_PatientBascInfomation_by_IDNOResponse)) return false;
        GET_PatientBascInfomation_by_IDNOResponse other = (GET_PatientBascInfomation_by_IDNOResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GET_PatientBascInfomation_by_IDNOResult==null && other.getGET_PatientBascInfomation_by_IDNOResult()==null) || 
             (this.GET_PatientBascInfomation_by_IDNOResult!=null &&
              this.GET_PatientBascInfomation_by_IDNOResult.equals(other.getGET_PatientBascInfomation_by_IDNOResult())));
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
        if (getGET_PatientBascInfomation_by_IDNOResult() != null) {
            _hashCode += getGET_PatientBascInfomation_by_IDNOResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GET_PatientBascInfomation_by_IDNOResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GET_PatientBascInfomation_by_IDNOResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GET_PatientBascInfomation_by_IDNOResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_PatientBascInfomation_by_IDNOResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_PatientBascInfomation_by_IDNOResponse>GET_PatientBascInfomation_by_IDNOResult"));
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
