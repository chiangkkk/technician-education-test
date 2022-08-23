package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 院校专业修改信息对象 gb15
 * 
 * @author zzhy
 * @date 2021-12-22
 */
public class Gb15 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 指院校专业的修改记录编号 */
    @Excel(name = "指院校专业的修改记录编号")
    private String age879;

    /** 指院校专业的编码 */
    @Excel(name = "指院校专业的编码")
    private String age655;

    /** 院校编号 */
    @Excel(name = "院校编号")
    private String agb020;

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

    /** 教师总数（人） 教师总数（人） */
    @Excel(name = "教师总数", readConverterExp = "人=")
    private Long age671;

    /** 学费（元） 学费（元） */
    @Excel(name = "学费", readConverterExp = "元=")
    private Long age705;

    /** 学生总数（人） 学生总数（人） */
    @Excel(name = "学生总数", readConverterExp = "人=")
    private Long age706;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 院校专业名称 */
    @Excel(name = "院校专业名称")
    private String age645;

    /** 专业编码 */
    @Excel(name = "专业编码")
    private String age560;

    /** 一体化教师总数（人） */
    @Excel(name = "一体化教师总数", readConverterExp = "人=")
    private Long age701;

    /** 实训室总数（间） */
    @Excel(name = "实训室总数", readConverterExp = "间=")
    private Long age702;

    /** 实训设备总数（台） */
    @Excel(name = "实训设备总数", readConverterExp = "台=")
    private Long age703;

    /** 实训资金总数（元） */
    @Excel(name = "实训资金总数", readConverterExp = "元=")
    private Long age704;

    /** 备注 */
    @Excel(name = "备注")
    private String aae013;

    /** 专业性质 */
    @Excel(name = "专业性质")
    private String age617;

    /** 专业删除原因 */
    @Excel(name = "专业删除原因")
    private String age707;

    public void setAge879(String age879) 
    {
        this.age879 = age879;
    }

    public String getAge879() 
    {
        return age879;
    }
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
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }
    public void setAge645(String age645) 
    {
        this.age645 = age645;
    }

    public String getAge645() 
    {
        return age645;
    }
    public void setAge560(String age560) 
    {
        this.age560 = age560;
    }

    public String getAge560() 
    {
        return age560;
    }
    public void setAge701(Long age701) 
    {
        this.age701 = age701;
    }

    public Long getAge701() 
    {
        return age701;
    }
    public void setAge702(Long age702) 
    {
        this.age702 = age702;
    }

    public Long getAge702() 
    {
        return age702;
    }
    public void setAge703(Long age703) 
    {
        this.age703 = age703;
    }

    public Long getAge703() 
    {
        return age703;
    }
    public void setAge704(Long age704) 
    {
        this.age704 = age704;
    }

    public Long getAge704() 
    {
        return age704;
    }
    public void setAae013(String aae013) 
    {
        this.aae013 = aae013;
    }

    public String getAae013() 
    {
        return aae013;
    }
    public void setAge617(String age617) 
    {
        this.age617 = age617;
    }

    public String getAge617() 
    {
        return age617;
    }
    public void setAge707(String age707) 
    {
        this.age707 = age707;
    }

    public String getAge707() 
    {
        return age707;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age879", getAge879())
            .append("age655", getAge655())
            .append("agb020", getAgb020())
            .append("age633", getAge633())
            .append("age433", getAge433())
            .append("age634", getAge634())
            .append("age010", getAge010())
            .append("age422", getAge422())
            .append("age671", getAge671())
            .append("age705", getAge705())
            .append("age706", getAge706())
            .append("aae100", getAae100())
            .append("age645", getAge645())
            .append("age560", getAge560())
            .append("age701", getAge701())
            .append("age702", getAge702())
            .append("age703", getAge703())
            .append("age704", getAge704())
            .append("aae013", getAae013())
            .append("age617", getAge617())
            .append("age707", getAge707())
            .toString();
    }
}
