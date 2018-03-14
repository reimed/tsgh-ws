/**
 * Query_REG_LISTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_REG_LISTResponse  implements java.io.Serializable {
    private org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult query_REG_LISTResult;

    public Query_REG_LISTResponse() {
    }

    public Query_REG_LISTResponse(
           org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult query_REG_LISTResult) {
           this.query_REG_LISTResult = query_REG_LISTResult;
    }


    /**
     * Gets the query_REG_LISTResult value for this Query_REG_LISTResponse.
     * 
     * @return query_REG_LISTResult
     */
    public org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult getQuery_REG_LISTResult() {
        return query_REG_LISTResult;
    }


    /**
     * Sets the query_REG_LISTResult value for this Query_REG_LISTResponse.
     * 
     * @param query_REG_LISTResult
     */
    public void setQuery_REG_LISTResult(org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult query_REG_LISTResult) {
        this.query_REG_LISTResult = query_REG_LISTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_REG_LISTResponse)) return false;
        Query_REG_LISTResponse other = (Query_REG_LISTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_REG_LISTResult==null && other.getQuery_REG_LISTResult()==null) || 
             (this.query_REG_LISTResult!=null &&
              this.query_REG_LISTResult.equals(other.getQuery_REG_LISTResult())));
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
        if (getQuery_REG_LISTResult() != null) {
            _hashCode += getQuery_REG_LISTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_REG_LISTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_REG_LISTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_REG_LISTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_REG_LISTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_REG_LISTResponse>Query_REG_LISTResult"));
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
