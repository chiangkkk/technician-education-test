package com.zzhy.shopping.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 转盘配置对象 turntable_configuration
 * 
 * @author zzhy
 * @date 2022-09-05
 */
public class TurntableConfiguration extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long turntableId;

    /** 转盘名称 */
    @Excel(name = "转盘名称")
    private String turntableName;

    /** 消耗积分 */
    @Excel(name = "消耗积分")
    private Long cusomerIntegral;

    /** 状态 1 启用 0 禁用 */
    @Excel(name = "状态 1 启用 0 禁用")
    private Long status;

    /** 删除标志 1 正常0 删除 */
    @Excel(name = "删除标志 1 正常0 删除")
    private String delFlag;

    @Excel(name = "抽奖次数")
    private Integer lotteryNumber;

    public Integer getLotteryNumber() {
        return lotteryNumber;
    }

    public void setLotteryNumber(Integer lotteryNumber) {
        this.lotteryNumber = lotteryNumber;
    }

    public void setTurntableId(Long turntableId)
    {
        this.turntableId = turntableId;
    }

    public Long getTurntableId() 
    {
        return turntableId;
    }
    public void setTurntableName(String turntableName) 
    {
        this.turntableName = turntableName;
    }

    public String getTurntableName() 
    {
        return turntableName;
    }
    public void setCusomerIntegral(Long cusomerIntegral) 
    {
        this.cusomerIntegral = cusomerIntegral;
    }

    public Long getCusomerIntegral() 
    {
        return cusomerIntegral;
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
            .append("turntableId", getTurntableId())
            .append("turntableName", getTurntableName())
            .append("cusomerIntegral", getCusomerIntegral())
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
