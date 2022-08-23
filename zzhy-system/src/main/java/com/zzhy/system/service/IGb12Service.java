package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gb12;

/**
 * 教师信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGb12Service 
{
    /**
     * 查询教师信息
     * 
     * @param agc153 教师信息主键
     * @return 教师信息
     */
    public Gb12 selectGb12ByAgc153(String agc153);

    /**
     * 查询教师信息列表
     * 
     * @param gb12 教师信息
     * @return 教师信息集合
     */
    public List<Gb12> selectGb12List(Gb12 gb12);

    /**
     * 新增教师信息
     * 
     * @param gb12 教师信息
     * @return 结果
     */
    public int insertGb12(Gb12 gb12);

    /**
     * 修改教师信息
     * 
     * @param gb12 教师信息
     * @return 结果
     */
    public int updateGb12(Gb12 gb12);

    /**
     * 批量删除教师信息
     * 
     * @param agc153s 需要删除的教师信息主键集合
     * @return 结果
     */
    public int deleteGb12ByAgc153s(String[] agc153s);

    /**
     * 删除教师信息信息
     * 
     * @param agc153 教师信息主键
     * @return 结果
     */
    public int deleteGb12ByAgc153(String agc153);
}
