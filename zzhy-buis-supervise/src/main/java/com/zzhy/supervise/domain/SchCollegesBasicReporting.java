package com.zzhy.supervise.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.math.BigDecimal;
import java.util.Date;

/**
    * 院校基本情况报备表
    */
public class SchCollegesBasicReporting extends BaseEntity {
    /**
    * 主键
    */
    private Long reportingId;

    /**
    * 学校ID
    */
    private Long schoolId;

    /**
    * 院校流程配置ID
    */
    private Long schProcessId;

    /**
    * 院校名称
    */
    private String schoolName;

    /**
    * 省区划
    */
    private Long provinceAreaId;

    /**
    * 市区划
    */
    private Long cityAreaId;

    /**
    * 区县区划
    */
    private Long countryAreaId;

    /**
    * 院校地址
    */
    private String schoolAddress;

    /**
    * 院校代码
    */
    private String schoolCode;

    /**
    * 审批文号
    */
    private String approvalNo;

    /**
    * 院校类别,1技工学院,2技工学校,3高级技工学校
    */
    private String schoolType;

    /**
    * 院校性质 1行业办，2企业办，3中外（港澳台）合作办学，4民办，5地方人社部门办
    */
    private String schoolNature;

    /**
    * 国家重点 1是，2不是
    */
    private String isNationImportant;

    /**
    * 省、直辖市重点 1是，2不是
    */
    private String isProvinceImportant;

    /**
    * 办学单位
    */
    private String schoolUnit;

    /**
    * 占地面积
    */
    private BigDecimal schoolArea;

    /**
    * 建筑面积
    */
    private BigDecimal buildingArea;

    /**
    * 成立时间
    */
    private Date establishedTime;

    /**
    * 在校生总数（人）
    */
    private Integer studentNum;

    /**
    * 教师总数（人）
    */
    private Integer teacherNum;

    /**
    * 教职工总数（人）
    */
    private Integer staffNum;

    /**
    * 实训室总数（间）
    */
    private Integer trainingRoomNum;

    /**
    * 实训资金（元）
    */
    private BigDecimal trainingMoney;

    /**
    * 实训设备总数（台）
    */
    private Integer trainingDeviceNum;

    /**
    * 专业设置总数（门）
    */
    private Integer majorNum;

    /**
    * 校企合作总数（家）
    */
    private Integer enterpriseNum;

    /**
    * 教学点总数（个）
    */
    private Integer teachingPointNum;

    /**
    * 通讯地址
    */
    private String postalAddress;

    /**
    * 通讯号码
    */
    private String postalCode;

    /**
    * 院校网站
    */
    private String schoolWebsite;

    /**
    * 院校邮箱
    */
    private String schoolEmail;

    /**
    * 院校联系人
    */
    private String schoolContacts;

    /**
    * 院校电话
    */
    private String schoolTelephone;

    /**
    * 校长姓名
    */
    private String principal;

    /**
    * 校长邮箱
    */
    private String principalEmail;

    /**
    * 校长电话
    */
    private String principalTelephone;

    /**
    * 学籍负责人
    */
    private String studentStatusManager;

    /**
    * 学籍联系电话
    */
    private String studentStatusTelephone;

    /**
    * 免学费联系人
    */
    private String freeTuitionContacts;

    /**
    * 免学费联系电话
    */
    private String freeTuitionTelephone;

    /**
    * 助学金联系人
    */
    private String stipendContacts;

    /**
    * 助学金联系电话
    */
    private String stipendTelephone;

    /**
    * 就业负责人
    */
    private String obtainEmploymentContacts;

    /**
    * 就业联系电话
    */
    private String obtainEmploymentTelephone;

    /**
    * 所属机构组织对应的组织机构表ID
    */
    private Long deptId;

    /**
    * 附件地址
    */
    private String attachmentAddress;

    /**
    * 报备日期
    */
    private Date reportingDate;

    /**
    * 报备信息 
    */
    private String reportingInformation;

    /**
    * 报备年份
    */
    private String reportingYear;

    /**
    * 报备状态：1草稿,2已提交报备审核
    */
    private String reportingStatus;

    /**
    * 审核状态 1待审核，2审核中，3审核通过，4审核驳回
    */
    private String auditStatus;

    /**
    * 最后审核人
    */
    private Long reportingBy;

    /**
    * 最后审核时间'
    */
    private Date reportingTime;

