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
import com.zzhy.system.domain.Gb13;
import com.zzhy.system.service.IGb13Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 院校专业信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gb13")
public class Gb13Controller extends BaseController
{
    @Autowired
    private IGb13Service gb13Service;

    /**
     * 查询院校专业信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb13:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gb13 gb13)
    {
        startPage();
        List<Gb13> list = gb13Service.selectGb13List(gb13);
        return getDataTable(list);
    }

    /**
     * 导出院校专业信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb13:export')")
    @Log(title = "院校专业信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gb13 gb13)
    {
        List<Gb13> list = gb13Service.selectGb13List(gb13);
        ExcelUtil<Gb13> util = new ExcelUtil<Gb13>(Gb13.class);
        return util.exportExcel(list, "院校专业信息数据");
    }

    /**
     * 获取院校专业信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb13:query')")
    @GetMapping(value = "/{age655}")
    public AjaxResult getInfo(@PathVariable("age655") String age655)
    {
        return AjaxResult.success(gb13Service.selectGb13ByAge655(age655));
    }

    /**
     * 新增院校专业信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb13:add')")
    @Log(title = "院校专业信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gb13 gb13)
    {
        return toAjax(gb13Service.insertGb13(gb13));
    }

    /**
     * 修改院校专业信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb13:edit')")
    @Log(title = "院校专业信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gb13 gb13)
    {
        return toAjax(gb13Service.updateGb13(gb13));
    }

    /**
     * 删除院校专业信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb13:remove')")
    @Log(title = "院校专业信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age655s}")
    public AjaxResult remove(@PathVariable String[] age655s)
    {
        return toAjax(gb13Service.deleteGb13ByAge655s(age655s));
    }
}
