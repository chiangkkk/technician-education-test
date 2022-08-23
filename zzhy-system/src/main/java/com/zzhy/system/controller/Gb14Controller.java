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
import com.zzhy.system.domain.Gb14;
import com.zzhy.system.service.IGb14Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 空白毕业证领用信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gb14")
public class Gb14Controller extends BaseController
{
    @Autowired
    private IGb14Service gb14Service;

    /**
     * 查询空白毕业证领用信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb14:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gb14 gb14)
    {
        startPage();
        List<Gb14> list = gb14Service.selectGb14List(gb14);
        return getDataTable(list);
    }

    /**
     * 导出空白毕业证领用信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb14:export')")
    @Log(title = "空白毕业证领用信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gb14 gb14)
    {
        List<Gb14> list = gb14Service.selectGb14List(gb14);
        ExcelUtil<Gb14> util = new ExcelUtil<Gb14>(Gb14.class);
        return util.exportExcel(list, "空白毕业证领用信息数据");
    }

    /**
     * 获取空白毕业证领用信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb14:query')")
    @GetMapping(value = "/{age544}")
    public AjaxResult getInfo(@PathVariable("age544") String age544)
    {
        return AjaxResult.success(gb14Service.selectGb14ByAge544(age544));
    }

    /**
     * 新增空白毕业证领用信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb14:add')")
    @Log(title = "空白毕业证领用信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gb14 gb14)
    {
        return toAjax(gb14Service.insertGb14(gb14));
    }

    /**
     * 修改空白毕业证领用信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb14:edit')")
    @Log(title = "空白毕业证领用信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gb14 gb14)
    {
        return toAjax(gb14Service.updateGb14(gb14));
    }

    /**
     * 删除空白毕业证领用信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb14:remove')")
    @Log(title = "空白毕业证领用信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age544s}")
    public AjaxResult remove(@PathVariable String[] age544s)
    {
        return toAjax(gb14Service.deleteGb14ByAge544s(age544s));
    }
}
