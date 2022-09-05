package com.zzhy.shopping.service;

import java.util.List;
import com.zzhy.shopping.domain.TurntableConfiguration;

/**
 * 转盘配置Service接口
 * 
 * @author zzhy
 * @date 2022-09-05
 */
public interface ITurntableConfigurationService 
{
    /**
     * 查询转盘配置
     * 
     * @param turntableId 转盘配置主键
     * @return 转盘配置
     */
    public TurntableConfiguration selectTurntableConfigurationByTurntableId(Long turntableId);

    /**
     * 查询转盘配置列表
     * 
     * @param turntableConfiguration 转盘配置
     * @return 转盘配置集合
     */
    public List<TurntableConfiguration> selectTurntableConfigurationList(TurntableConfiguration turntableConfiguration);

    /**
     * 新增转盘配置
     * 
     * @param turntableConfiguration 转盘配置
     * @return 结果
     */
    public int insertTurntableConfiguration(TurntableConfiguration turntableConfiguration);

    /**
     * 修改转盘配置
     * 
     * @param turntableConfiguration 转盘配置
     * @return 结果
     */
    public int updateTurntableConfiguration(TurntableConfiguration turntableConfiguration);

    /**
     * 批量删除转盘配置
     * 
     * @param turntableIds 需要删除的转盘配置主键集合
     * @return 结果
     */
    public int deleteTurntableConfigurationByTurntableIds(Long[] turntableIds);

    /**
     * 删除转盘配置信息
     * 
     * @param turntableId 转盘配置主键
     * @return 结果
     */
    public int deleteTurntableConfigurationByTurntableId(Long turntableId);
}
