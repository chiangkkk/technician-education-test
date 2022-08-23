package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 空白毕业证领用信息对象 gb14
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gb14 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 院校编号 */
    @Excel(name = "院校编号")
    private String agb020;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 院校编码 */
    @Excel(name = "院校编码")
    private String agb086;

    /** 院校名称 */
    @Excel(name = "院校名称")
    private String agb021;

    /** 空白毕业证起始编号 */
    @Excel(name = "空白毕业证起始编号")
    private String age713;

    /** 空白毕业证截止编号 */
    @Excel(name = "空白毕业证截止编号")
    private String age714;

    /** 领用人 */
    @Excel(name = "领用人")
    private String age715;

    /** 本次领用数量 */
    @Excel(name = "本次领用数量")
    private Long age716;

    /** 领用时间 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "领用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date age717;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String aae005;

    /** 备注 */
    @Excel(name = "备注")
    private String aae013;

    /** 空白毕业证编号 */
    private String age544;

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
    public void setAgb086(String agb086) 
    {
        this.agb086 = agb086;
    }

    public String getAgb086() 
    {
        return agb086;
    }
    public void setAgb021(String agb021) 
    {
        this.agb021 = agb021;
    }

    public String getAgb021() 
    {
        return agb021;
    }
    public void setAge713(String age713) 
    {
        this.age713 = age713;
    }

    public String getAge713() 
    {
        return age713;
    }
    public void setAge714(String age714) 
    {
        this.age714 = age714;
    }

    public String getAge714() 
    {
        return age714;
    }
    public void setAge715(String age715) 
    {
        this.age715 = age715;
    }

    public String getAge715() 
    {
        return age715;
    }
    public void setAge716(Long age716) 
    {
        this.age716 = age716;
    }

    public Long getAge716() 
    {
        return age716;
    }
    public void setAge717(Date age717) 
    {
        this.age717 = age717;
    }

    public Date getAge717() 
    {
        return age717;
    }
    public void setAae005(String aae005) 
    {
        this.aae005 = aae005;
    }

    public String getAae005() 
    {
        return aae005;
    }
    public void setAae013(String aae013) 
    {
        this.aae013 = aae013;
    }

    public String getAae013() 
    {
        return aae013;
    }
    public void setAge544(String age544) 
    {
        this.age544 = age544;
    }

    public String getAge544() 
    {
        return age544;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("agb020", getAgb020())
            .append("aae100", getAae100())
            .append("agb086", getAgb086())
            .append("agb021", getAgb021())
            .append("age713", getAge713())
            .append("age714", getAge714())
            .append("age715", getAge715())
            .append("age716", getAge716())
            .append("age717", getAge717())
            .append("aae005", getAae005())
            .append("aae013", getAae013())
            .append("age544", getAge544())
            .toString();
    }
}
