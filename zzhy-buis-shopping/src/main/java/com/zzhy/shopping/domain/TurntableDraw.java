package com.zzhy.shopping.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 转盘抽奖对象 turntable_draw
 * 
 * @author zzhy
 * @date 2022-09-05
 */
public class TurntableDraw extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键ID */
    private Long id;

    /** 奖项名称 */
    @Excel(name = "奖项名称")
    private String awardName;

    /** 奖项类型 1 谢谢参与 2 商品 */
    @Excel(name = "奖项类型 1 谢谢参与 2 商品")
    private Integer awardType;

    /** 规格id 0 无规格 */
    @Excel(name = "规格id 0 无规格")
    private Long skuId;

    /** 转盘配置id */
    @Excel(name = "转盘配置id")
    private Long turntableConfigId;

    /** 奖品排序 */
    @Excel(name = "奖品排序")
    private Long awordSort;

    /** 状态 1 上架 2 下架 */
    @Excel(name = "状态 1 上架 2 下架")
    private String status;

    /** 中奖几率 */
    @Excel(name = "中奖几率")
    private Long awardRate;

    /** 删除标志 1 正常 2 删除 */
    @Excel(name = "删除标志 1 正常 2 删除")
    private Integer delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setAwardName(String awardName) 
    {
        this.awardName = awardName;
    }

    public String getAwardName() 
    {
        return awardName;
    }
    public void setAwardType(Integer awardType) 
    {
        this.awardType = awardType;
    }

    public Integer getAwardType() 
    {
        return awardType;
    }
    public void setSkuId(Long skuId) 
    {
        this.skuId = skuId;
    }

    public Long getSkuId() 
    {
        return skuId;
    }
    public void setTurntableConfigId(Long turntableConfigId) 
    {
        this.turntableConfigId = turntableConfigId;
    }

    public Long getTurntableConfigId() 
    {
        return turntableConfigId;
    }
    public void setAwordSort(Long awordSort) 
    {
        this.awordSort = awordSort;
    }

    public Long getAwordSort() 
    {
        return awordSort;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setAwardRate(Long awardRate) 
    {
        this.awardRate = awardRate;
    }

    public Long getAwardRate() 
    {
        return awardRate;
    }
    public void setDelFlag(Integer delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Integer getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("awardName", getAwardName())
            .append("awardType", getAwardType())
            .append("skuId", getSkuId())
            .append("turntableConfigId", getTurntableConfigId())
            .append("awordSort", getAwordSort())
            .append("status", getStatus())
            .append("awardRate", getAwardRate())
            .append("delFlag", getDelFlag())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
