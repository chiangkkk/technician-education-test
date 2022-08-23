package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gc58;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGc58Service 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param age732 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Gc58 selectGc58ByAge732(String age732);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param gc58 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Gc58> selectGc58List(Gc58 gc58);

    /**
     * 新增【请填写功能名称】
     * 
     * @param gc58 【请填写功能名称】
     * @return 结果
     */
    public int insertGc58(Gc58 gc58);

    /**
     * 修改【请填写功能名称】
     * 
     * @param gc58 【请填写功能名称】
     * @return 结果
     */
    public int updateGc58(Gc58 gc58);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param age732s 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteGc58ByAge732s(String[] age732s);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param age732 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteGc58ByAge732(String age732);
}
