/**
 * Query_PHSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_PHSResponse  implements java.io.Serializable {
    private org.tempuri.Query_PHSResponseQuery_PHSResult query_PHSResult;

    public Query_PHSResponse() {
    }

    public Query_PHSResponse(
           org.tempuri.Query_PHSResponseQuery_PHSResult query_PHSResult) {
           this.query_PHSResult = query_PHSResult;
    }


    /**
     * Gets the query_PHSResult value for this Query_PHSResponse.
     * 
     * @return query_PHSResult
     */
    public org.tempuri.Query_PHSResponseQuery_PHSResult getQuery_PHSResult() {
        return query_PHSResult;
    }


    /**
     * Sets the query_PHSResult value for this Query_PHSResponse.
     * 
     * @param query_PHSResult
     */
    public void setQuery_PHSResult(org.tempuri.Query_PHSResponseQuery_PHSResult query_PHSResult) {
        this.query_PHSResult = query_PHSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_PHSResponse)) return false;
        Query_PHSResponse other = (Query_PHSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_PHSResult==null && other.getQuery_PHSResult()==null) || 
             (this.query_PHSResult!=null &&
              this.query_PHSResult.equals(other.getQuery_PHSResult())));
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
        if (getQuery_PHSResult() != null) {
            _hashCode += getQuery_PHSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_PHSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_PHSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_PHSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_PHSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_PHSResponse>Query_PHSResult"));
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
