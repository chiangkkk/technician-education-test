package com.zzhy.supervise.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 院校对象 sch_school
 * 
 * @author zzhy
 * @date 2021-11-11
 */
@Data
public class School extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    private Integer isFlag;//将省本级 转成 福建省标志, 0表示查全部  1表示查当前选择的部门

    /** 主键 */
    private Long schoolId;

    /** 院校名称 */
    @Excel(name = "院校名称")
    @ApiModelProperty(value = "院校名称")
    private String schoolName;

    /** 院校代码 */
    @Excel(name = "院校代码")
    @ApiModelProperty(value = "院校代码")
    private String schoolCode;

    /** 省区划 */
    @Excel(name = "省区划")
    @ApiModelProperty(value = "省区划")
    private Long provinceAreaId;

    /** 省名称 */
    @Excel(name = "省名称")
    @ApiModelProperty(value = "省名称")
    private String provinceAreaName;

    /** 市区划 */
    @Excel(name = "市区划")
    @ApiModelProperty(value = "市区划")
    private Long cityAreaId;

    /** 市名称 */
    @Excel(name = "市名称")
    @ApiModelProperty(value = "市名称")
    private String cityAreaName;

    /** 区县区划 */
    @Excel(name = "区县区划")
    @ApiModelProperty(value = "区县区划")
    private Long countryAreaId;

    /** 市名称 */
    @Excel(name = "区县名称")
    @ApiModelProperty(value = "区县名称")
    private String countryAreaName;

    /** 院校地址 */
    @Excel(name = "院校地址")
    @ApiModelProperty(value = "院校地址")
    private String schoolAddress;

    /** 审批文号 */
    @Excel(name = "审批文号")
    @ApiModelProperty(value = "审批文号")
    private String approvalNo;

    /** 院校类别,0技工学院,1技工学校,2高级技工学校 */
    @Excel(name = "院校类别,1技工学院,2技工学校,3高级技工学校")
    @ApiModelProperty(value = "院校类别,1技工学院,2技工学校,3高级技工学校")
    private String schoolType;

    /** 院校性质 1公办，2民办 */
    @Excel(name = "院校性质 1公办，2民办")
    @ApiModelProperty(value = "院校性质 1公办，2民办")
    private String schoolNature;

    /** 办学主体 1行业办，2企业办，3中外（港澳台）合作办学，4民办，5地方人社部门办 */
    @Excel(name = "办学主体 1行业办，2企业办，3中外（港澳台）合作办学，4民办，5地方人社部门办")
    @ApiModelProperty(value = "办学主体 1行业办，2企业办，3中外（港澳台）合作办学，4民办，5地方人社部门办")
    private String schoolSubject;

    /** 国家重点 1是，2不是 */
    @Excel(name = "国家重点 1是，2不是")
    @ApiModelProperty(value = "国家重点 1是，2不是")
    private String isNationImportant;

    /** 省、直辖市重点 1是，2不是 */
    @Excel(name = "省、直辖市重点 1是，2不是")
    @ApiModelProperty(value = "省、直辖市重点 1是，2不是")
    private String isProvinceImportant;

    /** 办学单位 */
    @Excel(name = "办学单位")
    @ApiModelProperty(value = "办学单位")
    private String schoolUnit;

    /** 占地面积 */
    @Excel(name = "占地面积")
    @ApiModelProperty(value = "占地面积")
    private BigDecimal schoolArea;

    /** 教学仪器设备总价值 */
    @Excel(name = "教学仪器设备总价值")
    private BigDecimal instrumentUnitPrice;

    /** 建筑面积 */
    @Excel(name = "建筑面积")
    @ApiModelProperty(value = "建筑面积")
    private BigDecimal buildingArea;

    /** 成立时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @ApiModelProperty(value = "成立时间")
    @Excel(name = "成立时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date establishedTime;

    /** 在校生总数（人） */
    @Excel(name = "在校生总数", readConverterExp = "人=")
    @ApiModelProperty(value = "在校生总数(人)")
    private Long studentNum;

    /** 教师总数（人） */
    @Excel(name = "教师总数", readConverterExp = "人=")
    @ApiModelProperty(value = "教师总数(人)")
    private Long teacherNum;

    /** 教职工总数（人） */
    @Excel(name = "教职工总数", readConverterExp = "人=")
    @ApiModelProperty(value = "教职工总数(人)")
    private Long staffNum;

    /** 实训室总数（间） */
    @Excel(name = "实训室总数", readConverterExp = "间=")
    @ApiModelProperty(value = "实训室总数(间)")
    private Long trainingRoomNum;

    /** 实训资金（元） */
    @Excel(name = "实训资金", readConverterExp = "元=")
    @ApiModelProperty(value = "实训资金(元)")
    private BigDecimal trainingMoney;

    /** 实训设备总数（台） */
    @Excel(name = "实训设备总数", readConverterExp = "台=")
    @ApiModelProperty(value = "实训设备总数(台)")
    private Long trainingDeviceNum;

    /** 专业设置总数（门） */
    @Excel(name = "专业设置总数", readConverterExp = "台=")
    @ApiModelProperty(value = "专业设置总数(台)")
    private Long majorNum;

    /** 校企合作总数（家） */
    @Excel(name = "校企合作总数", readConverterExp = "家=")
    @ApiModelProperty(value = "校企合作总数(家)")
    private Long enterpriseNum;

    /** 教学点总数（个） */
    @Excel(name = "教学点总数", readConverterExp = "个=")
    @ApiModelProperty(value = "教学点总数(个)")
    private Long teachingPointNum;

    /** 具有研究生学历或硕士学位教师数 */
    @Excel(name = "具有研究生学历或硕士学位教师数")
    private Integer graduateUpNum;

    /** 专业教师数 */
    @Excel(name = "专业教师数")
    private Long majorTeacherNum;

    /** 本科毕业及以上学历教师数 */
    @Excel(name = "本科毕业及以上学历教师数")
    private Integer undergraduateUpNum;

    /** “双师型”教师数 */
    @Excel(name = "“双师型”教师数")
    private Integer doubleTeacherNum;

    /** 近五年获得主要荣誉 */
    @Excel(name = "近五年获得主要荣誉")
    private String schoolMainHonor;

    /** 办学特色 */
    @Excel(name = "办学特色")
    private String schoolFeature;

    /** 通讯地址 */
    @Excel(name = "通讯地址")
    @ApiModelProperty(value = "通讯地址")
    private String postalAddress;

    /** 邮政编码 */
    @Excel(name = "邮政编码")
    @ApiModelProperty(value = "邮政编码")
    private String postalCode;

    /** 院校网站 */
    @Excel(name = "院校网站")
    @ApiModelProperty(value = "院校网站")
    private String schoolWebsite;

    /** 院校邮箱 */
    @Excel(name = "院校邮箱")
    @ApiModelProperty(value = "院校邮箱")
    private String schoolEmail;

    /** 院校联系人 */
    @Excel(name = "院校联系人")
    @ApiModelProperty(value = "院校联系人")
    private String schoolContacts;

    /** 院校电话 */
    @Excel(name = "院校电话")
    @ApiModelProperty(value = "院校电话")
    private String schoolTelephone;

    /** 校长姓名 */
    @Excel(name = "校长姓名")
    @ApiModelProperty(value = "校长姓名")
    private String principal;

    /** 校长邮箱 */
    @Excel(name = "校长邮箱")
    @ApiModelProperty(value = "校长姓名")
    private String principalEmail;

    /** 校长电话 */
    @Excel(name = "校长电话")
    @ApiModelProperty(value = "校长电话")
    private String principalTelephone;

    /** 学籍负责人 */
    @Excel(name = "学籍负责人")
    @ApiModelProperty(value = "学籍负责人")
    private String studentStatusManager;

    /** 学籍联系电话 */
    @Excel(name = "学籍联系电话")
    @ApiModelProperty(value = "学籍联系电话")
    private String studentStatusTelephone;

    /** 免学费联系人 */
    @Excel(name = "免学费联系人")
    @ApiModelProperty(value = "免学费联系人")
    private String freeTuitionContacts;

    /** 免学费联系电话 */
    @Excel(name = "免学费联系电话")
    @ApiModelProperty(value = "免学费联系电话")
    private String freeTuitionTelephone;

    /** 助学金联系人 */
    @Excel(name = "助学金联系人")
    @ApiModelProperty(value = "助学金联系人")
    private String stipendContacts;

    /** 助学金联系电话 */
    @Excel(name = "助学金联系电话")
    @ApiModelProperty(value = "助学金联系电话")
    private String stipendTelephone;

    /** 就业负责人 */
    @Excel(name = "就业负责人")
    @ApiModelProperty(value = "就业负责人")
    private String obtainEmploymentContacts;

    /** 就业联系电话 */
    @Excel(name = "就业联系电话")
    @ApiModelProperty(value = "就业联系电话")
    private String obtainEmploymentTelephone;

    /** 对应的组织机构表ID */
    @Excel(name = "对应的组织机构表ID")
    @ApiModelProperty(value = "对应的组织机构表ID")
    private Long deptId;

    /** 对应的组织机构表名称 */
    @Excel(name = "对应的组织机构表名称")
    @ApiModelProperty(value = "对应的组织机构表名称")
    private String deptName;

    /** 层级 1省，2市，3区/县 */
    @Excel(name = "层级 1省，2市，3区/县")
    @ApiModelProperty(value = "层级 1省，2市，3区/县")
    private Integer hierarchy;

    /** 是否年度报备 0是，1否 */
    @Excel(name = "是否年度报备 1是，2否")
    @ApiModelProperty(value = "是否年度报备 1是，2否")
    private String isReporting;

    /** 状态（1正常 2停用 3停办） */
    @Excel(name = "状态", readConverterExp = "1=正常,2=停用,3=停办")
    @ApiModelProperty(value = "状态（1正常 2停用 3停办）")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    @ApiModelProperty(value = "删除标志（0代表存在 2代表删除）")
    private String delFlag;

    /** 停办状态1正常，2停办 */
    @Excel(name = "停办状态1正常，2停办")
    @ApiModelProperty(value = "停办状态1正常，2停办 ")
    private Long disableFlag;

    /** 部平台-院校编码（同步部平台） */
    @Excel(name = "部平台-院校编码（同步部平台）")
    @ApiModelProperty(value = "部平台-院校编码（同步部平台） ")
    private String deptSchoolCode;

    /** 分校数 */
    @Excel(name = "分校数")
    private Integer branchSchoolNum;

    /** 本年招人数 */
    @Excel(name = "本年招人数")
    private Integer currentEnrollment;

    /** 是否营利性学校,1=是营,2=不是盈 */
    @Excel(name = "是否营利性学校,1=是营,2=不是盈")
    private String isProfitSchool;

    @Excel(name = "资助类型（1-免学费 2-生均）")
    private String supportType;
}
