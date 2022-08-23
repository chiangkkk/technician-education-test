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
import com.zzhy.system.domain.Ga03;
import com.zzhy.system.service.IGa03Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 专业信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/ga03")
public class Ga03Controller extends BaseController
{
    @Autowired
    private IGa03Service ga03Service;

    /**
     * 查询专业信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:ga03:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ga03 ga03)
    {
        startPage();
        List<Ga03> list = ga03Service.selectGa03List(ga03);
        return getDataTable(list);
    }

    /**
     * 导出专业信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:ga03:export')")
    @Log(title = "专业信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Ga03 ga03)
    {
        List<Ga03> list = ga03Service.selectGa03List(ga03);
        ExcelUtil<Ga03> util = new ExcelUtil<Ga03>(Ga03.class);
        return util.exportExcel(list, "专业信息数据");
    }

    /**
     * 获取专业信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ga03:query')")
    @GetMapping(value = "/{aae100}")
    public AjaxResult getInfo(@PathVariable("aae100") String aae100)
    {
        return AjaxResult.success(ga03Service.selectGa03ByAae100(aae100));
    }

    /**
     * 新增专业信息
     */
    @PreAuthorize("@ss.hasPermi('system:ga03:add')")
    @Log(title = "专业信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ga03 ga03)
    {
        return toAjax(ga03Service.insertGa03(ga03));
    }

    /**
     * 修改专业信息
     */
    @PreAuthorize("@ss.hasPermi('system:ga03:edit')")
    @Log(title = "专业信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ga03 ga03)
    {
        return toAjax(ga03Service.updateGa03(ga03));
    }

    /**
     * 删除专业信息
     */
    @PreAuthorize("@ss.hasPermi('system:ga03:remove')")
    @Log(title = "专业信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{aae100s}")
    public AjaxResult remove(@PathVariable String[] aae100s)
    {
        return toAjax(ga03Service.deleteGa03ByAae100s(aae100s));
    }
}
