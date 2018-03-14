/**
 * Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse  implements java.io.Serializable {
    private org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult;

    public Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse() {
    }

    public Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse(
           org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult) {
           this.query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult = query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult;
    }


    /**
     * Gets the query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse.
     * 
     * @return query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult
     */
    public org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult getQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult() {
        return query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult;
    }


    /**
     * Sets the query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult value for this Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse.
     * 
     * @param query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult
     */
    public void setQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult(org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult) {
        this.query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult = query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse)) return false;
        Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse other = (Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult==null && other.getQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult()==null) || 
             (this.query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult!=null &&
              this.query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult.equals(other.getQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult())));
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
        if (getQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult() != null) {
            _hashCode += getQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult"));
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
