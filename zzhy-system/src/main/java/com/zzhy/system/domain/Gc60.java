package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 学籍异动信息对象 gc60
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gc60 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学籍异动编号 */
    private String age548;

    /** 学籍编码 */
    @Excel(name = "学籍编码")
    private String agc156;

    /** 异动前所在院校编号 */
    @Excel(name = "异动前所在院校编号")
    private String age760;

    /** 转学学校编号 */
    @Excel(name = "转学学校编号")
    private String age790;

    /** 休学信息编号 休学信息ID，复学时记录对应的休学信息 */
    @Excel(name = "休学信息编号 休学信息ID，复学时记录对应的休学信息")
    private String age746;

    /** 转入前学籍编号 转入前学籍ID（系统内转入时，该学生在原学习的学籍id） */
    @Excel(name = "转入前学籍编号 转入前学籍ID", readConverterExp = "系=统内转入时，该学生在原学习的学籍id")
    private String age792;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 异动类型 */
    @Excel(name = "异动类型")
    private String age622;

    /** 经办人 */
    @Excel(name = "经办人")
    private String aae011;

    /** 经办时间 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "经办时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date aae036;

    public void setAge548(String age548) 
    {
        this.age548 = age548;
    }

    public String getAge548() 
    {
        return age548;
    }
    public void setAgc156(String agc156) 
    {
        this.agc156 = agc156;
    }

    public String getAgc156() 
    {
        return agc156;
    }
    public void setAge760(String age760) 
    {
        this.age760 = age760;
    }

    public String getAge760() 
    {
        return age760;
    }
    public void setAge790(String age790) 
    {
        this.age790 = age790;
    }

    public String getAge790() 
    {
        return age790;
    }
    public void setAge746(String age746) 
    {
        this.age746 = age746;
    }

    public String getAge746() 
    {
        return age746;
    }
    public void setAge792(String age792) 
    {
        this.age792 = age792;
    }

    public String getAge792() 
    {
        return age792;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }
    public void setAge622(String age622) 
    {
        this.age622 = age622;
    }

    public String getAge622() 
    {
        return age622;
    }
    public void setAae011(String aae011) 
    {
        this.aae011 = aae011;
    }

    public String getAae011() 
    {
        return aae011;
    }
    public void setAae036(Date aae036) 
    {
        this.aae036 = aae036;
    }

    public Date getAae036() 
    {
        return aae036;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age548", getAge548())
            .append("agc156", getAgc156())
            .append("age760", getAge760())
            .append("age790", getAge790())
            .append("age746", getAge746())
            .append("age792", getAge792())
            .append("aae100", getAae100())
            .append("age622", getAge622())
            .append("aae011", getAae011())
            .append("aae036", getAae036())
            .toString();
    }
}
