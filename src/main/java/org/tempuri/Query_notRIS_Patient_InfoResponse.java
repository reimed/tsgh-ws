/**
 * Query_notRIS_Patient_InfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_notRIS_Patient_InfoResponse  implements java.io.Serializable {
    private org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult query_notRIS_Patient_InfoResult;

    public Query_notRIS_Patient_InfoResponse() {
    }

    public Query_notRIS_Patient_InfoResponse(
           org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult query_notRIS_Patient_InfoResult) {
           this.query_notRIS_Patient_InfoResult = query_notRIS_Patient_InfoResult;
    }


    /**
     * Gets the query_notRIS_Patient_InfoResult value for this Query_notRIS_Patient_InfoResponse.
     * 
     * @return query_notRIS_Patient_InfoResult
     */
    public org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult getQuery_notRIS_Patient_InfoResult() {
        return query_notRIS_Patient_InfoResult;
    }


    /**
     * Sets the query_notRIS_Patient_InfoResult value for this Query_notRIS_Patient_InfoResponse.
     * 
     * @param query_notRIS_Patient_InfoResult
     */
    public void setQuery_notRIS_Patient_InfoResult(org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult query_notRIS_Patient_InfoResult) {
        this.query_notRIS_Patient_InfoResult = query_notRIS_Patient_InfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_notRIS_Patient_InfoResponse)) return false;
        Query_notRIS_Patient_InfoResponse other = (Query_notRIS_Patient_InfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_notRIS_Patient_InfoResult==null && other.getQuery_notRIS_Patient_InfoResult()==null) || 
             (this.query_notRIS_Patient_InfoResult!=null &&
              this.query_notRIS_Patient_InfoResult.equals(other.getQuery_notRIS_Patient_InfoResult())));
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
        if (getQuery_notRIS_Patient_InfoResult() != null) {
            _hashCode += getQuery_notRIS_Patient_InfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_notRIS_Patient_InfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_notRIS_Patient_InfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_notRIS_Patient_InfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_notRIS_Patient_InfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_notRIS_Patient_InfoResponse>Query_notRIS_Patient_InfoResult"));
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
