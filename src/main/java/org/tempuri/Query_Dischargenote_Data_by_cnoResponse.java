/**
 * Query_Dischargenote_Data_by_cnoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_Dischargenote_Data_by_cnoResponse  implements java.io.Serializable {
    private org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult query_Dischargenote_Data_by_cnoResult;

    public Query_Dischargenote_Data_by_cnoResponse() {
    }

    public Query_Dischargenote_Data_by_cnoResponse(
           org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult query_Dischargenote_Data_by_cnoResult) {
           this.query_Dischargenote_Data_by_cnoResult = query_Dischargenote_Data_by_cnoResult;
    }


    /**
     * Gets the query_Dischargenote_Data_by_cnoResult value for this Query_Dischargenote_Data_by_cnoResponse.
     * 
     * @return query_Dischargenote_Data_by_cnoResult
     */
    public org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult getQuery_Dischargenote_Data_by_cnoResult() {
        return query_Dischargenote_Data_by_cnoResult;
    }


    /**
     * Sets the query_Dischargenote_Data_by_cnoResult value for this Query_Dischargenote_Data_by_cnoResponse.
     * 
     * @param query_Dischargenote_Data_by_cnoResult
     */
    public void setQuery_Dischargenote_Data_by_cnoResult(org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult query_Dischargenote_Data_by_cnoResult) {
        this.query_Dischargenote_Data_by_cnoResult = query_Dischargenote_Data_by_cnoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_Dischargenote_Data_by_cnoResponse)) return false;
        Query_Dischargenote_Data_by_cnoResponse other = (Query_Dischargenote_Data_by_cnoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_Dischargenote_Data_by_cnoResult==null && other.getQuery_Dischargenote_Data_by_cnoResult()==null) || 
             (this.query_Dischargenote_Data_by_cnoResult!=null &&
              this.query_Dischargenote_Data_by_cnoResult.equals(other.getQuery_Dischargenote_Data_by_cnoResult())));
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
        if (getQuery_Dischargenote_Data_by_cnoResult() != null) {
            _hashCode += getQuery_Dischargenote_Data_by_cnoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_Dischargenote_Data_by_cnoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data_by_cnoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_Dischargenote_Data_by_cnoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_Data_by_cnoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_Data_by_cnoResponse>Query_Dischargenote_Data_by_cnoResult"));
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
