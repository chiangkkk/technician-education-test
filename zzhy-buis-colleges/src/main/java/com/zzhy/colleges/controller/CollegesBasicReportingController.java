package com.zzhy.colleges.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zzhy.common.annotation.Log;
import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.enums.BusinessType;
import com.zzhy.supervise.domain.CollegesBasicReporting;
import com.zzhy.supervise.service.ICollegesBasicReportingService;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

/**
 * 院校基本情况报备Controller
 *
 * @author zzhy
 * @date 2022-06-05
 */
@RestController
@RequestMapping("/supervise/reporting")
public class CollegesBasicReportingController extends BaseController
{
    @Autowired
    private ICollegesBasicReportingService collegesBasicReportingService;

    /**
     * 查询院校基本情况报备列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:reporting:list')")
    @GetMapping("/list")
    public TableDataInfo list(CollegesBasicReporting collegesBasicReporting)
    {
        startPage();
        List<CollegesBasicReporting> list = collegesBasicReportingService.selectCollegesBasicReportingList(collegesBasicReporting);
        return getDataTable(list);
    }

    /**
     * 导出院校基本情况报备列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:reporting:export')")
    @Log(title = "院校基本情况报备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CollegesBasicReporting collegesBasicReporting)
    {
        List<CollegesBasicReporting> list = collegesBasicReportingService.selectCollegesBasicReportingList(collegesBasicReporting);
        ExcelUtil<CollegesBasicReporting> util = new ExcelUtil<CollegesBasicReporting>(CollegesBasicReporting.class);
        util.exportExcel(response, list, "院校基本情况报备数据");
    }

    /**
     * 获取院校基本情况报备详细信息
     */
    @PreAuthorize("@ss.hasPermi('supervise:reporting:query')")
    @GetMapping(value = "/{reportingId}")
    public AjaxResult getInfo(@PathVariable("reportingId") Long reportingId)
    {
        return AjaxResult.success(collegesBasicReportingService.selectCollegesBasicReportingByReportingId(reportingId));
    }

    /**
     * 新增院校基本情况报备
     */
    @PreAuthorize("@ss.hasPermi('supervise:reporting:add')")
    @Log(title = "院校基本情况报备", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CollegesBasicReporting collegesBasicReporting)
    {
        return toAjax(collegesBasicReportingService.insertCollegesBasicReporting(collegesBasicReporting));
    }

    /**
     * 修改院校基本情况报备
     */
    @PreAuthorize("@ss.hasPermi('supervise:reporting:edit')")
    @Log(title = "院校基本情况报备", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CollegesBasicReporting collegesBasicReporting)
    {
        return toAjax(collegesBasicReportingService.updateCollegesBasicReporting(collegesBasicReporting));
    }

    /**
     * 删除院校基本情况报备
     */
    @PreAuthorize("@ss.hasPermi('supervise:reporting:remove')")
    @Log(title = "院校基本情况报备", businessType = BusinessType.DELETE)
	@DeleteMapping("/{reportingIds}")
    public AjaxResult remove(@PathVariable Long[] reportingIds)
    {
        return toAjax(collegesBasicReportingService.deleteCollegesBasicReportingByReportingIds(reportingIds));
    }
}
