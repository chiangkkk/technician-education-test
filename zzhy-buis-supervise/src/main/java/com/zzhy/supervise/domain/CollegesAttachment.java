package com.zzhy.supervise.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 院校端申报通用附件对象 sch_colleges_attachment
 * 
 * @author zzhy
 * @date 2022-06-05
 */
public class CollegesAttachment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long attachmentId;

    /** 院校流程配置ID */
    @Excel(name = "院校流程配置ID")
    private Long schProcessId;

    /** 院校流程名称 */
    @Excel(name = "院校流程名称")
    private String schProcessName;

    /** 院校ID */
    @Excel(name = "院校ID")
    private Long schoolId;

    /** 院校名称 */
    @Excel(name = "院校名称")
    private String schoolName;

    /** 申报年份 */
    @Excel(name = "申报年份")
    private String yearTime;

    /** 季度，1是春季，2是秋季 */
    @Excel(name = "季度，1是春季，2是秋季")
    private String season;

    /** 季度中文，1是春季，2是秋季 */
    @Excel(name = "季度中文，1是春季，2是秋季")
    private String seasonDesc;

    /** 来源id,根据申报流程配置id 获取对应的表id,比如基础信息报备表的id（reporting_id） */
    @Excel(name = "来源id,根据申报流程配置id 获取对应的表id,比如基础信息报备表的id", readConverterExp = "r=eporting_id")
    private Long sourceId;

    /** 附件模板名称 */
    @Excel(name = "附件模板名称")
    private String attachmentModelName;

    /** 附件名称 */
    @Excel(name = "附件名称")
    private String attachmentName;

    /** 附件地址 */
    @Excel(name = "附件地址")
    private String attachmentAddress;

    /** 状态（1正常 2停用） */
    @Excel(name = "状态", readConverterExp = "1=正常,2=停用")
    private String status;

    /** 删除标志（1代表存在 2代表删除） */
    private String delFlag;

    /** 附件模板id */
    @Excel(name = "附件模板id")
    private Long attachmentModelId;

    public void setAttachmentId(Long attachmentId) 
    {
        this.attachmentId = attachmentId;
    }

    public Long getAttachmentId() 
    {
        return attachmentId;
    }
    public void setSchProcessId(Long schProcessId) 
    {
        this.schProcessId = schProcessId;
    }

    public Long getSchProcessId() 
    {
        return schProcessId;
    }
    public void setSchProcessName(String schProcessName) 
    {
        this.schProcessName = schProcessName;
    }

    public String getSchProcessName() 
    {
        return schProcessName;
    }
    public void setSchoolId(Long schoolId) 
    {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() 
    {
        return schoolId;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setYearTime(String yearTime) 
    {
        this.yearTime = yearTime;
    }

    public String getYearTime() 
    {
        return yearTime;
    }
    public void setSeason(String season) 
    {
        this.season = season;
    }

    public String getSeason() 
    {
        return season;
    }
    public void setSeasonDesc(String seasonDesc) 
    {
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonDesc() 
    {
        return seasonDesc;
    }
    public void setSourceId(Long sourceId) 
    {
        this.sourceId = sourceId;
    }

    public Long getSourceId() 
    {
        return sourceId;
    }
    public void setAttachmentModelName(String attachmentModelName) 
    {
        this.attachmentModelName = attachmentModelName;
    }

    public String getAttachmentModelName() 
    {
        return attachmentModelName;
    }
    public void setAttachmentName(String attachmentName) 
    {
        this.attachmentName = attachmentName;
    }

    public String getAttachmentName() 
    {
        return attachmentName;
    }
    public void setAttachmentAddress(String attachmentAddress) 
    {
        this.attachmentAddress = attachmentAddress;
    }

    public String getAttachmentAddress() 
    {
        return attachmentAddress;
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
    public void setAttachmentModelId(Long attachmentModelId) 
    {
        this.attachmentModelId = attachmentModelId;
    }

    public Long getAttachmentModelId() 
    {
        return attachmentModelId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("attachmentId", getAttachmentId())
            .append("schProcessId", getSchProcessId())
            .append("schProcessName", getSchProcessName())
            .append("schoolId", getSchoolId())
            .append("schoolName", getSchoolName())
            .append("yearTime", getYearTime())
            .append("season", getSeason())
            .append("seasonDesc", getSeasonDesc())
            .append("sourceId", getSourceId())
            .append("attachmentModelName", getAttachmentModelName())
            .append("attachmentName", getAttachmentName())
            .append("attachmentAddress", getAttachmentAddress())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .append("attachmentModelId", getAttachmentModelId())
            .toString();
    }
}
