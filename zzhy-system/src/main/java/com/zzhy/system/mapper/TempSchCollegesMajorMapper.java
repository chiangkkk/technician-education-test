package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.TempSchCollegesMajor;

/**
 * 院校专业Mapper接口
 * 
 * @author zzhy
 * @date 2022-02-14
 */
public interface TempSchCollegesMajorMapper 
{
    /**
     * 查询院校专业
     * 
     * @param collegesMajorId 院校专业主键
     * @return 院校专业
     */
    public TempSchCollegesMajor selectTempSchCollegesMajorByCollegesMajorId(Long collegesMajorId);

    /**
     * 查询院校专业列表
     * 
     * @param tempSchCollegesMajor 院校专业
     * @return 院校专业集合
     */
    public List<TempSchCollegesMajor> selectTempSchCollegesMajorList(TempSchCollegesMajor tempSchCollegesMajor);

    /**
     * 新增院校专业
     * 
     * @param tempSchCollegesMajor 院校专业
     * @return 结果
     */
    public int insertTempSchCollegesMajor(TempSchCollegesMajor tempSchCollegesMajor);

    /**
     * 修改院校专业
     * 
     * @param tempSchCollegesMajor 院校专业
     * @return 结果
     */
    public int updateTempSchCollegesMajor(TempSchCollegesMajor tempSchCollegesMajor);

    /**
     * 删除院校专业
     * 
     * @param collegesMajorId 院校专业主键
     * @return 结果
     */
    public int deleteTempSchCollegesMajorByCollegesMajorId(Long collegesMajorId);

    /**
     * 批量删除院校专业
     * 
     * @param collegesMajorIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTempSchCollegesMajorByCollegesMajorIds(Long[] collegesMajorIds);

    /**
     * 查询院校专业列表
     *
     * @param tempSchCollegesMajor 院校专业
     * @return 院校专业集合
     */
    public List<TempSchCollegesMajor> testCollegesMajorList(TempSchCollegesMajor tempSchCollegesMajor);
    /**
     * 查询院校专业列表
     *
     * @param tempSchCollegesMajor 院校专业
     * @return 院校专业集合
     */
    public TempSchCollegesMajor collegesMajorGroupByLimitOne(TempSchCollegesMajor tempSchCollegesMajor);
    /**
     * 查询院校专业列表
     *
     * @param tempSchCollegesMajor 院校专业
     * @return 院校专业集合
     */
    public List<TempSchCollegesMajor> collegesMajorGroupByList(TempSchCollegesMajor tempSchCollegesMajor);

}
