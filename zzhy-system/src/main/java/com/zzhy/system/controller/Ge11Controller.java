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
import com.zzhy.system.domain.Ge11;
import com.zzhy.system.service.IGe11Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 中职卡导入记录Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/ge11")
public class Ge11Controller extends BaseController
{
    @Autowired
    private IGe11Service ge11Service;

    /**
     * 查询中职卡导入记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:ge11:list')")
    @GetMapping("/list")
    public TableDataInfo list(Ge11 ge11)
    {
        startPage();
        List<Ge11> list = ge11Service.selectGe11List(ge11);
        return getDataTable(list);
    }

    /**
     * 导出中职卡导入记录列表
     */
    @PreAuthorize("@ss.hasPermi('system:ge11:export')")
    @Log(title = "中职卡导入记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Ge11 ge11)
    {
        List<Ge11> list = ge11Service.selectGe11List(ge11);
        ExcelUtil<Ge11> util = new ExcelUtil<Ge11>(Ge11.class);
        return util.exportExcel(list, "中职卡导入记录数据");
    }

    /**
     * 获取中职卡导入记录详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:ge11:query')")
    @GetMapping(value = "/{age514}")
    public AjaxResult getInfo(@PathVariable("age514") String age514)
    {
        return AjaxResult.success(ge11Service.selectGe11ByAge514(age514));
    }

    /**
     * 新增中职卡导入记录
     */
    @PreAuthorize("@ss.hasPermi('system:ge11:add')")
    @Log(title = "中职卡导入记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Ge11 ge11)
    {
        return toAjax(ge11Service.insertGe11(ge11));
    }

    /**
     * 修改中职卡导入记录
     */
    @PreAuthorize("@ss.hasPermi('system:ge11:edit')")
    @Log(title = "中职卡导入记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Ge11 ge11)
    {
        return toAjax(ge11Service.updateGe11(ge11));
    }

    /**
     * 删除中职卡导入记录
     */
    @PreAuthorize("@ss.hasPermi('system:ge11:remove')")
    @Log(title = "中职卡导入记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age514s}")
    public AjaxResult remove(@PathVariable String[] age514s)
    {
        return toAjax(ge11Service.deleteGe11ByAge514s(age514s));
    }
}
