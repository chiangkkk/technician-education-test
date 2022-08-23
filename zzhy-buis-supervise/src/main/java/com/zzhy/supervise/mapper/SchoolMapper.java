package com.zzhy.supervise.mapper;

import com.zzhy.supervise.domain.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 院校Mapper接口
 *
 * @author zzhy
 * @date 2021-11-11
 */
public interface SchoolMapper
{
    /**
     * 查询院校
     *
     * @param schoolId 院校主键
     * @return 院校
     */
    public School selectSchoolBySchoolId(Long schoolId);

    /**
     * 查询院校列表
     *
     * @param school 院校
     * @return 院校集合
     */
    public List<School> selectSchoolList(School school);


    /**
     * 查询除本院校外的其他院校列表
     *
     * @param school 院校
     * @return 院校集合
     */
    public List<School> selectOtherSchoolList(School school);

    /**
     * 根据院校名称，院校代码，状态查询院校信息
     *
     * @param schoolName 院校
     * @param schoolCode 院校代码
     * @param status 院校状态
     * @return 院校集合
     */
    public List<School> queryBySchoolNameAndSchoolCodeAndStatus(@Param("schoolName") String schoolName, @Param("schoolCode") String schoolCode, @Param("status") String status);

    /**
     * 根据院校名称，院校代码 查询院校主键ID
     *
     * @param schoolName 院校
     * @param schoolCode 院校代码
     * @return 院校集合
     */
    public Long queryBySchoolId(@Param("schoolName") String schoolName);

    /**
     * 新增院校
     *
     * @param school 院校
     * @return 结果
     */
    public int insertSchool(School school);

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
    public int updateStatus(@Param("schoolId") Long schoolId, @Param("status") String status);

    /**
     * 删除院校
     *
     * @param schoolId 院校主键
     * @return 结果
     */
    public int deleteSchoolBySchoolId(Long schoolId);

    /**
     * 批量删除院校
     *
     * @param schoolIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSchoolBySchoolIds(Long[] schoolIds);

    /**
     * 根据depts查询其隶属的所有学校 院校招生配置
     */
    public List<School> querySchoolsByDepts(List<Long> depts);

    /**
     * 根据depts查询其隶属的所有学校的ids
     */
    public List<Long> querySchoolsIdsByDepts(List<Long> depts);

    /**
     * 校验学校名不能重复
     * @param school
     * @return
     */
    List<School> selectSchoolBySchoolNameList(School school);

    public List<School> selectTransferInInfo(Long schoolId);

    List<School> selectSchoolListByMajor(Long institutionId);

}
