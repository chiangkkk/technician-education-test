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
import com.zzhy.system.domain.Gb11;
import com.zzhy.system.service.IGb11Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 技工院校信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gb11")
public class Gb11Controller extends BaseController
{
    @Autowired
    private IGb11Service gb11Service;

    /**
     * 查询技工院校信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb11:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gb11 gb11)
    {
        startPage();
        List<Gb11> list = gb11Service.selectGb11List(gb11);
        return getDataTable(list);
    }

    /**
     * 导出技工院校信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb11:export')")
    @Log(title = "技工院校信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gb11 gb11)
    {
        List<Gb11> list = gb11Service.selectGb11List(gb11);
        ExcelUtil<Gb11> util = new ExcelUtil<Gb11>(Gb11.class);
        return util.exportExcel(list, "技工院校信息数据");
    }

    /**
     * 获取技工院校信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb11:query')")
    @GetMapping(value = "/{agb020}")
    public AjaxResult getInfo(@PathVariable("agb020") String agb020)
    {
        return AjaxResult.success(gb11Service.selectGb11ByAgb020(agb020));
    }

    /**
     * 新增技工院校信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb11:add')")
    @Log(title = "技工院校信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gb11 gb11)
    {
        return toAjax(gb11Service.insertGb11(gb11));
    }

    /**
     * 修改技工院校信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb11:edit')")
    @Log(title = "技工院校信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gb11 gb11)
    {
        return toAjax(gb11Service.updateGb11(gb11));
    }

    /**
     * 删除技工院校信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb11:remove')")
    @Log(title = "技工院校信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{agb020s}")
    public AjaxResult remove(@PathVariable String[] agb020s)
    {
        return toAjax(gb11Service.deleteGb11ByAgb020s(agb020s));
    }
}
