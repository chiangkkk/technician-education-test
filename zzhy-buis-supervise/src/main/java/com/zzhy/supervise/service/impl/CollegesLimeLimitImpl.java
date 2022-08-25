package com.zzhy.supervise.service.impl;

import com.zzhy.supervise.domain.SchCollegesTimelimit;
import com.zzhy.supervise.mapper.SchCollegesTimelimitMapper;
import com.zzhy.supervise.service.CollegesLimeLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/23 17:04
 */
@Service
public class CollegesLimeLimitImpl implements CollegesLimeLimit {

    @Autowired
    SchCollegesTimelimitMapper schCollegesTimelimitMapper;


    @Override
    public List<SchCollegesTimelimit> getList(SchCollegesTimelimit schCollegesTimelimit) {
        return schCollegesTimelimitMapper.select(schCollegesTimelimit);
    }

    @Override
    public int add(SchCollegesTimelimit collegesLimeLimit) {
        if (null != collegesLimeLimit) {
            if (null == collegesLimeLimit.getId())
                collegesLimeLimit.setCreateTime(new Date());
            collegesLimeLimit.setUpdateTime(new Date());
        }
        if (collegesLimeLimit.getId() == null)
            return schCollegesTimelimitMapper.insertSelective(collegesLimeLimit);
        return schCollegesTimelimitMapper.updateByPrimaryKeySelective(collegesLimeLimit);
    }

    @Override
    public int del(Integer id) {
        return schCollegesTimelimitMapper.deleteByPrimaryKey(id);
    }

    @Override
    public SchCollegesTimelimit getOne(Integer id) {
        return schCollegesTimelimitMapper.selectByPrimaryKey(id);
    }



}
