package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gc53;

/**
 * 助学金信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gc53Mapper 
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
     * 删除助学金信息
     * 
     * @param age535 助学金信息主键
     * @return 结果
     */
    public int deleteGc53ByAge535(String age535);

    /**
     * 批量删除助学金信息
     * 
     * @param age535s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGc53ByAge535s(String[] age535s);

    /**
     * 批量插入数据库
     * @param gc53List
     * @return
     */
    int insertBatchGc53(List<Gc53> gc53List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGc53();
}
