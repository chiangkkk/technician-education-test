package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 职业资格证书对象 gc56
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gc56 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 职业资格证书信息编号 */
    private String agc163;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String aac147;

    /** 姓名 */
    @Excel(name = "姓名")
    private String aac003;

    /** 职业资格名称 */
    @Excel(name = "职业资格名称")
    private String agc164;

    /** 技工院校职业资格等级 */
    @Excel(name = "技工院校职业资格等级")
    private String age618;

    /** 职业资格证书编号 */
    @Excel(name = "职业资格证书编号")
    private String age553;

    /** 发放时间 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "发放时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age654;

    /** 学籍编码 */
    @Excel(name = "学籍编码")
    private String agc156;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String aac058;

    /** 备注 */
    @Excel(name = "备注")
    private String aae013;

    public void setAgc163(String agc163) 
    {
        this.agc163 = agc163;
    }

    public String getAgc163() 
    {
        return agc163;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }
    public void setAac147(String aac147) 
    {
        this.aac147 = aac147;
    }

    public String getAac147() 
    {
        return aac147;
    }
    public void setAac003(String aac003) 
    {
        this.aac003 = aac003;
    }

    public String getAac003() 
    {
        return aac003;
    }
    public void setAgc164(String agc164) 
    {
        this.agc164 = agc164;
    }

    public String getAgc164() 
    {
        return agc164;
    }
    public void setAge618(String age618) 
    {
        this.age618 = age618;
    }

    public String getAge618() 
    {
        return age618;
    }
    public void setAge553(String age553) 
    {
        this.age553 = age553;
    }

    public String getAge553() 
    {
        return age553;
    }
    public void setAge654(Date age654) 
    {
        this.age654 = age654;
    }

    public Date getAge654() 
    {
        return age654;
    }
    public void setAgc156(String agc156) 
    {
        this.agc156 = agc156;
    }

    public String getAgc156() 
    {
        return agc156;
    }
    public void setAac058(String aac058) 
    {
        this.aac058 = aac058;
    }

    public String getAac058() 
    {
        return aac058;
    }
    public void setAae013(String aae013) 
    {
        this.aae013 = aae013;
    }

    public String getAae013() 
    {
        return aae013;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("agc163", getAgc163())
            .append("aae100", getAae100())
            .append("aac147", getAac147())
            .append("aac003", getAac003())
            .append("agc164", getAgc164())
            .append("age618", getAge618())
            .append("age553", getAge553())
            .append("age654", getAge654())
            .append("agc156", getAgc156())
            .append("aac058", getAac058())
            .append("aae013", getAae013())
            .toString();
    }
}
