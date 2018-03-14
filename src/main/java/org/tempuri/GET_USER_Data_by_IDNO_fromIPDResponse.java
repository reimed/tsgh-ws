/**
 * GET_USER_Data_by_IDNO_fromIPDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GET_USER_Data_by_IDNO_fromIPDResponse  implements java.io.Serializable {
    private org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult GET_USER_Data_by_IDNO_fromIPDResult;

    public GET_USER_Data_by_IDNO_fromIPDResponse() {
    }

    public GET_USER_Data_by_IDNO_fromIPDResponse(
           org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult GET_USER_Data_by_IDNO_fromIPDResult) {
           this.GET_USER_Data_by_IDNO_fromIPDResult = GET_USER_Data_by_IDNO_fromIPDResult;
    }


    /**
     * Gets the GET_USER_Data_by_IDNO_fromIPDResult value for this GET_USER_Data_by_IDNO_fromIPDResponse.
     * 
     * @return GET_USER_Data_by_IDNO_fromIPDResult
     */
    public org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult getGET_USER_Data_by_IDNO_fromIPDResult() {
        return GET_USER_Data_by_IDNO_fromIPDResult;
    }


    /**
     * Sets the GET_USER_Data_by_IDNO_fromIPDResult value for this GET_USER_Data_by_IDNO_fromIPDResponse.
     * 
     * @param GET_USER_Data_by_IDNO_fromIPDResult
     */
    public void setGET_USER_Data_by_IDNO_fromIPDResult(org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult GET_USER_Data_by_IDNO_fromIPDResult) {
        this.GET_USER_Data_by_IDNO_fromIPDResult = GET_USER_Data_by_IDNO_fromIPDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GET_USER_Data_by_IDNO_fromIPDResponse)) return false;
        GET_USER_Data_by_IDNO_fromIPDResponse other = (GET_USER_Data_by_IDNO_fromIPDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.GET_USER_Data_by_IDNO_fromIPDResult==null && other.getGET_USER_Data_by_IDNO_fromIPDResult()==null) || 
             (this.GET_USER_Data_by_IDNO_fromIPDResult!=null &&
              this.GET_USER_Data_by_IDNO_fromIPDResult.equals(other.getGET_USER_Data_by_IDNO_fromIPDResult())));
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
        if (getGET_USER_Data_by_IDNO_fromIPDResult() != null) {
            _hashCode += getGET_USER_Data_by_IDNO_fromIPDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GET_USER_Data_by_IDNO_fromIPDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNO_fromIPDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GET_USER_Data_by_IDNO_fromIPDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNO_fromIPDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNO_fromIPDResponse>GET_USER_Data_by_IDNO_fromIPDResult"));
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
