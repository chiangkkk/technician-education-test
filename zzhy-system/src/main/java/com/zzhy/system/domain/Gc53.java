package com.zzhy.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 助学金信息对象 gc53
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gc53 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 助学金信息编号 */
    private String age535;

    /** 学籍编码 */
    @Excel(name = "学籍编码")
    private String agc156;

    /** 院校编号 */
    @Excel(name = "院校编号")
    private String agb020;

    /** 助学金标准编号 */
    @Excel(name = "助学金标准编号")
    private String age661;

    /** 院校专业编码 */
    @Excel(name = "院校专业编码")
    private String age655;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 年级 */
    @Excel(name = "年级")
    private String age607;

    /** 学期 */
    @Excel(name = "学期")
    private String age625;

    /** 受助原因 */
    @Excel(name = "受助原因")
    private String age525;

    /** 补助金额 */
    @Excel(name = "补助金额")
    private Long age538;

    /** 发放类型 */
    @Excel(name = "发放类型")
    private String age636;

    public void setAge535(String age535) 
    {
        this.age535 = age535;
    }

    public String getAge535() 
    {
        return age535;
    }
    public void setAgc156(String agc156) 
    {
        this.agc156 = agc156;
    }

    public String getAgc156() 
    {
        return agc156;
    }
    public void setAgb020(String agb020) 
    {
        this.agb020 = agb020;
    }

    public String getAgb020() 
    {
        return agb020;
    }
    public void setAge661(String age661) 
    {
        this.age661 = age661;
    }

    public String getAge661() 
    {
        return age661;
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
    public void setAge607(String age607) 
    {
        this.age607 = age607;
    }

    public String getAge607() 
    {
        return age607;
    }
    public void setAge625(String age625) 
    {
        this.age625 = age625;
    }

    public String getAge625() 
    {
        return age625;
    }
    public void setAge525(String age525) 
    {
        this.age525 = age525;
    }

    public String getAge525() 
    {
        return age525;
    }
    public void setAge538(Long age538) 
    {
        this.age538 = age538;
    }

    public Long getAge538() 
    {
        return age538;
    }
    public void setAge636(String age636) 
    {
        this.age636 = age636;
    }

    public String getAge636() 
    {
        return age636;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("age535", getAge535())
            .append("agc156", getAgc156())
            .append("agb020", getAgb020())
            .append("age661", getAge661())
            .append("age655", getAge655())
            .append("aae100", getAae100())
            .append("age607", getAge607())
            .append("age625", getAge625())
            .append("age525", getAge525())
            .append("age538", getAge538())
            .append("age636", getAge636())
            .toString();
    }
}
