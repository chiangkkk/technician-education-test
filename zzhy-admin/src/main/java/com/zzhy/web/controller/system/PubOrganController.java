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
import com.zzhy.system.domain.PubOrgan;
import com.zzhy.system.service.IPubOrganService;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 部门Controller
 * 
 * @author ruoyi
 * @date 2021-11-10
 */
@RestController
@RequestMapping("/system/organ")
public class PubOrganController extends BaseController
{
    @Autowired
    private IPubOrganService pubOrganService;

    /**
     * 查询部门列表
     */
    @PreAuthorize("@ss.hasPermi('system:organ:list')")
    @GetMapping("/list")
    public TableDataInfo list(PubOrgan pubOrgan)
    {
        startPage();
        List<PubOrgan> list = pubOrganService.selectPubOrganList(pubOrgan);
        return getDataTable(list);
    }

    /**
     * 导出部门列表
     */
    @PreAuthorize("@ss.hasPermi('system:organ:export')")
    @Log(title = "部门", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, PubOrgan pubOrgan)
    {
        List<PubOrgan> list = pubOrganService.selectPubOrganList(pubOrgan);
        ExcelUtil<PubOrgan> util = new ExcelUtil<PubOrgan>(PubOrgan.class);
        return util.exportExcel(list, "部门数据");
    }

    /**
     * 获取部门详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:organ:query')")
    @GetMapping(value = "/{organId}")
    public AjaxResult getInfo(@PathVariable("organId") Long organId)
    {
        return AjaxResult.success(pubOrganService.selectPubOrganByOrganId(organId));
    }

    /**
     * 新增部门
     */
    @PreAuthorize("@ss.hasPermi('system:organ:add')")
    @Log(title = "部门", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PubOrgan pubOrgan)
    {
        return toAjax(pubOrganService.insertPubOrgan(pubOrgan));
    }

    /**
     * 修改部门
     */
    @PreAuthorize("@ss.hasPermi('system:organ:edit')")
    @Log(title = "部门", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PubOrgan pubOrgan)
    {
        return toAjax(pubOrganService.updatePubOrgan(pubOrgan));
    }

    /**
     * 删除部门
     */
    @PreAuthorize("@ss.hasPermi('system:organ:remove')")
    @Log(title = "部门", businessType = BusinessType.DELETE)
	@DeleteMapping("/{organIds}")
    public AjaxResult remove(@PathVariable Long[] organIds)
    {
        return toAjax(pubOrganService.deletePubOrganByOrganIds(organIds));
    }
}
