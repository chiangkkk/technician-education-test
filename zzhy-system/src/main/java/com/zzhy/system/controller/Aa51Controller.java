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
import com.zzhy.system.domain.Aa51;
import com.zzhy.system.service.IAa51Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 行政区划Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/aa51")
public class Aa51Controller extends BaseController
{
    @Autowired
    private IAa51Service aa51Service;

    /**
     * 查询行政区划列表
     */
    @PreAuthorize("@ss.hasPermi('system:aa51:list')")
    @GetMapping("/list")
    public TableDataInfo list(Aa51 aa51)
    {
        startPage();
        List<Aa51> list = aa51Service.selectAa51List(aa51);
        return getDataTable(list);
    }

    /**
     * 导出行政区划列表
     */
    @PreAuthorize("@ss.hasPermi('system:aa51:export')")
    @Log(title = "行政区划", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Aa51 aa51)
    {
        List<Aa51> list = aa51Service.selectAa51List(aa51);
        ExcelUtil<Aa51> util = new ExcelUtil<Aa51>(Aa51.class);
        return util.exportExcel(list, "行政区划数据");
    }

    /**
     * 获取行政区划详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:aa51:query')")
    @GetMapping(value = "/{aaa145}")
    public AjaxResult getInfo(@PathVariable("aaa145") String aaa145)
    {
        return AjaxResult.success(aa51Service.selectAa51ByAaa145(aaa145));
    }

    /**
     * 新增行政区划
     */
    @PreAuthorize("@ss.hasPermi('system:aa51:add')")
    @Log(title = "行政区划", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Aa51 aa51)
    {
        return toAjax(aa51Service.insertAa51(aa51));
    }

    /**
     * 修改行政区划
     */
    @PreAuthorize("@ss.hasPermi('system:aa51:edit')")
    @Log(title = "行政区划", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Aa51 aa51)
    {
        return toAjax(aa51Service.updateAa51(aa51));
    }

    /**
     * 删除行政区划
     */
    @PreAuthorize("@ss.hasPermi('system:aa51:remove')")
    @Log(title = "行政区划", businessType = BusinessType.DELETE)
	@DeleteMapping("/{aaa145s}")
    public AjaxResult remove(@PathVariable String[] aaa145s)
    {
        return toAjax(aa51Service.deleteAa51ByAaa145s(aaa145s));
    }
}
