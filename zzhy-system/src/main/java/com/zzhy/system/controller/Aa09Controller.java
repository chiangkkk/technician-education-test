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
import com.zzhy.system.domain.Aa09;
import com.zzhy.system.service.IAa09Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 代码类型Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/aa09")
public class Aa09Controller extends BaseController
{
    @Autowired
    private IAa09Service aa09Service;

    /**
     * 查询代码类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:aa09:list')")
    @GetMapping("/list")
    public TableDataInfo list(Aa09 aa09)
    {
        startPage();
        List<Aa09> list = aa09Service.selectAa09List(aa09);
        return getDataTable(list);
    }

    /**
     * 导出代码类型列表
     */
    @PreAuthorize("@ss.hasPermi('system:aa09:export')")
    @Log(title = "代码类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Aa09 aa09)
    {
        List<Aa09> list = aa09Service.selectAa09List(aa09);
        ExcelUtil<Aa09> util = new ExcelUtil<Aa09>(Aa09.class);
        return util.exportExcel(list, "代码类型数据");
    }

    /**
     * 获取代码类型详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:aa09:query')")
    @GetMapping(value = "/{aaa100}")
    public AjaxResult getInfo(@PathVariable("aaa100") String aaa100)
    {
        return AjaxResult.success(aa09Service.selectAa09ByAaa100(aaa100));
    }

    /**
     * 新增代码类型
     */
    @PreAuthorize("@ss.hasPermi('system:aa09:add')")
    @Log(title = "代码类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Aa09 aa09)
    {
        return toAjax(aa09Service.insertAa09(aa09));
    }

    /**
     * 修改代码类型
     */
    @PreAuthorize("@ss.hasPermi('system:aa09:edit')")
    @Log(title = "代码类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Aa09 aa09)
    {
        return toAjax(aa09Service.updateAa09(aa09));
    }

    /**
     * 删除代码类型
     */
    @PreAuthorize("@ss.hasPermi('system:aa09:remove')")
    @Log(title = "代码类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{aaa100s}")
    public AjaxResult remove(@PathVariable String[] aaa100s)
    {
        return toAjax(aa09Service.deleteAa09ByAaa100s(aaa100s));
    }
}
