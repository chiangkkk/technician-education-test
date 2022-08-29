package com.zzhy.colleges.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.core.domain.entity.SysRole;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.supervise.domain.SchCollegesBasicReporting;
import com.zzhy.supervise.domain.SupDeclareCollegesSchoolAudit;
import com.zzhy.supervise.domain.vo.AuditInfoVO;
import com.zzhy.supervise.mapper.SupDeclareCollegesSchoolAuditMapper;
import com.zzhy.supervise.service.CollegesReportingService;
import com.zzhy.supervise.service.SupDeclareCollegesSchoolAuditService;
import org.aspectj.weaver.loadtime.Aj;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author ChiangKai
 * @date 2022/8/23 19:33
 */
@RequestMapping("/colleges/reporting")
@RestController
public class CollegesReportingController extends BaseController {


    @Resource
    private CollegesReportingService reportingService;

    @Autowired
    private SupDeclareCollegesSchoolAuditService supDeclareCollegesSchoolAuditService;

    @RequestMapping("/findhave")
    public AjaxResult findHave() {
        return AjaxResult.success("hello ");
    }

    @PostMapping("/add")
    public AjaxResult add(@RequestBody SchCollegesBasicReporting schCollegesBasicReporting) {
        return toAjax(reportingService.addReport(schCollegesBasicReporting));
    }

    @RequestMapping("/list")
    public TableDataInfo add(
            @RequestParam(required = false) String schoolCode,
            @RequestParam(required = false) String schoolName,
            @RequestParam(required = false) Long reportingYear, //报备年份
            @RequestParam(required = false) Integer declareStatus, //流程状态
            @RequestParam(required = false) Integer waitingAudit //待我审批
    ) {
        Object[] roleIdsO = getLoginUser().getUser().getRoles().stream().map(SysRole::getRoleId).toArray();
        Long[] roleIds = new Long[roleIdsO.length];
        for (int i = 0; i < roleIdsO.length; i++) {
            roleIds[i] = (Long) roleIdsO[i];
        }
        startPage();

        return getDataTable(reportingService.getList(schoolCode, schoolName, reportingYear, declareStatus, waitingAudit, roleIds));
    }

    @RequestMapping("/query")
    public AjaxResult query(@RequestParam Integer reportingId) {
        return AjaxResult.success(reportingService.getById(reportingId));
    }

    @RequestMapping("/edit")
    public AjaxResult edit(@RequestBody SchCollegesBasicReporting schCollegesBasicReporting) {
        return AjaxResult.success(reportingService.editReport(schCollegesBasicReporting));
    }

    @PostMapping("/auditInfo")
    public AjaxResult audito(@RequestBody AuditInfoVO vo){
        List<Long> roleIds = getLoginUser().getUser().getRoles().stream().map(SysRole::getRoleId).collect(Collectors.toList());
        return toAjax(reportingService.audit(vo,roleIds));
    }



    @GetMapping(value = "/queryhistory")
    public AjaxResult queryHistory(@RequestParam Long reportingId){
        List<SupDeclareCollegesSchoolAudit> list = supDeclareCollegesSchoolAuditService.getBySourceId(reportingId);
        return AjaxResult.success(list);
    }

}
