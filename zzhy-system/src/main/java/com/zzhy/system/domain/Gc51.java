package com.zzhy.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 学籍信息对象 gc51
 * 
 * @author zzhy
 * @date 2022-05-30
 */
public class Gc51 extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 学籍编码 */
    private String agc156;

    /** 人员编号 */
    @Excel(name = "人员编号")
    private String aac001;

    /** 院校编号 */
    @Excel(name = "院校编号")
    private String agb020;

    /** 院校专业编码 */
    @Excel(name = "院校专业编码")
    private String age655;

    /** 当前有效标志 */
    @Excel(name = "当前有效标志")
    private String aae100;

    /** 学籍编号 */
    @Excel(name = "学籍编号")
    private String age547;

    /** 姓名 */
    @Excel(name = "姓名")
    private String aac003;

    /** 性别 */
    @Excel(name = "性别")
    private String aac004;

    /** 出生日期 */
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date aac006;

    /** 民族 */
    @Excel(name = "民族")
    private String aac005;

    /** 证件类型 */
    @Excel(name = "证件类型")
    private String aac058;

    /** 证件号码 */
    @Excel(name = "证件号码")
    private String aac147;

    /** 班级 */
    @Excel(name = "班级")
    private String age737;

    /** 学号 */
    @Excel(name = "学号")
    private String aac136;

    /** 入学时间 */
    @Excel(name = "入学时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String age736;

    /** 对应专业信息表中院校专业名称 */
    @Excel(name = "对应专业信息表中院校专业名称")
    private String age645;

    /** 专业等级 */
    @Excel(name = "专业等级")
    private String age616;

    /** 学习形式 */
    @Excel(name = "学习形式")
    private String age628;

    /** 政治面貌 */
    @Excel(name = "政治面貌")
    private String aac024;

    /** 学制 */
    @Excel(name = "学制")
    private String age101;

    /** 以前学历 */
    @Excel(name = "以前学历")
    private String age739;

    /** 兴趣爱好 */
    @Excel(name = "兴趣爱好")
    private String age767;

    /** 学籍状态 学籍状态：1-正式学籍，2-保留学籍，3-已离校 */
    @Excel(name = "学籍状态 学籍状态：1-正式学籍，2-保留学籍，3-已离校")
    private String age623;

    /** 户口性质（户籍地类别） */
    @Excel(name = "户口性质", readConverterExp = "户=籍地类别")
    private String aac009;

    /** 户口所在地址 */
    @Excel(name = "户口所在地址")
    private String aac010;

    /** 家庭地址 */
    @Excel(name = "家庭地址")
    private String agc160;

    /** 家庭联系人 */
    @Excel(name = "家庭联系人")
    private String agc159;

    /** 家庭联系电话 */
    @Excel(name = "家庭联系电话")
    private String agc162;

    /** 是否为三区三州 */
    @Excel(name = "是否为三区三州")
    private String age663;

    /** 资助申请类型 */
    @Excel(name = "资助申请类型")
    private String age619;

    /** 是否连片特困地区 */
    @Excel(name = "是否连片特困地区")
    private String age664;

    /** 是否家庭困难 */
    @Excel(name = "是否家庭困难")
    private String age662;

    /** 家庭困难类型 */
    @Excel(name = "家庭困难类型")
    private String agc152;

    /** 家庭经济来源 */
    @Excel(name = "家庭经济来源")
    private String age766;

    /** 家庭年总收入（元） 家庭年总收入（元） */
    @Excel(name = "家庭年总收入", readConverterExp = "元=")
    private BigDecimal age764;

    /** 家庭人均收入（元） 家庭人均收入（元） */
    @Excel(name = "家庭人均收入", readConverterExp = "元=")
    private BigDecimal age765;

    /** 家庭邮政编码 */
    @Excel(name = "家庭邮政编码")
    private String agc161;

    /** 父亲姓名 */
    @Excel(name = "父亲姓名")
    private String age768;

    /** 父亲证件号码 */
    @Excel(name = "父亲证件号码")
    private String age770;

    /** 母亲姓名 */
    @Excel(name = "母亲姓名")
    private String age771;

    /** 母亲证件号码 */
    @Excel(name = "母亲证件号码")
    private String age773;

    /** 其他监护人姓名 */
    @Excel(name = "其他监护人姓名")
    private String age774;

    /** 其他监护人证件号码 */
    @Excel(name = "其他监护人证件号码")
    private String age776;

    /** 备注2 */
    @Excel(name = "备注2")
    private String age783;

    /** 备注3 */
    @Excel(name = "备注3")
    private String age784;

    /** 结业时间 指学生的结业时间 */
    @Excel(name = "结业时间 指学生的结业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String age777;

    /** 应毕业时间指学生的结业转毕业时间 */
    @Excel(name = "应毕业时间指学生的结业转毕业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String age778;

    /** 招生年份 */
    @Excel(name = "招生年份")
    private String age735;

    /** 结业转毕业时间指学生的结业转毕业时间 */
    @Excel(name = "结业转毕业时间指学生的结业转毕业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String age779;

    /** 数据状态 */
    @Excel(name = "数据状态")
    private String age611;

    /** 所在区域 */
    @Excel(name = "所在区域")
    private String age613;

    /** 户口所在地（省） */
    @Excel(name = "户口所在地", readConverterExp = "省=")
    private String agc158;

    /** 户口所在地（市） */
    @Excel(name = "户口所在地", readConverterExp = "市=")
    private String agc157;

    /** 户口所在地（县） */
    @Excel(name = "户口所在地", readConverterExp = "县=")
    private String agc083;

    /** 毕业操作时行政区划代码 */
    @Excel(name = "毕业操作时行政区划代码")
    private String agc169;

    /** 院校名称 */
    @Excel(name = "院校名称")
    private String agb021;

    /** 入学前技能水平 */
    @Excel(name = "入学前技能水平")
    private String agc168;

    /** 是否新型学徒 */
    @Excel(name = "是否新型学徒")
    private String agc167;

    /** 社会保障卡卡号 */
    @Excel(name = "社会保障卡卡号")
    private String aaz500;

    /** 联系电话 */
    @Excel(name = "联系电话")
    private String aae005;

    /** 银行卡号 */
    @Excel(name = "银行卡号")
    private String agc172;

    /** 毕业时间 */
    @Excel(name = "毕业时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String age780;

    /** 离校时间 */
    @Excel(name = "离校时间", width = 30, dateFormat = "yyyy-MM-dd")
    private String age781;

    /** 毕业操作时院校办学层次 */
    @Excel(name = "毕业操作时院校办学层次")
    private String agc171;

    /** 获奖情况 */
    @Excel(name = "获奖情况")
    private String age782;

    /** 毕业操作时院校顺序号 */
    @Excel(name = "毕业操作时院校顺序号")
    private String agc170;

    /** 招生季度 */
    @Excel(name = "招生季度")
    private String age740;

    public String getAgc156() {
        return agc156;
    }

    public void setAgc156(String agc156) {
        this.agc156 = agc156;
    }

    public String getAac001() {
        return aac001;
    }

    public void setAac001(String aac001) {
        this.aac001 = aac001;
    }

    public String getAgb020() {
        return agb020;
    }

    public void setAgb020(String agb020) {
        this.agb020 = agb020;
    }

    public String getAge655() {
        return age655;
    }

    public void setAge655(String age655) {
        this.age655 = age655;
    }

    public String getAae100() {
        return aae100;
    }

    public void setAae100(String aae100) {
        this.aae100 = aae100;
    }

    public String getAge547() {
        return age547;
    }

    public void setAge547(String age547) {
        this.age547 = age547;
    }

    public String getAac003() {
        return aac003;
    }

    public void setAac003(String aac003) {
        this.aac003 = aac003;
    }

    public String getAac004() {
        return aac004;
    }

    public void setAac004(String aac004) {
        this.aac004 = aac004;
    }

    public Date getAac006() {
        return aac006;
    }

    public void setAac006(Date aac006) {
        this.aac006 = aac006;
    }

    public String getAac005() {
        return aac005;
    }

    public void setAac005(String aac005) {
        this.aac005 = aac005;
    }

    public String getAac058() {
        return aac058;
    }

    public void setAac058(String aac058) {
        this.aac058 = aac058;
    }

    public String getAac147() {
        return aac147;
    }

    public void setAac147(String aac147) {
        this.aac147 = aac147;
    }

    public String getAge737() {
        return age737;
    }

    public void setAge737(String age737) {
        this.age737 = age737;
    }

    public String getAac136() {
        return aac136;
    }

    public void setAac136(String aac136) {
        this.aac136 = aac136;
    }

    public String getAge736() {
        return age736;
    }

    public void setAge736(String age736) {
        this.age736 = age736;
    }

    public String getAge645() {
        return age645;
    }

    public void setAge645(String age645) {
        this.age645 = age645;
    }

    public String getAge616() {
        return age616;
    }

    public void setAge616(String age616) {
        this.age616 = age616;
    }

    public String getAge628() {
        return age628;
    }

    public void setAge628(String age628) {
        this.age628 = age628;
    }

    public String getAac024() {
        return aac024;
    }

    public void setAac024(String aac024) {
        this.aac024 = aac024;
    }

    public String getAge101() {
        return age101;
    }

    public void setAge101(String age101) {
        this.age101 = age101;
    }

    public String getAge739() {
        return age739;
    }

    public void setAge739(String age739) {
        this.age739 = age739;
    }

    public String getAge767() {
        return age767;
    }

    public void setAge767(String age767) {
        this.age767 = age767;
    }

    public String getAge623() {
        return age623;
    }

    public void setAge623(String age623) {
        this.age623 = age623;
    }

    public String getAac009() {
        return aac009;
    }

    public void setAac009(String aac009) {
        this.aac009 = aac009;
    }

    public String getAac010() {
        return aac010;
    }

    public void setAac010(String aac010) {
        this.aac010 = aac010;
    }

    public String getAgc160() {
        return agc160;
    }

    public void setAgc160(String agc160) {
        this.agc160 = agc160;
    }

    public String getAgc159() {
        return agc159;
    }

    public void setAgc159(String agc159) {
        this.agc159 = agc159;
    }

    public String getAgc162() {
        return agc162;
    }

    public void setAgc162(String agc162) {
        this.agc162 = agc162;
    }

    public String getAge663() {
        return age663;
    }

    public void setAge663(String age663) {
        this.age663 = age663;
    }

    public String getAge619() {
        return age619;
    }

    public void setAge619(String age619) {
        this.age619 = age619;
    }

    public String getAge664() {
        return age664;
    }

    public void setAge664(String age664) {
        this.age664 = age664;
    }

    public String getAge662() {
        return age662;
    }

    public void setAge662(String age662) {
        this.age662 = age662;
    }

    public String getAgc152() {
        return agc152;
    }

    public void setAgc152(String agc152) {
        this.agc152 = agc152;
    }

    public String getAge766() {
        return age766;
    }

    public void setAge766(String age766) {
        this.age766 = age766;
    }

    public BigDecimal getAge764() {
        return age764;
    }

    public void setAge764(BigDecimal age764) {
        this.age764 = age764;
    }

    public BigDecimal getAge765() {
        return age765;
    }

    public void setAge765(BigDecimal age765) {
        this.age765 = age765;
    }

    public String getAgc161() {
        return agc161;
    }

    public void setAgc161(String agc161) {
        this.agc161 = agc161;
    }

    public String getAge768() {
        return age768;
    }

    public void setAge768(String age768) {
        this.age768 = age768;
    }

    public String getAge770() {
        return age770;
    }

    public void setAge770(String age770) {
        this.age770 = age770;
    }

    public String getAge771() {
        return age771;
    }

    public void setAge771(String age771) {
        this.age771 = age771;
    }

    public String getAge773() {
        return age773;
    }

    public void setAge773(String age773) {
        this.age773 = age773;
    }

    public String getAge774() {
        return age774;
    }

    public void setAge774(String age774) {
        this.age774 = age774;
    }

    public String getAge776() {
        return age776;
    }

    public void setAge776(String age776) {
        this.age776 = age776;
    }

    public String getAge783() {
        return age783;
    }

    public void setAge783(String age783) {
        this.age783 = age783;
    }

    public String getAge784() {
        return age784;
    }

    public void setAge784(String age784) {
        this.age784 = age784;
    }

    public String getAge777() {
        return age777;
    }

    public void setAge777(String age777) {
        this.age777 = age777;
    }

    public String getAge778() {
        return age778;
    }

    public void setAge778(String age778) {
        this.age778 = age778;
    }

    public String getAge735() {
        return age735;
    }

    public void setAge735(String age735) {
        this.age735 = age735;
    }

    public String getAge779() {
        return age779;
    }

    public void setAge779(String age779) {
        this.age779 = age779;
    }

    public String getAge611() {
        return age611;
    }

    public void setAge611(String age611) {
        this.age611 = age611;
    }

    public String getAge613() {
        return age613;
    }

    public void setAge613(String age613) {
        this.age613 = age613;
    }

    public String getAgc158() {
        return agc158;
    }

    public void setAgc158(String agc158) {
        this.agc158 = agc158;
    }

    public String getAgc157() {
        return agc157;
    }

    public void setAgc157(String agc157) {
        this.agc157 = agc157;
    }

    public String getAgc083() {
        return agc083;
    }

    public void setAgc083(String agc083) {
        this.agc083 = agc083;
    }

    public String getAgc169() {
        return agc169;
    }

    public void setAgc169(String agc169) {
        this.agc169 = agc169;
    }

    public String getAgb021() {
        return agb021;
    }

    public void setAgb021(String agb021) {
        this.agb021 = agb021;
    }

    public String getAgc168() {
        return agc168;
    }

    public void setAgc168(String agc168) {
        this.agc168 = agc168;
    }

    public String getAgc167() {
        return agc167;
    }

    public void setAgc167(String agc167) {
        this.agc167 = agc167;
    }

    public String getAaz500() {
        return aaz500;
    }

    public void setAaz500(String aaz500) {
        this.aaz500 = aaz500;
    }

    public String getAae005() {
        return aae005;
    }

    public void setAae005(String aae005) {
        this.aae005 = aae005;
    }

    public String getAgc172() {
        return agc172;
    }

    public void setAgc172(String agc172) {
        this.agc172 = agc172;
    }

    public String getAge780() {
        return age780;
    }

    public void setAge780(String age780) {
        this.age780 = age780;
    }

    public String getAge781() {
        return age781;
    }

    public void setAge781(String age781) {
        this.age781 = age781;
    }

    public String getAgc171() {
        return agc171;
    }

    public void setAgc171(String agc171) {
        this.agc171 = agc171;
    }

    public String getAge782() {
        return age782;
    }

    public void setAge782(String age782) {
        this.age782 = age782;
    }

    public String getAgc170() {
        return agc170;
    }

    public void setAgc170(String agc170) {
        this.agc170 = agc170;
    }

    public String getAge740() {
        return age740;
    }

    public void setAge740(String age740) {
        this.age740 = age740;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("agc156", getAgc156())
            .append("aac001", getAac001())
            .append("agb020", getAgb020())
            .append("age655", getAge655())
            .append("aae100", getAae100())
            .append("age547", getAge547())
            .append("aac003", getAac003())
            .append("aac004", getAac004())
            .append("aac006", getAac006())
            .append("aac005", getAac005())
            .append("aac058", getAac058())
            .append("aac147", getAac147())
            .append("age737", getAge737())
            .append("aac136", getAac136())
            .append("age736", getAge736())
            .append("age645", getAge645())
            .append("age616", getAge616())
            .append("age628", getAge628())
            .append("aac024", getAac024())
            .append("age101", getAge101())
            .append("age739", getAge739())
            .append("age767", getAge767())
            .append("age623", getAge623())
            .append("aac009", getAac009())
            .append("aac010", getAac010())
            .append("agc160", getAgc160())
            .append("agc159", getAgc159())
            .append("agc162", getAgc162())
            .append("age663", getAge663())
            .append("age619", getAge619())
            .append("age664", getAge664())
            .append("age662", getAge662())
            .append("agc152", getAgc152())
            .append("age766", getAge766())
            .append("age764", getAge764())
            .append("age765", getAge765())
            .append("agc161", getAgc161())
            .append("age768", getAge768())
            .append("age770", getAge770())
            .append("age771", getAge771())
            .append("age773", getAge773())
            .append("age774", getAge774())
            .append("age776", getAge776())
            .append("age783", getAge783())
            .append("age784", getAge784())
            .append("age777", getAge777())
            .append("age778", getAge778())
            .append("age735", getAge735())
            .append("age779", getAge779())
            .append("age611", getAge611())
            .append("age613", getAge613())
            .append("agc158", getAgc158())
            .append("agc157", getAgc157())
            .append("agc083", getAgc083())
            .append("agc169", getAgc169())
            .append("agb021", getAgb021())
            .append("agc168", getAgc168())
            .append("agc167", getAgc167())
            .append("aaz500", getAaz500())
            .append("aae005", getAae005())
            .append("agc172", getAgc172())
            .append("age780", getAge780())
            .append("age781", getAge781())
            .append("agc171", getAgc171())
            .append("age782", getAge782())
            .append("agc170", getAgc170())
            .append("age740", getAge740())
            .toString();
    }
}
