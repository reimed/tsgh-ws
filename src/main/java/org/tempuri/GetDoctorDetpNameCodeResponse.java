/**
 * GetDoctorDetpNameCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetDoctorDetpNameCodeResponse  implements java.io.Serializable {
    private org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult getDoctorDetpNameCodeResult;

    public GetDoctorDetpNameCodeResponse() {
    }

    public GetDoctorDetpNameCodeResponse(
           org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult getDoctorDetpNameCodeResult) {
           this.getDoctorDetpNameCodeResult = getDoctorDetpNameCodeResult;
    }


    /**
     * Gets the getDoctorDetpNameCodeResult value for this GetDoctorDetpNameCodeResponse.
     * 
     * @return getDoctorDetpNameCodeResult
     */
    public org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult getGetDoctorDetpNameCodeResult() {
        return getDoctorDetpNameCodeResult;
    }


    /**
     * Sets the getDoctorDetpNameCodeResult value for this GetDoctorDetpNameCodeResponse.
     * 
     * @param getDoctorDetpNameCodeResult
     */
    public void setGetDoctorDetpNameCodeResult(org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult getDoctorDetpNameCodeResult) {
        this.getDoctorDetpNameCodeResult = getDoctorDetpNameCodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetDoctorDetpNameCodeResponse)) return false;
        GetDoctorDetpNameCodeResponse other = (GetDoctorDetpNameCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getDoctorDetpNameCodeResult==null && other.getGetDoctorDetpNameCodeResult()==null) || 
             (this.getDoctorDetpNameCodeResult!=null &&
              this.getDoctorDetpNameCodeResult.equals(other.getGetDoctorDetpNameCodeResult())));
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
        if (getGetDoctorDetpNameCodeResult() != null) {
            _hashCode += getGetDoctorDetpNameCodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetDoctorDetpNameCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetDoctorDetpNameCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getDoctorDetpNameCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDoctorDetpNameCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDoctorDetpNameCodeResponse>GetDoctorDetpNameCodeResult"));
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
