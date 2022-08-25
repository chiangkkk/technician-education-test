package com.zzhy.colleges.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.supervise.domain.SchCollegesBasicReporting;
import com.zzhy.supervise.service.CollegesReportingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ChiangKai
 * @date 2022/8/23 19:33
 */
@RequestMapping("/colleges/reporting")
@RestController
public class CollegesReportingController extends BaseController {


    @Resource
    private CollegesReportingService reportingService;

    @RequestMapping("/findhave")
    public AjaxResult findHave() {
        Long schoolId = getLoginUser().getUser().getSchoolId();
        if (null == schoolId) {
            return toAjax(false);
        }
        return toAjax(true);
    }

    @PostMapping("/add")
    public AjaxResult add(@RequestBody SchCollegesBasicReporting schCollegesBasicReporting) {
        return toAjax(reportingService.addReport(schCollegesBasicReporting));
    }

}
