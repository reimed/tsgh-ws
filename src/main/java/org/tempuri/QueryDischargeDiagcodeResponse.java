/**
 * QueryDischargeDiagcodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class QueryDischargeDiagcodeResponse  implements java.io.Serializable {
    private org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult queryDischargeDiagcodeResult;

    public QueryDischargeDiagcodeResponse() {
    }

    public QueryDischargeDiagcodeResponse(
           org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult queryDischargeDiagcodeResult) {
           this.queryDischargeDiagcodeResult = queryDischargeDiagcodeResult;
    }


    /**
     * Gets the queryDischargeDiagcodeResult value for this QueryDischargeDiagcodeResponse.
     * 
     * @return queryDischargeDiagcodeResult
     */
    public org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult getQueryDischargeDiagcodeResult() {
        return queryDischargeDiagcodeResult;
    }


    /**
     * Sets the queryDischargeDiagcodeResult value for this QueryDischargeDiagcodeResponse.
     * 
     * @param queryDischargeDiagcodeResult
     */
    public void setQueryDischargeDiagcodeResult(org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult queryDischargeDiagcodeResult) {
        this.queryDischargeDiagcodeResult = queryDischargeDiagcodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof QueryDischargeDiagcodeResponse)) return false;
        QueryDischargeDiagcodeResponse other = (QueryDischargeDiagcodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.queryDischargeDiagcodeResult==null && other.getQueryDischargeDiagcodeResult()==null) || 
             (this.queryDischargeDiagcodeResult!=null &&
              this.queryDischargeDiagcodeResult.equals(other.getQueryDischargeDiagcodeResult())));
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
        if (getQueryDischargeDiagcodeResult() != null) {
            _hashCode += getQueryDischargeDiagcodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(QueryDischargeDiagcodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">QueryDischargeDiagcodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queryDischargeDiagcodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryDischargeDiagcodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryDischargeDiagcodeResponse>QueryDischargeDiagcodeResult"));
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
