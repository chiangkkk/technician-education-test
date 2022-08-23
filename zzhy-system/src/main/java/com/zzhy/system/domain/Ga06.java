package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 免学费标准对象 ga06
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Ga06 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 免学费标准编号 */
    private String age542;

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

    /** 专业类别 */
    @Excel(name = "专业类别")
    private String age433;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String age422;

    /** 年级 */
    @Excel(name = "年级")
    private String age607;

    /** 学费标准 */
    @Excel(name = "学费标准")
    private Long age537;

    /** 补助金额 */
    @Excel(name = "补助金额")
    private Long age538;

    /** 启用时间（年度） */
    @Excel(name = "启用时间", readConverterExp = "年=度")
    @JSONField(format = "yyyymmdd HHmmss")
    private Date age658;

    public void setAge542(String age542) 
    {
        this.age542 = age542;
    }

    public String getAge542() 
    {
        return age542;
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
    public void setAge433(String age433) 
    {
        this.age433 = age433;
    }

    public String getAge433() 
    {
        return age433;
    }
    public void setAge422(String age422) 
    {
        this.age422 = age422;
    }

    public String getAge422() 
    {
        return age422;
    }
    public void setAge607(String age607) 
    {
        this.age607 = age607;
    }

    public String getAge607() 
    {
        return age607;
    }
    public void setAge537(Long age537) 
    {
        this.age537 = age537;
    }

    public Long getAge537() 
    {
        return age537;
    }
    public void setAge538(Long age538) 
    {
        this.age538 = age538;
    }

    public Long getAge538() 
    {
        return age538;
    }
    public void setAge658(Date age658)
    {
        this.age658 = age658;
    }

    public Date getAge658()
    {
        return age658;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age542", getAge542())
            .append("aab001", getAab001())
            .append("age560", getAge560())
            .append("age655", getAge655())
            .append("aae100", getAae100())
            .append("age659", getAge659())
            .append("age433", getAge433())
            .append("age422", getAge422())
            .append("age607", getAge607())
            .append("age537", getAge537())
            .append("age538", getAge538())
            .append("age658", getAge658())
            .toString();
    }
}
