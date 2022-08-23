package com.zzhy.system.service.impl;

import java.util.List;
import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.PubOrganMapper;
import com.zzhy.system.domain.PubOrgan;
import com.zzhy.system.service.IPubOrganService;

/**
 * 部门Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
@Service
public class PubOrganServiceImpl implements IPubOrganService 
{
    @Autowired
    private PubOrganMapper pubOrganMapper;

    /**
     * 查询部门
     * 
     * @param organId 部门主键
     * @return 部门
     */
    @Override
    public PubOrgan selectPubOrganByOrganId(Long organId)
    {
        return pubOrganMapper.selectPubOrganByOrganId(organId);
    }

    /**
     * 查询部门列表
     * 
     * @param pubOrgan 部门
     * @return 部门
     */
    @Override
    public List<PubOrgan> selectPubOrganList(PubOrgan pubOrgan)
    {
        return pubOrganMapper.selectPubOrganList(pubOrgan);
    }

    /**
     * 新增部门
     * 
     * @param pubOrgan 部门
     * @return 结果
     */
    @Override
    public int insertPubOrgan(PubOrgan pubOrgan)
    {
        pubOrgan.setCreateTime(DateUtils.getNowDate());
        return pubOrganMapper.insertPubOrgan(pubOrgan);
    }

    /**
     * 修改部门
     * 
     * @param pubOrgan 部门
     * @return 结果
     */
    @Override
    public int updatePubOrgan(PubOrgan pubOrgan)
    {
        pubOrgan.setUpdateTime(DateUtils.getNowDate());
        return pubOrganMapper.updatePubOrgan(pubOrgan);
    }

    /**
     * 批量删除部门
     * 
     * @param organIds 需要删除的部门主键
     * @return 结果
     */
    @Override
    public int deletePubOrganByOrganIds(Long[] organIds)
    {
        return pubOrganMapper.deletePubOrganByOrganIds(organIds);
    }

    /**
     * 删除部门信息
     * 
     * @param organId 部门主键
     * @return 结果
     */
    @Override
    public int deletePubOrganByOrganId(Long organId)
    {
        return pubOrganMapper.deletePubOrganByOrganId(organId);
    }
}
