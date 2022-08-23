package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gc55;

/**
 * 就业信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gc55Mapper 
{
    /**
     * 查询就业信息
     * 
     * @param age534 就业信息主键
     * @return 就业信息
     */
    public Gc55 selectGc55ByAge534(String age534);

    /**
     * 查询就业信息列表
     * 
     * @param gc55 就业信息
     * @return 就业信息集合
     */
    public List<Gc55> selectGc55List(Gc55 gc55);

    /**
     * 新增就业信息
     * 
     * @param gc55 就业信息
     * @return 结果
     */
    public int insertGc55(Gc55 gc55);

    /**
     * 修改就业信息
     * 
     * @param gc55 就业信息
     * @return 结果
     */
    public int updateGc55(Gc55 gc55);

    /**
     * 删除就业信息
     * 
     * @param age534 就业信息主键
     * @return 结果
     */
    public int deleteGc55ByAge534(String age534);

    /**
     * 批量删除就业信息
     * 
     * @param age534s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGc55ByAge534s(String[] age534s);

    /**
     * 批量插入数据库
     * @param gc55List
     * @return
     */
    int insertBatchGc55(List<Gc55> gc55List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGc55();
}
