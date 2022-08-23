package com.zzhy.system.domain;

import java.math.BigDecimal;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.zzhy.common.annotation.Excel;
import com.zzhy.common.core.domain.BaseEntity;

/**
 * 院校专业对象 temp_sch_colleges_major
 * 
 * @author zzhy
 * @date 2022-02-14
 */
public class TempSchCollegesMajor extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long collegesMajorId;

    /** 院校id */
    @Excel(name = "院校id")
    private Long schoolId;

    /** 院校名称 */
    @Excel(name = "院校名称")
    private String schoolName;

    /** 方向层次id */
    @Excel(name = "方向层次id")
    private Long directionlevelId;

    /** 专业id */
    @Excel(name = "专业id")
    private Long institutionId;

    /** 专业类型id */
    @Excel(name = "专业类型id")
    private Long itemId;

    /** 专业名称 */
    @Excel(name = "专业名称")
    private String majorName;

    /** 招生申请 0未申请 1申请，2 通过，9拒绝（不是本季度脚本更新为0） */
    @Excel(name = "招生申请 0未申请 1申请，2 通过，9拒绝", readConverterExp = "不=是本季度脚本更新为0")
    private Long admissionsApply;

    /** 最近申请招生季度 需要和招生申请关联，不是本季度的招生申请是0 */
    @Excel(name = "最近申请招生季度 需要和招生申请关联，不是本季度的招生申请是0")
    private Long nearApply;

    /** 招生季度记录 Json{2021春季，2021秋季。。。} */
    @Excel(name = "招生季度记录 Json{2021春季，2021秋季。。。}")
    private String admissionsRecord;

    /** 教室总数(人) */
    @Excel(name = "教室总数(人)")
    private Long schoolMajorClassroomTotal;

    /** 费用（元） */
    @Excel(name = "费用", readConverterExp = "元=")
    private BigDecimal schoolMajorTuition;

    /** 学生总数（人） */
    @Excel(name = "学生总数", readConverterExp = "人=")
    private Long schoolMajorStudentTotal;

    /** 一体化教室总数（人） */
    @Excel(name = "一体化教室总数", readConverterExp = "人=")
    private Long schoolMajorIntegratedTotal;

    /** 实训室数量（间） */
    @Excel(name = "实训室数量", readConverterExp = "间=")
    private Long schoolMajorTrainingTotal;

    /** 实训设备数量（台） */
    @Excel(name = "实训设备数量", readConverterExp = "台=")
    private Long schoolMajorEquipmentTotal;

    /** 实训资金（元） */
    @Excel(name = "实训资金", readConverterExp = "元=")
    private BigDecimal schoolMajorTrainingPrice;

    /** 当前季度连续办学，提交资格申请，自动连续改专业年份 */
    @Excel(name = "当前季度连续办学，提交资格申请，自动连续改专业年份")
    private Long schoolMajorContinuityYear;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    /** 状态（1正常 2停用 一种连续三年无学员学籍产生的专业将自动归类无效，根据版本停用判断） */
    @Excel(name = "状态", readConverterExp = "1=正常,2=停用,一=种连续三年无学员学籍产生的专业将自动归类无效，根据版本停用判断")
    private String status;

    /** 删除标志（1代表存在 2代表删除） */
    private String delFlag;

    /** 院校专业编码：自动生成 */
    @Excel(name = "院校专业编码：自动生成")
    private String collegesMajorNo;

    /** 部平台-院校专业编码（同步部平台） */
    @Excel(name = "部平台-院校专业编码", readConverterExp = "同=步部平台")
    private String deptCollegesMajorNo;

    /** 年份 */
    @Excel(name = "年份")
    private String yearTime;

    /** 季度，1是春季，2是秋季 */
    @Excel(name = "季度，1是春季，2是秋季")
    private String season;

    public void setCollegesMajorId(Long collegesMajorId) 
    {
        this.collegesMajorId = collegesMajorId;
    }

    public Long getCollegesMajorId() 
    {
        return collegesMajorId;
    }
    public void setSchoolId(Long schoolId) 
    {
        this.schoolId = schoolId;
    }

    public Long getSchoolId() 
    {
        return schoolId;
    }
    public void setSchoolName(String schoolName) 
    {
        this.schoolName = schoolName;
    }

    public String getSchoolName() 
    {
        return schoolName;
    }
    public void setDirectionlevelId(Long directionlevelId) 
    {
        this.directionlevelId = directionlevelId;
    }

    public Long getDirectionlevelId() 
    {
        return directionlevelId;
    }
    public void setInstitutionId(Long institutionId) 
    {
        this.institutionId = institutionId;
    }

    public Long getInstitutionId() 
    {
        return institutionId;
    }
    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setMajorName(String majorName) 
    {
        this.majorName = majorName;
    }

    public String getMajorName() 
    {
        return majorName;
    }
    public void setAdmissionsApply(Long admissionsApply) 
    {
        this.admissionsApply = admissionsApply;
    }

    public Long getAdmissionsApply() 
    {
        return admissionsApply;
    }
    public void setNearApply(Long nearApply) 
    {
        this.nearApply = nearApply;
    }

    public Long getNearApply() 
    {
        return nearApply;
    }
    public void setAdmissionsRecord(String admissionsRecord) 
    {
        this.admissionsRecord = admissionsRecord;
    }

    public String getAdmissionsRecord() 
    {
        return admissionsRecord;
    }
    public void setSchoolMajorClassroomTotal(Long schoolMajorClassroomTotal) 
    {
        this.schoolMajorClassroomTotal = schoolMajorClassroomTotal;
    }

    public Long getSchoolMajorClassroomTotal() 
    {
        return schoolMajorClassroomTotal;
    }
    public void setSchoolMajorTuition(BigDecimal schoolMajorTuition) 
    {
        this.schoolMajorTuition = schoolMajorTuition;
    }

    public BigDecimal getSchoolMajorTuition() 
    {
        return schoolMajorTuition;
    }
    public void setSchoolMajorStudentTotal(Long schoolMajorStudentTotal) 
    {
        this.schoolMajorStudentTotal = schoolMajorStudentTotal;
    }

    public Long getSchoolMajorStudentTotal() 
    {
        return schoolMajorStudentTotal;
    }
    public void setSchoolMajorIntegratedTotal(Long schoolMajorIntegratedTotal) 
    {
        this.schoolMajorIntegratedTotal = schoolMajorIntegratedTotal;
    }

    public Long getSchoolMajorIntegratedTotal() 
    {
        return schoolMajorIntegratedTotal;
    }
    public void setSchoolMajorTrainingTotal(Long schoolMajorTrainingTotal) 
    {
        this.schoolMajorTrainingTotal = schoolMajorTrainingTotal;
    }

    public Long getSchoolMajorTrainingTotal() 
    {
        return schoolMajorTrainingTotal;
    }
    public void setSchoolMajorEquipmentTotal(Long schoolMajorEquipmentTotal) 
    {
        this.schoolMajorEquipmentTotal = schoolMajorEquipmentTotal;
    }

    public Long getSchoolMajorEquipmentTotal() 
    {
        return schoolMajorEquipmentTotal;
    }
    public void setSchoolMajorTrainingPrice(BigDecimal schoolMajorTrainingPrice) 
    {
        this.schoolMajorTrainingPrice = schoolMajorTrainingPrice;
    }

    public BigDecimal getSchoolMajorTrainingPrice() 
    {
        return schoolMajorTrainingPrice;
    }
    public void setSchoolMajorContinuityYear(Long schoolMajorContinuityYear) 
    {
        this.schoolMajorContinuityYear = schoolMajorContinuityYear;
    }

    public Long getSchoolMajorContinuityYear() 
    {
        return schoolMajorContinuityYear;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }
    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }
    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }
    public void setCollegesMajorNo(String collegesMajorNo) 
    {
        this.collegesMajorNo = collegesMajorNo;
    }

    public String getCollegesMajorNo() 
    {
        return collegesMajorNo;
    }
    public void setDeptCollegesMajorNo(String deptCollegesMajorNo) 
    {
        this.deptCollegesMajorNo = deptCollegesMajorNo;
    }

    public String getDeptCollegesMajorNo() 
    {
        return deptCollegesMajorNo;
    }
    public void setYearTime(String yearTime) 
    {
        this.yearTime = yearTime;
    }

    public String getYearTime() 
    {
        return yearTime;
    }
    public void setSeason(String season) 
    {
        this.season = season;
    }

    public String getSeason() 
    {
        return season;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("collegesMajorId", getCollegesMajorId())
            .append("schoolId", getSchoolId())
            .append("schoolName", getSchoolName())
            .append("directionlevelId", getDirectionlevelId())
            .append("institutionId", getInstitutionId())
            .append("itemId", getItemId())
            .append("majorName", getMajorName())
            .append("admissionsApply", getAdmissionsApply())
            .append("nearApply", getNearApply())
            .append("admissionsRecord", getAdmissionsRecord())
            .append("schoolMajorClassroomTotal", getSchoolMajorClassroomTotal())
            .append("schoolMajorTuition", getSchoolMajorTuition())
            .append("schoolMajorStudentTotal", getSchoolMajorStudentTotal())
            .append("schoolMajorIntegratedTotal", getSchoolMajorIntegratedTotal())
            .append("schoolMajorTrainingTotal", getSchoolMajorTrainingTotal())
            .append("schoolMajorEquipmentTotal", getSchoolMajorEquipmentTotal())
            .append("schoolMajorTrainingPrice", getSchoolMajorTrainingPrice())
            .append("schoolMajorContinuityYear", getSchoolMajorContinuityYear())
            .append("remark", getRemark())
            .append("sort", getSort())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .append("collegesMajorNo", getCollegesMajorNo())
            .append("deptCollegesMajorNo", getDeptCollegesMajorNo())
            .append("yearTime", getYearTime())
            .append("season", getSeason())
            .toString();
    }
}
