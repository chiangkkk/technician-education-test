package com.zzhy.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.zzhy.system.domain.Gc51;
import com.zzhy.system.service.IGc51Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

/**
 * 学籍信息Controller
 * 
 * @author zzhy
 * @date 2022-05-30
 */
@RestController
@RequestMapping("/system/gc51")
public class Gc51Controller extends BaseController
{
    @Autowired
    private IGc51Service gc51Service;

    /**
     * 查询学籍信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc51:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gc51 gc51)
    {
        startPage();
        List<Gc51> list = gc51Service.selectGc51List(gc51);
        return getDataTable(list);
    }

    /**
     * 导出学籍信息列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc51:export')")
    @Log(title = "学籍信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Gc51 gc51)
    {
        List<Gc51> list = gc51Service.selectGc51List(gc51);
        ExcelUtil<Gc51> util = new ExcelUtil<Gc51>(Gc51.class);
        util.exportExcel(response, list, "学籍信息数据");
    }

    /**
     * 获取学籍信息详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc51:query')")
    @GetMapping(value = "/{agc156}")
    public AjaxResult getInfo(@PathVariable("agc156") String agc156)
    {
        return AjaxResult.success(gc51Service.selectGc51ByAgc156(agc156));
    }

    /**
     * 新增学籍信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc51:add')")
    @Log(title = "学籍信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gc51 gc51)
    {
        return toAjax(gc51Service.insertGc51(gc51));
    }

    /**
     * 修改学籍信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc51:edit')")
    @Log(title = "学籍信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gc51 gc51)
    {
        return toAjax(gc51Service.updateGc51(gc51));
    }

    /**
     * 删除学籍信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc51:remove')")
    @Log(title = "学籍信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{agc156s}")
    public AjaxResult remove(@PathVariable String[] agc156s)
    {
        return toAjax(gc51Service.deleteGc51ByAgc156s(agc156s));
    }
}
