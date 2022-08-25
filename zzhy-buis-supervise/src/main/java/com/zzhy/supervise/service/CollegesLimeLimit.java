package com.zzhy.supervise.service;

import com.zzhy.supervise.domain.SchCollegesTimelimit;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/8/23 17:02
 */
public interface CollegesLimeLimit {

    List<SchCollegesTimelimit> getList(SchCollegesTimelimit schCollegesTimelimit);

    int add(SchCollegesTimelimit collegesLimeLimit);

    SchCollegesTimelimit getOne(Integer id);

    int del(Integer id);
}
