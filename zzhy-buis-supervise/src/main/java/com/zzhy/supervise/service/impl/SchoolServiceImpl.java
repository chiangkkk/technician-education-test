package com.zzhy.supervise.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.zzhy.common.core.domain.entity.SysDept;
import com.zzhy.common.core.domain.entity.SysUser;
import com.zzhy.common.utils.DateUtils;
import com.zzhy.common.utils.ResultUtils;
import com.zzhy.common.utils.SecurityUtils;
import com.zzhy.common.utils.bean.BeanUtils;
import com.zzhy.supervise.domain.School;
import com.zzhy.supervise.domain.vo.SchoolVo;
import com.zzhy.supervise.mapper.CollegesAttachmentMapper;
import com.zzhy.supervise.mapper.SchoolMapper;
import com.zzhy.supervise.service.ISchoolService;
import com.zzhy.system.mapper.SysDeptMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

import static com.zzhy.common.utils.StringUtils.trim;

/**
 * 院校Service业务层处理
 *
 * @author zzhy
 * @date 2021-11-11
 */
@Service
public class SchoolServiceImpl implements ISchoolService
{
    @Autowired
    private SchoolMapper schoolMapper;

    @Autowired
    private SysDeptMapper sysDeptMapper;
    @Autowired
    private CollegesAttachmentMapper attachmentMapper;

    private static final Logger log= LoggerFactory.getLogger(SchoolServiceImpl.class);
    /**
     * 查询院校
     *
     * @param schoolId 院校主键
     * @return 院校
     */
    @Override
    public SchoolVo selectSchoolBySchoolId(Long schoolId)
    {
        SchoolVo schoolVo = new SchoolVo();
        BeanUtils.copyBeanProp(schoolVo, schoolMapper.selectSchoolBySchoolId(schoolId));
//        BeanUtils.copyBeanProp(schoolVo, schoolMapper.selectSchoolBySchoolId( schoolMapper.selectRandomScoolId()));
//        schoolVo.setAttachments( attachmentMapper.selectReportingAttachmentList(schoolId, ReportingEnum.SourceId.YXBB.value));
        return schoolVo;
    }

    @Override
    public List<School> getTransferInInfo(SysUser user) {
        return schoolMapper.selectTransferInInfo(user.getSchoolId());
    }

    /**
     * 查询院校列表
     *
     * @param school 院校
     * @return 院校
     */
    @Override
    public List<School> selectSchoolList(School school)
    {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        Long userId = user.getUserId();
        if (school.getDeptId() == null){
            school.setIsFlag(0);
            if(userId != 1){
                school.setDeptId(user.getDeptId());
            }
        }else if (school.getDeptId() == 200L){
            school.setDeptId(100L);
            school.setIsFlag(1);
        }else {
            school.setIsFlag(1);
        }
        if (null == school.getStatus()){
            school.setStatus("1");
        }
        school.setSchoolId(user.getSchoolId());
     if(school.getSchoolCode() != null)
     {
         String replace = trim(school.getSchoolCode().replace("/(^\\s*)|(\\s*$)/g", ""));
         school.setSchoolCode(replace);
     }
        if(school.getSchoolName() != null)
        {
            String replace = trim(school.getSchoolName().replace("/(^\\s*)|(\\s*$)/g", ""));
            school.setSchoolName(replace);
        }
        List<School> list = schoolMapper.selectOtherSchoolList(school);
        return list;
    }

    /**
     * 根据院校名称，院校代码，状态查询院校信息
     *
     * @param schoolName 院校
     * @param schoolCode 院校代码
     * @param status 院校状态
     * @return 院校集合
     */
    @Override
    public List<School> queryBySchoolNameAndSchoolCodeAndStatus(String schoolName, String schoolCode, String status) {
        List<School> list = schoolMapper.queryBySchoolNameAndSchoolCodeAndStatus(schoolName, schoolCode, status);
        for (School sch : list) {
            SysDept dept = sysDeptMapper.selectDeptById(sch.getDeptId());
            sch.setHierarchy(dept.getHierarchy());
            sch.setDeptName(dept.getDeptName());
        }
        return list;
    }

