package com.zzhy.supervise.mapper;

import com.zzhy.supervise.domain.SchCollegesBasicReporting;

public interface SchCollegesBasicReportingMapper {
    int deleteByPrimaryKey(Long reportingId);

    int insert(SchCollegesBasicReporting record);

    int insertSelective(SchCollegesBasicReporting record);

    SchCollegesBasicReporting selectByPrimaryKey(Long reportingId);

    int updateByPrimaryKeySelective(SchCollegesBasicReporting record);

    int updateByPrimaryKey(SchCollegesBasicReporting record);
}