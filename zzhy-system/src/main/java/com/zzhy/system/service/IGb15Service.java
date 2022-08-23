package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gb15;

/**
 * 院校专业修改信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-22
 */
public interface IGb15Service 
{
    /**
     * 查询院校专业修改信息
     * 
     * @param age879 院校专业修改信息主键
     * @return 院校专业修改信息
     */
    public Gb15 selectGb15ByAge879(String age879);

    /**
     * 查询院校专业修改信息列表
     * 
     * @param gb15 院校专业修改信息
     * @return 院校专业修改信息集合
     */
    public List<Gb15> selectGb15List(Gb15 gb15);

    /**
     * 新增院校专业修改信息
     * 
     * @param gb15 院校专业修改信息
     * @return 结果
     */
    public int insertGb15(Gb15 gb15);

    /**
     * 修改院校专业修改信息
     * 
     * @param gb15 院校专业修改信息
     * @return 结果
     */
    public int updateGb15(Gb15 gb15);

    /**
     * 批量删除院校专业修改信息
     * 
     * @param age879s 需要删除的院校专业修改信息主键集合
     * @return 结果
     */
    public int deleteGb15ByAge879s(String[] age879s);

    /**
     * 删除院校专业修改信息信息
     * 
     * @param age879 院校专业修改信息主键
     * @return 结果
     */
    public int deleteGb15ByAge879(String age879);
}
