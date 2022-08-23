package com.zzhy.supervise.service.impl;

import java.util.List;
import com.zzhy.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.supervise.mapper.CollegesBasicReportingMapper;
import com.zzhy.supervise.domain.CollegesBasicReporting;
import com.zzhy.supervise.service.ICollegesBasicReportingService;

/**
 * 院校基本情况报备Service业务层处理
 * 
 * @author zzhy
 * @date 2022-06-05
 */
@Service
public class CollegesBasicReportingServiceImpl implements ICollegesBasicReportingService 
{
    @Autowired
    private CollegesBasicReportingMapper collegesBasicReportingMapper;

    /**
     * 查询院校基本情况报备
     * 
     * @param reportingId 院校基本情况报备主键
     * @return 院校基本情况报备
     */
    @Override
    public CollegesBasicReporting selectCollegesBasicReportingByReportingId(Long reportingId)
    {
        return collegesBasicReportingMapper.selectCollegesBasicReportingByReportingId(reportingId);
    }

    /**
     * 查询院校基本情况报备列表
     * 
     * @param collegesBasicReporting 院校基本情况报备
     * @return 院校基本情况报备
     */
    @Override
    public List<CollegesBasicReporting> selectCollegesBasicReportingList(CollegesBasicReporting collegesBasicReporting)
    {
        return collegesBasicReportingMapper.selectCollegesBasicReportingList(collegesBasicReporting);
    }

    /**
     * 新增院校基本情况报备
     * 
     * @param collegesBasicReporting 院校基本情况报备
     * @return 结果
     */
    @Override
    public int insertCollegesBasicReporting(CollegesBasicReporting collegesBasicReporting)
    {
        collegesBasicReporting.setCreateTime(DateUtils.getNowDate());
        return collegesBasicReportingMapper.insertCollegesBasicReporting(collegesBasicReporting);
    }

    /**
     * 修改院校基本情况报备
     * 
     * @param collegesBasicReporting 院校基本情况报备
     * @return 结果
     */
    @Override
    public int updateCollegesBasicReporting(CollegesBasicReporting collegesBasicReporting)
    {
        collegesBasicReporting.setUpdateTime(DateUtils.getNowDate());
        return collegesBasicReportingMapper.updateCollegesBasicReporting(collegesBasicReporting);
    }

    /**
     * 批量删除院校基本情况报备
     * 
     * @param reportingIds 需要删除的院校基本情况报备主键
     * @return 结果
     */
    @Override
    public int deleteCollegesBasicReportingByReportingIds(Long[] reportingIds)
    {
        return collegesBasicReportingMapper.deleteCollegesBasicReportingByReportingIds(reportingIds);
    }

    /**
     * 删除院校基本情况报备信息
     * 
     * @param reportingId 院校基本情况报备主键
     * @return 结果
     */
    @Override
    public int deleteCollegesBasicReportingByReportingId(Long reportingId)
    {
        return collegesBasicReportingMapper.deleteCollegesBasicReportingByReportingId(reportingId);
    }
}
