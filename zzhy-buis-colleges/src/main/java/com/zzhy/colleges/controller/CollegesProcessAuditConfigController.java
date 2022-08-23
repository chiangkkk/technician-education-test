package com.zzhy.colleges.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.zzhy.common.annotation.RepeatSubmit;
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
import com.zzhy.supervise.domain.CollegesProcessAuditConfig;
import com.zzhy.supervise.service.ICollegesProcessAuditConfigService;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

/**
 * 院校端申报流程审核配置（默认对应院校的管理员角色）Controller
 *
 * @author zzhy
 * @date 2022-06-05
 */
@RestController
@RequestMapping("/supervise/config")
public class CollegesProcessAuditConfigController extends BaseController
{
    @Autowired
    private ICollegesProcessAuditConfigService collegesProcessAuditConfigService;

    /**
     * 查询院校端申报流程审核配置（默认对应院校的管理员角色）列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:config:list')")
    @GetMapping("/list")
    public TableDataInfo list(CollegesProcessAuditConfig collegesProcessAuditConfig)
    {
        startPage();
        List<CollegesProcessAuditConfig> list = collegesProcessAuditConfigService.selectCollegesProcessAuditConfigList(collegesProcessAuditConfig);
        return getDataTable(list);
    }

    /**
     * 导出院校端申报流程审核配置（默认对应院校的管理员角色）列表
     */
    @PreAuthorize("@ss.hasPermi('supervise:config:export')")
    @Log(title = "院校端申报流程审核配置（默认对应院校的管理员角色）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @RepeatSubmit
    public void export(HttpServletResponse response, CollegesProcessAuditConfig collegesProcessAuditConfig)
    {
        List<CollegesProcessAuditConfig> list = collegesProcessAuditConfigService.selectCollegesProcessAuditConfigList(collegesProcessAuditConfig);
        ExcelUtil<CollegesProcessAuditConfig> util = new ExcelUtil<CollegesProcessAuditConfig>(CollegesProcessAuditConfig.class);
        util.exportExcel(response, list, "院校端申报流程审核配置（默认对应院校的管理员角色）数据");
    }

    /**
     * 获取院校端申报流程审核配置（默认对应院校的管理员角色）详细信息
     */
    @PreAuthorize("@ss.hasPermi('supervise:config:query')")
    @GetMapping(value = "/{declareAuditId}")
    public AjaxResult getInfo(@PathVariable("declareAuditId") Long declareAuditId)
    {
        return AjaxResult.success(collegesProcessAuditConfigService.selectCollegesProcessAuditConfigByDeclareAuditId(declareAuditId));
    }

    /**
     * 新增院校端申报流程审核配置（默认对应院校的管理员角色）
     */
    @PreAuthorize("@ss.hasPermi('supervise:config:add')")
    @Log(title = "院校端申报流程审核配置（默认对应院校的管理员角色）", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CollegesProcessAuditConfig collegesProcessAuditConfig)
    {
        return toAjax(collegesProcessAuditConfigService.insertCollegesProcessAuditConfig(collegesProcessAuditConfig));
    }

    /**
     * 修改院校端申报流程审核配置（默认对应院校的管理员角色）
     */
    @PreAuthorize("@ss.hasPermi('supervise:config:edit')")
    @Log(title = "院校端申报流程审核配置（默认对应院校的管理员角色）", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CollegesProcessAuditConfig collegesProcessAuditConfig)
    {
        return toAjax(collegesProcessAuditConfigService.updateCollegesProcessAuditConfig(collegesProcessAuditConfig));
    }

    /**
     * 删除院校端申报流程审核配置（默认对应院校的管理员角色）
     */
    @PreAuthorize("@ss.hasPermi('supervise:config:remove')")
    @Log(title = "院校端申报流程审核配置（默认对应院校的管理员角色）", businessType = BusinessType.DELETE)
	@DeleteMapping("/{declareAuditIds}")
    public AjaxResult remove(@PathVariable Long[] declareAuditIds)
    {
        return toAjax(collegesProcessAuditConfigService.deleteCollegesProcessAuditConfigByDeclareAuditIds(declareAuditIds));
    }
}
