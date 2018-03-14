/**
 * GET_USER_DataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GET_USER_DataResponse  implements java.io.Serializable {
    private org.tempuri.GET_USER_DataResponseGET_USER_DataResult GET_USER_DataResult;

    public GET_USER_DataResponse() {
    }

    public GET_USER_DataResponse(
           org.tempuri.GET_USER_DataResponseGET_USER_DataResult GET_USER_DataResult) {
           this.GET_USER_DataResult = GET_USER_DataResult;
    }


    /**
     * Gets the GET_USER_DataResult value for this GET_USER_DataResponse.
     * 
     * @return GET_USER_DataResult
     */
    public org.tempuri.GET_USER_DataResponseGET_USER_DataResult getGET_USER_DataResult() {
        return GET_USER_DataResult;
    }


    /**
     * Sets the GET_USER_DataResult value for this GET_USER_DataResponse.
     * 
     * @param GET_USER_DataResult
     */
    public void setGET_USER_DataResult(org.tempuri.GET_USER_DataResponseGET_USER_DataResult GET_USER_DataResult) {
        this.GET_USER_DataResult = GET_USER_DataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GET_USER_DataResponse)) return false;
        GET_USER_DataResponse other = (GET_USER_DataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GET_USER_DataResult==null && other.getGET_USER_DataResult()==null) || 
             (this.GET_USER_DataResult!=null &&
              this.GET_USER_DataResult.equals(other.getGET_USER_DataResult())));
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
        if (getGET_USER_DataResult() != null) {
            _hashCode += getGET_USER_DataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GET_USER_DataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_DataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GET_USER_DataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_DataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_DataResponse>GET_USER_DataResult"));
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
