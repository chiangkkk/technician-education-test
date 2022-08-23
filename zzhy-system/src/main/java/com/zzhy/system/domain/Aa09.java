package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 代码类型对象 aa09
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Aa09 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 代码编号 */
    @Excel(name = "代码编号")
    private String aaa100;

    /** 代码名称 */
    @Excel(name = "代码名称")
    private String aaa101;

    /** 备注 */
    @Excel(name = "备注")
    private String aae013;

    public void setAaa100(String aaa100) 
    {
        this.aaa100 = aaa100;
    }

    public String getAaa100() 
    {
        return aaa100;
    }
    public void setAaa101(String aaa101) 
    {
        this.aaa101 = aaa101;
    }

    public String getAaa101() 
    {
        return aaa101;
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
            .append("aaa100", getAaa100())
            .append("aaa101", getAaa101())
            .append("aae013", getAae013())
            .toString();
    }
}
