package com.zzhy.system.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 审核历史对象 pub_audit
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
public class PubAudit extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 审核级数，1院校业务经办，2院校专业招生办，3院校校长经办，4院校非全日制学籍申报经办，5院校资助经办 */
    @Excel(name = "审核级数，1院校业务经办，2院校专业招生办，3院校校长经办，4院校非全日制学籍申报经办，5院校资助经办")
    private String auditLevel;

    /** 审核机构名称 */
    @Excel(name = "审核机构名称")
    private String deptName;

    /** 审核角色名称 */
    @Excel(name = "审核角色名称")
    private String roleName;

    /** 审核状态 0待审核，1审核中，2审核通过，3审核驳回 */
    @Excel(name = "审核状态 0待审核，1审核中，2审核通过，3审核驳回")
    private String auditStatus;

    /** 审核人 */
    @Excel(name = "审核人")
    private Long auditBy;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    /** 审核驳回备注备注 */
    @Excel(name = "审核驳回备注备注")
    private String auditRemark;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAuditLevel(String auditLevel) 
    {
        this.auditLevel = auditLevel;
    }

    public String getAuditLevel() 
    {
        return auditLevel;
    }
    public void setDeptName(String deptName) 
    {
        this.deptName = deptName;
    }

    public String getDeptName() 
    {
        return deptName;
    }
    public void setRoleName(String roleName) 
    {
        this.roleName = roleName;
    }

    public String getRoleName() 
    {
        return roleName;
    }
    public void setAuditStatus(String auditStatus) 
    {
        this.auditStatus = auditStatus;
    }

    public String getAuditStatus() 
    {
        return auditStatus;
    }
    public void setAuditBy(Long auditBy) 
    {
        this.auditBy = auditBy;
    }

    public Long getAuditBy() 
    {
        return auditBy;
    }
    public void setAuditTime(Date auditTime) 
    {
        this.auditTime = auditTime;
    }

    public Date getAuditTime() 
    {
        return auditTime;
    }
    public void setAuditRemark(String auditRemark) 
    {
        this.auditRemark = auditRemark;
    }

    public String getAuditRemark() 
    {
        return auditRemark;
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

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("auditLevel", getAuditLevel())
            .append("deptName", getDeptName())
            .append("roleName", getRoleName())
            .append("auditStatus", getAuditStatus())
            .append("auditBy", getAuditBy())
            .append("auditTime", getAuditTime())
            .append("auditRemark", getAuditRemark())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .toString();
    }
}
