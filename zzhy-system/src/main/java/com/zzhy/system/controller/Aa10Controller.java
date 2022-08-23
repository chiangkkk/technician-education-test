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
import com.zzhy.system.domain.Aa10;
import com.zzhy.system.service.IAa10Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 代码Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/aa10")
public class Aa10Controller extends BaseController
{
    @Autowired
    private IAa10Service aa10Service;

    /**
     * 查询代码列表
     */
    @PreAuthorize("@ss.hasPermi('system:aa10:list')")
    @GetMapping("/list")
    public TableDataInfo list(Aa10 aa10)
    {
        startPage();
        List<Aa10> list = aa10Service.selectAa10List(aa10);
        return getDataTable(list);
    }

    /**
     * 导出代码列表
     */
    @PreAuthorize("@ss.hasPermi('system:aa10:export')")
    @Log(title = "代码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Aa10 aa10)
    {
        List<Aa10> list = aa10Service.selectAa10List(aa10);
        ExcelUtil<Aa10> util = new ExcelUtil<Aa10>(Aa10.class);
        return util.exportExcel(list, "代码数据");
    }

    /**
     * 获取代码详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:aa10:query')")
    @GetMapping(value = "/{aaa100}")
    public AjaxResult getInfo(@PathVariable("aaa100") String aaa100)
    {
        return AjaxResult.success(aa10Service.selectAa10ByAaa100(aaa100));
    }

    /**
     * 新增代码
     */
    @PreAuthorize("@ss.hasPermi('system:aa10:add')")
    @Log(title = "代码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Aa10 aa10)
    {
        return toAjax(aa10Service.insertAa10(aa10));
    }

    /**
     * 修改代码
     */
    @PreAuthorize("@ss.hasPermi('system:aa10:edit')")
    @Log(title = "代码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Aa10 aa10)
    {
        return toAjax(aa10Service.updateAa10(aa10));
    }

    /**
     * 删除代码
     */
    @PreAuthorize("@ss.hasPermi('system:aa10:remove')")
    @Log(title = "代码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{aaa100s}")
    public AjaxResult remove(@PathVariable String[] aaa100s)
    {
        return toAjax(aa10Service.deleteAa10ByAaa100s(aaa100s));
    }
}
