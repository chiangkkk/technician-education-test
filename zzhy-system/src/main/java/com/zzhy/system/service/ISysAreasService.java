package com.zzhy.system.service;

import com.zzhy.common.core.domain.TreeSelect;
import com.zzhy.common.core.domain.entity.SysAreas;

import java.util.List;
/**
 * 区域Service接口
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
public interface ISysAreasService 
{
    /**
     * 查询区域
     * 
     * @param areaId 区域主键
     * @return 区域
     */
    public SysAreas selectSysAreasByAreaId(Long areaId);

    /**
     * 查询区域列表
     * 
     * @param sysAreas 区域
     * @return 区域集合
     */
    public List<SysAreas> selectSysAreasList(SysAreas sysAreas);

    /**
     * 新增区域
     * 
     * @param sysAreas 区域
     * @return 结果
     */
    public int insertSysAreas(SysAreas sysAreas);

    /**
     * 修改区域
     * 
     * @param sysAreas 区域
     * @return 结果
     */
    public int updateSysAreas(SysAreas sysAreas);

    /**
     * 批量删除区域
     * 
     * @param areaIds 需要删除的区域主键集合
     * @return 结果
     */
    public int deleteSysAreasByAreaIds(Long[] areaIds);

    /**
     * 删除区域信息
     * 
     * @param areaId 区域主键
     * @return 结果
     */
    public int deleteSysAreasByAreaId(Long areaId);

    //获取某个areaId下的 区域树，传100000 是整个区域树
    public List<SysAreas> findAreaTree(long areaId);

    //获取某个areaId下的 区域树，传100000 是整个区域树
    public List<TreeSelect> findAreaTreeBysysAreas(List<SysAreas> depts);
}
