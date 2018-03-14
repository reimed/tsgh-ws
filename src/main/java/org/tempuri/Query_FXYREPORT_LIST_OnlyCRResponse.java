/**
 * Query_FXYREPORT_LIST_OnlyCRResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_FXYREPORT_LIST_OnlyCRResponse  implements java.io.Serializable {
    private org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult query_FXYREPORT_LIST_OnlyCRResult;

    public Query_FXYREPORT_LIST_OnlyCRResponse() {
    }

    public Query_FXYREPORT_LIST_OnlyCRResponse(
           org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult query_FXYREPORT_LIST_OnlyCRResult) {
           this.query_FXYREPORT_LIST_OnlyCRResult = query_FXYREPORT_LIST_OnlyCRResult;
    }


    /**
     * Gets the query_FXYREPORT_LIST_OnlyCRResult value for this Query_FXYREPORT_LIST_OnlyCRResponse.
     * 
     * @return query_FXYREPORT_LIST_OnlyCRResult
     */
    public org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult getQuery_FXYREPORT_LIST_OnlyCRResult() {
        return query_FXYREPORT_LIST_OnlyCRResult;
    }


    /**
     * Sets the query_FXYREPORT_LIST_OnlyCRResult value for this Query_FXYREPORT_LIST_OnlyCRResponse.
     * 
     * @param query_FXYREPORT_LIST_OnlyCRResult
     */
    public void setQuery_FXYREPORT_LIST_OnlyCRResult(org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult query_FXYREPORT_LIST_OnlyCRResult) {
        this.query_FXYREPORT_LIST_OnlyCRResult = query_FXYREPORT_LIST_OnlyCRResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_FXYREPORT_LIST_OnlyCRResponse)) return false;
        Query_FXYREPORT_LIST_OnlyCRResponse other = (Query_FXYREPORT_LIST_OnlyCRResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_FXYREPORT_LIST_OnlyCRResult==null && other.getQuery_FXYREPORT_LIST_OnlyCRResult()==null) || 
             (this.query_FXYREPORT_LIST_OnlyCRResult!=null &&
              this.query_FXYREPORT_LIST_OnlyCRResult.equals(other.getQuery_FXYREPORT_LIST_OnlyCRResult())));
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
        if (getQuery_FXYREPORT_LIST_OnlyCRResult() != null) {
            _hashCode += getQuery_FXYREPORT_LIST_OnlyCRResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_FXYREPORT_LIST_OnlyCRResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_LIST_OnlyCRResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_FXYREPORT_LIST_OnlyCRResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_LIST_OnlyCRResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_LIST_OnlyCRResponse>Query_FXYREPORT_LIST_OnlyCRResult"));
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
