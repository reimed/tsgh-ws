/**
 * Query_RIS_MODALITY_IS_US_MG_BREASTS2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_RIS_MODALITY_IS_US_MG_BREASTS2Response  implements java.io.Serializable {
    private java.lang.String query_RIS_MODALITY_IS_US_MG_BREASTS2Result;

    public Query_RIS_MODALITY_IS_US_MG_BREASTS2Response() {
    }

    public Query_RIS_MODALITY_IS_US_MG_BREASTS2Response(
           java.lang.String query_RIS_MODALITY_IS_US_MG_BREASTS2Result) {
           this.query_RIS_MODALITY_IS_US_MG_BREASTS2Result = query_RIS_MODALITY_IS_US_MG_BREASTS2Result;
    }


    /**
     * Gets the query_RIS_MODALITY_IS_US_MG_BREASTS2Result value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2Response.
     * 
     * @return query_RIS_MODALITY_IS_US_MG_BREASTS2Result
     */
    public java.lang.String getQuery_RIS_MODALITY_IS_US_MG_BREASTS2Result() {
        return query_RIS_MODALITY_IS_US_MG_BREASTS2Result;
    }


    /**
     * Sets the query_RIS_MODALITY_IS_US_MG_BREASTS2Result value for this Query_RIS_MODALITY_IS_US_MG_BREASTS2Response.
     * 
     * @param query_RIS_MODALITY_IS_US_MG_BREASTS2Result
     */
    public void setQuery_RIS_MODALITY_IS_US_MG_BREASTS2Result(java.lang.String query_RIS_MODALITY_IS_US_MG_BREASTS2Result) {
        this.query_RIS_MODALITY_IS_US_MG_BREASTS2Result = query_RIS_MODALITY_IS_US_MG_BREASTS2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_RIS_MODALITY_IS_US_MG_BREASTS2Response)) return false;
        Query_RIS_MODALITY_IS_US_MG_BREASTS2Response other = (Query_RIS_MODALITY_IS_US_MG_BREASTS2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_RIS_MODALITY_IS_US_MG_BREASTS2Result==null && other.getQuery_RIS_MODALITY_IS_US_MG_BREASTS2Result()==null) || 
             (this.query_RIS_MODALITY_IS_US_MG_BREASTS2Result!=null &&
              this.query_RIS_MODALITY_IS_US_MG_BREASTS2Result.equals(other.getQuery_RIS_MODALITY_IS_US_MG_BREASTS2Result())));
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
        if (getQuery_RIS_MODALITY_IS_US_MG_BREASTS2Result() != null) {
            _hashCode += getQuery_RIS_MODALITY_IS_US_MG_BREASTS2Result().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_RIS_MODALITY_IS_US_MG_BREASTS2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTS2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_RIS_MODALITY_IS_US_MG_BREASTS2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTS2Result"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
