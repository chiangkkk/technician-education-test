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
import com.zzhy.system.domain.Gc52;
import com.zzhy.system.service.IGc52Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 免学费信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gc52")
public class Gc52Controller extends BaseController
{
    @Autowired
    private IGc52Service gc52Service;

    /**
     * 查询免学费信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc52:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gc52 gc52)
    {
        startPage();
        List<Gc52> list = gc52Service.selectGc52List(gc52);
        return getDataTable(list);
    }

    /**
     * 导出免学费信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc52:export')")
    @Log(title = "免学费信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gc52 gc52)
    {
        List<Gc52> list = gc52Service.selectGc52List(gc52);
        ExcelUtil<Gc52> util = new ExcelUtil<Gc52>(Gc52.class);
        return util.exportExcel(list, "免学费信息数据");
    }

    /**
     * 获取免学费信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc52:query')")
    @GetMapping(value = "/{age521}")
    public AjaxResult getInfo(@PathVariable("age521") String age521)
    {
        return AjaxResult.success(gc52Service.selectGc52ByAge521(age521));
    }

    /**
     * 新增免学费信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc52:add')")
    @Log(title = "免学费信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gc52 gc52)
    {
        return toAjax(gc52Service.insertGc52(gc52));
    }

    /**
     * 修改免学费信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc52:edit')")
    @Log(title = "免学费信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gc52 gc52)
    {
        return toAjax(gc52Service.updateGc52(gc52));
    }

    /**
     * 删除免学费信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc52:remove')")
    @Log(title = "免学费信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age521s}")
    public AjaxResult remove(@PathVariable String[] age521s)
    {
        return toAjax(gc52Service.deleteGc52ByAge521s(age521s));
    }
}