    /**
    * 审核情况
    */
    private String auditCondition;

    /**
    * 最后审核备注
    */
    private String reportingRemark;

    /**
    * 状态（1正常 2停用）
    */
    private String status;

    /**
    * 删除标志（1代表存在 1代表删除）
    */
    private String delFlag;

    /**
    * 具有研究生学历或硕士学位教师数
    */
    private Integer graduateUpNum;

    /**
    * 专业教师数
    */
    private Integer majorTeacherNum;

    /**
    * 本科毕业及以上学历教师数
    */
    private Integer undergraduateUpNum;

    /**
    * “双师型”教师数
    */
    private Integer doubleTeacherNum;

    /**
    * 近五年获得主要荣誉
    */
    private String schoolMainHonor;

    /**
    * 办学特色
    */
    private String schoolFeature;

    /**
    * 教学仪器设备总价值
    */
    private BigDecimal instrumentUnitPrice;

    /**
    * 省报备状态 1已报备确认  2已提交报备
    */
    private Boolean provincesReportStatus;

    /**
    * 省报备确认时间
    */
    private Date provincesReportTime;

    /**
    * 省报备确认人
    */
    private String provincesReportPerson;

    /**
    *  是否向省技工中心发送报备 1-是，2-否（主要用于判断省技工中心能不能显示确认报备的按钮）
    */
    private String sendReportStatus;

    /**
    * 办学主体 1行业办，2企业办，3中外（港澳台）合作办学，4民办，5地方人社部门办
    */
    private String schoolSubject;

    /**
    * 审核机构名称
    */
    private String deptName;

    /**
    * 层级 1省属，2市属，3区/县属
    */
    private Byte hierarchy;

    /**
    * 分校数
    */
    private Integer branchSchoolNum;

    /**
    * 本年招人数
    */
    private Integer currentEnrollment;

    /**
    * 申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流）
    */
    private Boolean declareStatus;

    public Long getReportingId() {
        return reportingId;
    }

