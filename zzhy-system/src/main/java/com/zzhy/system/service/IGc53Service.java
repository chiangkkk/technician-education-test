package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gc53;

/**
 * 助学金信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGc53Service 
{
    /**
     * 查询助学金信息
     * 
     * @param age535 助学金信息主键
     * @return 助学金信息
     */
    public Gc53 selectGc53ByAge535(String age535);

    /**
     * 查询助学金信息列表
     * 
     * @param gc53 助学金信息
     * @return 助学金信息集合
     */
    public List<Gc53> selectGc53List(Gc53 gc53);

    /**
     * 新增助学金信息
     * 
     * @param gc53 助学金信息
     * @return 结果
     */
    public int insertGc53(Gc53 gc53);

    /**
     * 修改助学金信息
     * 
     * @param gc53 助学金信息
     * @return 结果
     */
    public int updateGc53(Gc53 gc53);

    /**
     * 批量删除助学金信息
     * 
     * @param age535s 需要删除的助学金信息主键集合
     * @return 结果
     */
    public int deleteGc53ByAge535s(String[] age535s);

    /**
     * 删除助学金信息信息
     * 
     * @param age535 助学金信息主键
     * @return 结果
     */
    public int deleteGc53ByAge535(String age535);
}
