package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 教师信息对象 gb12
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gb12 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 教师编号 */
    private String agc153;

    /** 院校编号 */
    @Excel(name = "院校编号")
    private String agb020;

    /** 证书编号 */
    @Excel(name = "证书编号")
    private String age699;

    /** 院校专业编码 */
    @Excel(name = "院校专业编码")
    private String age655;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 姓名 */
    @Excel(name = "姓名")
    private String aac003;

    /** 性别 */
    @Excel(name = "性别")
    private String aac004;

    /** 出生日期 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date aac006;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String aac058;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String aac147;

    /** 民族 */
    @Excel(name = "民族")
    private String aac005;

    /** 教育程度 */
    @Excel(name = "教育程度")
    private String agc100;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String aac024;

    /** 教师类别 */
    @Excel(name = "教师类别")
    private String age603;

    /** 专兼职 */
    @Excel(name = "专兼职")
    private String age631;

    /** 专业技术职务 */
    @Excel(name = "专业技术职务")
    private String aac200;

    /** 技工院校职业资格等级 */
    @Excel(name = "技工院校职业资格等级")
    private String age618;

    /** 是否有职称 */
    @Excel(name = "是否有职称")
    private String age648;

    /** 是否有职业资格证书 */
    @Excel(name = "是否有职业资格证书")
    private String age649;

    /** 办公电话 */
    @Excel(name = "办公电话")
    private String age280;

    /** 手机号码 */
    @Excel(name = "手机号码")
    private String aac067;

    /** 个人电子邮箱 */
    @Excel(name = "个人电子邮箱")
    private String agc013;

    public void setAgc153(String agc153) 
    {
        this.agc153 = agc153;
    }

    public String getAgc153() 
    {
        return agc153;
    }
    public void setAgb020(String agb020) 
    {
        this.agb020 = agb020;
    }

    public String getAgb020() 
    {
        return agb020;
    }
    public void setAge699(String age699) 
    {
        this.age699 = age699;
    }

    public String getAge699() 
    {
        return age699;
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
    public void setAac003(String aac003) 
    {
        this.aac003 = aac003;
    }

    public String getAac003() 
    {
        return aac003;
    }
    public void setAac004(String aac004) 
    {
        this.aac004 = aac004;
    }

    public String getAac004() 
    {
        return aac004;
    }
    public void setAac006(Date aac006) 
    {
        this.aac006 = aac006;
    }

    public Date getAac006() 
    {
        return aac006;
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
    public void setAac005(String aac005) 
    {
        this.aac005 = aac005;
    }

    public String getAac005() 
    {
        return aac005;
    }
    public void setAgc100(String agc100) 
    {
        this.agc100 = agc100;
    }

    public String getAgc100() 
    {
        return agc100;
    }
    public void setAac024(String aac024) 
    {
        this.aac024 = aac024;
    }

    public String getAac024() 
    {
        return aac024;
    }
    public void setAge603(String age603) 
    {
        this.age603 = age603;
    }

    public String getAge603() 
    {
        return age603;
    }
    public void setAge631(String age631) 
    {
        this.age631 = age631;
    }

    public String getAge631() 
    {
        return age631;
    }
    public void setAac200(String aac200) 
    {
        this.aac200 = aac200;
    }

    public String getAac200() 
    {
        return aac200;
    }
    public void setAge618(String age618) 
    {
        this.age618 = age618;
    }

    public String getAge618() 
    {
        return age618;
    }
    public void setAge648(String age648) 
    {
        this.age648 = age648;
    }

    public String getAge648() 
    {
        return age648;
    }
    public void setAge649(String age649) 
    {
        this.age649 = age649;
    }

    public String getAge649() 
    {
        return age649;
    }
    public void setAge280(String age280) 
    {
        this.age280 = age280;
    }

    public String getAge280() 
    {
        return age280;
    }
    public void setAac067(String aac067) 
    {
        this.aac067 = aac067;
    }

    public String getAac067() 
    {
        return aac067;
    }
    public void setAgc013(String agc013) 
    {
        this.agc013 = agc013;
    }

    public String getAgc013() 
    {
        return agc013;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("agc153", getAgc153())
            .append("agb020", getAgb020())
            .append("age699", getAge699())
            .append("age655", getAge655())
            .append("aae100", getAae100())
            .append("aac003", getAac003())
            .append("aac004", getAac004())
            .append("aac006", getAac006())
            .append("aac058", getAac058())
            .append("aac147", getAac147())
            .append("aac005", getAac005())
            .append("agc100", getAgc100())
            .append("aac024", getAac024())
            .append("age603", getAge603())
            .append("age631", getAge631())
            .append("aac200", getAac200())
            .append("age618", getAge618())
            .append("age648", getAge648())
            .append("age649", getAge649())
            .append("age280", getAge280())
            .append("aac067", getAac067())
            .append("agc013", getAgc013())
            .toString();
    }
}
