package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 院校专业信息对象 gb13
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gb13 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 院校专业编码 */
    private String age655;

    /** 院校编号 */
    @Excel(name = "院校编号")
    private String agb020;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 专业版本 */
    @Excel(name = "专业版本")
    private String age633;

    /** 专业大类 */
    @Excel(name = "专业大类")
    private String age433;

    /** 专业大类名称 */
    @Excel(name = "专业大类名称")
    private String age634;

    /** 专业小类 */
    @Excel(name = "专业小类")
    private String age010;

    /** 专业小类名称 */
    @Excel(name = "专业小类名称")
    private String age422;

    /** 所学专业 */
    @Excel(name = "所学专业")
    private String age645;

    /** 教师总数（人） 教师总数（人） */
    @Excel(name = "教师总数", readConverterExp = "人=")
    private Long age671;

    /** 学费（元） 学费（元） */
    @Excel(name = "学费", readConverterExp = "元=")
    private Long age705;

    /** 学生总数（人） 学生总数（人） */
    @Excel(name = "学生总数", readConverterExp = "人=")
    private Long age706;

    public void setAge655(String age655) 
    {
        this.age655 = age655;
    }

    public String getAge655() 
    {
        return age655;
    }
    public void setAgb020(String agb020) 
    {
        this.agb020 = agb020;
    }

    public String getAgb020() 
    {
        return agb020;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }
    public void setAge633(String age633) 
    {
        this.age633 = age633;
    }

    public String getAge633() 
    {
        return age633;
    }
    public void setAge433(String age433) 
    {
        this.age433 = age433;
    }

    public String getAge433() 
    {
        return age433;
    }
    public void setAge634(String age634) 
    {
        this.age634 = age634;
    }

    public String getAge634() 
    {
        return age634;
    }
    public void setAge010(String age010) 
    {
        this.age010 = age010;
    }

    public String getAge010() 
    {
        return age010;
    }
    public void setAge422(String age422) 
    {
        this.age422 = age422;
    }

    public String getAge422() 
    {
        return age422;
    }
    public void setAge645(String age645) 
    {
        this.age645 = age645;
    }

    public String getAge645() 
    {
        return age645;
    }
    public void setAge671(Long age671) 
    {
        this.age671 = age671;
    }

    public Long getAge671() 
    {
        return age671;
    }
    public void setAge705(Long age705) 
    {
        this.age705 = age705;
    }

    public Long getAge705() 
    {
        return age705;
    }
    public void setAge706(Long age706) 
    {
        this.age706 = age706;
    }

    public Long getAge706() 
    {
        return age706;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age655", getAge655())
            .append("agb020", getAgb020())
            .append("aae100", getAae100())
            .append("age633", getAge633())
            .append("age433", getAge433())
            .append("age634", getAge634())
            .append("age010", getAge010())
            .append("age422", getAge422())
            .append("age645", getAge645())
            .append("age671", getAge671())
            .append("age705", getAge705())
            .append("age706", getAge706())
            .toString();
    }
}
