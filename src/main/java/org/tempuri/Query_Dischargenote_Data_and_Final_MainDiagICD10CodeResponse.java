/**
 * Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse  implements java.io.Serializable {
    private org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult;

    public Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse() {
    }

    public Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse(
           org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult) {
           this.query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult = query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult;
    }


    /**
     * Gets the query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult value for this Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse.
     * 
     * @return query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult
     */
    public org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult getQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult() {
        return query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult;
    }


    /**
     * Sets the query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult value for this Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse.
     * 
     * @param query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult
     */
    public void setQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult(org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult) {
        this.query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult = query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse)) return false;
        Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse other = (Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult==null && other.getQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult()==null) || 
             (this.query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult!=null &&
              this.query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult.equals(other.getQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult())));
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
        if (getQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult() != null) {
            _hashCode += getQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse>Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult"));
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
