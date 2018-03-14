/**
 * Query_OP_EventTimeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_OP_EventTimeResponse  implements java.io.Serializable {
    private org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult query_OP_EventTimeResult;

    public Query_OP_EventTimeResponse() {
    }

    public Query_OP_EventTimeResponse(
           org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult query_OP_EventTimeResult) {
           this.query_OP_EventTimeResult = query_OP_EventTimeResult;
    }


    /**
     * Gets the query_OP_EventTimeResult value for this Query_OP_EventTimeResponse.
     * 
     * @return query_OP_EventTimeResult
     */
    public org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult getQuery_OP_EventTimeResult() {
        return query_OP_EventTimeResult;
    }


    /**
     * Sets the query_OP_EventTimeResult value for this Query_OP_EventTimeResponse.
     * 
     * @param query_OP_EventTimeResult
     */
    public void setQuery_OP_EventTimeResult(org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult query_OP_EventTimeResult) {
        this.query_OP_EventTimeResult = query_OP_EventTimeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_OP_EventTimeResponse)) return false;
        Query_OP_EventTimeResponse other = (Query_OP_EventTimeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_OP_EventTimeResult==null && other.getQuery_OP_EventTimeResult()==null) || 
             (this.query_OP_EventTimeResult!=null &&
              this.query_OP_EventTimeResult.equals(other.getQuery_OP_EventTimeResult())));
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
        if (getQuery_OP_EventTimeResult() != null) {
            _hashCode += getQuery_OP_EventTimeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_OP_EventTimeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OP_EventTimeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_OP_EventTimeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OP_EventTimeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OP_EventTimeResponse>Query_OP_EventTimeResult"));
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
