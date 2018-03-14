/**
 * GET_USER_Data_by_IDNO_fromOPDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GET_USER_Data_by_IDNO_fromOPDResponse  implements java.io.Serializable {
    private org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult GET_USER_Data_by_IDNO_fromOPDResult;

    public GET_USER_Data_by_IDNO_fromOPDResponse() {
    }

    public GET_USER_Data_by_IDNO_fromOPDResponse(
           org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult GET_USER_Data_by_IDNO_fromOPDResult) {
           this.GET_USER_Data_by_IDNO_fromOPDResult = GET_USER_Data_by_IDNO_fromOPDResult;
    }


    /**
     * Gets the GET_USER_Data_by_IDNO_fromOPDResult value for this GET_USER_Data_by_IDNO_fromOPDResponse.
     * 
     * @return GET_USER_Data_by_IDNO_fromOPDResult
     */
    public org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult getGET_USER_Data_by_IDNO_fromOPDResult() {
        return GET_USER_Data_by_IDNO_fromOPDResult;
    }


    /**
     * Sets the GET_USER_Data_by_IDNO_fromOPDResult value for this GET_USER_Data_by_IDNO_fromOPDResponse.
     * 
     * @param GET_USER_Data_by_IDNO_fromOPDResult
     */
    public void setGET_USER_Data_by_IDNO_fromOPDResult(org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult GET_USER_Data_by_IDNO_fromOPDResult) {
        this.GET_USER_Data_by_IDNO_fromOPDResult = GET_USER_Data_by_IDNO_fromOPDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GET_USER_Data_by_IDNO_fromOPDResponse)) return false;
        GET_USER_Data_by_IDNO_fromOPDResponse other = (GET_USER_Data_by_IDNO_fromOPDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GET_USER_Data_by_IDNO_fromOPDResult==null && other.getGET_USER_Data_by_IDNO_fromOPDResult()==null) || 
             (this.GET_USER_Data_by_IDNO_fromOPDResult!=null &&
              this.GET_USER_Data_by_IDNO_fromOPDResult.equals(other.getGET_USER_Data_by_IDNO_fromOPDResult())));
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
        if (getGET_USER_Data_by_IDNO_fromOPDResult() != null) {
            _hashCode += getGET_USER_Data_by_IDNO_fromOPDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GET_USER_Data_by_IDNO_fromOPDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNO_fromOPDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GET_USER_Data_by_IDNO_fromOPDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNO_fromOPDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNO_fromOPDResponse>GET_USER_Data_by_IDNO_fromOPDResult"));
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
