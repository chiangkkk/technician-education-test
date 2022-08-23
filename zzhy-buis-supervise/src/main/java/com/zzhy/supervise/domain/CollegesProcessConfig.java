package com.zzhy.supervise.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 院校端申报流程配置对象 sch_colleges_process_config
 * 
 * @author zzhy
 * @date 2022-06-05
 */
public class CollegesProcessConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 院校端的配置id */
    private Long schConfigId;

    /** 监管端流程配置id */
    @Excel(name = "监管端流程配置id")
    private Long supProcessId;

    /** 流程编码 */
    @Excel(name = "流程编码")
    private String processCode;

    /** 流程名称 */
    @Excel(name = "流程名称")
    private String processName;

    /** 流程头像 */
    @Excel(name = "流程头像")
    private String processImg;

    /** 审核层级,默认为1层 */
    @Excel(name = "审核层级,默认为1层")
    private Long auditLevel;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 状态 1正常,2停用 */
    @Excel(name = "状态 1正常,2停用")
    private String status;

    /** 删除标志（1代表存在 2代表删除） */
    private String delFlag;

    /** 上传文件的的相对路径 */
    @Excel(name = "上传文件的的相对路径")
    private String filePath;

    public void setSchConfigId(Long schConfigId) 
    {
        this.schConfigId = schConfigId;
    }

    public Long getSchConfigId() 
    {
        return schConfigId;
    }
    public void setSupProcessId(Long supProcessId) 
    {
        this.supProcessId = supProcessId;
    }

    public Long getSupProcessId() 
    {
        return supProcessId;
    }
    public void setProcessCode(String processCode) 
    {
        this.processCode = processCode;
    }

    public String getProcessCode() 
    {
        return processCode;
    }
    public void setProcessName(String processName) 
    {
        this.processName = processName;
    }

    public String getProcessName() 
    {
        return processName;
    }
    public void setProcessImg(String processImg) 
    {
        this.processImg = processImg;
    }

    public String getProcessImg() 
    {
        return processImg;
    }
    public void setAuditLevel(Long auditLevel) 
    {
        this.auditLevel = auditLevel;
    }

    public Long getAuditLevel() 
    {
        return auditLevel;
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
    public void setFilePath(String filePath) 
    {
        this.filePath = filePath;
    }

    public String getFilePath() 
    {
        return filePath;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("schConfigId", getSchConfigId())
            .append("supProcessId", getSupProcessId())
            .append("processCode", getProcessCode())
            .append("processName", getProcessName())
            .append("processImg", getProcessImg())
            .append("auditLevel", getAuditLevel())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .append("filePath", getFilePath())
            .toString();
    }
}
