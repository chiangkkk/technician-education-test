package com.zzhy.colleges.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.core.domain.model.LoginUser;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.supervise.domain.SchCollegesTimelimit;
import com.zzhy.supervise.service.CollegesLimeLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/**
 * 招生平台时限配置
 *
 * @author ChiangKai
 * @date 2022/8/23 15:34
 */
@RestController()
@RequestMapping("/supervise/timelimit")
public class CollegesTimeLimitController extends BaseController {

    @Autowired
    private CollegesLimeLimit collegesLimeLimit;

    @RequestMapping("/list")
    public TableDataInfo list(SchCollegesTimelimit schCollegesTimelimit) {
        startPage();
        return getDataTable(collegesLimeLimit.getList(schCollegesTimelimit));
    }

    @RequestMapping("add")
    public AjaxResult add(@RequestBody SchCollegesTimelimit schCollegesTimelimit, Principal principal) {
        if (null == schCollegesTimelimit.getId()) {
            schCollegesTimelimit.setCreateBy(principal.getName());
        }
        schCollegesTimelimit.setUpdateBy(principal.getName());
        return AjaxResult.success(collegesLimeLimit.add(schCollegesTimelimit));
    }

    @GetMapping("/{id}")
    public AjaxResult getOne(@PathVariable("id") Integer id) {
        return AjaxResult.success(collegesLimeLimit.getOne(id));

    }

    @DeleteMapping("/tombstone/{id}")
    public AjaxResult del(@PathVariable("id") Integer id){
        return AjaxResult.success(collegesLimeLimit.del(id));
    }


}
