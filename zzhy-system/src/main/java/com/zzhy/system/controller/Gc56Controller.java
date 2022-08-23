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
import com.zzhy.system.domain.Gc56;
import com.zzhy.system.service.IGc56Service;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 职业资格证书Controller
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@RestController
@RequestMapping("/system/gc56")
public class Gc56Controller extends BaseController
{
    @Autowired
    private IGc56Service gc56Service;

    /**
     * 查询职业资格证书列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc56:list')")
    @GetMapping("/list")
    public TableDataInfo list(Gc56 gc56)
    {
        startPage();
        List<Gc56> list = gc56Service.selectGc56List(gc56);
        return getDataTable(list);
    }

    /**
     * 导出职业资格证书列表
     */
    @PreAuthorize("@ss.hasPermi('system:gc56:export')")
    @Log(title = "职业资格证书", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, Gc56 gc56)
    {
        List<Gc56> list = gc56Service.selectGc56List(gc56);
        ExcelUtil<Gc56> util = new ExcelUtil<Gc56>(Gc56.class);
        return util.exportExcel(list, "职业资格证书数据");
    }

    /**
     * 获取职业资格证书详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:gc56:query')")
    @GetMapping(value = "/{agc163}")
    public AjaxResult getInfo(@PathVariable("agc163") String agc163)
    {
        return AjaxResult.success(gc56Service.selectGc56ByAgc163(agc163));
    }

    /**
     * 新增职业资格证书
     */
    @PreAuthorize("@ss.hasPermi('system:gc56:add')")
    @Log(title = "职业资格证书", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Gc56 gc56)
    {
        return toAjax(gc56Service.insertGc56(gc56));
    }

    /**
     * 修改职业资格证书
     */
    @PreAuthorize("@ss.hasPermi('system:gc56:edit')")
    @Log(title = "职业资格证书", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Gc56 gc56)
    {
        return toAjax(gc56Service.updateGc56(gc56));
    }

    /**
     * 删除职业资格证书
     */
    @PreAuthorize("@ss.hasPermi('system:gc56:remove')")
    @Log(title = "职业资格证书", businessType = BusinessType.DELETE)
	@DeleteMapping("/{agc163s}")
    public AjaxResult remove(@PathVariable String[] agc163s)
    {
        return toAjax(gc56Service.deleteGc56ByAgc163s(agc163s));
    }
}
