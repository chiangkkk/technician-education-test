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
import com.zzhy.system.domain.Gc53;
import com.zzhy.system.service.IGc53Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 助学金信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gc53")
public class Gc53Controller extends BaseController
{
    @Autowired
    private IGc53Service gc53Service;

    /**
     * 查询助学金信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc53:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gc53 gc53)
    {
        startPage();
        List<Gc53> list = gc53Service.selectGc53List(gc53);
        return getDataTable(list);
    }

    /**
     * 导出助学金信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc53:export')")
    @Log(title = "助学金信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gc53 gc53)
    {
        List<Gc53> list = gc53Service.selectGc53List(gc53);
        ExcelUtil<Gc53> util = new ExcelUtil<Gc53>(Gc53.class);
        return util.exportExcel(list, "助学金信息数据");
    }

    /**
     * 获取助学金信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc53:query')")
    @GetMapping(value = "/{age535}")
    public AjaxResult getInfo(@PathVariable("age535") String age535)
    {
        return AjaxResult.success(gc53Service.selectGc53ByAge535(age535));
    }

    /**
     * 新增助学金信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc53:add')")
    @Log(title = "助学金信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gc53 gc53)
    {
        return toAjax(gc53Service.insertGc53(gc53));
    }

    /**
     * 修改助学金信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc53:edit')")
    @Log(title = "助学金信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gc53 gc53)
    {
        return toAjax(gc53Service.updateGc53(gc53));
    }

    /**
     * 删除助学金信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc53:remove')")
    @Log(title = "助学金信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age535s}")
    public AjaxResult remove(@PathVariable String[] age535s)
    {
        return toAjax(gc53Service.deleteGc53ByAge535s(age535s));
    }
}
