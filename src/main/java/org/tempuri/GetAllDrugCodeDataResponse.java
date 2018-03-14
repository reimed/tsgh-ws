/**
 * GetAllDrugCodeDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllDrugCodeDataResponse  implements java.io.Serializable {
    private org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult getAllDrugCodeDataResult;

    public GetAllDrugCodeDataResponse() {
    }

    public GetAllDrugCodeDataResponse(
           org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult getAllDrugCodeDataResult) {
           this.getAllDrugCodeDataResult = getAllDrugCodeDataResult;
    }


    /**
     * Gets the getAllDrugCodeDataResult value for this GetAllDrugCodeDataResponse.
     * 
     * @return getAllDrugCodeDataResult
     */
    public org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult getGetAllDrugCodeDataResult() {
        return getAllDrugCodeDataResult;
    }


    /**
     * Sets the getAllDrugCodeDataResult value for this GetAllDrugCodeDataResponse.
     * 
     * @param getAllDrugCodeDataResult
     */
    public void setGetAllDrugCodeDataResult(org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult getAllDrugCodeDataResult) {
        this.getAllDrugCodeDataResult = getAllDrugCodeDataResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllDrugCodeDataResponse)) return false;
        GetAllDrugCodeDataResponse other = (GetAllDrugCodeDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllDrugCodeDataResult==null && other.getGetAllDrugCodeDataResult()==null) || 
             (this.getAllDrugCodeDataResult!=null &&
              this.getAllDrugCodeDataResult.equals(other.getGetAllDrugCodeDataResult())));
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
        if (getGetAllDrugCodeDataResult() != null) {
            _hashCode += getGetAllDrugCodeDataResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllDrugCodeDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDrugCodeDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllDrugCodeDataResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDrugCodeDataResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllDrugCodeDataResponse>GetAllDrugCodeDataResult"));
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
