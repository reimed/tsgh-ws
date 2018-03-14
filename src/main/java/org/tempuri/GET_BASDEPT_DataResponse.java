/**
 * GET_BASDEPT_DataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GET_BASDEPT_DataResponse  implements java.io.Serializable {
    private org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult GET_BASDEPT_DataResult;

    public GET_BASDEPT_DataResponse() {
    }

    public GET_BASDEPT_DataResponse(
           org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult GET_BASDEPT_DataResult) {
           this.GET_BASDEPT_DataResult = GET_BASDEPT_DataResult;
    }


    /**
     * Gets the GET_BASDEPT_DataResult value for this GET_BASDEPT_DataResponse.
     * 
     * @return GET_BASDEPT_DataResult
     */
    public org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult getGET_BASDEPT_DataResult() {
        return GET_BASDEPT_DataResult;
    }


    /**
     * Sets the GET_BASDEPT_DataResult value for this GET_BASDEPT_DataResponse.
     * 
     * @param GET_BASDEPT_DataResult
     */
    public void setGET_BASDEPT_DataResult(org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult GET_BASDEPT_DataResult) {
        this.GET_BASDEPT_DataResult = GET_BASDEPT_DataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GET_BASDEPT_DataResponse)) return false;
        GET_BASDEPT_DataResponse other = (GET_BASDEPT_DataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GET_BASDEPT_DataResult==null && other.getGET_BASDEPT_DataResult()==null) || 
             (this.GET_BASDEPT_DataResult!=null &&
              this.GET_BASDEPT_DataResult.equals(other.getGET_BASDEPT_DataResult())));
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
        if (getGET_BASDEPT_DataResult() != null) {
            _hashCode += getGET_BASDEPT_DataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GET_BASDEPT_DataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GET_BASDEPT_DataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GET_BASDEPT_DataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_BASDEPT_DataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_BASDEPT_DataResponse>GET_BASDEPT_DataResult"));
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
