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
import com.zzhy.system.domain.Gc54;
import com.zzhy.system.service.IGc54Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 毕业证信息Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gc54")
public class Gc54Controller extends BaseController
{
    @Autowired
    private IGc54Service gc54Service;

    /**
     * 查询毕业证信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc54:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gc54 gc54)
    {
        startPage();
        List<Gc54> list = gc54Service.selectGc54List(gc54);
        return getDataTable(list);
    }

    /**
     * 导出毕业证信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc54:export')")
    @Log(title = "毕业证信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gc54 gc54)
    {
        List<Gc54> list = gc54Service.selectGc54List(gc54);
        ExcelUtil<Gc54> util = new ExcelUtil<Gc54>(Gc54.class);
        return util.exportExcel(list, "毕业证信息数据");
    }

    /**
     * 获取毕业证信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc54:query')")
    @GetMapping(value = "/{age529}")
    public AjaxResult getInfo(@PathVariable("age529") String age529)
    {
        return AjaxResult.success(gc54Service.selectGc54ByAge529(age529));
    }

    /**
     * 新增毕业证信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc54:add')")
    @Log(title = "毕业证信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gc54 gc54)
    {
        return toAjax(gc54Service.insertGc54(gc54));
    }

    /**
     * 修改毕业证信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc54:edit')")
    @Log(title = "毕业证信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gc54 gc54)
    {
        return toAjax(gc54Service.updateGc54(gc54));
    }

    /**
     * 删除毕业证信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc54:remove')")
    @Log(title = "毕业证信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age529s}")
    public AjaxResult remove(@PathVariable String[] age529s)
    {
        return toAjax(gc54Service.deleteGc54ByAge529s(age529s));
    }
}
