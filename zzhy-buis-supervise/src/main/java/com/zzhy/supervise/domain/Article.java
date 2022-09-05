package com.zzhy.supervise.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 文章对象 article
 * 
 * @author zzhy
 * @date 2022-08-30
 */
public class Article extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long articleId;

    /** 文章标题 */
    @Excel(name = "文章标题")
    private String articleTitle;

    /** 文章类型 1 通知公告 2 政策法规 */
    @Excel(name = "文章类型 1 通知公告 2 政策法规")
    private String articleType;

    /** 是否置顶 1 置顶 2 不置顶 */
    @Excel(name = "是否置顶 1 置顶 2 不置顶")
    private Long articleTop;

    /** 发布终端 1 小程序 2PC */
    @Excel(name = "发布终端 1 小程序 2PC")
    private String terminalType;

    /** 对外发布开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Excel(name = "对外发布开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 对外发布截止时间 */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Excel(name = "对外发布截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 文章内容 */
    @Excel(name = "文章内容")
    private String articleDetails;

    /** 排序 越大越考前 */
    @Excel(name = "排序 越大越考前")
    private Long sort;

    /** 状态 */
    @Excel(name = "状态")
    private Long status;

    /** 删除标志 1 正常 2 删除 */
    @Excel(name = "删除标志 1 正常 2 删除")
    private String delFlag;

    public void setArticleId(Long articleId) 
    {
        this.articleId = articleId;
    }

    public Long getArticleId() 
    {
        return articleId;
    }
    public void setArticleTitle(String articleTitle) 
    {
        this.articleTitle = articleTitle;
    }

    public String getArticleTitle() 
    {
        return articleTitle;
    }
    public void setArticleType(String articleType)
    {
        this.articleType = articleType;
    }

    public String getArticleType()
    {
        return articleType;
    }
    public void setArticleTop(Long articleTop) 
    {
        this.articleTop = articleTop;
    }

    public Long getArticleTop() 
    {
        return articleTop;
    }
    public void setTerminalType(String terminalType)
    {
        this.terminalType = terminalType;
    }

    public String getTerminalType()
    {
        return terminalType;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }

    public String getArticleDetails() {
        return articleDetails;
    }

    public void setArticleDetails(String articleDetails) {
        this.articleDetails = articleDetails;
    }

    public void setSort(Long sort)
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public Long getStatus() 
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
            .append("articleId", getArticleId())
            .append("articleTitle", getArticleTitle())
            .append("articleType", getArticleType())
            .append("articleTop", getArticleTop())
            .append("terminalType", getTerminalType())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("articleDetai",getArticleDetails())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
