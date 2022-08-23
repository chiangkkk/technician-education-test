package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 就业信息对象 gc55
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gc55 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 就业信息编号 */
    private String age534;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 姓名 */
    @Excel(name = "姓名")
    private String aac003;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String aac058;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String aac147;

    /** 就业方式 */
    @Excel(name = "就业方式")
    private String age605;

    /** 就业领域 */
    @Excel(name = "就业领域")
    private String age606;

    /** 就业地区 */
    @Excel(name = "就业地区")
    private String age604;

    /** 就业时间 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "就业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age527;

    /** 基础工资 工资（元） */
    @Excel(name = "基础工资 工资", readConverterExp = "元=")
    private Long aic233;

    /** 备注 */
    @Excel(name = "备注")
    private String aae013;

    /** 学籍编码 */
    @Excel(name = "学籍编码")
    private String agc156;

    public void setAge534(String age534) 
    {
        this.age534 = age534;
    }

    public String getAge534() 
    {
        return age534;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }
    public void setAac003(String aac003) 
    {
        this.aac003 = aac003;
    }

    public String getAac003() 
    {
        return aac003;
    }
    public void setAac058(String aac058) 
    {
        this.aac058 = aac058;
    }

    public String getAac058() 
    {
        return aac058;
    }
    public void setAac147(String aac147) 
    {
        this.aac147 = aac147;
    }

    public String getAac147() 
    {
        return aac147;
    }
    public void setAge605(String age605) 
    {
        this.age605 = age605;
    }

    public String getAge605() 
    {
        return age605;
    }
    public void setAge606(String age606) 
    {
        this.age606 = age606;
    }

    public String getAge606() 
    {
        return age606;
    }
    public void setAge604(String age604) 
    {
        this.age604 = age604;
    }

    public String getAge604() 
    {
        return age604;
    }
    public void setAge527(Date age527) 
    {
        this.age527 = age527;
    }

    public Date getAge527() 
    {
        return age527;
    }
    public void setAic233(Long aic233) 
    {
        this.aic233 = aic233;
    }

    public Long getAic233() 
    {
        return aic233;
    }
    public void setAae013(String aae013) 
    {
        this.aae013 = aae013;
    }

    public String getAae013() 
    {
        return aae013;
    }
    public void setAgc156(String agc156) 
    {
        this.agc156 = agc156;
    }

    public String getAgc156() 
    {
        return agc156;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age534", getAge534())
            .append("aae100", getAae100())
            .append("aac003", getAac003())
            .append("aac058", getAac058())
            .append("aac147", getAac147())
            .append("age605", getAge605())
            .append("age606", getAge606())
            .append("age604", getAge604())
            .append("age527", getAge527())
            .append("aic233", getAic233())
            .append("aae013", getAae013())
            .append("agc156", getAgc156())
            .toString();
    }
}
