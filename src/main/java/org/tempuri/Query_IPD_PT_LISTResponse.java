/**
 * Query_IPD_PT_LISTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_IPD_PT_LISTResponse  implements java.io.Serializable {
    private org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult query_IPD_PT_LISTResult;

    public Query_IPD_PT_LISTResponse() {
    }

    public Query_IPD_PT_LISTResponse(
           org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult query_IPD_PT_LISTResult) {
           this.query_IPD_PT_LISTResult = query_IPD_PT_LISTResult;
    }


    /**
     * Gets the query_IPD_PT_LISTResult value for this Query_IPD_PT_LISTResponse.
     * 
     * @return query_IPD_PT_LISTResult
     */
    public org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult getQuery_IPD_PT_LISTResult() {
        return query_IPD_PT_LISTResult;
    }


    /**
     * Sets the query_IPD_PT_LISTResult value for this Query_IPD_PT_LISTResponse.
     * 
     * @param query_IPD_PT_LISTResult
     */
    public void setQuery_IPD_PT_LISTResult(org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult query_IPD_PT_LISTResult) {
        this.query_IPD_PT_LISTResult = query_IPD_PT_LISTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_IPD_PT_LISTResponse)) return false;
        Query_IPD_PT_LISTResponse other = (Query_IPD_PT_LISTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_IPD_PT_LISTResult==null && other.getQuery_IPD_PT_LISTResult()==null) || 
             (this.query_IPD_PT_LISTResult!=null &&
              this.query_IPD_PT_LISTResult.equals(other.getQuery_IPD_PT_LISTResult())));
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
        if (getQuery_IPD_PT_LISTResult() != null) {
            _hashCode += getQuery_IPD_PT_LISTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_IPD_PT_LISTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_IPD_PT_LISTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_IPD_PT_LISTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_IPD_PT_LISTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_IPD_PT_LISTResponse>Query_IPD_PT_LISTResult"));
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
