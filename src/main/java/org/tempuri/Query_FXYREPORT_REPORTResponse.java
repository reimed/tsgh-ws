/**
 * Query_FXYREPORT_REPORTResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_FXYREPORT_REPORTResponse  implements java.io.Serializable {
    private org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult query_FXYREPORT_REPORTResult;

    public Query_FXYREPORT_REPORTResponse() {
    }

    public Query_FXYREPORT_REPORTResponse(
           org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult query_FXYREPORT_REPORTResult) {
           this.query_FXYREPORT_REPORTResult = query_FXYREPORT_REPORTResult;
    }


    /**
     * Gets the query_FXYREPORT_REPORTResult value for this Query_FXYREPORT_REPORTResponse.
     * 
     * @return query_FXYREPORT_REPORTResult
     */
    public org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult getQuery_FXYREPORT_REPORTResult() {
        return query_FXYREPORT_REPORTResult;
    }


    /**
     * Sets the query_FXYREPORT_REPORTResult value for this Query_FXYREPORT_REPORTResponse.
     * 
     * @param query_FXYREPORT_REPORTResult
     */
    public void setQuery_FXYREPORT_REPORTResult(org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult query_FXYREPORT_REPORTResult) {
        this.query_FXYREPORT_REPORTResult = query_FXYREPORT_REPORTResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_FXYREPORT_REPORTResponse)) return false;
        Query_FXYREPORT_REPORTResponse other = (Query_FXYREPORT_REPORTResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_FXYREPORT_REPORTResult==null && other.getQuery_FXYREPORT_REPORTResult()==null) || 
             (this.query_FXYREPORT_REPORTResult!=null &&
              this.query_FXYREPORT_REPORTResult.equals(other.getQuery_FXYREPORT_REPORTResult())));
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
        if (getQuery_FXYREPORT_REPORTResult() != null) {
            _hashCode += getQuery_FXYREPORT_REPORTResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_FXYREPORT_REPORTResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_REPORTResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_FXYREPORT_REPORTResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_REPORTResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_REPORTResponse>Query_FXYREPORT_REPORTResult"));
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
