package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 中职卡导入记录对象 ge11
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Ge11 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 中职卡导入记录编号 */
    private String age514;

    /** 学籍编码 */
    @Excel(name = "学籍编码")
    private String agc156;

    /** 银行卡卡号 */
    @Excel(name = "银行卡卡号")
    private String aae053;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String aac147;

    /** 姓名 */
    @Excel(name = "姓名")
    private String aac003;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    public void setAge514(String age514) 
    {
        this.age514 = age514;
    }

    public String getAge514() 
    {
        return age514;
    }
    public void setAgc156(String agc156) 
    {
        this.agc156 = agc156;
    }

    public String getAgc156() 
    {
        return agc156;
    }
    public void setAae053(String aae053) 
    {
        this.aae053 = aae053;
    }

    public String getAae053() 
    {
        return aae053;
    }
    public void setAac147(String aac147) 
    {
        this.aac147 = aac147;
    }

    public String getAac147() 
    {
        return aac147;
    }
    public void setAac003(String aac003) 
    {
        this.aac003 = aac003;
    }

    public String getAac003() 
    {
        return aac003;
    }
    public void setAae100(String aae100) 
    {
        this.aae100 = aae100;
    }

    public String getAae100() 
    {
        return aae100;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age514", getAge514())
            .append("agc156", getAgc156())
            .append("aae053", getAae053())
            .append("aac147", getAac147())
            .append("aac003", getAac003())
            .append("aae100", getAae100())
            .toString();
    }
}