    /**
     * 新增院校
     *
     * @param school 院校
     * @return 结果
     */
    @Override
    @Transactional
    public JSONObject insertSchool(School school)
    {
        SysUser sysUser = SecurityUtils.getLoginUser().getUser();
        int res=0;
        try {
            //插入院校表

            school.setCreateBy(sysUser.getUserName());
            school.setCreateTime(DateUtils.getNowDate());
            if (null != school.getDeptId()) {
                if (school.getDeptId() == 200L) {
                    school.setDeptId(100L);
                }
                SysDept dept = sysDeptMapper.selectDeptById(school.getDeptId());
                school.setHierarchy(dept.getHierarchy());
                school.setDeptName(dept.getDeptName());
            }
            school.setStatus("1");
            //List<School> schools = schoolMapper.selectSchoolBySchoolNameList(school);
            //if (CollectionUtils.isEmpty(schools)){
            //    return ResultUtils.results(false,"已存在相同名字的院校");
            //}
            res = schoolMapper.insertSchool(school);
//            if(res > 0){
//                CollegesIndicators indicators = new CollegesIndicators();
//                indicators.setSchoolId(school.getSchoolId());
//                indicators.setSchoolName(school.getSchoolName());
//                indicators.setSchoolCode(school.getSchoolCode());
//                indicators.setSchoolNature(school.getSchoolNature());
//                indicators.setSchoolType(school.getSchoolType());
//                indicators.setNumberAdmissions(0);
//                indicators.setOverflowAdmissions(0);
//                indicators.setEnrollmentOverflow(0);
//                indicators.setDeptId(sysUser.getDeptId());
//                //获取部门信息
//                SysDept sysDept = sysDeptMapper.selectDeptById(school.getDeptId());
//                if(null != sysDept){
//                    indicators.setAffiliation(null == sysDept.getHierarchy() ? "2" : String.valueOf(sysDept.getHierarchy()));
//                }
//                indicators.setCreateBy(SecurityUtils.getLoginUser().getUser().getUserName());
//                indicators.setCreateTime(new Date());
//                indicatorsMapper.insertCollegesIndicators(indicators);
//            }

        }catch (Exception e){
            e.printStackTrace();
            res=0;
        }
        return ResultUtils.results(true,"");


    }

    /**
     * 修改院校
     *
     * @param school 院校
     * @return 结果
     */
    @Override
    public int updateSchool(School school)
    {
        SysUser user = SecurityUtils.getLoginUser().getUser();
        if (null != school.getDeptId()) {
            if (school.getDeptId() == 200L) {
                school.setDeptId(100L);
            }
            SysDept dept = sysDeptMapper.selectDeptById(school.getDeptId());
            school.setHierarchy(dept.getHierarchy());
            school.setDeptName(dept.getDeptName());
        }
        school.setUpdateBy(user.getUserName());
        school.setUpdateTime(DateUtils.getNowDate());
        return schoolMapper.updateSchool(school);
    }

    /**
     * 修改根据院校ID修改院校状态
     *
     * @param schoolId
     * @param status
     * @return
     */
    @Override
    public int updateStatus(Long schoolId,String status) {
        return schoolMapper.updateStatus(schoolId,status);
    }

    /**
     * 批量删除院校
     *
     * @param schoolIds 需要删除的院校主键
     * @return 结果
     */
    @Override
    public int deleteSchoolBySchoolIds(Long[] schoolIds)
    {
        return schoolMapper.deleteSchoolBySchoolIds(schoolIds);
    }

    /**
     * 删除院校信息
     *
     * @param schoolId 院校主键
     * @return 结果
     */
    @Override
    public int deleteSchoolBySchoolId(Long schoolId)
    {
        return schoolMapper.deleteSchoolBySchoolId(schoolId);
    }
}
