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
import com.zzhy.system.domain.Gc55;
import com.zzhy.system.service.IGc55Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 就业信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gc55")
public class Gc55Controller extends BaseController
{
    @Autowired
    private IGc55Service gc55Service;

    /**
     * 查询就业信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc55:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gc55 gc55)
    {
        startPage();
        List<Gc55> list = gc55Service.selectGc55List(gc55);
        return getDataTable(list);
    }

    /**
     * 导出就业信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc55:export')")
    @Log(title = "就业信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gc55 gc55)
    {
        List<Gc55> list = gc55Service.selectGc55List(gc55);
        ExcelUtil<Gc55> util = new ExcelUtil<Gc55>(Gc55.class);
        return util.exportExcel(list, "就业信息数据");
    }

    /**
     * 获取就业信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc55:query')")
    @GetMapping(value = "/{age534}")
    public AjaxResult getInfo(@PathVariable("age534") String age534)
    {
        return AjaxResult.success(gc55Service.selectGc55ByAge534(age534));
    }

    /**
     * 新增就业信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc55:add')")
    @Log(title = "就业信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gc55 gc55)
    {
        return toAjax(gc55Service.insertGc55(gc55));
    }

    /**
     * 修改就业信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc55:edit')")
    @Log(title = "就业信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gc55 gc55)
    {
        return toAjax(gc55Service.updateGc55(gc55));
    }

    /**
     * 删除就业信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc55:remove')")
    @Log(title = "就业信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age534s}")
    public AjaxResult remove(@PathVariable String[] age534s)
    {
        return toAjax(gc55Service.deleteGc55ByAge534s(age534s));
    }
}
