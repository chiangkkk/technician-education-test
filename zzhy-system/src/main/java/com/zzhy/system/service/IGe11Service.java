package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Ge11;

/**
 * 中职卡导入记录Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGe11Service 
{
    /**
     * 查询中职卡导入记录
     * 
     * @param age514 中职卡导入记录主键
     * @return 中职卡导入记录
     */
    public Ge11 selectGe11ByAge514(String age514);

    /**
     * 查询中职卡导入记录列表
     * 
     * @param ge11 中职卡导入记录
     * @return 中职卡导入记录集合
     */
    public List<Ge11> selectGe11List(Ge11 ge11);

    /**
     * 新增中职卡导入记录
     * 
     * @param ge11 中职卡导入记录
     * @return 结果
     */
    public int insertGe11(Ge11 ge11);

    /**
     * 修改中职卡导入记录
     * 
     * @param ge11 中职卡导入记录
     * @return 结果
     */
    public int updateGe11(Ge11 ge11);

    /**
     * 批量删除中职卡导入记录
     * 
     * @param age514s 需要删除的中职卡导入记录主键集合
     * @return 结果
     */
    public int deleteGe11ByAge514s(String[] age514s);

    /**
     * 删除中职卡导入记录信息
     * 
     * @param age514 中职卡导入记录主键
     * @return 结果
     */
    public int deleteGe11ByAge514(String age514);
}