    public void setReportingId(Long reportingId) {
        this.reportingId = reportingId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getSchProcessId() {
        return schProcessId;
    }

    public void setSchProcessId(Long schProcessId) {
        this.schProcessId = schProcessId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public Long getProvinceAreaId() {
        return provinceAreaId;
    }

    public void setProvinceAreaId(Long provinceAreaId) {
        this.provinceAreaId = provinceAreaId;
    }

    public Long getCityAreaId() {
        return cityAreaId;
    }

    public void setCityAreaId(Long cityAreaId) {
        this.cityAreaId = cityAreaId;
    }

    public Long getCountryAreaId() {
        return countryAreaId;
    }

    public void setCountryAreaId(Long countryAreaId) {
        this.countryAreaId = countryAreaId;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolCode() {
        return schoolCode;
    }

    public void setSchoolCode(String schoolCode) {
        this.schoolCode = schoolCode;
    }

    public String getApprovalNo() {
        return approvalNo;
    }

    public void setApprovalNo(String approvalNo) {
        this.approvalNo = approvalNo;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }

    public String getSchoolNature() {
        return schoolNature;
    }

    public void setSchoolNature(String schoolNature) {
        this.schoolNature = schoolNature;
    }

    public String getIsNationImportant() {
        return isNationImportant;
    }

    public void setIsNationImportant(String isNationImportant) {
        this.isNationImportant = isNationImportant;
    }

    public String getIsProvinceImportant() {
        return isProvinceImportant;
    }

    public void setIsProvinceImportant(String isProvinceImportant) {
        this.isProvinceImportant = isProvinceImportant;
    }

    public String getSchoolUnit() {
        return schoolUnit;
    }

    public void setSchoolUnit(String schoolUnit) {
        this.schoolUnit = schoolUnit;
    }

    public BigDecimal getSchoolArea() {
        return schoolArea;
    }

    public void setSchoolArea(BigDecimal schoolArea) {
        this.schoolArea = schoolArea;
    }

    public BigDecimal getBuildingArea() {
        return buildingArea;
    }

    public void setBuildingArea(BigDecimal buildingArea) {
        this.buildingArea = buildingArea;
    }

    public Date getEstablishedTime() {
        return establishedTime;
    }

    public void setEstablishedTime(Date establishedTime) {
        this.establishedTime = establishedTime;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public Integer getTeacherNum() {
        return teacherNum;
    }

    public void setTeacherNum(Integer teacherNum) {
        this.teacherNum = teacherNum;
    }

    public Integer getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(Integer staffNum) {
        this.staffNum = staffNum;
    }

    public Integer getTrainingRoomNum() {
        return trainingRoomNum;
    }

    public void setTrainingRoomNum(Integer trainingRoomNum) {
        this.trainingRoomNum = trainingRoomNum;
    }

    public BigDecimal getTrainingMoney() {
        return trainingMoney;
    }

    public void setTrainingMoney(BigDecimal trainingMoney) {
        this.trainingMoney = trainingMoney;
    }

    public Integer getTrainingDeviceNum() {
        return trainingDeviceNum;
    }

    public void setTrainingDeviceNum(Integer trainingDeviceNum) {
        this.trainingDeviceNum = trainingDeviceNum;
    }

    public Integer getMajorNum() {
        return majorNum;
    }

    public void setMajorNum(Integer majorNum) {
        this.majorNum = majorNum;
    }

    public Integer getEnterpriseNum() {
        return enterpriseNum;
    }

    public void setEnterpriseNum(Integer enterpriseNum) {
        this.enterpriseNum = enterpriseNum;
    }

    public Integer getTeachingPointNum() {
        return teachingPointNum;
    }

    public void setTeachingPointNum(Integer teachingPointNum) {
        this.teachingPointNum = teachingPointNum;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getSchoolWebsite() {
        return schoolWebsite;
    }

    public void setSchoolWebsite(String schoolWebsite) {
        this.schoolWebsite = schoolWebsite;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }

    public String getSchoolContacts() {
        return schoolContacts;
    }

    public void setSchoolContacts(String schoolContacts) {
        this.schoolContacts = schoolContacts;
    }

    public String getSchoolTelephone() {
        return schoolTelephone;
    }

    public void setSchoolTelephone(String schoolTelephone) {
        this.schoolTelephone = schoolTelephone;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getPrincipalEmail() {
        return principalEmail;
    }

    public void setPrincipalEmail(String principalEmail) {
        this.principalEmail = principalEmail;
    }

    public String getPrincipalTelephone() {
        return principalTelephone;
    }

    public void setPrincipalTelephone(String principalTelephone) {
        this.principalTelephone = principalTelephone;
    }

    public String getStudentStatusManager() {
        return studentStatusManager;
    }

    public void setStudentStatusManager(String studentStatusManager) {
        this.studentStatusManager = studentStatusManager;
    }

    public String getStudentStatusTelephone() {
        return studentStatusTelephone;
    }

    public void setStudentStatusTelephone(String studentStatusTelephone) {
        this.studentStatusTelephone = studentStatusTelephone;
    }

    public String getFreeTuitionContacts() {
        return freeTuitionContacts;
    }

    public void setFreeTuitionContacts(String freeTuitionContacts) {
        this.freeTuitionContacts = freeTuitionContacts;
    }

    public String getFreeTuitionTelephone() {
        return freeTuitionTelephone;
    }

    public void setFreeTuitionTelephone(String freeTuitionTelephone) {
        this.freeTuitionTelephone = freeTuitionTelephone;
    }

    public String getStipendContacts() {
        return stipendContacts;
    }

    public void setStipendContacts(String stipendContacts) {
        this.stipendContacts = stipendContacts;
    }

    public String getStipendTelephone() {
        return stipendTelephone;
    }

    public void setStipendTelephone(String stipendTelephone) {
        this.stipendTelephone = stipendTelephone;
    }

    public String getObtainEmploymentContacts() {
        return obtainEmploymentContacts;
    }

    public void setObtainEmploymentContacts(String obtainEmploymentContacts) {
        this.obtainEmploymentContacts = obtainEmploymentContacts;
    }

    public String getObtainEmploymentTelephone() {
        return obtainEmploymentTelephone;
    }

    public void setObtainEmploymentTelephone(String obtainEmploymentTelephone) {
        this.obtainEmploymentTelephone = obtainEmploymentTelephone;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getAttachmentAddress() {
        return attachmentAddress;
    }

    public void setAttachmentAddress(String attachmentAddress) {
        this.attachmentAddress = attachmentAddress;
    }

    public Date getReportingDate() {
        return reportingDate;
    }

    public void setReportingDate(Date reportingDate) {
        this.reportingDate = reportingDate;
    }

    public String getReportingInformation() {
        return reportingInformation;
    }

    public void setReportingInformation(String reportingInformation) {
        this.reportingInformation = reportingInformation;
    }

    public String getReportingYear() {
        return reportingYear;
    }

    public void setReportingYear(String reportingYear) {
        this.reportingYear = reportingYear;
    }

    public String getReportingStatus() {
        return reportingStatus;
    }

    public void setReportingStatus(String reportingStatus) {
        this.reportingStatus = reportingStatus;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Long getReportingBy() {
        return reportingBy;
    }

    public void setReportingBy(Long reportingBy) {
        this.reportingBy = reportingBy;
    }

    public Date getReportingTime() {
        return reportingTime;
    }

    public void setReportingTime(Date reportingTime) {
        this.reportingTime = reportingTime;
    }

    public String getAuditCondition() {
        return auditCondition;
    }

    public void setAuditCondition(String auditCondition) {
        this.auditCondition = auditCondition;
    }

    public String getReportingRemark() {
        return reportingRemark;
    }

    public void setReportingRemark(String reportingRemark) {
        this.reportingRemark = reportingRemark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getGraduateUpNum() {
        return graduateUpNum;
    }

    public void setGraduateUpNum(Integer graduateUpNum) {
        this.graduateUpNum = graduateUpNum;
    }

    public Integer getMajorTeacherNum() {
        return majorTeacherNum;
    }

    public void setMajorTeacherNum(Integer majorTeacherNum) {
        this.majorTeacherNum = majorTeacherNum;
    }

    public Integer getUndergraduateUpNum() {
        return undergraduateUpNum;
    }

    public void setUndergraduateUpNum(Integer undergraduateUpNum) {
        this.undergraduateUpNum = undergraduateUpNum;
    }

    public Integer getDoubleTeacherNum() {
        return doubleTeacherNum;
    }

    public void setDoubleTeacherNum(Integer doubleTeacherNum) {
        this.doubleTeacherNum = doubleTeacherNum;
    }

    public String getSchoolMainHonor() {
        return schoolMainHonor;
    }

    public void setSchoolMainHonor(String schoolMainHonor) {
        this.schoolMainHonor = schoolMainHonor;
    }

    public String getSchoolFeature() {
        return schoolFeature;
    }

    public void setSchoolFeature(String schoolFeature) {
        this.schoolFeature = schoolFeature;
    }

    public BigDecimal getInstrumentUnitPrice() {
        return instrumentUnitPrice;
    }

    public void setInstrumentUnitPrice(BigDecimal instrumentUnitPrice) {
        this.instrumentUnitPrice = instrumentUnitPrice;
    }

    public Boolean getProvincesReportStatus() {
        return provincesReportStatus;
    }

    public void setProvincesReportStatus(Boolean provincesReportStatus) {
        this.provincesReportStatus = provincesReportStatus;
    }

    public Date getProvincesReportTime() {
        return provincesReportTime;
    }

    public void setProvincesReportTime(Date provincesReportTime) {
        this.provincesReportTime = provincesReportTime;
    }

    public String getProvincesReportPerson() {
        return provincesReportPerson;
    }

    public void setProvincesReportPerson(String provincesReportPerson) {
        this.provincesReportPerson = provincesReportPerson;
    }

    public String getSendReportStatus() {
        return sendReportStatus;
    }

    public void setSendReportStatus(String sendReportStatus) {
        this.sendReportStatus = sendReportStatus;
    }

    public String getSchoolSubject() {
        return schoolSubject;
    }

    public void setSchoolSubject(String schoolSubject) {
        this.schoolSubject = schoolSubject;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Byte getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(Byte hierarchy) {
        this.hierarchy = hierarchy;
    }

    public Integer getBranchSchoolNum() {
        return branchSchoolNum;
    }

    public void setBranchSchoolNum(Integer branchSchoolNum) {
        this.branchSchoolNum = branchSchoolNum;
    }

    public Integer getCurrentEnrollment() {
        return currentEnrollment;
    }

    public void setCurrentEnrollment(Integer currentEnrollment) {
        this.currentEnrollment = currentEnrollment;
    }

    public Boolean getDeclareStatus() {
        return declareStatus;
    }

    public void setDeclareStatus(Boolean declareStatus) {
        this.declareStatus = declareStatus;
    }
}