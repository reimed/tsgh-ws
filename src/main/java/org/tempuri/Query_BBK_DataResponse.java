/**
 * Query_BBK_DataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_BBK_DataResponse  implements java.io.Serializable {
    private org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult query_BBK_DataResult;

    public Query_BBK_DataResponse() {
    }

    public Query_BBK_DataResponse(
           org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult query_BBK_DataResult) {
           this.query_BBK_DataResult = query_BBK_DataResult;
    }


    /**
     * Gets the query_BBK_DataResult value for this Query_BBK_DataResponse.
     * 
     * @return query_BBK_DataResult
     */
    public org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult getQuery_BBK_DataResult() {
        return query_BBK_DataResult;
    }


    /**
     * Sets the query_BBK_DataResult value for this Query_BBK_DataResponse.
     * 
     * @param query_BBK_DataResult
     */
    public void setQuery_BBK_DataResult(org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult query_BBK_DataResult) {
        this.query_BBK_DataResult = query_BBK_DataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_BBK_DataResponse)) return false;
        Query_BBK_DataResponse other = (Query_BBK_DataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_BBK_DataResult==null && other.getQuery_BBK_DataResult()==null) || 
             (this.query_BBK_DataResult!=null &&
              this.query_BBK_DataResult.equals(other.getQuery_BBK_DataResult())));
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
        if (getQuery_BBK_DataResult() != null) {
            _hashCode += getQuery_BBK_DataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_BBK_DataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_BBK_DataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_BBK_DataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_BBK_DataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_BBK_DataResponse>Query_BBK_DataResult"));
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
