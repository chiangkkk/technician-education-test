package com.zzhy.system.mapper;

import java.util.List;
import com.zzhy.system.domain.Gb13;

/**
 * 院校专业信息Mapper接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface Gb13Mapper 
{
    /**
     * 查询院校专业信息
     * 
     * @param age655 院校专业信息主键
     * @return 院校专业信息
     */
    public Gb13 selectGb13ByAge655(String age655);

    /**
     * 查询院校专业信息列表
     * 
     * @param gb13 院校专业信息
     * @return 院校专业信息集合
     */
    public List<Gb13> selectGb13List(Gb13 gb13);

    /**
     * 新增院校专业信息
     * 
     * @param gb13 院校专业信息
     * @return 结果
     */
    public int insertGb13(Gb13 gb13);

    /**
     * 修改院校专业信息
     * 
     * @param gb13 院校专业信息
     * @return 结果
     */
    public int updateGb13(Gb13 gb13);

    /**
     * 删除院校专业信息
     * 
     * @param age655 院校专业信息主键
     * @return 结果
     */
    public int deleteGb13ByAge655(String age655);

    /**
     * 批量删除院校专业信息
     * 
     * @param age655s 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteGb13ByAge655s(String[] age655s);

    /**
     * 批量插入数据库
     * @param gb13List
     * @return
     */
    int insertBatchGb13(List<Gb13> gb13List);
    /**
     * 真删所有数据
     * @return
     */
    int deleteAllGb13();
}
