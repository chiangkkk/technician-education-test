package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 行政区划对象 aa51
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Aa51 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 行政区划代码 */
    @Excel(name = "行政区划代码")
    private String aaa145;

    /** 行政区划名称 */
    @Excel(name = "行政区划名称")
    private String aaa146;

    /** 行政区划级别 */
    @Excel(name = "行政区划级别")
    private String aaa147;

    /** 上级行政区划代码 */
    @Excel(name = "上级行政区划代码")
    private String aaa148;

    /** 行政区划版本号 */
    @Excel(name = "行政区划版本号")
    private Long aae383;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 备注 */
    @Excel(name = "备注")
    private String aae013;

    public void setAaa145(String aaa145) 
    {
        this.aaa145 = aaa145;
    }

    public String getAaa145() 
    {
        return aaa145;
    }
    public void setAaa146(String aaa146) 
    {
        this.aaa146 = aaa146;
    }

    public String getAaa146() 
    {
        return aaa146;
    }
    public void setAaa147(String aaa147) 
    {
        this.aaa147 = aaa147;
    }

    public String getAaa147() 
    {
        return aaa147;
    }
    public void setAaa148(String aaa148) 
    {
        this.aaa148 = aaa148;
    }

    public String getAaa148() 
    {
        return aaa148;
    }
    public void setAae383(Long aae383) 
    {
        this.aae383 = aae383;
    }

    public Long getAae383() 
    {
        return aae383;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
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
            .append("aaa145", getAaa145())
            .append("aaa146", getAaa146())
            .append("aaa147", getAaa147())
            .append("aaa148", getAaa148())
            .append("aae383", getAae383())
            .append("aae100", getAae100())
            .append("aae013", getAae013())
            .toString();
    }
}
