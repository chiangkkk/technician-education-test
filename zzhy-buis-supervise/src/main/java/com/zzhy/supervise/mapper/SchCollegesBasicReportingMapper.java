package com.zzhy.supervise.mapper;

import com.zzhy.supervise.domain.SchCollegesBasicReporting;
import com.zzhy.supervise.domain.vo.ReportingVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchCollegesBasicReportingMapper {
    int deleteByPrimaryKey(Long reportingId);

    int insert(SchCollegesBasicReporting record);

    int insertSelective(SchCollegesBasicReporting record);

    SchCollegesBasicReporting selectByPrimaryKey(Long reportingId);

    int updateByPrimaryKeySelective(SchCollegesBasicReporting record);

    int updateByPrimaryKey(SchCollegesBasicReporting record);

    List<SchCollegesBasicReporting> selectList(@Param("schoolCode") String schoolCode,
                                              @Param("schoolName") String schoolName,
                                               @Param("reportingYear") Long reportingYear,
                                               @Param("declareStatus") Integer declareStatus);

    List<ReportingVO> selectWithAuditoList(String schoolCode, String schoolName, Long reportingYear, Integer declareStatus);
}