package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 专业信息对象 ga03
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Ga03 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

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

    /** 专业编码 */
    @Excel(name = "专业编码")
    private String age560;

    /** 专业性质 */
    @Excel(name = "专业性质")
    private String age617;

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
    public void setAge560(String age560) 
    {
        this.age560 = age560;
    }

    public String getAge560() 
    {
        return age560;
    }
    public void setAge617(String age617) 
    {
        this.age617 = age617;
    }

    public String getAge617() 
    {
        return age617;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("aae100", getAae100())
            .append("age633", getAge633())
            .append("age433", getAge433())
            .append("age634", getAge634())
            .append("age010", getAge010())
            .append("age422", getAge422())
            .append("age560", getAge560())
            .append("age617", getAge617())
            .toString();
    }
}
