/**
 * Query2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query2Response  implements java.io.Serializable {
    private org.tempuri.Query2ResponseQuery2Result query2Result;

    public Query2Response() {
    }

    public Query2Response(
           org.tempuri.Query2ResponseQuery2Result query2Result) {
           this.query2Result = query2Result;
    }


    /**
     * Gets the query2Result value for this Query2Response.
     * 
     * @return query2Result
     */
    public org.tempuri.Query2ResponseQuery2Result getQuery2Result() {
        return query2Result;
    }


    /**
     * Sets the query2Result value for this Query2Response.
     * 
     * @param query2Result
     */
    public void setQuery2Result(org.tempuri.Query2ResponseQuery2Result query2Result) {
        this.query2Result = query2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query2Response)) return false;
        Query2Response other = (Query2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query2Result==null && other.getQuery2Result()==null) || 
             (this.query2Result!=null &&
              this.query2Result.equals(other.getQuery2Result())));
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
        if (getQuery2Result() != null) {
            _hashCode += getQuery2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query2Response>Query2Result"));
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
