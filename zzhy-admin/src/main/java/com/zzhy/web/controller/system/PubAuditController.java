package com.zzhy.web.controller.system;

import java.util.List;
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
import com.zzhy.system.domain.PubAudit;
import com.zzhy.system.service.IPubAuditService;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 审核历史Controller
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
@RestController
@RequestMapping("/system/audit")
public class PubAuditController extends BaseController
{
    @Autowired
    private IPubAuditService pubAuditService;

    /**
     * 查询审核历史列表
     */
    @PreAuthorize("@ss.hasPermi('system:audit:list')")
    @GetMapping("/list")
    public TableDataInfo list(PubAudit pubAudit)
    {
        startPage();
        List<PubAudit> list = pubAuditService.selectPubAuditList(pubAudit);
        return getDataTable(list);
    }

    /**
     * 导出审核历史列表
     */
    @PreAuthorize("@ss.hasPermi('system:audit:export')")
    @Log(title = "审核历史", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, PubAudit pubAudit)
    {
        List<PubAudit> list = pubAuditService.selectPubAuditList(pubAudit);
        ExcelUtil<PubAudit> util = new ExcelUtil<PubAudit>(PubAudit.class);
        return util.exportExcel(list, "审核历史数据");
    }

    /**
     * 获取审核历史详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:audit:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(pubAuditService.selectPubAuditById(id));
    }

    /**
     * 新增审核历史
     */
    @PreAuthorize("@ss.hasPermi('system:audit:add')")
    @Log(title = "审核历史", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PubAudit pubAudit)
    {
        return toAjax(pubAuditService.insertPubAudit(pubAudit));
    }

    /**
     * 修改审核历史
     */
    @PreAuthorize("@ss.hasPermi('system:audit:edit')")
    @Log(title = "审核历史", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PubAudit pubAudit)
    {
        return toAjax(pubAuditService.updatePubAudit(pubAudit));
    }

    /**
     * 删除审核历史
     */
    @PreAuthorize("@ss.hasPermi('system:audit:remove')")
    @Log(title = "审核历史", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(pubAuditService.deletePubAuditByIds(ids));
    }
}
