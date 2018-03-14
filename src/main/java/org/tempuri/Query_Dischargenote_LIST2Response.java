/**
 * Query_Dischargenote_LIST2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_Dischargenote_LIST2Response  implements java.io.Serializable {
    private org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result query_Dischargenote_LIST2Result;

    public Query_Dischargenote_LIST2Response() {
    }

    public Query_Dischargenote_LIST2Response(
           org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result query_Dischargenote_LIST2Result) {
           this.query_Dischargenote_LIST2Result = query_Dischargenote_LIST2Result;
    }


    /**
     * Gets the query_Dischargenote_LIST2Result value for this Query_Dischargenote_LIST2Response.
     * 
     * @return query_Dischargenote_LIST2Result
     */
    public org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result getQuery_Dischargenote_LIST2Result() {
        return query_Dischargenote_LIST2Result;
    }


    /**
     * Sets the query_Dischargenote_LIST2Result value for this Query_Dischargenote_LIST2Response.
     * 
     * @param query_Dischargenote_LIST2Result
     */
    public void setQuery_Dischargenote_LIST2Result(org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result query_Dischargenote_LIST2Result) {
        this.query_Dischargenote_LIST2Result = query_Dischargenote_LIST2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_Dischargenote_LIST2Response)) return false;
        Query_Dischargenote_LIST2Response other = (Query_Dischargenote_LIST2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_Dischargenote_LIST2Result==null && other.getQuery_Dischargenote_LIST2Result()==null) || 
             (this.query_Dischargenote_LIST2Result!=null &&
              this.query_Dischargenote_LIST2Result.equals(other.getQuery_Dischargenote_LIST2Result())));
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
        if (getQuery_Dischargenote_LIST2Result() != null) {
            _hashCode += getQuery_Dischargenote_LIST2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_Dischargenote_LIST2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_LIST2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_Dischargenote_LIST2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_LIST2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_LIST2Response>Query_Dischargenote_LIST2Result"));
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
