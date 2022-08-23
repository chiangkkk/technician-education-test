package com.zzhy.supervise.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 院校端申报流程审核配置（默认对应院校的管理员角色）对象 sch_colleges_process_audit_config
 * 
 * @author zzhy
 * @date 2022-06-05
 */
public class CollegesProcessAuditConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long declareAuditId;

    /** 申报流程配置id */
    @Excel(name = "申报流程配置id")
    private Long schConfigId;

    /** 机构名称，根据机构id获取机构名称 */
    @Excel(name = "机构名称，根据机构id获取机构名称")
    private Long deptId;

    /** 学院id */
    @Excel(name = "学院id")
    private Long schoolId;

    /** 审核顺序，弱1,2,3,4,5数值越大，越后审 */
    @Excel(name = "审核顺序，弱1,2,3,4,5数值越大，越后审")
    private Long auditOrder;

    /** 角色id */
    @Excel(name = "角色id")
    private Long roleId;

    /** 角色名称 */
    @Excel(name = "角色名称")
    private String roleName;

    /** 审核状态 1待审核，2审核中,3审核通过,4审核驳回 */
    @Excel(name = "审核状态 1待审核，2审核中,3审核通过,4审核驳回")
    private Long auditState;

    /** 审核人 */
    @Excel(name = "审核人")
    private String auditBy;

    /** 审核时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "审核时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date auditTime;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 状态（1正常 2停用） */
    @Excel(name = "状态", readConverterExp = "1=正常,2=停用")
    private String status;

    /** 删除标志（1代表存在 2代表删除） */
    private String delFlag;

    public void setDeclareAuditId(Long declareAuditId) 
    {
        this.declareAuditId = declareAuditId;
    }

    public Long getDeclareAuditId() 
    {
        return declareAuditId;
    }
    public void setSchConfigId(Long schConfigId) 
    {
        this.schConfigId = schConfigId;
    }

    public Long getSchConfigId() 
    {
        return schConfigId;
    }
    public void setDeptId(Long deptId) 
    {
        this.deptId = deptId;
    }

    public Long getDeptId() 
    {
        return deptId;
    }
    public void setSchoolId(Long schoolId) 
    {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() 
    {
        return schoolId;
    }
    public void setAuditOrder(Long auditOrder) 
    {
        this.auditOrder = auditOrder;
    }

    public Long getAuditOrder() 
    {
        return auditOrder;
    }
    public void setRoleId(Long roleId) 
    {
        this.roleId = roleId;
    }

    public Long getRoleId() 
    {
        return roleId;
    }
    public void setRoleName(String roleName) 
    {
        this.roleName = roleName;
    }

    public String getRoleName() 
    {
        return roleName;
    }
    public void setAuditState(Long auditState) 
    {
        this.auditState = auditState;
    }

    public Long getAuditState() 
    {
        return auditState;
    }
    public void setAuditBy(String auditBy) 
    {
        this.auditBy = auditBy;
    }

    public String getAuditBy() 
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
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
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
            .append("declareAuditId", getDeclareAuditId())
            .append("schConfigId", getSchConfigId())
            .append("deptId", getDeptId())
            .append("schoolId", getSchoolId())
            .append("auditOrder", getAuditOrder())
            .append("roleId", getRoleId())
            .append("roleName", getRoleName())
            .append("auditState", getAuditState())
            .append("auditBy", getAuditBy())
            .append("auditTime", getAuditTime())
            .append("sort", getSort())
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
