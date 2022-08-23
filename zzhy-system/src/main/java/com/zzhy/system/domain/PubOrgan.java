package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 部门对象 pub_organ
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
public class PubOrgan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 机构id */
    private Long organId;

    /** 父部门id */
    @Excel(name = "父部门id")
    private Long parentId;

    /** 祖级列表 */
    @Excel(name = "祖级列表")
    private String ancestors;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String organName;

    /** 显示顺序 */
    @Excel(name = "显示顺序")
    private Long orderNum;

    /** 负责人 */
    @Excel(name = "负责人")
    private String leader;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String phone;

    /** 邮箱 */
    @Excel(name = "邮箱")
    private String email;

    /** 机构学校类型1机构，2学校 */
    @Excel(name = "机构学校类型1机构，2学校")
    private String orgType;

    /** 层级 0区县，1市，2省 */
    @Excel(name = "层级 0区县，1市，2省")
    private String hierarchy;

    /** 地区ID */
    @Excel(name = "地区ID")
    private String areaId;

    /** 不同类型机构的详情ID(学校,院系,校区 等表的ID) */
    @Excel(name = "不同类型机构的详情ID(学校,院系,校区 等表的ID)")
    private Long detailId;

    /** 机构类型1、部门，2、科室 */
    @Excel(name = "机构类型1、部门，2、科室")
    private String organType;

    /** 机构状态（1正常 0停用） */
    @Excel(name = "机构状态", readConverterExp = "1=正常,0=停用")
    private Long status;

    /** 删除标志（0代表存在 2代表删除） */
    private Long delFlag;

    public void setOrganId(Long organId) 
    {
        this.organId = organId;
    }

    public Long getOrganId() 
    {
        return organId;
    }
    public void setParentId(Long parentId) 
    {
        this.parentId = parentId;
    }

    public Long getParentId() 
    {
        return parentId;
    }
    public void setAncestors(String ancestors) 
    {
        this.ancestors = ancestors;
    }

    public String getAncestors() 
    {
        return ancestors;
    }
    public void setOrganName(String organName) 
    {
        this.organName = organName;
    }

    public String getOrganName() 
    {
        return organName;
    }
    public void setOrderNum(Long orderNum) 
    {
        this.orderNum = orderNum;
    }

    public Long getOrderNum() 
    {
        return orderNum;
    }
    public void setLeader(String leader) 
    {
        this.leader = leader;
    }

    public String getLeader() 
    {
        return leader;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getEmail() 
    {
        return email;
    }
    public void setOrgType(String orgType) 
    {
        this.orgType = orgType;
    }

    public String getOrgType() 
    {
        return orgType;
    }
    public void setHierarchy(String hierarchy) 
    {
        this.hierarchy = hierarchy;
    }

    public String getHierarchy() 
    {
        return hierarchy;
    }
    public void setAreaId(String areaId) 
    {
        this.areaId = areaId;
    }

    public String getAreaId() 
    {
        return areaId;
    }
    public void setDetailId(Long detailId) 
    {
        this.detailId = detailId;
    }

    public Long getDetailId() 
    {
        return detailId;
    }
    public void setOrganType(String organType) 
    {
        this.organType = organType;
    }

    public String getOrganType() 
    {
        return organType;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
    {
        return status;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("organId", getOrganId())
            .append("parentId", getParentId())
            .append("ancestors", getAncestors())
            .append("organName", getOrganName())
            .append("orderNum", getOrderNum())
            .append("leader", getLeader())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("orgType", getOrgType())
            .append("hierarchy", getHierarchy())
            .append("areaId", getAreaId())
            .append("detailId", getDetailId())
            .append("organType", getOrganType())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
