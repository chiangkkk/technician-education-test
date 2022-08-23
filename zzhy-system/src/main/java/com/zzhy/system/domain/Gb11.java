package com.zzhy.system.domain;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 技工院校信息对象 gb11
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public class Gb11 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 院校编号 */
    private String agb020;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 院校地址（省） 院校地址（省） */
    @Excel(name = "院校地址", readConverterExp = "省=")
    private String age679;

    /** 院校地址（省） 院校地址（市） */
    @Excel(name = "院校地址", readConverterExp = "省=")
    private String age680;

    /** 院校地址（省） 院校地址（县） */
    @Excel(name = "院校地址", readConverterExp = "省=")
    private String age681;

    /** 是否连片困难地区 */
    @Excel(name = "是否连片困难地区")
    private String age664;

    /** 是否民族地区 是否民族地区（自治区县） */
    @Excel(name = "是否民族地区 是否民族地区", readConverterExp = "自=治区县")
    private String agb024;

    /** 是否三区三洲 */
    @Excel(name = "是否三区三洲")
    private String agb025;

    /** 院校地址详细信息 */
    @Excel(name = "院校地址详细信息")
    private String age682;

    /** 批准成立文号 */
    @Excel(name = "批准成立文号")
    private String aae051;

    /** 院校名称 */
    @Excel(name = "院校名称")
    private String agb021;

    /** 院校代码 院校代码(三位，此代码由上级分配） */
    @Excel(name = "院校代码 院校代码(三位，此代码由上级分配）")
    private String agb087;

    /** 组织机构代码 */
    @Excel(name = "组织机构代码")
    private String aab003;

    /** 所在区域 */
    @Excel(name = "所在区域")
    private String age613;

    /** 上级单位编码 */
    @Excel(name = "上级单位编码")
    private String agb012;

    /** 成立日期 */
    @JSONField(format = "yyyymmdd HHmmss")
    @Excel(name = "成立日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date aae047;

    /** 院校类别 */
    @Excel(name = "院校类别")
    private String agb082;

    /** 院校性质 */
    @Excel(name = "院校性质")
    private String agb022;

    /** 院校性质2 */
    @Excel(name = "院校性质2")
    private String agb023;

    /** 是否国家重点院校 */
    @Excel(name = "是否国家重点院校")
    private String age666;

    /** 是否省重点院校 */
    @Excel(name = "是否省重点院校")
    private String age667;

    /** 隶属关系 隶属关系，1-省属，2-市属 */
    @Excel(name = "隶属关系 隶属关系，1-省属，2-市属")
    private String aab021;

    /** 办学单位 */
    @Excel(name = "办学单位")
    private String agb084;

    /** 占地面积（平方米） 占地面积（平方米） */
    @Excel(name = "占地面积", readConverterExp = "平=方米")
    private Long age668;

    /** 建筑面积（平方米） 建筑面积（平方米） */
    @Excel(name = "建筑面积", readConverterExp = "平=方米")
    private Long age669;

    /** 在校生总数（人） 在校生总数（人） */
    @Excel(name = "在校生总数", readConverterExp = "人=")
    private Long age670;

    /** 教师总数（人） 教师总数（人） */
    @Excel(name = "教师总数", readConverterExp = "人=")
    private Long age671;

    /** 教职工总数（人） 教职工总数（人） */
    @Excel(name = "教职工总数", readConverterExp = "人=")
    private Long age672;

    /** 实训室总数（间） 实训室总数（间） */
    @Excel(name = "实训室总数", readConverterExp = "间=")
    private Long age702;

    /** 实训设备总数（台） 实训设备总数（台） */
    @Excel(name = "实训设备总数", readConverterExp = "台=")
    private Long age703;

    /** 实训资金（元） 实训资金（元） */
    @Excel(name = "实训资金", readConverterExp = "元=")
    private Long age675;

    /** 专业设置总数（门） 专业设置总数（门） */
    @Excel(name = "专业设置总数", readConverterExp = "门=")
    private Long age676;

    /** 校企合作总数（家） 校企合作总数（家） */
    @Excel(name = "校企合作总数", readConverterExp = "家=")
    private Long age677;

    /** 教学点总数（个） 教学点总数（个） */
    @Excel(name = "教学点总数", readConverterExp = "个=")
    private Long age678;

    /** 通讯地址详细信息 */
    @Excel(name = "通讯地址详细信息")
    private String age686;

    /** 邮政编码 */
    @Excel(name = "邮政编码")
    private String aae007;

    /** 院校网站 */
    @Excel(name = "院校网站")
    private String agb088;

    /** 电子邮箱 */
    @Excel(name = "电子邮箱")
    private String agb004;

    /** 联系人 */
    @Excel(name = "联系人")
    private String aae004;

    /** 院校联系电话 */
    @Excel(name = "院校联系电话")
    private String agb096;

    /** 校长姓名 */
    @Excel(name = "校长姓名")
    private String age687;

    /** 校长邮箱 */
    @Excel(name = "校长邮箱")
    private String age688;

    /** 校长电话 */
    @Excel(name = "校长电话")
    private String age689;

    /** 学籍负责人 */
    @Excel(name = "学籍负责人")
    private String age690;

    /** 学籍联系电话 */
    @Excel(name = "学籍联系电话")
    private String age691;

    /** 免学费联系人 */
    @Excel(name = "免学费联系人")
    private String age692;

    /** 免学费联系电话 */
    @Excel(name = "免学费联系电话")
    private String age693;

    /** 助学金联系人 */
    @Excel(name = "助学金联系人")
    private String age694;

    /** 助学金联系电话 */
    @Excel(name = "助学金联系电话")
    private String age695;

    /** 就业负责人 */
    @Excel(name = "就业负责人")
    private String age696;

    /** 就业联系电话 */
    @Excel(name = "就业联系电话")
    private String age697;

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
    public void setAge679(String age679) 
    {
        this.age679 = age679;
    }

    public String getAge679() 
    {
        return age679;
    }
    public void setAge680(String age680) 
    {
        this.age680 = age680;
    }

    public String getAge680() 
    {
        return age680;
    }
    public void setAge681(String age681) 
    {
        this.age681 = age681;
    }

    public String getAge681() 
    {
        return age681;
    }
    public void setAge664(String age664) 
    {
        this.age664 = age664;
    }

    public String getAge664() 
    {
        return age664;
    }
    public void setAgb024(String agb024) 
    {
        this.agb024 = agb024;
    }

    public String getAgb024() 
    {
        return agb024;
    }
    public void setAgb025(String agb025) 
    {
        this.agb025 = agb025;
    }

    public String getAgb025() 
    {
        return agb025;
    }
    public void setAge682(String age682) 
    {
        this.age682 = age682;
    }

    public String getAge682() 
    {
        return age682;
    }
    public void setAae051(String aae051) 
    {
        this.aae051 = aae051;
    }

    public String getAae051() 
    {
        return aae051;
    }
    public void setAgb021(String agb021) 
    {
        this.agb021 = agb021;
    }

    public String getAgb021() 
    {
        return agb021;
    }
    public void setAgb087(String agb087) 
    {
        this.agb087 = agb087;
    }

    public String getAgb087() 
    {
        return agb087;
    }
    public void setAab003(String aab003) 
    {
        this.aab003 = aab003;
    }

    public String getAab003() 
    {
        return aab003;
    }
    public void setAge613(String age613) 
    {
        this.age613 = age613;
    }

    public String getAge613() 
    {
        return age613;
    }
    public void setAgb012(String agb012) 
    {
        this.agb012 = agb012;
    }

    public String getAgb012() 
    {
        return agb012;
    }
    public void setAae047(Date aae047) 
    {
        this.aae047 = aae047;
    }

    public Date getAae047() 
    {
        return aae047;
    }
    public void setAgb082(String agb082) 
    {
        this.agb082 = agb082;
    }

    public String getAgb082() 
    {
        return agb082;
    }
    public void setAgb022(String agb022) 
    {
        this.agb022 = agb022;
    }

    public String getAgb022() 
    {
        return agb022;
    }
    public void setAgb023(String agb023) 
    {
        this.agb023 = agb023;
    }

    public String getAgb023() 
    {
        return agb023;
    }
    public void setAge666(String age666) 
    {
        this.age666 = age666;
    }

    public String getAge666() 
    {
        return age666;
    }
    public void setAge667(String age667) 
    {
        this.age667 = age667;
    }

    public String getAge667() 
    {
        return age667;
    }
    public void setAab021(String aab021) 
    {
        this.aab021 = aab021;
    }

    public String getAab021() 
    {
        return aab021;
    }
    public void setAgb084(String agb084) 
    {
        this.agb084 = agb084;
    }

    public String getAgb084() 
    {
        return agb084;
    }
    public void setAge668(Long age668) 
    {
        this.age668 = age668;
    }

    public Long getAge668() 
    {
        return age668;
    }
    public void setAge669(Long age669) 
    {
        this.age669 = age669;
    }

    public Long getAge669() 
    {
        return age669;
    }
    public void setAge670(Long age670) 
    {
        this.age670 = age670;
    }

    public Long getAge670() 
    {
        return age670;
    }
    public void setAge671(Long age671) 
    {
        this.age671 = age671;
    }

    public Long getAge671() 
    {
        return age671;
    }
    public void setAge672(Long age672) 
    {
        this.age672 = age672;
    }

    public Long getAge672() 
    {
        return age672;
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
    public void setAge675(Long age675) 
    {
        this.age675 = age675;
    }

    public Long getAge675() 
    {
        return age675;
    }
    public void setAge676(Long age676) 
    {
        this.age676 = age676;
    }

    public Long getAge676() 
    {
        return age676;
    }
    public void setAge677(Long age677) 
    {
        this.age677 = age677;
    }

    public Long getAge677() 
    {
        return age677;
    }
    public void setAge678(Long age678) 
    {
        this.age678 = age678;
    }

    public Long getAge678() 
    {
        return age678;
    }
    public void setAge686(String age686) 
    {
        this.age686 = age686;
    }

    public String getAge686() 
    {
        return age686;
    }
    public void setAae007(String aae007) 
    {
        this.aae007 = aae007;
    }

    public String getAae007() 
    {
        return aae007;
    }
    public void setAgb088(String agb088) 
    {
        this.agb088 = agb088;
    }

    public String getAgb088() 
    {
        return agb088;
    }
    public void setAgb004(String agb004) 
    {
        this.agb004 = agb004;
    }

    public String getAgb004() 
    {
        return agb004;
    }
    public void setAae004(String aae004) 
    {
        this.aae004 = aae004;
    }

    public String getAae004() 
    {
        return aae004;
    }
    public void setAgb096(String agb096) 
    {
        this.agb096 = agb096;
    }

    public String getAgb096() 
    {
        return agb096;
    }
    public void setAge687(String age687) 
    {
        this.age687 = age687;
    }

    public String getAge687() 
    {
        return age687;
    }
    public void setAge688(String age688) 
    {
        this.age688 = age688;
    }

    public String getAge688() 
    {
        return age688;
    }
    public void setAge689(String age689) 
    {
        this.age689 = age689;
    }

    public String getAge689() 
    {
        return age689;
    }
    public void setAge690(String age690) 
    {
        this.age690 = age690;
    }

    public String getAge690() 
    {
        return age690;
    }
    public void setAge691(String age691) 
    {
        this.age691 = age691;
    }

    public String getAge691() 
    {
        return age691;
    }
    public void setAge692(String age692) 
    {
        this.age692 = age692;
    }

    public String getAge692() 
    {
        return age692;
    }
    public void setAge693(String age693) 
    {
        this.age693 = age693;
    }

    public String getAge693() 
    {
        return age693;
    }
    public void setAge694(String age694) 
    {
        this.age694 = age694;
    }

    public String getAge694() 
    {
        return age694;
    }
    public void setAge695(String age695) 
    {
        this.age695 = age695;
    }

    public String getAge695() 
    {
        return age695;
    }
    public void setAge696(String age696) 
    {
        this.age696 = age696;
    }

    public String getAge696() 
    {
        return age696;
    }
    public void setAge697(String age697) 
    {
        this.age697 = age697;
    }

    public String getAge697() 
    {
        return age697;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("agb020", getAgb020())
            .append("aae100", getAae100())
            .append("age679", getAge679())
            .append("age680", getAge680())
            .append("age681", getAge681())
            .append("age664", getAge664())
            .append("agb024", getAgb024())
            .append("agb025", getAgb025())
            .append("age682", getAge682())
            .append("aae051", getAae051())
            .append("agb021", getAgb021())
            .append("agb087", getAgb087())
            .append("aab003", getAab003())
            .append("age613", getAge613())
            .append("agb012", getAgb012())
            .append("aae047", getAae047())
            .append("agb082", getAgb082())
            .append("agb022", getAgb022())
            .append("agb023", getAgb023())
            .append("age666", getAge666())
            .append("age667", getAge667())
            .append("aab021", getAab021())
            .append("agb084", getAgb084())
            .append("age668", getAge668())
            .append("age669", getAge669())
            .append("age670", getAge670())
            .append("age671", getAge671())
            .append("age672", getAge672())
            .append("age702", getAge702())
            .append("age703", getAge703())
            .append("age675", getAge675())
            .append("age676", getAge676())
            .append("age677", getAge677())
            .append("age678", getAge678())
            .append("age686", getAge686())
            .append("aae007", getAae007())
            .append("agb088", getAgb088())
            .append("agb004", getAgb004())
            .append("aae004", getAae004())
            .append("agb096", getAgb096())
            .append("age687", getAge687())
            .append("age688", getAge688())
            .append("age689", getAge689())
            .append("age690", getAge690())
            .append("age691", getAge691())
            .append("age692", getAge692())
            .append("age693", getAge693())
            .append("age694", getAge694())
            .append("age695", getAge695())
            .append("age696", getAge696())
            .append("age697", getAge697())
            .toString();
    }
}
