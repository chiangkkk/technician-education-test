package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.PubOrgan;

/**
 * 部门Service接口
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
public interface IPubOrganService 
{
    /**
     * 查询部门
     * 
     * @param organId 部门主键
     * @return 部门
     */
    public PubOrgan selectPubOrganByOrganId(Long organId);

    /**
     * 查询部门列表
     * 
     * @param pubOrgan 部门
     * @return 部门集合
     */
    public List<PubOrgan> selectPubOrganList(PubOrgan pubOrgan);

    /**
     * 新增部门
     * 
     * @param pubOrgan 部门
     * @return 结果
     */
    public int insertPubOrgan(PubOrgan pubOrgan);

    /**
     * 修改部门
     * 
     * @param pubOrgan 部门
     * @return 结果
     */
    public int updatePubOrgan(PubOrgan pubOrgan);

    /**
     * 批量删除部门
     * 
     * @param organIds 需要删除的部门主键集合
     * @return 结果
     */
    public int deletePubOrganByOrganIds(Long[] organIds);

    /**
     * 删除部门信息
     * 
     * @param organId 部门主键
     * @return 结果
     */
    public int deletePubOrganByOrganId(Long organId);
}
