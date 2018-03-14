/**
 * CTSOleDBSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class CTSOleDBSoapStub extends org.apache.axis.client.Stub implements org.tempuri.CTSOleDBSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[50];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOtherHospDisaesAndDischargeDiag");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Hospnum"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sDAS_INPDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "eDAS_INPDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetOtherHospDisaesAndDischargeDiagResponse>GetOtherHospDisaesAndDischargeDiagResult"));
        oper.setReturnClass(org.tempuri.GetOtherHospDisaesAndDischargeDiagResponseGetOtherHospDisaesAndDischargeDiagResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetOtherHospDisaesAndDischargeDiagResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_USER_Data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LOGIN_ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_DataResponse>GET_USER_DataResult"));
        oper.setReturnClass(org.tempuri.GET_USER_DataResponseGET_USER_DataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_DataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_USER_Data_by_IDNO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IDNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNOResponse>GET_USER_Data_by_IDNOResult"));
        oper.setReturnClass(org.tempuri.GET_USER_Data_by_IDNOResponseGET_USER_Data_by_IDNOResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNOResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_USER_Data_by_IDNO_fromIPD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IDNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNO_fromIPDResponse>GET_USER_Data_by_IDNO_fromIPDResult"));
        oper.setReturnClass(org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNO_fromIPDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_USER_Data_by_LOGIN_ID_fromIPD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LOGIN_ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_LOGIN_ID_fromIPDResponse>GET_USER_Data_by_LOGIN_ID_fromIPDResult"));
        oper.setReturnClass(org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponseGET_USER_Data_by_LOGIN_ID_fromIPDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_LOGIN_ID_fromIPDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_BASDEPT_Data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DEPTNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_BASDEPT_DataResponse>GET_BASDEPT_DataResult"));
        oper.setReturnClass(org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_BASDEPT_DataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_USER_Data_by_LOGIN_ID_fromOPD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LOGIN_ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_LOGIN_ID_fromOPDResponse>GET_USER_Data_by_LOGIN_ID_fromOPDResult"));
        oper.setReturnClass(org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponseGET_USER_Data_by_LOGIN_ID_fromOPDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_LOGIN_ID_fromOPDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_USER_Data_by_IDNO_fromOPD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IDNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNO_fromOPDResponse>GET_USER_Data_by_IDNO_fromOPDResult"));
        oper.setReturnClass(org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNO_fromOPDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sql"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "connString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ouser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query2Response>Query2Result"));
        oper.setReturnClass(org.tempuri.Query2ResponseQuery2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExcuteSQL2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sql"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "connString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ouser"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "ExcuteSQL2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_OPSCH_LIST_from_DB2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Cno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "HCURSVCL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OPSCH_LIST_from_DB2Response>Query_OPSCH_LIST_from_DB2Result"));
        oper.setReturnClass(org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OPSCH_LIST_from_DB2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_OPSCH_AND_CLOCASED_LIST_from_DB2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Cno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "HCURSVCL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OPSCH_AND_CLOCASED_LIST_from_DB2Response>Query_OPSCH_AND_CLOCASED_LIST_from_DB2Result"));
        oper.setReturnClass(org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2ResponseQuery_OPSCH_AND_CLOCASED_LIST_from_DB2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OPSCH_AND_CLOCASED_LIST_from_DB2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryDischargeDiagcode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryDischargeDiagcodeResponse>QueryDischargeDiagcodeResult"));
        oper.setReturnClass(org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryDischargeDiagcodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_OPSCH_LIST");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Cno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "HCURSVCL"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OPSCH_LISTResponse>Query_OPSCH_LISTResult"));
        oper.setReturnClass(org.tempuri.Query_OPSCH_LISTResponseQuery_OPSCH_LISTResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OPSCH_LISTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_OP_EventTime_from_DB2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "OPTIME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OP_EventTime_from_DB2Response>Query_OP_EventTime_from_DB2Result"));
        oper.setReturnClass(org.tempuri.Query_OP_EventTime_from_DB2ResponseQuery_OP_EventTime_from_DB2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OP_EventTime_from_DB2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_OP_EventTime");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "OPTIME"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OP_EventTimeResponse>Query_OP_EventTimeResult"));
        oper.setReturnClass(org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OP_EventTimeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_BBK_Data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "MEDNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "VISITSEQ"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "VISITDATEyyymmdd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_BBK_DataResponse>Query_BBK_DataResult"));
        oper.setReturnClass(org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_BBK_DataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_FEXREPORT_Data_From_LisDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_From_LisDBResponse>Query_FEXREPORT_Data_From_LisDBResult"));
        oper.setReturnClass(org.tempuri.Query_FEXREPORT_Data_From_LisDBResponseQuery_FEXREPORT_Data_From_LisDBResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_From_LisDBResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LASTUPDTESTDATEyyyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LASTUPDTESTDATEyyyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponse>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult"));
        oper.setReturnClass(org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LASTUPDTESTDATEyyyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "LASTUPDTESTDATEyyyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult"));
        oper.setReturnClass(org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponse>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult"));
        oper.setReturnClass(org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_RIS_MODALITY_IS_US_MG_BREASTS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ACCESSION_NUM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "VERIFICATION_PHYSICIAN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_MODALITY_IS_US_MG_BREASTSResponse>Query_RIS_MODALITY_IS_US_MG_BREASTSResult"));
        oper.setReturnClass(org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTSResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_RIS_MODALITY_IS_US_MG_BREASTS2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ACCESSION_NUM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "VERIFICATION_PHYSICIAN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTS2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_ID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATE2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ACCESSION_NUM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "VERIFICATION_PHYSICIAN"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_FXYREPORT_LIST");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATEyyyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATEyyyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_LISTResponse>Query_FXYREPORT_LISTResult"));
        oper.setReturnClass(org.tempuri.Query_FXYREPORT_LISTResponseQuery_FXYREPORT_LISTResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_LISTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_FXYREPORT_REPORT");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ACCESSION_NUM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_REPORTResponse>Query_FXYREPORT_REPORTResult"));
        oper.setReturnClass(org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_REPORTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_FXYREPORT_LIST_OnlyCR");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATEyyyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PERFRMD_START_DATEyyyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_LIST_OnlyCRResponse>Query_FXYREPORT_LIST_OnlyCRResult"));
        oper.setReturnClass(org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_LIST_OnlyCRResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_EKG_LIST");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_EKG_LISTResponse>Query_EKG_LISTResult"));
        oper.setReturnClass(org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_EKG_LISTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_Dischargenote_LIST2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "HDISYMD_yyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "HDISYMD_yyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_LIST2Response>Query_Dischargenote_LIST2Result"));
        oper.setReturnClass(org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_LIST2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_HISDIAG10_All_Diag_Data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Medno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "visitseq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_HISDIAG10_All_Diag_DataResponse>Query_HISDIAG10_All_Diag_DataResult"));
        oper.setReturnClass(org.tempuri.Query_HISDIAG10_All_Diag_DataResponseQuery_HISDIAG10_All_Diag_DataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_HISDIAG10_All_Diag_DataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_HISDIAG10_MainDiag_Data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Medno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "visitseq"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_HISDIAG10_MainDiag_DataResponse>Query_HISDIAG10_MainDiag_DataResult"));
        oper.setReturnClass(org.tempuri.Query_HISDIAG10_MainDiag_DataResponseQuery_HISDIAG10_MainDiag_DataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_HISDIAG10_MainDiag_DataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_Dischargenote_Data_and_Final_MainDiagICD10Code");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "HDISYMD_yyyMMdd1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "HDISYMD_yyyMMdd2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse>Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult"));
        oper.setReturnClass(org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_Dischargenote_Data");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "hCaseno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_DataResponse>Query_Dischargenote_DataResult"));
        oper.setReturnClass(org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_DataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_Dischargenote_Data_by_cno");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_Data_by_cnoResponse>Query_Dischargenote_Data_by_cnoResult"));
        oper.setReturnClass(org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_Data_by_cnoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_RIS_Patient_Info2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CHARTNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "AccessionNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "PATIENT_SOURCE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_Patient_Info2Result"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_RIS_Patient_Info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CHARTNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "AccessionNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Comefrom"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_Patient_InfoResponse>Query_RIS_Patient_InfoResult"));
        oper.setReturnClass(org.tempuri.Query_RIS_Patient_InfoResponseQuery_RIS_Patient_InfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_Patient_InfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_RIS_Patient_Info_OLD");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CHARTNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "AccessionNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Comefrom"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_Patient_Info_OLDResponse>Query_RIS_Patient_Info_OLDResult"));
        oper.setReturnClass(org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_Patient_Info_OLDResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_IPD_PT_LIST");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "NRCODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CHARTNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "VSDR"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyMMddINDATETIME1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "yyyMMddINDATETIME2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_IPD_PT_LISTResponse>Query_IPD_PT_LISTResult"));
        oper.setReturnClass(org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_IPD_PT_LISTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_PHS");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IDNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_PHSResponse>Query_PHSResult"));
        oper.setReturnClass(org.tempuri.Query_PHSResponseQuery_PHSResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_PHSResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_REG_LIST");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Cno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "DEPT"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Taiwan_Date2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_REG_LISTResponse>Query_REG_LISTResult"));
        oper.setReturnClass(org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_REG_LISTResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_PatientBascInfomation_by_IDNO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IDNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_PatientBascInfomation_by_IDNOResponse>GET_PatientBascInfomation_by_IDNOResult"));
        oper.setReturnClass(org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_PatientBascInfomation_by_IDNOResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GET_PatientBascInfomation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "Cno"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_PatientBascInfomationResponse>GET_PatientBascInfomationResult"));
        oper.setReturnClass(org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_PatientBascInfomationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDoctorDetpNameCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "IDNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDoctorDetpNameCodeResponse>GetDoctorDetpNameCodeResult"));
        oper.setReturnClass(org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDoctorDetpNameCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPatientDetpNameCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "hisdocpk"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sheetName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPatientDetpNameCodeResponse>GetPatientDetpNameCodeResult"));
        oper.setReturnClass(org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPatientDetpNameCodeResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Query_notRIS_Patient_Info");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "hisdocpk"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "sheetName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_notRIS_Patient_InfoResponse>Query_notRIS_Patient_InfoResult"));
        oper.setReturnClass(org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_notRIS_Patient_InfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllDrugCodeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllDrugCodeDataResponse>GetAllDrugCodeDataResult"));
        oper.setReturnClass(org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDrugCodeDataResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertCRC_Patient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "INDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "OUTDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ISCLOSED"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertCRC_PatientResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCRC_Patient");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "INDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteCRC_PatientResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InsertCRCTabooDrug");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "INDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "OUTDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ORDERCODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertCRCTabooDrugResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteCRCTabooDrug");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "CNO"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "INDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "OUTDATE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "ORDERCODE"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "user"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://tempuri.org/", "passwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteCRCTabooDrugResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    public CTSOleDBSoapStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CTSOleDBSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CTSOleDBSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_BASDEPT_DataResponse>GET_BASDEPT_DataResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_PatientBascInfomation_by_IDNOResponse>GET_PatientBascInfomation_by_IDNOResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_PatientBascInfomationResponse>GET_PatientBascInfomationResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNO_fromIPDResponse>GET_USER_Data_by_IDNO_fromIPDResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNO_fromOPDResponse>GET_USER_Data_by_IDNO_fromOPDResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_IDNOResponse>GET_USER_Data_by_IDNOResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNOResponseGET_USER_Data_by_IDNOResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_LOGIN_ID_fromIPDResponse>GET_USER_Data_by_LOGIN_ID_fromIPDResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponseGET_USER_Data_by_LOGIN_ID_fromIPDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_Data_by_LOGIN_ID_fromOPDResponse>GET_USER_Data_by_LOGIN_ID_fromOPDResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponseGET_USER_Data_by_LOGIN_ID_fromOPDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GET_USER_DataResponse>GET_USER_DataResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_DataResponseGET_USER_DataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetAllDrugCodeDataResponse>GetAllDrugCodeDataResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetDoctorDetpNameCodeResponse>GetDoctorDetpNameCodeResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetOtherHospDisaesAndDischargeDiagResponse>GetOtherHospDisaesAndDischargeDiagResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetOtherHospDisaesAndDischargeDiagResponseGetOtherHospDisaesAndDischargeDiagResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>GetPatientDetpNameCodeResponse>GetPatientDetpNameCodeResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query2Response>Query2Result");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query2ResponseQuery2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_BBK_DataResponse>Query_BBK_DataResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse>Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_Data_by_cnoResponse>Query_Dischargenote_Data_by_cnoResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_DataResponse>Query_Dischargenote_DataResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_Dischargenote_LIST2Response>Query_Dischargenote_LIST2Result");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_EKG_LISTResponse>Query_EKG_LISTResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponse>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponse>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse>Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FEXREPORT_Data_From_LisDBResponse>Query_FEXREPORT_Data_From_LisDBResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_From_LisDBResponseQuery_FEXREPORT_Data_From_LisDBResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_LIST_OnlyCRResponse>Query_FXYREPORT_LIST_OnlyCRResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_LISTResponse>Query_FXYREPORT_LISTResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_LISTResponseQuery_FXYREPORT_LISTResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_FXYREPORT_REPORTResponse>Query_FXYREPORT_REPORTResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_HISDIAG10_All_Diag_DataResponse>Query_HISDIAG10_All_Diag_DataResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_HISDIAG10_All_Diag_DataResponseQuery_HISDIAG10_All_Diag_DataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_HISDIAG10_MainDiag_DataResponse>Query_HISDIAG10_MainDiag_DataResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_HISDIAG10_MainDiag_DataResponseQuery_HISDIAG10_MainDiag_DataResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_IPD_PT_LISTResponse>Query_IPD_PT_LISTResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_notRIS_Patient_InfoResponse>Query_notRIS_Patient_InfoResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OP_EventTime_from_DB2Response>Query_OP_EventTime_from_DB2Result");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OP_EventTime_from_DB2ResponseQuery_OP_EventTime_from_DB2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OP_EventTimeResponse>Query_OP_EventTimeResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OPSCH_AND_CLOCASED_LIST_from_DB2Response>Query_OPSCH_AND_CLOCASED_LIST_from_DB2Result");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2ResponseQuery_OPSCH_AND_CLOCASED_LIST_from_DB2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OPSCH_LIST_from_DB2Response>Query_OPSCH_LIST_from_DB2Result");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_OPSCH_LISTResponse>Query_OPSCH_LISTResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_LISTResponseQuery_OPSCH_LISTResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_PHSResponse>Query_PHSResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_PHSResponseQuery_PHSResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_REG_LISTResponse>Query_REG_LISTResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_MODALITY_IS_US_MG_BREASTSResponse>Query_RIS_MODALITY_IS_US_MG_BREASTSResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_Patient_Info_OLDResponse>Query_RIS_Patient_Info_OLDResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>Query_RIS_Patient_InfoResponse>Query_RIS_Patient_InfoResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_InfoResponseQuery_RIS_Patient_InfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">>QueryDischargeDiagcodeResponse>QueryDischargeDiagcodeResult");
            cachedSerQNames.add(qName);
            cls = org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCRC_Patient");
            cachedSerQNames.add(qName);
            cls = org.tempuri.DeleteCRC_Patient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCRC_PatientResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.DeleteCRC_PatientResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCRCTabooDrug");
            cachedSerQNames.add(qName);
            cls = org.tempuri.DeleteCRCTabooDrug.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">DeleteCRCTabooDrugResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.DeleteCRCTabooDrugResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ExcuteSQL2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.ExcuteSQL2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">ExcuteSQL2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.ExcuteSQL2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_BASDEPT_Data");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_BASDEPT_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_BASDEPT_DataResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_BASDEPT_DataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_PatientBascInfomation");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_PatientBascInfomation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_PatientBascInfomation_by_IDNO");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_PatientBascInfomation_by_IDNO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_PatientBascInfomation_by_IDNOResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_PatientBascInfomation_by_IDNOResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_PatientBascInfomationResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_PatientBascInfomationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNO");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNO.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNO_fromIPD");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNO_fromIPD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNO_fromIPDResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNO_fromOPD");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNO_fromOPD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNO_fromOPDResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_IDNOResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_IDNOResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_LOGIN_ID_fromIPD");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_LOGIN_ID_fromIPDResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_LOGIN_ID_fromOPD");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_Data_by_LOGIN_ID_fromOPDResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GET_USER_DataResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GET_USER_DataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDrugCodeData");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetAllDrugCodeData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllDrugCodeDataResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetAllDrugCodeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetDoctorDetpNameCode");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetDoctorDetpNameCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetDoctorDetpNameCodeResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetDoctorDetpNameCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientDetpNameCode");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetPatientDetpNameCode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">GetPatientDetpNameCodeResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.GetPatientDetpNameCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">InsertCRC_Patient");
            cachedSerQNames.add(qName);
            cls = org.tempuri.InsertCRC_Patient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">InsertCRC_PatientResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.InsertCRC_PatientResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">InsertCRCTabooDrug");
            cachedSerQNames.add(qName);
            cls = org.tempuri.InsertCRCTabooDrug.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">InsertCRCTabooDrugResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.InsertCRCTabooDrugResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_BBK_Data");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_BBK_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_BBK_DataResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_BBK_DataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data_and_Final_MainDiagICD10Code");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10Code.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data_by_cno");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_Data_by_cno.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_Data_by_cnoResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_Data_by_cnoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_DataResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_DataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_LIST2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_LIST2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_Dischargenote_LIST2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_Dischargenote_LIST2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_EKG_LIST");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_EKG_LIST.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_EKG_LISTResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_EKG_LISTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_From_LisDB");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_From_LisDB.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FEXREPORT_Data_From_LisDBResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FEXREPORT_Data_From_LisDBResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_LIST");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_LIST.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_LIST_OnlyCR");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_LIST_OnlyCR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_LIST_OnlyCRResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_LISTResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_LISTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_REPORT");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_REPORT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_FXYREPORT_REPORTResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_FXYREPORT_REPORTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_HISDIAG10_All_Diag_Data");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_HISDIAG10_All_Diag_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_HISDIAG10_All_Diag_DataResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_HISDIAG10_All_Diag_DataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_HISDIAG10_MainDiag_Data");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_HISDIAG10_MainDiag_Data.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_HISDIAG10_MainDiag_DataResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_HISDIAG10_MainDiag_DataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_IPD_PT_LIST");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_IPD_PT_LIST.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_IPD_PT_LISTResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_IPD_PT_LISTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_notRIS_Patient_Info");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_notRIS_Patient_Info.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_notRIS_Patient_InfoResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_notRIS_Patient_InfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OP_EventTime");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OP_EventTime.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OP_EventTime_from_DB2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OP_EventTime_from_DB2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OP_EventTime_from_DB2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OP_EventTime_from_DB2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OP_EventTimeResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OP_EventTimeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_AND_CLOCASED_LIST_from_DB2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_AND_CLOCASED_LIST_from_DB2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_LIST");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_LIST.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_LIST_from_DB2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_LIST_from_DB2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_LIST_from_DB2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_LIST_from_DB2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_OPSCH_LISTResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_OPSCH_LISTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_PHS");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_PHS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_PHSResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_PHSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_REG_LIST");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_REG_LIST.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_REG_LISTResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_REG_LISTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTS");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTS2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTS2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTS2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTS2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORTResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORTResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_MODALITY_IS_US_MG_BREASTSResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_Info.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info2");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_Info2.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info2Response");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_Info2Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info_OLD");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_Info_OLD.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_Info_OLDResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_Info_OLDResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">Query_RIS_Patient_InfoResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.Query_RIS_Patient_InfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">QueryDischargeDiagcode");
            cachedSerQNames.add(qName);
            cls = org.tempuri.QueryDischargeDiagcode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://tempuri.org/", ">QueryDischargeDiagcodeResponse");
            cachedSerQNames.add(qName);
            cls = org.tempuri.QueryDischargeDiagcodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public org.tempuri.GetOtherHospDisaesAndDischargeDiagResponseGetOtherHospDisaesAndDischargeDiagResult getOtherHospDisaesAndDischargeDiag(java.lang.String hospnum, java.lang.String sDAS_INPDATE, java.lang.String eDAS_INPDATE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetOtherHospDisaesAndDischargeDiag");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetOtherHospDisaesAndDischargeDiag"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hospnum, sDAS_INPDATE, eDAS_INPDATE, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GetOtherHospDisaesAndDischargeDiagResponseGetOtherHospDisaesAndDischargeDiagResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GetOtherHospDisaesAndDischargeDiagResponseGetOtherHospDisaesAndDischargeDiagResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GetOtherHospDisaesAndDischargeDiagResponseGetOtherHospDisaesAndDischargeDiagResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_USER_DataResponseGET_USER_DataResult GET_USER_Data(java.lang.String LOGIN_ID, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_USER_Data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {LOGIN_ID, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_USER_DataResponseGET_USER_DataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_USER_DataResponseGET_USER_DataResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_USER_DataResponseGET_USER_DataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_USER_Data_by_IDNOResponseGET_USER_Data_by_IDNOResult GET_USER_Data_by_IDNO(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_USER_Data_by_IDNO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IDNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_USER_Data_by_IDNOResponseGET_USER_Data_by_IDNOResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_USER_Data_by_IDNOResponseGET_USER_Data_by_IDNOResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_USER_Data_by_IDNOResponseGET_USER_Data_by_IDNOResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult GET_USER_Data_by_IDNO_fromIPD(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_USER_Data_by_IDNO_fromIPD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNO_fromIPD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IDNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponseGET_USER_Data_by_LOGIN_ID_fromIPDResult GET_USER_Data_by_LOGIN_ID_fromIPD(java.lang.String LOGIN_ID, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_USER_Data_by_LOGIN_ID_fromIPD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_LOGIN_ID_fromIPD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {LOGIN_ID, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponseGET_USER_Data_by_LOGIN_ID_fromIPDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponseGET_USER_Data_by_LOGIN_ID_fromIPDResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponseGET_USER_Data_by_LOGIN_ID_fromIPDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult GET_BASDEPT_Data(java.lang.String DEPTNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_BASDEPT_Data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_BASDEPT_Data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DEPTNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponseGET_USER_Data_by_LOGIN_ID_fromOPDResult GET_USER_Data_by_LOGIN_ID_fromOPD(java.lang.String LOGIN_ID, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_USER_Data_by_LOGIN_ID_fromOPD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_LOGIN_ID_fromOPD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {LOGIN_ID, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponseGET_USER_Data_by_LOGIN_ID_fromOPDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponseGET_USER_Data_by_LOGIN_ID_fromOPDResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponseGET_USER_Data_by_LOGIN_ID_fromOPDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult GET_USER_Data_by_IDNO_fromOPD(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_USER_Data_by_IDNO_fromOPD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_USER_Data_by_IDNO_fromOPD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IDNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query2ResponseQuery2Result query2(java.lang.String sql, java.lang.String connString, java.lang.String ouser, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sql, connString, ouser, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query2ResponseQuery2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query2ResponseQuery2Result) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query2ResponseQuery2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int excuteSQL2(java.lang.String sql, java.lang.String connString, java.lang.String ouser, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/ExcuteSQL2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "ExcuteSQL2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sql, connString, ouser, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result query_OPSCH_LIST_from_DB2(java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String cno, java.lang.String HCURSVCL, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_OPSCH_LIST_from_DB2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OPSCH_LIST_from_DB2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taiwan_Date1, taiwan_Date2, cno, HCURSVCL, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2ResponseQuery_OPSCH_AND_CLOCASED_LIST_from_DB2Result query_OPSCH_AND_CLOCASED_LIST_from_DB2(java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String cno, java.lang.String HCURSVCL, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_OPSCH_AND_CLOCASED_LIST_from_DB2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OPSCH_AND_CLOCASED_LIST_from_DB2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taiwan_Date1, taiwan_Date2, cno, HCURSVCL, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2ResponseQuery_OPSCH_AND_CLOCASED_LIST_from_DB2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2ResponseQuery_OPSCH_AND_CLOCASED_LIST_from_DB2Result) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2ResponseQuery_OPSCH_AND_CLOCASED_LIST_from_DB2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult queryDischargeDiagcode(java.lang.String CNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/QueryDischargeDiagcode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "QueryDischargeDiagcode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_OPSCH_LISTResponseQuery_OPSCH_LISTResult query_OPSCH_LIST(java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String cno, java.lang.String HCURSVCL, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_OPSCH_LIST");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OPSCH_LIST"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {taiwan_Date1, taiwan_Date2, cno, HCURSVCL, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_OPSCH_LISTResponseQuery_OPSCH_LISTResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_OPSCH_LISTResponseQuery_OPSCH_LISTResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_OPSCH_LISTResponseQuery_OPSCH_LISTResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_OP_EventTime_from_DB2ResponseQuery_OP_EventTime_from_DB2Result query_OP_EventTime_from_DB2(java.lang.String OPTIME, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_OP_EventTime_from_DB2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OP_EventTime_from_DB2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OPTIME, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_OP_EventTime_from_DB2ResponseQuery_OP_EventTime_from_DB2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_OP_EventTime_from_DB2ResponseQuery_OP_EventTime_from_DB2Result) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_OP_EventTime_from_DB2ResponseQuery_OP_EventTime_from_DB2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult query_OP_EventTime(java.lang.String OPTIME, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_OP_EventTime");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_OP_EventTime"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {OPTIME, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult query_BBK_Data(java.lang.String MEDNO, java.lang.String VISITSEQ, java.lang.String VISITDATEyyymmdd, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_BBK_Data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_BBK_Data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {MEDNO, VISITSEQ, VISITDATEyyymmdd, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_FEXREPORT_Data_From_LisDBResponseQuery_FEXREPORT_Data_From_LisDBResult query_FEXREPORT_Data_From_LisDB(java.lang.String CNO, java.lang.String yyyyMMdd1, java.lang.String yyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_FEXREPORT_Data_From_LisDB");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_From_LisDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, yyyyMMdd1, yyyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_FEXREPORT_Data_From_LisDBResponseQuery_FEXREPORT_Data_From_LisDBResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_FEXREPORT_Data_From_LisDBResponseQuery_FEXREPORT_Data_From_LisDBResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_FEXREPORT_Data_From_LisDBResponseQuery_FEXREPORT_Data_From_LisDBResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB(java.lang.String CNO, java.lang.String LASTUPDTESTDATEyyyyMMdd1, java.lang.String LASTUPDTESTDATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, LASTUPDTESTDATEyyyyMMdd1, LASTUPDTESTDATEyyyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB(java.lang.String CNO, java.lang.String LASTUPDTESTDATEyyyyMMdd1, java.lang.String LASTUPDTESTDATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, LASTUPDTESTDATEyyyyMMdd1, LASTUPDTESTDATEyyyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB(java.lang.String CNO, java.lang.String yyyyMMdd1, java.lang.String yyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, yyyyMMdd1, yyyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult query_RIS_MODALITY_IS_US_MG_BREASTS(java.lang.String PATIENT_ID, java.lang.String PERFRMD_START_DATE1, java.lang.String PERFRMD_START_DATE2, java.lang.String ACCESSION_NUM, java.lang.String VERIFICATION_PHYSICIAN, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_RIS_MODALITY_IS_US_MG_BREASTS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PATIENT_ID, PERFRMD_START_DATE1, PERFRMD_START_DATE2, ACCESSION_NUM, VERIFICATION_PHYSICIAN, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String query_RIS_MODALITY_IS_US_MG_BREASTS2(java.lang.String PATIENT_ID, java.lang.String PERFRMD_START_DATE1, java.lang.String PERFRMD_START_DATE2, java.lang.String ACCESSION_NUM, java.lang.String VERIFICATION_PHYSICIAN, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_RIS_MODALITY_IS_US_MG_BREASTS2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTS2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PATIENT_ID, PERFRMD_START_DATE1, PERFRMD_START_DATE2, ACCESSION_NUM, VERIFICATION_PHYSICIAN, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT(java.lang.String PATIENT_ID, java.lang.String PERFRMD_START_DATE1, java.lang.String PERFRMD_START_DATE2, java.lang.String ACCESSION_NUM, java.lang.String VERIFICATION_PHYSICIAN, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PATIENT_ID, PERFRMD_START_DATE1, PERFRMD_START_DATE2, ACCESSION_NUM, VERIFICATION_PHYSICIAN, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_FXYREPORT_LISTResponseQuery_FXYREPORT_LISTResult query_FXYREPORT_LIST(java.lang.String CNO, java.lang.String PERFRMD_START_DATEyyyyMMdd1, java.lang.String PERFRMD_START_DATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_FXYREPORT_LIST");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_LIST"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, PERFRMD_START_DATEyyyyMMdd1, PERFRMD_START_DATEyyyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_FXYREPORT_LISTResponseQuery_FXYREPORT_LISTResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_FXYREPORT_LISTResponseQuery_FXYREPORT_LISTResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_FXYREPORT_LISTResponseQuery_FXYREPORT_LISTResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult query_FXYREPORT_REPORT(java.lang.String ACCESSION_NUM, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_FXYREPORT_REPORT");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_REPORT"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ACCESSION_NUM, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult query_FXYREPORT_LIST_OnlyCR(java.lang.String CNO, java.lang.String PERFRMD_START_DATEyyyyMMdd1, java.lang.String PERFRMD_START_DATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_FXYREPORT_LIST_OnlyCR");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_FXYREPORT_LIST_OnlyCR"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, PERFRMD_START_DATEyyyyMMdd1, PERFRMD_START_DATEyyyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult query_EKG_LIST(java.lang.String CNO, java.lang.String yyyyMMdd1, java.lang.String yyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_EKG_LIST");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_EKG_LIST"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, yyyyMMdd1, yyyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result query_Dischargenote_LIST2(java.lang.String HDISYMD_yyyMMdd1, java.lang.String HDISYMD_yyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_Dischargenote_LIST2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_LIST2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {HDISYMD_yyyMMdd1, HDISYMD_yyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_HISDIAG10_All_Diag_DataResponseQuery_HISDIAG10_All_Diag_DataResult query_HISDIAG10_All_Diag_Data(java.lang.String medno, java.lang.String visitseq, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_HISDIAG10_All_Diag_Data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_HISDIAG10_All_Diag_Data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {medno, visitseq, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_HISDIAG10_All_Diag_DataResponseQuery_HISDIAG10_All_Diag_DataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_HISDIAG10_All_Diag_DataResponseQuery_HISDIAG10_All_Diag_DataResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_HISDIAG10_All_Diag_DataResponseQuery_HISDIAG10_All_Diag_DataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_HISDIAG10_MainDiag_DataResponseQuery_HISDIAG10_MainDiag_DataResult query_HISDIAG10_MainDiag_Data(java.lang.String medno, java.lang.String visitseq, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_HISDIAG10_MainDiag_Data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_HISDIAG10_MainDiag_Data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {medno, visitseq, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_HISDIAG10_MainDiag_DataResponseQuery_HISDIAG10_MainDiag_DataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_HISDIAG10_MainDiag_DataResponseQuery_HISDIAG10_MainDiag_DataResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_HISDIAG10_MainDiag_DataResponseQuery_HISDIAG10_MainDiag_DataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult query_Dischargenote_Data_and_Final_MainDiagICD10Code(java.lang.String HDISYMD_yyyMMdd1, java.lang.String HDISYMD_yyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_Dischargenote_Data_and_Final_MainDiagICD10Code");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_Data_and_Final_MainDiagICD10Code"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {HDISYMD_yyyMMdd1, HDISYMD_yyyMMdd2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult query_Dischargenote_Data(java.lang.String hCaseno, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_Dischargenote_Data");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_Data"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hCaseno, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult query_Dischargenote_Data_by_cno(java.lang.String CNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_Dischargenote_Data_by_cno");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_Dischargenote_Data_by_cno"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String query_RIS_Patient_Info2(java.lang.String CHARTNO, java.lang.String accessionNo, java.lang.String PATIENT_SOURCE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_RIS_Patient_Info2");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_Patient_Info2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CHARTNO, accessionNo, PATIENT_SOURCE, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_RIS_Patient_InfoResponseQuery_RIS_Patient_InfoResult query_RIS_Patient_Info(java.lang.String CHARTNO, java.lang.String accessionNo, java.lang.String comefrom, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_RIS_Patient_Info");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_Patient_Info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CHARTNO, accessionNo, comefrom, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_RIS_Patient_InfoResponseQuery_RIS_Patient_InfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_RIS_Patient_InfoResponseQuery_RIS_Patient_InfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_RIS_Patient_InfoResponseQuery_RIS_Patient_InfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult query_RIS_Patient_Info_OLD(java.lang.String CHARTNO, java.lang.String accessionNo, java.lang.String comefrom, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_RIS_Patient_Info_OLD");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_RIS_Patient_Info_OLD"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CHARTNO, accessionNo, comefrom, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult query_IPD_PT_LIST(java.lang.String NRCODE, java.lang.String CHARTNO, java.lang.String VSDR, java.lang.String yyyMMddINDATETIME1, java.lang.String yyyMMddINDATETIME2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_IPD_PT_LIST");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_IPD_PT_LIST"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {NRCODE, CHARTNO, VSDR, yyyMMddINDATETIME1, yyyMMddINDATETIME2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_PHSResponseQuery_PHSResult query_PHS(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_PHS");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_PHS"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IDNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_PHSResponseQuery_PHSResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_PHSResponseQuery_PHSResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_PHSResponseQuery_PHSResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult query_REG_LIST(java.lang.String cno, java.lang.String DEPT, java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_REG_LIST");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_REG_LIST"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cno, DEPT, taiwan_Date1, taiwan_Date2, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult GET_PatientBascInfomation_by_IDNO(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_PatientBascInfomation_by_IDNO");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_PatientBascInfomation_by_IDNO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IDNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult GET_PatientBascInfomation(java.lang.String cno, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GET_PatientBascInfomation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GET_PatientBascInfomation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {cno, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult getDoctorDetpNameCode(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetDoctorDetpNameCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetDoctorDetpNameCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {IDNO, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult getPatientDetpNameCode(java.lang.String hisdocpk, java.lang.String sheetName, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetPatientDetpNameCode");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetPatientDetpNameCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hisdocpk, sheetName, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult query_notRIS_Patient_Info(java.lang.String hisdocpk, java.lang.String sheetName, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/Query_notRIS_Patient_Info");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "Query_notRIS_Patient_Info"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {hisdocpk, sheetName, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult getAllDrugCodeData(java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/GetAllDrugCodeData");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllDrugCodeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult) org.apache.axis.utils.JavaUtils.convert(_resp, org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean insertCRC_Patient(java.lang.String CNO, java.lang.String INDATE, java.lang.String OUTDATE, java.lang.String ISCLOSED, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/InsertCRC_Patient");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertCRC_Patient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, INDATE, OUTDATE, ISCLOSED, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean deleteCRC_Patient(java.lang.String CNO, java.lang.String INDATE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/DeleteCRC_Patient");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteCRC_Patient"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, INDATE, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean insertCRCTabooDrug(java.lang.String CNO, java.lang.String INDATE, java.lang.String OUTDATE, java.lang.String ORDERCODE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/InsertCRCTabooDrug");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "InsertCRCTabooDrug"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, INDATE, OUTDATE, ORDERCODE, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean deleteCRCTabooDrug(java.lang.String CNO, java.lang.String INDATE, java.lang.String OUTDATE, java.lang.String ORDERCODE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://tempuri.org/DeleteCRCTabooDrug");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://tempuri.org/", "DeleteCRCTabooDrug"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CNO, INDATE, OUTDATE, ORDERCODE, user, passwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
