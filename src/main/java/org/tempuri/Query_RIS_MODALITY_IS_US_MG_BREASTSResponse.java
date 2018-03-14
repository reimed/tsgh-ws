/**
 * Query_RIS_MODALITY_IS_US_MG_BREASTSResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_RIS_MODALITY_IS_US_MG_BREASTSResponse  implements java.io.Serializable {
    private org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult query_RIS_MODALITY_IS_US_MG_BREASTSResult;

    public Query_RIS_MODALITY_IS_US_MG_BREASTSResponse() {
    }

    public Query_RIS_MODALITY_IS_US_MG_BREASTSResponse(
           org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult query_RIS_MODALITY_IS_US_MG_BREASTSResult) {
           this.query_RIS_MODALITY_IS_US_MG_BREASTSResult = query_RIS_MODALITY_IS_US_MG_BREASTSResult;
    }


    /**
     * Gets the query_RIS_MODALITY_IS_US_MG_BREASTSResult value for this Query_RIS_MODALITY_IS_US_MG_BREASTSResponse.
     * 
     * @return query_RIS_MODALITY_IS_US_MG_BREASTSResult
     */
    public org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult getQuery_RIS_MODALITY_IS_US_MG_BREASTSResult() {
        return query_RIS_MODALITY_IS_US_MG_BREASTSResult;
    }


    /**
     * Sets the query_RIS_MODALITY_IS_US_MG_BREASTSResult value for this Query_RIS_MODALITY_IS_US_MG_BREASTSResponse.
     * 
     * @param query_RIS_MODALITY_IS_US_MG_BREASTSResult
     */
    public void setQuery_RIS_MODALITY_IS_US_MG_BREASTSResult(org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult query_RIS_MODALITY_IS_US_MG_BREASTSResult) {
        this.query_RIS_MODALITY_IS_US_MG_BREASTSResult = query_RIS_MODALITY_IS_US_MG_BREASTSResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_RIS_MODALITY_IS_US_MG_BREASTSResponse)) return false;
        Query_RIS_MODALITY_IS_US_MG_BREASTSResponse other = (Query_RIS_MODALITY_IS_US_MG_BREASTSResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_RIS_MODALITY_IS_US_MG_BREASTSResult==null && other.getQuery_RIS_MODALITY_IS_US_MG_BREASTSResult()==null) || 
             (this.query_RIS_MODALITY_IS_US_MG_BREASTSResult!=null &&
              this.query_RIS_MODALITY_IS_US_MG_BREASTSResult.equals(other.getQuery_RIS_MODALITY_IS_US_MG_BREASTSResult())));
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
        if (getQuery_RIS_MODALITY_IS_US_MG_BREASTSResult() != null) {
            _hashCode += getQuery_RIS_MODALITY_IS_US_MG_BREASTSResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_RIS_MODALITY_IS_US_MG_BREASTSResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTSResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_RIS_MODALITY_IS_US_MG_BREASTSResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTSResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_MODALITY_IS_US_MG_BREASTSResponse>Query_RIS_MODALITY_IS_US_MG_BREASTSResult"));
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
