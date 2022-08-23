package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gc54;

/**
 * 毕业证信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gc54Mapper 
{
    /**
     * 查询毕业证信息
     * 
     * @param age529 毕业证信息主键
     * @return 毕业证信息
     */
    public Gc54 selectGc54ByAge529(String age529);

    /**
     * 查询毕业证信息列表
     * 
     * @param gc54 毕业证信息
     * @return 毕业证信息集合
     */
    public List<Gc54> selectGc54List(Gc54 gc54);

    /**
     * 新增毕业证信息
     * 
     * @param gc54 毕业证信息
     * @return 结果
     */
    public int insertGc54(Gc54 gc54);

    /**
     * 修改毕业证信息
     * 
     * @param gc54 毕业证信息
     * @return 结果
     */
    public int updateGc54(Gc54 gc54);

    /**
     * 删除毕业证信息
     * 
     * @param age529 毕业证信息主键
     * @return 结果
     */
    public int deleteGc54ByAge529(String age529);

    /**
     * 批量删除毕业证信息
     * 
     * @param age529s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGc54ByAge529s(String[] age529s);

    /**
     * 批量插入数据库
     * @param gc54List
     * @return
     */
    int insertBatchGc54(List<Gc54> gc54List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGc54();
}
