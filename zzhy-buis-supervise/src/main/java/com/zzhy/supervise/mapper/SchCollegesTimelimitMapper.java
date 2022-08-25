package com.zzhy.supervise.mapper;

import com.zzhy.supervise.domain.SchCollegesTimelimit;

import java.util.List;

public interface SchCollegesTimelimitMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchCollegesTimelimit record);

    int insertSelective(SchCollegesTimelimit record);

    SchCollegesTimelimit selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchCollegesTimelimit record);

    int updateByPrimaryKey(SchCollegesTimelimit record);

    List<SchCollegesTimelimit> select(SchCollegesTimelimit schCollegesTimelimit);
}