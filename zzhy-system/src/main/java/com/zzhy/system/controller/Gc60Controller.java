package com.zzhy.system.controller;

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
import com.zzhy.system.domain.Gc60;
import com.zzhy.system.service.IGc60Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 学籍异动信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gc60")
public class Gc60Controller extends BaseController
{
    @Autowired
    private IGc60Service gc60Service;

    /**
     * 查询学籍异动信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc60:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gc60 gc60)
    {
        startPage();
        List<Gc60> list = gc60Service.selectGc60List(gc60);
        return getDataTable(list);
    }

    /**
     * 导出学籍异动信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc60:export')")
    @Log(title = "学籍异动信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gc60 gc60)
    {
        List<Gc60> list = gc60Service.selectGc60List(gc60);
        ExcelUtil<Gc60> util = new ExcelUtil<Gc60>(Gc60.class);
        return util.exportExcel(list, "学籍异动信息数据");
    }

    /**
     * 获取学籍异动信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc60:query')")
    @GetMapping(value = "/{age548}")
    public AjaxResult getInfo(@PathVariable("age548") String age548)
    {
        return AjaxResult.success(gc60Service.selectGc60ByAge548(age548));
    }

    /**
     * 新增学籍异动信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc60:add')")
    @Log(title = "学籍异动信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gc60 gc60)
    {
        return toAjax(gc60Service.insertGc60(gc60));
    }

    /**
     * 修改学籍异动信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc60:edit')")
    @Log(title = "学籍异动信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gc60 gc60)
    {
        return toAjax(gc60Service.updateGc60(gc60));
    }

    /**
     * 删除学籍异动信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc60:remove')")
    @Log(title = "学籍异动信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age548s}")
    public AjaxResult remove(@PathVariable String[] age548s)
    {
        return toAjax(gc60Service.deleteGc60ByAge548s(age548s));
    }
}
