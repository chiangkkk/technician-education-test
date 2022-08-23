package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 助学金标准对象 ga07
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Ga07 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 助学金标准编号 */
    private String age661;

    /** 单位编号 */
    @Excel(name = "单位编号")
    private String aab001;

    /** 专业编码 */
    @Excel(name = "专业编码")
    private String age560;

    /** 院校专业编码 */
    @Excel(name = "院校专业编码")
    private String age655;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 生效范围 生效范围：填写院校或省、市、县、行政区划 */
    @Excel(name = "生效范围 生效范围：填写院校或省、市、县、行政区划")
    private String age659;

    /** 档次数 */
    @Excel(name = "档次数")
    private Long age646;

    /** 分档 */
    @Excel(name = "分档")
    private String age601;

    /** 启用时间（年度） 启用时间（年度） */
    @Excel(name = "启用时间", readConverterExp = "年=度")
    private String age656;

    /** 启用时间（年度） */
    @Excel(name = "启用时间", readConverterExp = "年=度")
    @JSONField(format = "yyyymmdd HHmmss")
    private Date age658;

    /** 启用时间（年度） 启用时间（学期） */
    @Excel(name = "启用时间", readConverterExp = "年=度")
    private String age657;

    public void setAge661(String age661) 
    {
        this.age661 = age661;
    }

    public String getAge661() 
    {
        return age661;
    }
    public void setAab001(String aab001) 
    {
        this.aab001 = aab001;
    }

    public String getAab001() 
    {
        return aab001;
    }
    public void setAge560(String age560) 
    {
        this.age560 = age560;
    }

    public String getAge560() 
    {
        return age560;
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
    public void setAge659(String age659) 
    {
        this.age659 = age659;
    }

    public String getAge659() 
    {
        return age659;
    }
    public void setAge646(Long age646) 
    {
        this.age646 = age646;
    }

    public Long getAge646() 
    {
        return age646;
    }
    public void setAge601(String age601) 
    {
        this.age601 = age601;
    }

    public String getAge601() 
    {
        return age601;
    }
    public void setAge656(String age656) 
    {
        this.age656 = age656;
    }

    public String getAge656() 
    {
        return age656;
    }
    public void setAge658(Date age658) 
    {
        this.age658 = age658;
    }

    public Date getAge658() 
    {
        return age658;
    }
    public void setAge657(String age657) 
    {
        this.age657 = age657;
    }

    public String getAge657() 
    {
        return age657;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age661", getAge661())
            .append("aab001", getAab001())
            .append("age560", getAge560())
            .append("age655", getAge655())
            .append("aae100", getAae100())
            .append("age659", getAge659())
            .append("age646", getAge646())
            .append("age601", getAge601())
            .append("age656", getAge656())
            .append("age658", getAge658())
            .append("age657", getAge657())
            .toString();
    }
}
