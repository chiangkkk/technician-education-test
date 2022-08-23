package com.zzhy.supervise.service;

import com.alibaba.fastjson.JSONObject;
import com.zzhy.common.core.domain.entity.SysUser;
import com.zzhy.supervise.domain.School;
import com.zzhy.supervise.domain.vo.SchoolVo;

import java.util.List;

/**
 * 院校Service接口
 *
 * @author zzhy
 * @date 2021-11-11
 */
public interface ISchoolService
{
    /**
     * 查询院校
     *
     * @param schoolId 院校主键
     * @return 院校
     */
    public SchoolVo selectSchoolBySchoolId(Long schoolId);

    /**
     * 获取系统内转入院校详细信息
     */
    public  List<School> getTransferInInfo(SysUser user);

    /**
     * 查询院校列表
     *
     * @param school 院校
     * @return 院校集合
     */
    public List<School> selectSchoolList(School school);

    /**
     * 根据院校名称，院校代码，状态查询院校信息
     *
     * @param schoolName 院校
     * @param schoolCode 院校代码
     * @param status 院校状态
     * @return 院校集合
     */
    public List<School> queryBySchoolNameAndSchoolCodeAndStatus(String schoolName, String schoolCode, String status);


    /**
     * 新增院校
     *
     * @param school 院校
     * @return 结果
     */
    public JSONObject insertSchool(School school);

    /**
     * 修改院校
     *
     * @param school 院校
     * @return 结果
     */
    public int updateSchool(School school);

    /**
     * 修改根据院校ID修改院校状态
     *
     * @param schoolId
     * @param status
     * @return
     */
    public int updateStatus(Long schoolId, String status);

    /**
     * 批量删除院校
     *
     * @param schoolIds 需要删除的院校主键集合
     * @return 结果
     */
    public int deleteSchoolBySchoolIds(Long[] schoolIds);

    /**
     * 删除院校信息
     *
     * @param schoolId 院校主键
     * @return 结果
     */
    public int deleteSchoolBySchoolId(Long schoolId);


    /***/
}
