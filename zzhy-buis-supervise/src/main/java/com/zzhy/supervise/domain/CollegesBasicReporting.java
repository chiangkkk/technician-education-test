package com.zzhy.supervise.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 院校基本情况报备对象 sch_colleges_basic_reporting
 * 
 * @author zzhy
 * @date 2022-06-05
 */
public class CollegesBasicReporting extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long reportingId;

    /** 学校ID */
    @Excel(name = "学校ID")
    private Long schoolId;

    /** 院校流程配置ID */
    @Excel(name = "院校流程配置ID")
    private Long schProcessId;

    /** 院校名称 */
    @Excel(name = "院校名称")
    private String schoolName;

    /** 省区划 */
    @Excel(name = "省区划")
    private Long provinceAreaId;

    /** 市区划 */
    @Excel(name = "市区划")
    private Long cityAreaId;

    /** 区县区划 */
    @Excel(name = "区县区划")
    private Long countryAreaId;

    /** 院校地址 */
    @Excel(name = "院校地址")
    private String schoolAddress;

    /** 院校代码 */
    @Excel(name = "院校代码")
    private String schoolCode;

    /** 审批文号 */
    @Excel(name = "审批文号")
    private String approvalNo;

    /** 院校类别,1技工学院,2技工学校,3高级技工学校 */
    @Excel(name = "院校类别,1技工学院,2技工学校,3高级技工学校")
    private String schoolType;

    /** 院校性质 1行业办，2企业办，3中外（港澳台）合作办学，4民办，5地方人社部门办 */
    @Excel(name = "院校性质 1行业办，2企业办，3中外", readConverterExp = "港=澳台")
    private String schoolNature;

    /** 国家重点 1是，2不是 */
    @Excel(name = "国家重点 1是，2不是")
    private String isNationImportant;

    /** 省、直辖市重点 1是，2不是 */
    @Excel(name = "省、直辖市重点 1是，2不是")
    private String isProvinceImportant;

    /** 办学单位 */
    @Excel(name = "办学单位")
    private String schoolUnit;

    /** 占地面积 */
    @Excel(name = "占地面积")
    private BigDecimal schoolArea;

    /** 建筑面积 */
    @Excel(name = "建筑面积")
    private BigDecimal buildingArea;

    /** 成立时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "成立时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date establishedTime;

    /** 在校生总数（人） */
    @Excel(name = "在校生总数", readConverterExp = "人=")
    private Long studentNum;

    /** 教师总数（人） */
    @Excel(name = "教师总数", readConverterExp = "人=")
    private Long teacherNum;

    /** 教职工总数（人） */
    @Excel(name = "教职工总数", readConverterExp = "人=")
    private Long staffNum;

    /** 实训室总数（间） */
    @Excel(name = "实训室总数", readConverterExp = "间=")
    private Long trainingRoomNum;

    /** 实训资金（元） */
    @Excel(name = "实训资金", readConverterExp = "元=")
    private BigDecimal trainingMoney;

    /** 实训设备总数（台） */
    @Excel(name = "实训设备总数", readConverterExp = "台=")
    private Long trainingDeviceNum;

    /** 专业设置总数（门） */
    @Excel(name = "专业设置总数", readConverterExp = "门=")
    private Long majorNum;

    /** 校企合作总数（家） */
    @Excel(name = "校企合作总数", readConverterExp = "家=")
    private Long enterpriseNum;

    /** 教学点总数（个） */
    @Excel(name = "教学点总数", readConverterExp = "个=")
    private Long teachingPointNum;

    /** 通讯地址 */
    @Excel(name = "通讯地址")
    private String postalAddress;

    /** 通讯号码 */
    @Excel(name = "通讯号码")
    private String postalCode;

    /** 院校网站 */
    @Excel(name = "院校网站")
    private String schoolWebsite;

    /** 院校邮箱 */
    @Excel(name = "院校邮箱")
    private String schoolEmail;

    /** 院校联系人 */
    @Excel(name = "院校联系人")
    private String schoolContacts;

    /** 院校电话 */
    @Excel(name = "院校电话")
    private String schoolTelephone;

    /** 校长姓名 */
    @Excel(name = "校长姓名")
    private String principal;

    /** 校长邮箱 */
    @Excel(name = "校长邮箱")
    private String principalEmail;

    /** 校长电话 */
    @Excel(name = "校长电话")
    private String principalTelephone;

    /** 学籍负责人 */
    @Excel(name = "学籍负责人")
    private String studentStatusManager;

    /** 学籍联系电话 */
    @Excel(name = "学籍联系电话")
    private String studentStatusTelephone;

    /** 免学费联系人 */
    @Excel(name = "免学费联系人")
    private String freeTuitionContacts;

    /** 免学费联系电话 */
    @Excel(name = "免学费联系电话")
    private String freeTuitionTelephone;

    /** 助学金联系人 */
    @Excel(name = "助学金联系人")
    private String stipendContacts;

    /** 助学金联系电话 */
    @Excel(name = "助学金联系电话")
    private String stipendTelephone;

    /** 就业负责人 */
    @Excel(name = "就业负责人")
    private String obtainEmploymentContacts;

    /** 就业联系电话 */
    @Excel(name = "就业联系电话")
    private String obtainEmploymentTelephone;

    /** 所属机构组织对应的组织机构表ID */
    @Excel(name = "所属机构组织对应的组织机构表ID")
    private Long deptId;

    /** 附件地址 */
    @Excel(name = "附件地址")
    private String attachmentAddress;

    /** 报备日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "报备日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportingDate;

    /** 报备信息  */
    @Excel(name = "报备信息 ")
    private String reportingInformation;

    /** 报备年份 */
    @Excel(name = "报备年份")
    private String reportingYear;

    /** 报备状态：1草稿,2已提交报备审核 */
    @Excel(name = "报备状态：1草稿,2已提交报备审核")
    private String reportingStatus;

    /** 审核状态 1待审核，2审核中，3审核通过，4审核驳回 */
    @Excel(name = "审核状态 1待审核，2审核中，3审核通过，4审核驳回")
    private String auditStatus;

    /** 最后审核人 */
    @Excel(name = "最后审核人")
    private Long reportingBy;

    /** 最后审核时间' */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "最后审核时间'", width = 30, dateFormat = "yyyy-MM-dd")
    private Date reportingTime;

    /** 审核情况 */
    @Excel(name = "审核情况")
    private String auditCondition;

    /** 最后审核备注 */
    @Excel(name = "最后审核备注")
    private String reportingRemark;

    /** 状态（1正常 2停用） */
    @Excel(name = "状态", readConverterExp = "1=正常,2=停用")
    private String status;

    /** 删除标志（1代表存在 1代表删除） */
    private String delFlag;

    /** 具有研究生学历或硕士学位教师数 */
    @Excel(name = "具有研究生学历或硕士学位教师数")
    private Long graduateUpNum;

    /** 专业教师数 */
    @Excel(name = "专业教师数")
    private Long majorTeacherNum;

    /** 本科毕业及以上学历教师数 */
    @Excel(name = "本科毕业及以上学历教师数")
    private Long undergraduateUpNum;

    /** “双师型”教师数 */
    @Excel(name = "“双师型”教师数")
    private Long doubleTeacherNum;

    /** 近五年获得主要荣誉 */
    @Excel(name = "近五年获得主要荣誉")
    private String schoolMainHonor;

    /** 办学特色 */
    @Excel(name = "办学特色")
    private String schoolFeature;

    /** 教学仪器设备总价值 */
    @Excel(name = "教学仪器设备总价值")
    private BigDecimal instrumentUnitPrice;

    /** 省报备状态 1已报备确认  2已提交报备 */
    @Excel(name = "省报备状态 1已报备确认  2已提交报备")
    private Integer provincesReportStatus;

    /** 省报备确认时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "省报备确认时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date provincesReportTime;

    /** 省报备确认人 */
    @Excel(name = "省报备确认人")
    private String provincesReportPerson;

    /**  是否向省技工中心发送报备 1-是，2-否（主要用于判断省技工中心能不能显示确认报备的按钮） */
    @Excel(name = " 是否向省技工中心发送报备 1-是，2-否", readConverterExp = "主=要用于判断省技工中心能不能显示确认报备的按钮")
    private String sendReportStatus;

    /** 办学主体 1行业办，2企业办，3中外（港澳台）合作办学，4民办，5地方人社部门办 */
    @Excel(name = "办学主体 1行业办，2企业办，3中外", readConverterExp = "港=澳台")
    private String schoolSubject;

    /** 审核机构名称 */
    @Excel(name = "审核机构名称")
    private String deptName;

    /** 层级 1省属，2市属，3区/县属 */
    @Excel(name = "层级 1省属，2市属，3区/县属")
    private Long hierarchy;

    /** 分校数 */
    @Excel(name = "分校数")
    private Long branchSchoolNum;

    /** 本年招人数 */
    @Excel(name = "本年招人数")
    private Long currentEnrollment;

    /** 申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过（无需监管中心审批时，显示审核通过的状态） 5-待审批 6-审批通过 7-审批驳回 8-退回（此处省局和市局退回都是同一个退回状态） 9-撤回（院校自行撤回审批流） */
    @Excel(name = "申报状态 供查询使用区分监管端和院校端 1-草稿 2-待审核 3-审核驳回 4-审核通过", readConverterExp = "无=需监管中心审批时，显示审核通过的状态")
    private Integer declareStatus;

    public void setReportingId(Long reportingId) 
    {
        this.reportingId = reportingId;
    }

    public Long getReportingId() 
    {
        return reportingId;
    }
    public void setSchoolId(Long schoolId) 
    {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() 
    {
        return schoolId;
    }
    public void setSchProcessId(Long schProcessId) 
    {
        this.schProcessId = schProcessId;
    }

    public Long getSchProcessId() 
    {
        return schProcessId;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setProvinceAreaId(Long provinceAreaId) 
    {
        this.provinceAreaId = provinceAreaId;
    }

    public Long getProvinceAreaId() 
    {
        return provinceAreaId;
    }
    public void setCityAreaId(Long cityAreaId) 
    {
        this.cityAreaId = cityAreaId;
    }

    public Long getCityAreaId() 
    {
        return cityAreaId;
    }
    public void setCountryAreaId(Long countryAreaId) 
    {
        this.countryAreaId = countryAreaId;
    }

    public Long getCountryAreaId() 
    {
        return countryAreaId;
    }
    public void setSchoolAddress(String schoolAddress) 
    {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolAddress() 
    {
        return schoolAddress;
    }
    public void setSchoolCode(String schoolCode) 
    {
        this.schoolCode = schoolCode;
    }

    public String getSchoolCode() 
    {
        return schoolCode;
    }
    public void setApprovalNo(String approvalNo) 
    {
        this.approvalNo = approvalNo;
    }

    public String getApprovalNo() 
    {
        return approvalNo;
    }
    public void setSchoolType(String schoolType) 
    {
        this.schoolType = schoolType;
    }

    public String getSchoolType() 
    {
        return schoolType;
    }
    public void setSchoolNature(String schoolNature) 
    {
        this.schoolNature = schoolNature;
    }

    public String getSchoolNature() 
    {
        return schoolNature;
    }
    public void setIsNationImportant(String isNationImportant) 
    {
        this.isNationImportant = isNationImportant;
    }

    public String getIsNationImportant() 
    {
        return isNationImportant;
    }
    public void setIsProvinceImportant(String isProvinceImportant) 
    {
        this.isProvinceImportant = isProvinceImportant;
    }

    public String getIsProvinceImportant() 
    {
        return isProvinceImportant;
    }
    public void setSchoolUnit(String schoolUnit) 
    {
        this.schoolUnit = schoolUnit;
    }

    public String getSchoolUnit() 
    {
        return schoolUnit;
    }
    public void setSchoolArea(BigDecimal schoolArea) 
    {
        this.schoolArea = schoolArea;
    }

    public BigDecimal getSchoolArea() 
    {
        return schoolArea;
    }
    public void setBuildingArea(BigDecimal buildingArea) 
    {
        this.buildingArea = buildingArea;
    }

    public BigDecimal getBuildingArea() 
    {
        return buildingArea;
    }
    public void setEstablishedTime(Date establishedTime) 
    {
        this.establishedTime = establishedTime;
    }

    public Date getEstablishedTime() 
    {
        return establishedTime;
    }
    public void setStudentNum(Long studentNum) 
    {
        this.studentNum = studentNum;
    }

    public Long getStudentNum() 
    {
        return studentNum;
    }
    public void setTeacherNum(Long teacherNum) 
    {
        this.teacherNum = teacherNum;
    }

    public Long getTeacherNum() 
    {
        return teacherNum;
    }
    public void setStaffNum(Long staffNum) 
    {
        this.staffNum = staffNum;
    }

    public Long getStaffNum() 
    {
        return staffNum;
    }
    public void setTrainingRoomNum(Long trainingRoomNum) 
    {
        this.trainingRoomNum = trainingRoomNum;
    }

    public Long getTrainingRoomNum() 
    {
        return trainingRoomNum;
    }
    public void setTrainingMoney(BigDecimal trainingMoney) 
    {
        this.trainingMoney = trainingMoney;
    }

    public BigDecimal getTrainingMoney() 
    {
        return trainingMoney;
    }
    public void setTrainingDeviceNum(Long trainingDeviceNum) 
    {
        this.trainingDeviceNum = trainingDeviceNum;
    }

    public Long getTrainingDeviceNum() 
    {
        return trainingDeviceNum;
    }
    public void setMajorNum(Long majorNum) 
    {
        this.majorNum = majorNum;
    }

    public Long getMajorNum() 
    {
        return majorNum;
    }
    public void setEnterpriseNum(Long enterpriseNum) 
    {
        this.enterpriseNum = enterpriseNum;
    }

    public Long getEnterpriseNum() 
    {
        return enterpriseNum;
    }
    public void setTeachingPointNum(Long teachingPointNum) 
    {
        this.teachingPointNum = teachingPointNum;
    }

    public Long getTeachingPointNum() 
    {
        return teachingPointNum;
    }
    public void setPostalAddress(String postalAddress) 
    {
        this.postalAddress = postalAddress;
    }

    public String getPostalAddress() 
    {
        return postalAddress;
    }
    public void setPostalCode(String postalCode) 
    {
        this.postalCode = postalCode;
    }

    public String getPostalCode() 
    {
        return postalCode;
    }
    public void setSchoolWebsite(String schoolWebsite) 
    {
        this.schoolWebsite = schoolWebsite;
    }

    public String getSchoolWebsite() 
    {
        return schoolWebsite;
    }
    public void setSchoolEmail(String schoolEmail) 
    {
        this.schoolEmail = schoolEmail;
    }

    public String getSchoolEmail() 
    {
        return schoolEmail;
    }
    public void setSchoolContacts(String schoolContacts) 
    {
        this.schoolContacts = schoolContacts;
    }

    public String getSchoolContacts() 
    {
        return schoolContacts;
    }
    public void setSchoolTelephone(String schoolTelephone) 
    {
        this.schoolTelephone = schoolTelephone;
    }

    public String getSchoolTelephone() 
    {
        return schoolTelephone;
    }
    public void setPrincipal(String principal) 
    {
        this.principal = principal;
    }

    public String getPrincipal() 
    {
        return principal;
    }
    public void setPrincipalEmail(String principalEmail) 
    {
        this.principalEmail = principalEmail;
    }

    public String getPrincipalEmail() 
    {
        return principalEmail;
    }
    public void setPrincipalTelephone(String principalTelephone) 
    {
        this.principalTelephone = principalTelephone;
    }

    public String getPrincipalTelephone() 
    {
        return principalTelephone;
    }
    public void setStudentStatusManager(String studentStatusManager) 
    {
        this.studentStatusManager = studentStatusManager;
    }

    public String getStudentStatusManager() 
    {
        return studentStatusManager;
    }
    public void setStudentStatusTelephone(String studentStatusTelephone) 
    {
        this.studentStatusTelephone = studentStatusTelephone;
    }

    public String getStudentStatusTelephone() 
    {
        return studentStatusTelephone;
    }
    public void setFreeTuitionContacts(String freeTuitionContacts) 
    {
        this.freeTuitionContacts = freeTuitionContacts;
    }

    public String getFreeTuitionContacts() 
    {
        return freeTuitionContacts;
    }
    public void setFreeTuitionTelephone(String freeTuitionTelephone) 
    {
        this.freeTuitionTelephone = freeTuitionTelephone;
    }

    public String getFreeTuitionTelephone() 
    {
        return freeTuitionTelephone;
    }
    public void setStipendContacts(String stipendContacts) 
    {
        this.stipendContacts = stipendContacts;
    }

    public String getStipendContacts() 
    {
        return stipendContacts;
    }
    public void setStipendTelephone(String stipendTelephone) 
    {
        this.stipendTelephone = stipendTelephone;
    }

    public String getStipendTelephone() 
    {
        return stipendTelephone;
    }
    public void setObtainEmploymentContacts(String obtainEmploymentContacts) 
    {
        this.obtainEmploymentContacts = obtainEmploymentContacts;
    }

    public String getObtainEmploymentContacts() 
    {
        return obtainEmploymentContacts;
    }
    public void setObtainEmploymentTelephone(String obtainEmploymentTelephone) 
    {
        this.obtainEmploymentTelephone = obtainEmploymentTelephone;
    }

    public String getObtainEmploymentTelephone() 
    {
        return obtainEmploymentTelephone;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setAttachmentAddress(String attachmentAddress) 
    {
        this.attachmentAddress = attachmentAddress;
    }

    public String getAttachmentAddress() 
    {
        return attachmentAddress;
    }
    public void setReportingDate(Date reportingDate) 
    {
        this.reportingDate = reportingDate;
    }

    public Date getReportingDate() 
    {
        return reportingDate;
    }
    public void setReportingInformation(String reportingInformation) 
    {
        this.reportingInformation = reportingInformation;
    }

    public String getReportingInformation() 
    {
        return reportingInformation;
    }
    public void setReportingYear(String reportingYear) 
    {
        this.reportingYear = reportingYear;
    }

    public String getReportingYear() 
    {
        return reportingYear;
    }
    public void setReportingStatus(String reportingStatus) 
    {
        this.reportingStatus = reportingStatus;
    }

    public String getReportingStatus() 
    {
        return reportingStatus;
    }
    public void setAuditStatus(String auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public String getAuditStatus() 
    {
        return auditStatus;
    }
    public void setReportingBy(Long reportingBy) 
    {
        this.reportingBy = reportingBy;
    }

    public Long getReportingBy() 
    {
        return reportingBy;
    }
    public void setReportingTime(Date reportingTime) 
    {
        this.reportingTime = reportingTime;
    }

    public Date getReportingTime() 
    {
        return reportingTime;
    }
    public void setAuditCondition(String auditCondition) 
    {
        this.auditCondition = auditCondition;
    }

    public String getAuditCondition() 
    {
        return auditCondition;
    }
    public void setReportingRemark(String reportingRemark) 
    {
        this.reportingRemark = reportingRemark;
    }

    public String getReportingRemark() 
    {
        return reportingRemark;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setGraduateUpNum(Long graduateUpNum) 
    {
        this.graduateUpNum = graduateUpNum;
    }

    public Long getGraduateUpNum() 
    {
        return graduateUpNum;
    }
    public void setMajorTeacherNum(Long majorTeacherNum) 
    {
        this.majorTeacherNum = majorTeacherNum;
    }

    public Long getMajorTeacherNum() 
    {
        return majorTeacherNum;
    }
    public void setUndergraduateUpNum(Long undergraduateUpNum) 
    {
        this.undergraduateUpNum = undergraduateUpNum;
    }

    public Long getUndergraduateUpNum() 
    {
        return undergraduateUpNum;
    }
    public void setDoubleTeacherNum(Long doubleTeacherNum) 
    {
        this.doubleTeacherNum = doubleTeacherNum;
    }

    public Long getDoubleTeacherNum() 
    {
        return doubleTeacherNum;
    }
    public void setSchoolMainHonor(String schoolMainHonor) 
    {
        this.schoolMainHonor = schoolMainHonor;
    }

    public String getSchoolMainHonor() 
    {
        return schoolMainHonor;
    }
    public void setSchoolFeature(String schoolFeature) 
    {
        this.schoolFeature = schoolFeature;
    }

    public String getSchoolFeature() 
    {
        return schoolFeature;
    }
    public void setInstrumentUnitPrice(BigDecimal instrumentUnitPrice) 
    {
        this.instrumentUnitPrice = instrumentUnitPrice;
    }

    public BigDecimal getInstrumentUnitPrice() 
    {
        return instrumentUnitPrice;
    }
    public void setProvincesReportStatus(Integer provincesReportStatus) 
    {
        this.provincesReportStatus = provincesReportStatus;
    }

    public Integer getProvincesReportStatus() 
    {
        return provincesReportStatus;
    }
    public void setProvincesReportTime(Date provincesReportTime) 
    {
        this.provincesReportTime = provincesReportTime;
    }

    public Date getProvincesReportTime() 
    {
        return provincesReportTime;
    }
    public void setProvincesReportPerson(String provincesReportPerson) 
    {
        this.provincesReportPerson = provincesReportPerson;
    }

    public String getProvincesReportPerson() 
    {
        return provincesReportPerson;
    }
    public void setSendReportStatus(String sendReportStatus) 
    {
        this.sendReportStatus = sendReportStatus;
    }

    public String getSendReportStatus() 
    {
        return sendReportStatus;
    }
    public void setSchoolSubject(String schoolSubject) 
    {
        this.schoolSubject = schoolSubject;
    }

    public String getSchoolSubject() 
    {
        return schoolSubject;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }
    public void setHierarchy(Long hierarchy) 
    {
        this.hierarchy = hierarchy;
    }

    public Long getHierarchy() 
    {
        return hierarchy;
    }
    public void setBranchSchoolNum(Long branchSchoolNum) 
    {
        this.branchSchoolNum = branchSchoolNum;
    }

    public Long getBranchSchoolNum() 
    {
        return branchSchoolNum;
    }
    public void setCurrentEnrollment(Long currentEnrollment) 
    {
        this.currentEnrollment = currentEnrollment;
    }

    public Long getCurrentEnrollment() 
    {
        return currentEnrollment;
    }
    public void setDeclareStatus(Integer declareStatus) 
    {
        this.declareStatus = declareStatus;
    }

    public Integer getDeclareStatus() 
    {
        return declareStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("reportingId", getReportingId())
            .append("schoolId", getSchoolId())
            .append("schProcessId", getSchProcessId())
            .append("schoolName", getSchoolName())
            .append("provinceAreaId", getProvinceAreaId())
            .append("cityAreaId", getCityAreaId())
            .append("countryAreaId", getCountryAreaId())
            .append("schoolAddress", getSchoolAddress())
            .append("schoolCode", getSchoolCode())
            .append("approvalNo", getApprovalNo())
            .append("schoolType", getSchoolType())
            .append("schoolNature", getSchoolNature())
            .append("isNationImportant", getIsNationImportant())
            .append("isProvinceImportant", getIsProvinceImportant())
            .append("schoolUnit", getSchoolUnit())
            .append("schoolArea", getSchoolArea())
            .append("buildingArea", getBuildingArea())
            .append("establishedTime", getEstablishedTime())
            .append("studentNum", getStudentNum())
            .append("teacherNum", getTeacherNum())
            .append("staffNum", getStaffNum())
            .append("trainingRoomNum", getTrainingRoomNum())
            .append("trainingMoney", getTrainingMoney())
            .append("trainingDeviceNum", getTrainingDeviceNum())
            .append("majorNum", getMajorNum())
            .append("enterpriseNum", getEnterpriseNum())
            .append("teachingPointNum", getTeachingPointNum())
            .append("postalAddress", getPostalAddress())
            .append("postalCode", getPostalCode())
            .append("schoolWebsite", getSchoolWebsite())
            .append("schoolEmail", getSchoolEmail())
            .append("schoolContacts", getSchoolContacts())
            .append("schoolTelephone", getSchoolTelephone())
            .append("principal", getPrincipal())
            .append("principalEmail", getPrincipalEmail())
            .append("principalTelephone", getPrincipalTelephone())
            .append("studentStatusManager", getStudentStatusManager())
            .append("studentStatusTelephone", getStudentStatusTelephone())
            .append("freeTuitionContacts", getFreeTuitionContacts())
            .append("freeTuitionTelephone", getFreeTuitionTelephone())
            .append("stipendContacts", getStipendContacts())
            .append("stipendTelephone", getStipendTelephone())
            .append("obtainEmploymentContacts", getObtainEmploymentContacts())
            .append("obtainEmploymentTelephone", getObtainEmploymentTelephone())
            .append("deptId", getDeptId())
            .append("attachmentAddress", getAttachmentAddress())
            .append("reportingDate", getReportingDate())
            .append("reportingInformation", getReportingInformation())
            .append("reportingYear", getReportingYear())
            .append("reportingStatus", getReportingStatus())
            .append("auditStatus", getAuditStatus())
            .append("reportingBy", getReportingBy())
            .append("reportingTime", getReportingTime())
            .append("auditCondition", getAuditCondition())
            .append("reportingRemark", getReportingRemark())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .append("graduateUpNum", getGraduateUpNum())
            .append("majorTeacherNum", getMajorTeacherNum())
            .append("undergraduateUpNum", getUndergraduateUpNum())
            .append("doubleTeacherNum", getDoubleTeacherNum())
            .append("schoolMainHonor", getSchoolMainHonor())
            .append("schoolFeature", getSchoolFeature())
            .append("instrumentUnitPrice", getInstrumentUnitPrice())
            .append("provincesReportStatus", getProvincesReportStatus())
            .append("provincesReportTime", getProvincesReportTime())
            .append("provincesReportPerson", getProvincesReportPerson())
            .append("sendReportStatus", getSendReportStatus())
            .append("schoolSubject", getSchoolSubject())
            .append("deptName", getDeptName())
            .append("hierarchy", getHierarchy())
            .append("branchSchoolNum", getBranchSchoolNum())
            .append("currentEnrollment", getCurrentEnrollment())
            .append("declareStatus", getDeclareStatus())
            .toString();
    }
}
