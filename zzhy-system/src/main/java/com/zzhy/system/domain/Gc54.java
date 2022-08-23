package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 毕业证信息对象 gc54
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gc54 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 毕业证信息编号 */
    private String age529;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 毕业证书编号 */
    @Excel(name = "毕业证书编号")
    private String agc054;

    /** 毕业证类型 */
    @Excel(name = "毕业证类型")
    private String age635;

    /** 学籍编码 */
    @Excel(name = "学籍编码")
    private String agc156;

    /** 姓名 */
    @Excel(name = "姓名")
    private String aac003;

    /** 性别 */
    @Excel(name = "性别")
    private String aac004;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String aac147;

    /** 出生日期 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date aac006;

    /** 班级 */
    @Excel(name = "班级")
    private String age737;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String age422;

    /** 学制 */
    @Excel(name = "学制")
    private String age101;

    /** 入学时间 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "入学时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age736;

    /** 毕业时间 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "毕业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age780;

    /** 是否打印 */
    @Excel(name = "是否打印")
    private String age559;

    /** 打印时间 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "打印时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age551;

    public void setAge529(String age529) 
    {
        this.age529 = age529;
    }

    public String getAge529() 
    {
        return age529;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }
    public void setAgc054(String agc054) 
    {
        this.agc054 = agc054;
    }

    public String getAgc054() 
    {
        return agc054;
    }
    public void setAge635(String age635) 
    {
        this.age635 = age635;
    }

    public String getAge635() 
    {
        return age635;
    }
    public void setAgc156(String agc156) 
    {
        this.agc156 = agc156;
    }

    public String getAgc156() 
    {
        return agc156;
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
    public void setAac147(String aac147) 
    {
        this.aac147 = aac147;
    }

    public String getAac147() 
    {
        return aac147;
    }
    public void setAac006(Date aac006) 
    {
        this.aac006 = aac006;
    }

    public Date getAac006() 
    {
        return aac006;
    }
    public void setAge737(String age737) 
    {
        this.age737 = age737;
    }

    public String getAge737() 
    {
        return age737;
    }
    public void setAge422(String age422) 
    {
        this.age422 = age422;
    }

    public String getAge422() 
    {
        return age422;
    }
    public void setAge101(String age101) 
    {
        this.age101 = age101;
    }

    public String getAge101() 
    {
        return age101;
    }
    public void setAge736(Date age736) 
    {
        this.age736 = age736;
    }

    public Date getAge736() 
    {
        return age736;
    }
    public void setAge780(Date age780) 
    {
        this.age780 = age780;
    }

    public Date getAge780() 
    {
        return age780;
    }
    public void setAge559(String age559) 
    {
        this.age559 = age559;
    }

    public String getAge559() 
    {
        return age559;
    }
    public void setAge551(Date age551) 
    {
        this.age551 = age551;
    }

    public Date getAge551() 
    {
        return age551;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age529", getAge529())
            .append("aae100", getAae100())
            .append("agc054", getAgc054())
            .append("age635", getAge635())
            .append("agc156", getAgc156())
            .append("aac003", getAac003())
            .append("aac004", getAac004())
            .append("aac147", getAac147())
            .append("aac006", getAac006())
            .append("age737", getAge737())
            .append("age422", getAge422())
            .append("age101", getAge101())
            .append("age736", getAge736())
            .append("age780", getAge780())
            .append("age559", getAge559())
            .append("age551", getAge551())
            .toString();
    }
}
