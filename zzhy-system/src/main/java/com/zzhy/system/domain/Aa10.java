package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 代码对象 aa10
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Aa10 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 代码编号 */
    @Excel(name = "代码编号")
    private String aaa100;

    /** 代码值 */
    @Excel(name = "代码值")
    private String aaa102;

    /** 代码说明 */
    @Excel(name = "代码说明")
    private String aaa103;

    /** 顺序号 */
    @Excel(name = "顺序号")
    private Long aaa191;

    public void setAaa100(String aaa100) 
    {
        this.aaa100 = aaa100;
    }

    public String getAaa100() 
    {
        return aaa100;
    }
    public void setAaa102(String aaa102) 
    {
        this.aaa102 = aaa102;
    }

    public String getAaa102() 
    {
        return aaa102;
    }
    public void setAaa103(String aaa103) 
    {
        this.aaa103 = aaa103;
    }

    public String getAaa103() 
    {
        return aaa103;
    }
    public void setAaa191(Long aaa191) 
    {
        this.aaa191 = aaa191;
    }

    public Long getAaa191() 
    {
        return aaa191;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("aaa100", getAaa100())
            .append("aaa102", getAaa102())
            .append("aaa103", getAaa103())
            .append("aaa191", getAaa191())
            .toString();
    }
}
