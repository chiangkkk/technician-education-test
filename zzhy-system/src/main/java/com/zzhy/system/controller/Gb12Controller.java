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
import com.zzhy.system.domain.Gb12;
import com.zzhy.system.service.IGb12Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 教师信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gb12")
public class Gb12Controller extends BaseController
{
    @Autowired
    private IGb12Service gb12Service;

    /**
     * 查询教师信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb12:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gb12 gb12)
    {
        startPage();
        List<Gb12> list = gb12Service.selectGb12List(gb12);
        return getDataTable(list);
    }

    /**
     * 导出教师信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb12:export')")
    @Log(title = "教师信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gb12 gb12)
    {
        List<Gb12> list = gb12Service.selectGb12List(gb12);
        ExcelUtil<Gb12> util = new ExcelUtil<Gb12>(Gb12.class);
        return util.exportExcel(list, "教师信息数据");
    }

    /**
     * 获取教师信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb12:query')")
    @GetMapping(value = "/{agc153}")
    public AjaxResult getInfo(@PathVariable("agc153") String agc153)
    {
        return AjaxResult.success(gb12Service.selectGb12ByAgc153(agc153));
    }

    /**
     * 新增教师信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb12:add')")
    @Log(title = "教师信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gb12 gb12)
    {
        return toAjax(gb12Service.insertGb12(gb12));
    }

    /**
     * 修改教师信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb12:edit')")
    @Log(title = "教师信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gb12 gb12)
    {
        return toAjax(gb12Service.updateGb12(gb12));
    }

    /**
     * 删除教师信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb12:remove')")
    @Log(title = "教师信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{agc153s}")
    public AjaxResult remove(@PathVariable String[] agc153s)
    {
        return toAjax(gb12Service.deleteGb12ByAgc153s(agc153s));
    }
}
