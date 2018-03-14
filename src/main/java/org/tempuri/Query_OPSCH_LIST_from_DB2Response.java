/**
 * Query_OPSCH_LIST_from_DB2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_OPSCH_LIST_from_DB2Response  implements java.io.Serializable {
    private org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result query_OPSCH_LIST_from_DB2Result;

    public Query_OPSCH_LIST_from_DB2Response() {
    }

    public Query_OPSCH_LIST_from_DB2Response(
           org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result query_OPSCH_LIST_from_DB2Result) {
           this.query_OPSCH_LIST_from_DB2Result = query_OPSCH_LIST_from_DB2Result;
    }


    /**
     * Gets the query_OPSCH_LIST_from_DB2Result value for this Query_OPSCH_LIST_from_DB2Response.
     * 
     * @return query_OPSCH_LIST_from_DB2Result
     */
    public org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result getQuery_OPSCH_LIST_from_DB2Result() {
        return query_OPSCH_LIST_from_DB2Result;
    }


    /**
     * Sets the query_OPSCH_LIST_from_DB2Result value for this Query_OPSCH_LIST_from_DB2Response.
     * 
     * @param query_OPSCH_LIST_from_DB2Result
     */
    public void setQuery_OPSCH_LIST_from_DB2Result(org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result query_OPSCH_LIST_from_DB2Result) {
        this.query_OPSCH_LIST_from_DB2Result = query_OPSCH_LIST_from_DB2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_OPSCH_LIST_from_DB2Response)) return false;
        Query_OPSCH_LIST_from_DB2Response other = (Query_OPSCH_LIST_from_DB2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_OPSCH_LIST_from_DB2Result==null && other.getQuery_OPSCH_LIST_from_DB2Result()==null) || 
             (this.query_OPSCH_LIST_from_DB2Result!=null &&
              this.query_OPSCH_LIST_from_DB2Result.equals(other.getQuery_OPSCH_LIST_from_DB2Result())));
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
        if (getQuery_OPSCH_LIST_from_DB2Result() != null) {
            _hashCode += getQuery_OPSCH_LIST_from_DB2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_OPSCH_LIST_from_DB2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_LIST_from_DB2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_OPSCH_LIST_from_DB2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OPSCH_LIST_from_DB2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OPSCH_LIST_from_DB2Response>Query_OPSCH_LIST_from_DB2Result"));
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
