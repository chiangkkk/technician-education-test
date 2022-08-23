package com.zzhy.system.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.zzhy.common.annotation.DataScope;
import com.zzhy.common.core.domain.TreeSelect;
import com.zzhy.common.core.domain.entity.SysAreas;
import com.zzhy.common.core.domain.entity.SysDept;
import com.zzhy.common.utils.StringUtils;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.SysAreasMapper;
import com.zzhy.system.service.ISysAreasService;

/**
 * 区域Service业务层处理
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
@Service
public class SysAreasServiceImpl implements ISysAreasService 
{
    @Autowired
    private SysAreasMapper sysAreasMapper;

    /**
     * 查询区域
     * 
     * @param areaId 区域主键
     * @return 区域
     */
    @Override
    public SysAreas selectSysAreasByAreaId(Long areaId)
    {
        return sysAreasMapper.selectSysAreasByAreaId(areaId);
    }

    /**
     * 查询区域列表
     * 
     * @param sysAreas 区域
     * @return 区域
     */
    @Override
    public List<SysAreas> selectSysAreasList(SysAreas sysAreas)
    {
        return sysAreasMapper.selectSysAreasList(sysAreas);
    }

    /**
     * 新增区域
     * 
     * @param sysAreas 区域
     * @return 结果
     */
    @Override
    public int insertSysAreas(SysAreas sysAreas)
    {
        return sysAreasMapper.insertSysAreas(sysAreas);
    }

    /**
     * 修改区域
     * 
     * @param sysAreas 区域
     * @return 结果
     */
    @Override
    public int updateSysAreas(SysAreas sysAreas)
    {
        return sysAreasMapper.updateSysAreas(sysAreas);
    }

    /**
     * 批量删除区域
     * 
     * @param areaIds 需要删除的区域主键
     * @return 结果
     */
    @Override
    public int deleteSysAreasByAreaIds(Long[] areaIds)
    {
        return sysAreasMapper.deleteSysAreasByAreaIds(areaIds);
    }


    /**
     * 删除区域信息
     * 
     * @param areaId 区域主键
     * @return 结果
     */
    @Override
    public int deleteSysAreasByAreaId(Long areaId)
    {
        return sysAreasMapper.deleteSysAreasByAreaId(areaId);
    }

    @Override
    public List<SysAreas> findAreaTree(long areaId) {
        return null;
    }

    @Override
    public List<TreeSelect> findAreaTreeBysysAreas(List<SysAreas> sysAreasList) {

        List<SysAreas> sysareaTrees = buildDeptTree(sysAreasList);
        return sysareaTrees.stream().map(TreeSelect::new).collect(Collectors.toList());



       /* List<SysAreas> all = sysAreasMapper.findAll();

        List<SysAreas> list = new ArrayList<>();
        if(StringUtils.isNotEmpty(all)){

            Map<Long, SysAreas> map = all.stream()
                    .collect(Collectors.toMap(SysAreas::getAreaId, Function.identity()));

            if(areaId != 100000){//当前节点存在
                //获取当前节点下所有子节点,并设置到当前节点

                if(CollectionUtils.isNotEmpty(this.getChildrenByParentId(all,areaId))){
                    SysAreas sysAreas = map.get(areaId);
                    sysAreas.setChildren(this.getChildrenByParentId(all,areaId));
                    list.add(sysAreas);
                }


            }else {//当前节点不存在
                list = this.getChildrenByParentId(all,areaId);
            }
        }
        return list;*/
    }


    private List<SysAreas> getChildrenByParentId(List<SysAreas> list,Long areaId){
        List<SysAreas> children = new ArrayList<>();
        for(SysAreas area :list){
            Long pid = area.getParentId();
            if(pid.longValue() == areaId.longValue()){
                children.add(area);
            }
        }
        if(StringUtils.isNotEmpty(children)){
            for(SysAreas area :children){
                area.setChildren(getChildrenByParentId(list,area.getAreaId()));
            }
        }
        return children;
    }

    /**
     * 构建前端所需要树结构
     *
     * @param sysAreasList 地区树列表
     * @return 树结构列表
     */
    private List<SysAreas> buildDeptTree(List<SysAreas> sysAreasList)
    {
        List<SysAreas> returnList = new ArrayList<SysAreas>();
        List<Long> tempList = new ArrayList<Long>();
        for (SysAreas sysAreas : sysAreasList)
        {
            tempList.add(sysAreas.getAreaId());
        }
        for (Iterator<SysAreas> iterator = sysAreasList.iterator(); iterator.hasNext();)
        {
            SysAreas sysAreas = (SysAreas) iterator.next();
            // 如果是顶级节点, 遍历该父节点的所有子节点
            if (!tempList.contains(sysAreas.getParentId()))
            {
                recursionFn(sysAreasList, sysAreas);
                returnList.add(sysAreas);
            }
        }
        if (returnList.isEmpty())
        {
            returnList = sysAreasList;
        }
        return returnList;
    }


    /**
     * 递归列表
     */
    private void recursionFn(List<SysAreas> list, SysAreas t)
    {
        // 得到子节点列表
        List<SysAreas> childList = getChildList(list, t);
        t.setChildren(childList);
        for (SysAreas tChild : childList)
        {
            if (hasChild(list, tChild))
            {
                recursionFn(list, tChild);
            }
        }
    }


    /**
     * 得到子节点列表
     */
    private List<SysAreas> getChildList(List<SysAreas> list, SysAreas t)
    {
        List<SysAreas> tlist = new ArrayList<SysAreas>();
        Iterator<SysAreas> it = list.iterator();
        while (it.hasNext())
        {
            SysAreas n = (SysAreas) it.next();
            if (StringUtils.isNotNull(n.getParentId()) && n.getParentId().longValue() == t.getAreaId().longValue())
            {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<SysAreas> list, SysAreas t)
    {
        return getChildList(list, t).size() > 0 ? true : false;
    }

}
