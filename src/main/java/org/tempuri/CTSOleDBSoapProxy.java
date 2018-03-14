package org.tempuri;

public class CTSOleDBSoapProxy implements org.tempuri.CTSOleDBSoap {
  private String _endpoint = null;
  private org.tempuri.CTSOleDBSoap cTSOleDBSoap = null;
  
  public CTSOleDBSoapProxy() {
    _initCTSOleDBSoapProxy();
  }
  
  public CTSOleDBSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initCTSOleDBSoapProxy();
  }
  
  private void _initCTSOleDBSoapProxy() {
    try {
      cTSOleDBSoap = (new org.tempuri.CTSOleDBLocator()).getCTSOleDBSoap();
      if (cTSOleDBSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cTSOleDBSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cTSOleDBSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cTSOleDBSoap != null)
      ((javax.xml.rpc.Stub)cTSOleDBSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.CTSOleDBSoap getCTSOleDBSoap() {
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap;
  }
  
  public org.tempuri.GetOtherHospDisaesAndDischargeDiagResponseGetOtherHospDisaesAndDischargeDiagResult getOtherHospDisaesAndDischargeDiag(java.lang.String hospnum, java.lang.String sDAS_INPDATE, java.lang.String eDAS_INPDATE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.getOtherHospDisaesAndDischargeDiag(hospnum, sDAS_INPDATE, eDAS_INPDATE, user, passwd);
  }
  
  public org.tempuri.GET_USER_DataResponseGET_USER_DataResult GET_USER_Data(java.lang.String LOGIN_ID, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_USER_Data(LOGIN_ID, user, passwd);
  }
  
  public org.tempuri.GET_USER_Data_by_IDNOResponseGET_USER_Data_by_IDNOResult GET_USER_Data_by_IDNO(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_USER_Data_by_IDNO(IDNO, user, passwd);
  }
  
  public org.tempuri.GET_USER_Data_by_IDNO_fromIPDResponseGET_USER_Data_by_IDNO_fromIPDResult GET_USER_Data_by_IDNO_fromIPD(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_USER_Data_by_IDNO_fromIPD(IDNO, user, passwd);
  }
  
  public org.tempuri.GET_USER_Data_by_LOGIN_ID_fromIPDResponseGET_USER_Data_by_LOGIN_ID_fromIPDResult GET_USER_Data_by_LOGIN_ID_fromIPD(java.lang.String LOGIN_ID, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_USER_Data_by_LOGIN_ID_fromIPD(LOGIN_ID, user, passwd);
  }
  
  public org.tempuri.GET_BASDEPT_DataResponseGET_BASDEPT_DataResult GET_BASDEPT_Data(java.lang.String DEPTNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_BASDEPT_Data(DEPTNO, user, passwd);
  }
  
  public org.tempuri.GET_USER_Data_by_LOGIN_ID_fromOPDResponseGET_USER_Data_by_LOGIN_ID_fromOPDResult GET_USER_Data_by_LOGIN_ID_fromOPD(java.lang.String LOGIN_ID, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_USER_Data_by_LOGIN_ID_fromOPD(LOGIN_ID, user, passwd);
  }
  
  public org.tempuri.GET_USER_Data_by_IDNO_fromOPDResponseGET_USER_Data_by_IDNO_fromOPDResult GET_USER_Data_by_IDNO_fromOPD(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_USER_Data_by_IDNO_fromOPD(IDNO, user, passwd);
  }
  
  public org.tempuri.Query2ResponseQuery2Result query2(java.lang.String sql, java.lang.String connString, java.lang.String ouser, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query2(sql, connString, ouser, passwd);
  }
  
  public int excuteSQL2(java.lang.String sql, java.lang.String connString, java.lang.String ouser, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.excuteSQL2(sql, connString, ouser, passwd);
  }
  
  public org.tempuri.Query_OPSCH_LIST_from_DB2ResponseQuery_OPSCH_LIST_from_DB2Result query_OPSCH_LIST_from_DB2(java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String cno, java.lang.String HCURSVCL, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_OPSCH_LIST_from_DB2(taiwan_Date1, taiwan_Date2, cno, HCURSVCL, user, passwd);
  }
  
  public org.tempuri.Query_OPSCH_AND_CLOCASED_LIST_from_DB2ResponseQuery_OPSCH_AND_CLOCASED_LIST_from_DB2Result query_OPSCH_AND_CLOCASED_LIST_from_DB2(java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String cno, java.lang.String HCURSVCL, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_OPSCH_AND_CLOCASED_LIST_from_DB2(taiwan_Date1, taiwan_Date2, cno, HCURSVCL, user, passwd);
  }
  
  public org.tempuri.QueryDischargeDiagcodeResponseQueryDischargeDiagcodeResult queryDischargeDiagcode(java.lang.String CNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.queryDischargeDiagcode(CNO, user, passwd);
  }
  
  public org.tempuri.Query_OPSCH_LISTResponseQuery_OPSCH_LISTResult query_OPSCH_LIST(java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String cno, java.lang.String HCURSVCL, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_OPSCH_LIST(taiwan_Date1, taiwan_Date2, cno, HCURSVCL, user, passwd);
  }
  
  public org.tempuri.Query_OP_EventTime_from_DB2ResponseQuery_OP_EventTime_from_DB2Result query_OP_EventTime_from_DB2(java.lang.String OPTIME, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_OP_EventTime_from_DB2(OPTIME, user, passwd);
  }
  
  public org.tempuri.Query_OP_EventTimeResponseQuery_OP_EventTimeResult query_OP_EventTime(java.lang.String OPTIME, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_OP_EventTime(OPTIME, user, passwd);
  }
  
  public org.tempuri.Query_BBK_DataResponseQuery_BBK_DataResult query_BBK_Data(java.lang.String MEDNO, java.lang.String VISITSEQ, java.lang.String VISITDATEyyymmdd, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_BBK_Data(MEDNO, VISITSEQ, VISITDATEyyymmdd, user, passwd);
  }
  
  public org.tempuri.Query_FEXREPORT_Data_From_LisDBResponseQuery_FEXREPORT_Data_From_LisDBResult query_FEXREPORT_Data_From_LisDB(java.lang.String CNO, java.lang.String yyyyMMdd1, java.lang.String yyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_FEXREPORT_Data_From_LisDB(CNO, yyyyMMdd1, yyyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB(java.lang.String CNO, java.lang.String LASTUPDTESTDATEyyyyMMdd1, java.lang.String LASTUPDTESTDATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_From_LisDB(CNO, LASTUPDTESTDATEyyyyMMdd1, LASTUPDTESTDATEyyyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB(java.lang.String CNO, java.lang.String LASTUPDTESTDATEyyyyMMdd1, java.lang.String LASTUPDTESTDATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_FEXREPORT_Data_by_LASTUPDTESTDATE_Limit_usecase_stroke_From_LisDB(CNO, LASTUPDTESTDATEyyyyMMdd1, LASTUPDTESTDATEyyyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResponseQuery_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDBResult query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB(java.lang.String CNO, java.lang.String yyyyMMdd1, java.lang.String yyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_FEXREPORT_Data_by_LASTUPDTESTDATE_From_LisDB(CNO, yyyyMMdd1, yyyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_RIS_MODALITY_IS_US_MG_BREASTSResponseQuery_RIS_MODALITY_IS_US_MG_BREASTSResult query_RIS_MODALITY_IS_US_MG_BREASTS(java.lang.String PATIENT_ID, java.lang.String PERFRMD_START_DATE1, java.lang.String PERFRMD_START_DATE2, java.lang.String ACCESSION_NUM, java.lang.String VERIFICATION_PHYSICIAN, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_RIS_MODALITY_IS_US_MG_BREASTS(PATIENT_ID, PERFRMD_START_DATE1, PERFRMD_START_DATE2, ACCESSION_NUM, VERIFICATION_PHYSICIAN, user, passwd);
  }
  
  public java.lang.String query_RIS_MODALITY_IS_US_MG_BREASTS2(java.lang.String PATIENT_ID, java.lang.String PERFRMD_START_DATE1, java.lang.String PERFRMD_START_DATE2, java.lang.String ACCESSION_NUM, java.lang.String VERIFICATION_PHYSICIAN, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_RIS_MODALITY_IS_US_MG_BREASTS2(PATIENT_ID, PERFRMD_START_DATE1, PERFRMD_START_DATE2, ACCESSION_NUM, VERIFICATION_PHYSICIAN, user, passwd);
  }
  
  public java.lang.String query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT(java.lang.String PATIENT_ID, java.lang.String PERFRMD_START_DATE1, java.lang.String PERFRMD_START_DATE2, java.lang.String ACCESSION_NUM, java.lang.String VERIFICATION_PHYSICIAN, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_RIS_MODALITY_IS_US_MG_BREASTS_WITHOUT_REPORT(PATIENT_ID, PERFRMD_START_DATE1, PERFRMD_START_DATE2, ACCESSION_NUM, VERIFICATION_PHYSICIAN, user, passwd);
  }
  
  public org.tempuri.Query_FXYREPORT_LISTResponseQuery_FXYREPORT_LISTResult query_FXYREPORT_LIST(java.lang.String CNO, java.lang.String PERFRMD_START_DATEyyyyMMdd1, java.lang.String PERFRMD_START_DATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_FXYREPORT_LIST(CNO, PERFRMD_START_DATEyyyyMMdd1, PERFRMD_START_DATEyyyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_FXYREPORT_REPORTResponseQuery_FXYREPORT_REPORTResult query_FXYREPORT_REPORT(java.lang.String ACCESSION_NUM, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_FXYREPORT_REPORT(ACCESSION_NUM, user, passwd);
  }
  
  public org.tempuri.Query_FXYREPORT_LIST_OnlyCRResponseQuery_FXYREPORT_LIST_OnlyCRResult query_FXYREPORT_LIST_OnlyCR(java.lang.String CNO, java.lang.String PERFRMD_START_DATEyyyyMMdd1, java.lang.String PERFRMD_START_DATEyyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_FXYREPORT_LIST_OnlyCR(CNO, PERFRMD_START_DATEyyyyMMdd1, PERFRMD_START_DATEyyyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_EKG_LISTResponseQuery_EKG_LISTResult query_EKG_LIST(java.lang.String CNO, java.lang.String yyyyMMdd1, java.lang.String yyyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_EKG_LIST(CNO, yyyyMMdd1, yyyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_Dischargenote_LIST2ResponseQuery_Dischargenote_LIST2Result query_Dischargenote_LIST2(java.lang.String HDISYMD_yyyMMdd1, java.lang.String HDISYMD_yyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_Dischargenote_LIST2(HDISYMD_yyyMMdd1, HDISYMD_yyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_HISDIAG10_All_Diag_DataResponseQuery_HISDIAG10_All_Diag_DataResult query_HISDIAG10_All_Diag_Data(java.lang.String medno, java.lang.String visitseq, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_HISDIAG10_All_Diag_Data(medno, visitseq, user, passwd);
  }
  
  public org.tempuri.Query_HISDIAG10_MainDiag_DataResponseQuery_HISDIAG10_MainDiag_DataResult query_HISDIAG10_MainDiag_Data(java.lang.String medno, java.lang.String visitseq, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_HISDIAG10_MainDiag_Data(medno, visitseq, user, passwd);
  }
  
  public org.tempuri.Query_Dischargenote_Data_and_Final_MainDiagICD10CodeResponseQuery_Dischargenote_Data_and_Final_MainDiagICD10CodeResult query_Dischargenote_Data_and_Final_MainDiagICD10Code(java.lang.String HDISYMD_yyyMMdd1, java.lang.String HDISYMD_yyyMMdd2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_Dischargenote_Data_and_Final_MainDiagICD10Code(HDISYMD_yyyMMdd1, HDISYMD_yyyMMdd2, user, passwd);
  }
  
  public org.tempuri.Query_Dischargenote_DataResponseQuery_Dischargenote_DataResult query_Dischargenote_Data(java.lang.String hCaseno, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_Dischargenote_Data(hCaseno, user, passwd);
  }
  
  public org.tempuri.Query_Dischargenote_Data_by_cnoResponseQuery_Dischargenote_Data_by_cnoResult query_Dischargenote_Data_by_cno(java.lang.String CNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_Dischargenote_Data_by_cno(CNO, user, passwd);
  }
  
  public java.lang.String query_RIS_Patient_Info2(java.lang.String CHARTNO, java.lang.String accessionNo, java.lang.String PATIENT_SOURCE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_RIS_Patient_Info2(CHARTNO, accessionNo, PATIENT_SOURCE, user, passwd);
  }
  
  public org.tempuri.Query_RIS_Patient_InfoResponseQuery_RIS_Patient_InfoResult query_RIS_Patient_Info(java.lang.String CHARTNO, java.lang.String accessionNo, java.lang.String comefrom, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_RIS_Patient_Info(CHARTNO, accessionNo, comefrom, user, passwd);
  }
  
  public org.tempuri.Query_RIS_Patient_Info_OLDResponseQuery_RIS_Patient_Info_OLDResult query_RIS_Patient_Info_OLD(java.lang.String CHARTNO, java.lang.String accessionNo, java.lang.String comefrom, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_RIS_Patient_Info_OLD(CHARTNO, accessionNo, comefrom, user, passwd);
  }
  
  public org.tempuri.Query_IPD_PT_LISTResponseQuery_IPD_PT_LISTResult query_IPD_PT_LIST(java.lang.String NRCODE, java.lang.String CHARTNO, java.lang.String VSDR, java.lang.String yyyMMddINDATETIME1, java.lang.String yyyMMddINDATETIME2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_IPD_PT_LIST(NRCODE, CHARTNO, VSDR, yyyMMddINDATETIME1, yyyMMddINDATETIME2, user, passwd);
  }
  
  public org.tempuri.Query_PHSResponseQuery_PHSResult query_PHS(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_PHS(IDNO, user, passwd);
  }
  
  public org.tempuri.Query_REG_LISTResponseQuery_REG_LISTResult query_REG_LIST(java.lang.String cno, java.lang.String DEPT, java.lang.String taiwan_Date1, java.lang.String taiwan_Date2, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_REG_LIST(cno, DEPT, taiwan_Date1, taiwan_Date2, user, passwd);
  }
  
  public org.tempuri.GET_PatientBascInfomation_by_IDNOResponseGET_PatientBascInfomation_by_IDNOResult GET_PatientBascInfomation_by_IDNO(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_PatientBascInfomation_by_IDNO(IDNO, user, passwd);
  }
  
  public org.tempuri.GET_PatientBascInfomationResponseGET_PatientBascInfomationResult GET_PatientBascInfomation(java.lang.String cno, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.GET_PatientBascInfomation(cno, user, passwd);
  }
  
  public org.tempuri.GetDoctorDetpNameCodeResponseGetDoctorDetpNameCodeResult getDoctorDetpNameCode(java.lang.String IDNO, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.getDoctorDetpNameCode(IDNO, user, passwd);
  }
  
  public org.tempuri.GetPatientDetpNameCodeResponseGetPatientDetpNameCodeResult getPatientDetpNameCode(java.lang.String hisdocpk, java.lang.String sheetName, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.getPatientDetpNameCode(hisdocpk, sheetName, user, passwd);
  }
  
  public org.tempuri.Query_notRIS_Patient_InfoResponseQuery_notRIS_Patient_InfoResult query_notRIS_Patient_Info(java.lang.String hisdocpk, java.lang.String sheetName, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.query_notRIS_Patient_Info(hisdocpk, sheetName, user, passwd);
  }
  
  public org.tempuri.GetAllDrugCodeDataResponseGetAllDrugCodeDataResult getAllDrugCodeData(java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.getAllDrugCodeData(user, passwd);
  }
  
  public boolean insertCRC_Patient(java.lang.String CNO, java.lang.String INDATE, java.lang.String OUTDATE, java.lang.String ISCLOSED, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.insertCRC_Patient(CNO, INDATE, OUTDATE, ISCLOSED, user, passwd);
  }
  
  public boolean deleteCRC_Patient(java.lang.String CNO, java.lang.String INDATE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.deleteCRC_Patient(CNO, INDATE, user, passwd);
  }
  
  public boolean insertCRCTabooDrug(java.lang.String CNO, java.lang.String INDATE, java.lang.String OUTDATE, java.lang.String ORDERCODE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.insertCRCTabooDrug(CNO, INDATE, OUTDATE, ORDERCODE, user, passwd);
  }
  
  public boolean deleteCRCTabooDrug(java.lang.String CNO, java.lang.String INDATE, java.lang.String OUTDATE, java.lang.String ORDERCODE, java.lang.String user, java.lang.String passwd) throws java.rmi.RemoteException{
    if (cTSOleDBSoap == null)
      _initCTSOleDBSoapProxy();
    return cTSOleDBSoap.deleteCRCTabooDrug(CNO, INDATE, OUTDATE, ORDERCODE, user, passwd);
  }
  
  
}