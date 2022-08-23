package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Ga03;

/**
 * 专业信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Ga03Mapper 
{
    /**
     * 查询专业信息
     * 
     * @param aae100 专业信息主键
     * @return 专业信息
     */
    public Ga03 selectGa03ByAae100(String aae100);

    /**
     * 查询专业信息列表
     * 
     * @param ga03 专业信息
     * @return 专业信息集合
     */
    public List<Ga03> selectGa03List(Ga03 ga03);

    /**
     * 新增专业信息
     * 
     * @param ga03 专业信息
     * @return 结果
     */
    public int insertGa03(Ga03 ga03);

    /**
     * 修改专业信息
     * 
     * @param ga03 专业信息
     * @return 结果
     */
    public int updateGa03(Ga03 ga03);

    /**
     * 删除专业信息
     * 
     * @param aae100 专业信息主键
     * @return 结果
     */
    public int deleteGa03ByAae100(String aae100);

    /**
     * 批量删除专业信息
     * 
     * @param aae100s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGa03ByAae100s(String[] aae100s);

    /**
     * 批量插入数据库
     * @param aa51List
     * @return
     */
    int insertBatchGa03(List<Ga03> ga03List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGa03();
}
