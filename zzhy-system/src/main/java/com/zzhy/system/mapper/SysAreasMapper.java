package com.zzhy.system.mapper;

import com.zzhy.common.core.domain.entity.SysAreas;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 区域Mapper接口
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
public interface SysAreasMapper 
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
     * 删除区域
     * 
     * @param areaId 区域主键
     * @return 结果
     */
    public int deleteSysAreasByAreaId(Long areaId);

    /**
     * 批量删除区域
     * 
     * @param areaIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSysAreasByAreaIds(Long[] areaIds);


    //获取所有区域
    public List<SysAreas> findAll();


    Long selectAreaIdByName(@Param("provinceAreaName") String provinceAreaName,@Param("cityAreaName") String cityAreaName,@Param("countryAreaName") String countryAreaName);

}
