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
import com.zzhy.system.domain.Ga07;
import com.zzhy.system.service.IGa07Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 助学金标准Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/ga07")
public class Ga07Controller extends BaseController
{
    @Autowired
    private IGa07Service ga07Service;

    /**
     * 查询助学金标准列表
     */
    @PreAuthorize("@ss.hasPermi('system:ga07:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ga07 ga07)
    {
        startPage();
        List<Ga07> list = ga07Service.selectGa07List(ga07);
        return getDataTable(list);
    }

    /**
     * 导出助学金标准列表
     */
    @PreAuthorize("@ss.hasPermi('system:ga07:export')")
    @Log(title = "助学金标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Ga07 ga07)
    {
        List<Ga07> list = ga07Service.selectGa07List(ga07);
        ExcelUtil<Ga07> util = new ExcelUtil<Ga07>(Ga07.class);
        return util.exportExcel(list, "助学金标准数据");
    }

    /**
     * 获取助学金标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ga07:query')")
    @GetMapping(value = "/{age661}")
    public AjaxResult getInfo(@PathVariable("age661") String age661)
    {
        return AjaxResult.success(ga07Service.selectGa07ByAge661(age661));
    }

    /**
     * 新增助学金标准
     */
    @PreAuthorize("@ss.hasPermi('system:ga07:add')")
    @Log(title = "助学金标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ga07 ga07)
    {
        return toAjax(ga07Service.insertGa07(ga07));
    }

    /**
     * 修改助学金标准
     */
    @PreAuthorize("@ss.hasPermi('system:ga07:edit')")
    @Log(title = "助学金标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ga07 ga07)
    {
        return toAjax(ga07Service.updateGa07(ga07));
    }

    /**
     * 删除助学金标准
     */
    @PreAuthorize("@ss.hasPermi('system:ga07:remove')")
    @Log(title = "助学金标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age661s}")
    public AjaxResult remove(@PathVariable String[] age661s)
    {
        return toAjax(ga07Service.deleteGa07ByAge661s(age661s));
    }
}
