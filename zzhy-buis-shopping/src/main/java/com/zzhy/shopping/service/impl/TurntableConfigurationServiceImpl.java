package com.zzhy.shopping.service.impl;

import java.util.List;

import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.shopping.mapper.TurntableConfigurationMapper;
import com.zzhy.shopping.domain.TurntableConfiguration;
import com.zzhy.shopping.service.ITurntableConfigurationService;

/**
 * 转盘配置Service业务层处理
 *
 * @author zzhy
 * @date 2022-09-05
 */
@Service
public class TurntableConfigurationServiceImpl implements ITurntableConfigurationService {
    @Autowired
    private TurntableConfigurationMapper turntableConfigurationMapper;

    /**
     * 查询转盘配置
     *
     * @param turntableId 转盘配置主键
     * @return 转盘配置
     */
    @Override
    public TurntableConfiguration selectTurntableConfigurationByTurntableId(Long turntableId) {
        return turntableConfigurationMapper.selectTurntableConfigurationByTurntableId(turntableId);
    }

    /**
     * 查询转盘配置列表
     *
     * @param turntableConfiguration 转盘配置
     * @return 转盘配置
     */
    @Override
    public List<TurntableConfiguration> selectTurntableConfigurationList(TurntableConfiguration turntableConfiguration) {
        turntableConfiguration.setDelFlag("1");
        return turntableConfigurationMapper.selectTurntableConfigurationList(turntableConfiguration);
    }

    /**
     * 新增转盘配置
     *
     * @param turntableConfiguration 转盘配置
     * @return 结果
     */
    @Override
    public int insertTurntableConfiguration(TurntableConfiguration turntableConfiguration) {
        turntableConfiguration.setCreateTime(DateUtils.getNowDate());
        return turntableConfigurationMapper.insertTurntableConfiguration(turntableConfiguration);
    }

    /**
     * 修改转盘配置
     *
     * @param turntableConfiguration 转盘配置
     * @return 结果
     */
    @Override
    public int updateTurntableConfiguration(TurntableConfiguration turntableConfiguration) {
        turntableConfiguration.setUpdateTime(DateUtils.getNowDate());
        return turntableConfigurationMapper.updateTurntableConfiguration(turntableConfiguration);
    }

    /**
     * 批量删除转盘配置
     *
     * @param turntableIds 需要删除的转盘配置主键
     * @return 结果
     */
    @Override
    public int deleteTurntableConfigurationByTurntableIds(Long[] turntableIds) {
        return turntableConfigurationMapper.deleteTurntableConfigurationByTurntableIds(turntableIds);
    }

    /**
     * 删除转盘配置信息
     *
     * @param turntableId 转盘配置主键
     * @return 结果
     */
    @Override
    public int deleteTurntableConfigurationByTurntableId(Long turntableId) {
        return turntableConfigurationMapper.deleteTurntableConfigurationByTurntableId(turntableId);
    }
}
