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
import com.zzhy.system.domain.Ga06;
import com.zzhy.system.service.IGa06Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 免学费标准Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/ga06")
public class Ga06Controller extends BaseController
{
    @Autowired
    private IGa06Service ga06Service;

    /**
     * 查询免学费标准列表
     */
    @PreAuthorize("@ss.hasPermi('system:ga06:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ga06 ga06)
    {
        startPage();
        List<Ga06> list = ga06Service.selectGa06List(ga06);
        return getDataTable(list);
    }

    /**
     * 导出免学费标准列表
     */
    @PreAuthorize("@ss.hasPermi('system:ga06:export')")
    @Log(title = "免学费标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Ga06 ga06)
    {
        List<Ga06> list = ga06Service.selectGa06List(ga06);
        ExcelUtil<Ga06> util = new ExcelUtil<Ga06>(Ga06.class);
        return util.exportExcel(list, "免学费标准数据");
    }

    /**
     * 获取免学费标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ga06:query')")
    @GetMapping(value = "/{age542}")
    public AjaxResult getInfo(@PathVariable("age542") String age542)
    {
        return AjaxResult.success(ga06Service.selectGa06ByAge542(age542));
    }

    /**
     * 新增免学费标准
     */
    @PreAuthorize("@ss.hasPermi('system:ga06:add')")
    @Log(title = "免学费标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ga06 ga06)
    {
        return toAjax(ga06Service.insertGa06(ga06));
    }

    /**
     * 修改免学费标准
     */
    @PreAuthorize("@ss.hasPermi('system:ga06:edit')")
    @Log(title = "免学费标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ga06 ga06)
    {
        return toAjax(ga06Service.updateGa06(ga06));
    }

    /**
     * 删除免学费标准
     */
    @PreAuthorize("@ss.hasPermi('system:ga06:remove')")
    @Log(title = "免学费标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age542s}")
    public AjaxResult remove(@PathVariable String[] age542s)
    {
        return toAjax(ga06Service.deleteGa06ByAge542s(age542s));
    }
}
