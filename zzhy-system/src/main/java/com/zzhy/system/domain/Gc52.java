package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 免学费信息对象 gc52
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gc52 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 免学费信息编号 */
    private String age521;

    /** 学籍编码 */
    @Excel(name = "学籍编码")
    private String agc156;

    /** 院校编号 */
    @Excel(name = "院校编号")
    private String agb020;

    /** 免学费标准编号 */
    @Excel(name = "免学费标准编号")
    private String age542;

    /** 院校专业编码 */
    @Excel(name = "院校专业编码")
    private String age655;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 受助原因 */
    @Excel(name = "受助原因")
    private String age525;

    /** 待遇开始日期 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "待遇开始日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age522;

    /** 待遇截止日期 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "待遇截止日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age523;

    /** 学制 */
    @Excel(name = "学制")
    private String age101;

    /** 户口性质（户籍地类别） */
    @Excel(name = "户口性质", readConverterExp = "户=籍地类别")
    private String aac009;

    /** 是否家庭困难 */
    @Excel(name = "是否家庭困难")
    private String age662;

    /** 是否为三区三州 */
    @Excel(name = "是否为三区三州")
    private String age663;

    /** 家庭困难类型 */
    @Excel(name = "家庭困难类型")
    private String agc152;

    /** 资助申请类型 */
    @Excel(name = "资助申请类型")
    private String age619;

    public void setAge521(String age521) 
    {
        this.age521 = age521;
    }

    public String getAge521() 
    {
        return age521;
    }
    public void setAgc156(String agc156) 
    {
        this.agc156 = agc156;
    }

    public String getAgc156() 
    {
        return agc156;
    }
    public void setAgb020(String agb020) 
    {
        this.agb020 = agb020;
    }

    public String getAgb020() 
    {
        return agb020;
    }
    public void setAge542(String age542) 
    {
        this.age542 = age542;
    }

    public String getAge542() 
    {
        return age542;
    }
    public void setAge655(String age655) 
    {
        this.age655 = age655;
    }

    public String getAge655() 
    {
        return age655;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }
    public void setAge525(String age525) 
    {
        this.age525 = age525;
    }

    public String getAge525() 
    {
        return age525;
    }
    public void setAge522(Date age522) 
    {
        this.age522 = age522;
    }

    public Date getAge522() 
    {
        return age522;
    }
    public void setAge523(Date age523) 
    {
        this.age523 = age523;
    }

    public Date getAge523() 
    {
        return age523;
    }
    public void setAge101(String age101) 
    {
        this.age101 = age101;
    }

    public String getAge101() 
    {
        return age101;
    }
    public void setAac009(String aac009) 
    {
        this.aac009 = aac009;
    }

    public String getAac009() 
    {
        return aac009;
    }
    public void setAge662(String age662) 
    {
        this.age662 = age662;
    }

    public String getAge662() 
    {
        return age662;
    }
    public void setAge663(String age663) 
    {
        this.age663 = age663;
    }

    public String getAge663() 
    {
        return age663;
    }
    public void setAgc152(String agc152) 
    {
        this.agc152 = agc152;
    }

    public String getAgc152() 
    {
        return agc152;
    }
    public void setAge619(String age619) 
    {
        this.age619 = age619;
    }

    public String getAge619() 
    {
        return age619;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age521", getAge521())
            .append("agc156", getAgc156())
            .append("agb020", getAgb020())
            .append("age542", getAge542())
            .append("age655", getAge655())
            .append("aae100", getAae100())
            .append("age525", getAge525())
            .append("age522", getAge522())
            .append("age523", getAge523())
            .append("age101", getAge101())
            .append("aac009", getAac009())
            .append("age662", getAge662())
            .append("age663", getAge663())
            .append("agc152", getAgc152())
            .append("age619", getAge619())
            .toString();
    }
}
