/**
 * Query_Dischargenote_DataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_Dischargenote_DataResponse  implements java.io.Serializable {
    private org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult query_Dischargenote_DataResult;

    public Query_Dischargenote_DataResponse() {
    }

    public Query_Dischargenote_DataResponse(
           org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult query_Dischargenote_DataResult) {
           this.query_Dischargenote_DataResult = query_Dischargenote_DataResult;
    }


    /**
     * Gets the query_Dischargenote_DataResult value for this Query_Dischargenote_DataResponse.
     * 
     * @return query_Dischargenote_DataResult
     */
    public org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult getQuery_Dischargenote_DataResult() {
        return query_Dischargenote_DataResult;
    }


    /**
     * Sets the query_Dischargenote_DataResult value for this Query_Dischargenote_DataResponse.
     * 
     * @param query_Dischargenote_DataResult
     */
    public void setQuery_Dischargenote_DataResult(org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult query_Dischargenote_DataResult) {
        this.query_Dischargenote_DataResult = query_Dischargenote_DataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_Dischargenote_DataResponse)) return false;
        Query_Dischargenote_DataResponse other = (Query_Dischargenote_DataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_Dischargenote_DataResult==null && other.getQuery_Dischargenote_DataResult()==null) || 
             (this.query_Dischargenote_DataResult!=null &&
              this.query_Dischargenote_DataResult.equals(other.getQuery_Dischargenote_DataResult())));
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
        if (getQuery_Dischargenote_DataResult() != null) {
            _hashCode += getQuery_Dischargenote_DataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_Dischargenote_DataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_DataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_Dischargenote_DataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_DataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_DataResponse>Query_Dischargenote_DataResult"));
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
