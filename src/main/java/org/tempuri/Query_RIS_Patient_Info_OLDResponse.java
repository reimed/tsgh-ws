/**
 * Query_RIS_Patient_Info_OLDResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_RIS_Patient_Info_OLDResponse  implements java.io.Serializable {
    private org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult query_RIS_Patient_Info_OLDResult;

    public Query_RIS_Patient_Info_OLDResponse() {
    }

    public Query_RIS_Patient_Info_OLDResponse(
           org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult query_RIS_Patient_Info_OLDResult) {
           this.query_RIS_Patient_Info_OLDResult = query_RIS_Patient_Info_OLDResult;
    }


    /**
     * Gets the query_RIS_Patient_Info_OLDResult value for this Query_RIS_Patient_Info_OLDResponse.
     * 
     * @return query_RIS_Patient_Info_OLDResult
     */
    public org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult getQuery_RIS_Patient_Info_OLDResult() {
        return query_RIS_Patient_Info_OLDResult;
    }


    /**
     * Sets the query_RIS_Patient_Info_OLDResult value for this Query_RIS_Patient_Info_OLDResponse.
     * 
     * @param query_RIS_Patient_Info_OLDResult
     */
    public void setQuery_RIS_Patient_Info_OLDResult(org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult query_RIS_Patient_Info_OLDResult) {
        this.query_RIS_Patient_Info_OLDResult = query_RIS_Patient_Info_OLDResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_RIS_Patient_Info_OLDResponse)) return false;
        Query_RIS_Patient_Info_OLDResponse other = (Query_RIS_Patient_Info_OLDResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_RIS_Patient_Info_OLDResult==null && other.getQuery_RIS_Patient_Info_OLDResult()==null) || 
             (this.query_RIS_Patient_Info_OLDResult!=null &&
              this.query_RIS_Patient_Info_OLDResult.equals(other.getQuery_RIS_Patient_Info_OLDResult())));
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
        if (getQuery_RIS_Patient_Info_OLDResult() != null) {
            _hashCode += getQuery_RIS_Patient_Info_OLDResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_RIS_Patient_Info_OLDResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info_OLDResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_RIS_Patient_Info_OLDResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_Patient_Info_OLDResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_Patient_Info_OLDResponse>Query_RIS_Patient_Info_OLDResult"));
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
