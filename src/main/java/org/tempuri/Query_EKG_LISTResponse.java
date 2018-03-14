/**
 * Query_EKG_LISTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_EKG_LISTResponse  implements java.io.Serializable {
    private org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult query_EKG_LISTResult;

    public Query_EKG_LISTResponse() {
    }

    public Query_EKG_LISTResponse(
           org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult query_EKG_LISTResult) {
           this.query_EKG_LISTResult = query_EKG_LISTResult;
    }


    /**
     * Gets the query_EKG_LISTResult value for this Query_EKG_LISTResponse.
     * 
     * @return query_EKG_LISTResult
     */
    public org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult getQuery_EKG_LISTResult() {
        return query_EKG_LISTResult;
    }


    /**
     * Sets the query_EKG_LISTResult value for this Query_EKG_LISTResponse.
     * 
     * @param query_EKG_LISTResult
     */
    public void setQuery_EKG_LISTResult(org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult query_EKG_LISTResult) {
        this.query_EKG_LISTResult = query_EKG_LISTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_EKG_LISTResponse)) return false;
        Query_EKG_LISTResponse other = (Query_EKG_LISTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_EKG_LISTResult==null && other.getQuery_EKG_LISTResult()==null) || 
             (this.query_EKG_LISTResult!=null &&
              this.query_EKG_LISTResult.equals(other.getQuery_EKG_LISTResult())));
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
        if (getQuery_EKG_LISTResult() != null) {
            _hashCode += getQuery_EKG_LISTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_EKG_LISTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_EKG_LISTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_EKG_LISTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_EKG_LISTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_EKG_LISTResponse>Query_EKG_LISTResult"));
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
