package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gc56;

/**
 * 职业资格证书Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gc56Mapper 
{
    /**
     * 查询职业资格证书
     * 
     * @param agc163 职业资格证书主键
     * @return 职业资格证书
     */
    public Gc56 selectGc56ByAgc163(String agc163);

    /**
     * 查询职业资格证书列表
     * 
     * @param gc56 职业资格证书
     * @return 职业资格证书集合
     */
    public List<Gc56> selectGc56List(Gc56 gc56);

    /**
     * 新增职业资格证书
     * 
     * @param gc56 职业资格证书
     * @return 结果
     */
    public int insertGc56(Gc56 gc56);

    /**
     * 修改职业资格证书
     * 
     * @param gc56 职业资格证书
     * @return 结果
     */
    public int updateGc56(Gc56 gc56);

    /**
     * 删除职业资格证书
     * 
     * @param agc163 职业资格证书主键
     * @return 结果
     */
    public int deleteGc56ByAgc163(String agc163);

    /**
     * 批量删除职业资格证书
     * 
     * @param agc163s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGc56ByAgc163s(String[] agc163s);

    /**
     * 批量插入数据库
     * @param gc56List
     * @return
     */
    int insertBatchGc56(List<Gc56> gc56List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGc56();
}
