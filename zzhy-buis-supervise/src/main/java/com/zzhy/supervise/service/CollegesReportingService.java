package com.zzhy.supervise.service;

import com.zzhy.supervise.domain.SchCollegesBasicReporting;

/**
 * @author ChiangKai
 * @date 2022/8/25 11:07
 */
public interface CollegesReportingService {

    /**
     * 添加院校基本报备情况
     * @param SchCollegesBasicReporting
     * @return
     */
    int addReport(SchCollegesBasicReporting SchCollegesBasicReporting);
}
