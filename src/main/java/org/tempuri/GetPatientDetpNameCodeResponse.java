/**
 * GetPatientDetpNameCodeResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetPatientDetpNameCodeResponse  implements java.io.Serializable {
    private org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult getPatientDetpNameCodeResult;

    public GetPatientDetpNameCodeResponse() {
    }

    public GetPatientDetpNameCodeResponse(
           org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult getPatientDetpNameCodeResult) {
           this.getPatientDetpNameCodeResult = getPatientDetpNameCodeResult;
    }


    /**
     * Gets the getPatientDetpNameCodeResult value for this GetPatientDetpNameCodeResponse.
     * 
     * @return getPatientDetpNameCodeResult
     */
    public org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult getGetPatientDetpNameCodeResult() {
        return getPatientDetpNameCodeResult;
    }


    /**
     * Sets the getPatientDetpNameCodeResult value for this GetPatientDetpNameCodeResponse.
     * 
     * @param getPatientDetpNameCodeResult
     */
    public void setGetPatientDetpNameCodeResult(org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult getPatientDetpNameCodeResult) {
        this.getPatientDetpNameCodeResult = getPatientDetpNameCodeResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPatientDetpNameCodeResponse)) return false;
        GetPatientDetpNameCodeResponse other = (GetPatientDetpNameCodeResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPatientDetpNameCodeResult==null && other.getGetPatientDetpNameCodeResult()==null) || 
             (this.getPatientDetpNameCodeResult!=null &&
              this.getPatientDetpNameCodeResult.equals(other.getGetPatientDetpNameCodeResult())));
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
        if (getGetPatientDetpNameCodeResult() != null) {
            _hashCode += getGetPatientDetpNameCodeResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPatientDetpNameCodeResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientDetpNameCodeResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPatientDetpNameCodeResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPatientDetpNameCodeResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPatientDetpNameCodeResponse>GetPatientDetpNameCodeResult"));
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
