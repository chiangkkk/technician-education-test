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
import com.zzhy.system.domain.Gb15;
import com.zzhy.system.service.IGb15Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 院校专业修改信息Controller
 * 
 * @author zzhy
 * @date 2021-12-22
 */
@RestController
@RequestMapping("/system/gb15")
public class Gb15Controller extends BaseController
{
    @Autowired
    private IGb15Service gb15Service;

    /**
     * 查询院校专业修改信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb15:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gb15 gb15)
    {
        startPage();
        List<Gb15> list = gb15Service.selectGb15List(gb15);
        return getDataTable(list);
    }

    /**
     * 导出院校专业修改信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gb15:export')")
    @Log(title = "院校专业修改信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gb15 gb15)
    {
        List<Gb15> list = gb15Service.selectGb15List(gb15);
        ExcelUtil<Gb15> util = new ExcelUtil<Gb15>(Gb15.class);
        return util.exportExcel(list, "院校专业修改信息数据");
    }

    /**
     * 获取院校专业修改信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb15:query')")
    @GetMapping(value = "/{age879}")
    public AjaxResult getInfo(@PathVariable("age879") String age879)
    {
        return AjaxResult.success(gb15Service.selectGb15ByAge879(age879));
    }

    /**
     * 新增院校专业修改信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb15:add')")
    @Log(title = "院校专业修改信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gb15 gb15)
    {
        return toAjax(gb15Service.insertGb15(gb15));
    }

    /**
     * 修改院校专业修改信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb15:edit')")
    @Log(title = "院校专业修改信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gb15 gb15)
    {
        return toAjax(gb15Service.updateGb15(gb15));
    }

    /**
     * 删除院校专业修改信息
     */
    @PreAuthorize("@ss.hasPermi('system:gb15:remove')")
    @Log(title = "院校专业修改信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{age879s}")
    public AjaxResult remove(@PathVariable String[] age879s)
    {
        return toAjax(gb15Service.deleteGb15ByAge879s(age879s));
    }
}
