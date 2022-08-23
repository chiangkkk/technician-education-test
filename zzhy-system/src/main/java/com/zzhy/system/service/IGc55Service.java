package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gc55;

/**
 * 就业信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGc55Service 
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
     * 批量删除就业信息
     * 
     * @param age534s 需要删除的就业信息主键集合
     * @return 结果
     */
    public int deleteGc55ByAge534s(String[] age534s);

    /**
     * 删除就业信息信息
     * 
     * @param age534 就业信息主键
     * @return 结果
     */
    public int deleteGc55ByAge534(String age534);
}
