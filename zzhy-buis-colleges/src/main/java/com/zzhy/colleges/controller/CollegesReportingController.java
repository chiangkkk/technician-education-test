package com.zzhy.colleges.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ChiangKai
 * @date 2022/8/23 19:33
 */
@RequestMapping("/colleges/reporting")
@RestController
public class CollegesReportingController extends BaseController {

    @RequestMapping("/findhave")
    public AjaxResult findHave() {
        Long schoolId = getLoginUser().getUser().getSchoolId();
        if (null == schoolId){
            return toAjax(false);
        }
        return toAjax(true);
    }

}
