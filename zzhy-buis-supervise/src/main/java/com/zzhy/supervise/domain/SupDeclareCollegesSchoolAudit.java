package com.zzhy.supervise.domain;

import com.zzhy.common.core.domain.BaseEntity;
import java.util.Date;

/**
    * 审核历史记录表（监管端）
    */
public class SupDeclareCollegesSchoolAudit extends BaseEntity {
    /**
    * 主键id
    */
    private Long auditId;

    /**
    * 机构层级，0-初始值，1-省，2-市，3-隶属
    */
    private String deptLevel;

    /**
    * 终审级别，1-省，2-市，3-区县(暂时不考虑)，4-隶属，5-院校
    */
    private String auditLevel;

    /**
    * 终审标志（通过院校端审核完成到监管端配置取处理改状态），1-是，2-否，默认值为2
    */
    private String appointStatus;

    /**
    * 院校id
    */
    private Long schoolId;

    /**
    * 审核顺序 从院校到监管端的审核顺序
    */
    private Byte auditOrder;

    /**
    * 类型，1-院校端，2-监管端
    */
    private String type;

    /**
    * source_id 对应的关联相关配置申请表的id，院校基本情况报备（reporting_id）,其他申报配置类似根据process_config_id来看是对应的那张表的id
    */
    private Long sourceId;

    /**
    * 申报流程配置id（监管端）
    */
    private Long supProcessConfigId;

    /**
    * 申报流程配置id（院校端）
    */
    private Long schProcessConfigId;

    /**
    * 部分级别终审ID（只有部分终审开关打开的情况的会有改信息）
    */
    private Long partProcessAuditId;

    /**
    * 机构id type=2不能为空
    */
    private Long deptId;

    /**
    * 审核机构名称  type=2不能为空
    */
    private String deptName;

    /**
    * 院校对应的角色id  type=1不能为空
    */
    private Long roleId;

    /**
    * 审核角色名称  type=1不能为空
    */
    private String roleName;

    /**
    * 审核状态 1待审核，2审核中，3审核通过，4审核驳回 5 不参与审核
    */
    private String auditStatus;

    /**
    * 审核人
    */
    private Long auditBy;

    /**
    * 审核时间
    */
    private Date auditTime;

    /**
    * 审核备注
    */
    private String auditRemark;

    /**
    * 状态（1正常 2停用）
    */
    private String status;

    /**
    * 删除标志（1代表存在 2代表删除）
    */
    private String delFlag;

    /**
    * 被驳回审核历史是否展示 0 -展示 1-不展示
    */
    private String showType;

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public String getDeptLevel() {
        return deptLevel;
    }

    public void setDeptLevel(String deptLevel) {
        this.deptLevel = deptLevel;
    }

    public String getAuditLevel() {
        return auditLevel;
    }

    public void setAuditLevel(String auditLevel) {
        this.auditLevel = auditLevel;
    }

    public String getAppointStatus() {
        return appointStatus;
    }

    public void setAppointStatus(String appointStatus) {
        this.appointStatus = appointStatus;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Byte getAuditOrder() {
        return auditOrder;
    }

    public void setAuditOrder(Byte auditOrder) {
        this.auditOrder = auditOrder;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public void setSourceId(Long sourceId) {
        this.sourceId = sourceId;
    }

    public Long getSupProcessConfigId() {
        return supProcessConfigId;
    }

    public void setSupProcessConfigId(Long supProcessConfigId) {
        this.supProcessConfigId = supProcessConfigId;
    }

    public Long getSchProcessConfigId() {
        return schProcessConfigId;
    }

    public void setSchProcessConfigId(Long schProcessConfigId) {
        this.schProcessConfigId = schProcessConfigId;
    }

    public Long getPartProcessAuditId() {
        return partProcessAuditId;
    }

    public void setPartProcessAuditId(Long partProcessAuditId) {
        this.partProcessAuditId = partProcessAuditId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(String auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Long getAuditBy() {
        return auditBy;
    }

    public void setAuditBy(Long auditBy) {
        this.auditBy = auditBy;
    }

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditRemark() {
        return auditRemark;
    }

    public void setAuditRemark(String auditRemark) {
        this.auditRemark = auditRemark;
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

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }
}