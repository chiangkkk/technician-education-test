package com.zzhy.shopping.controller;

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
import com.zzhy.shopping.domain.TurntableConfiguration;
import com.zzhy.shopping.service.ITurntableConfigurationService;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.common.core.page.TableDataInfo;

/**
 * 转盘配置Controller
 * 
 * @author zzhy
 * @date 2022-09-05
 */
@RestController
@RequestMapping("/shopping/turntable")
public class TurntableConfigurationController extends BaseController
{
    @Autowired
    private ITurntableConfigurationService turntableConfigurationService;

    /**
     * 查询转盘配置列表
     */
    @PreAuthorize("@ss.hasPermi('shopping:turntable:list')")
    @GetMapping("/list")
    public TableDataInfo list(TurntableConfiguration turntableConfiguration)
    {
        startPage();
        List<TurntableConfiguration> list = turntableConfigurationService.selectTurntableConfigurationList(turntableConfiguration);
        return getDataTable(list);
    }

    /**
     * 导出转盘配置列表
     */
    @PreAuthorize("@ss.hasPermi('shopping:turntable:export')")
    @Log(title = "转盘配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TurntableConfiguration turntableConfiguration)
    {
        List<TurntableConfiguration> list = turntableConfigurationService.selectTurntableConfigurationList(turntableConfiguration);
        ExcelUtil<TurntableConfiguration> util = new ExcelUtil<TurntableConfiguration>(TurntableConfiguration.class);
        util.exportExcel(response, list, "转盘配置数据");
    }

    /**
     * 获取转盘配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('shopping:turntable:query')")
    @GetMapping(value = "/{turntableId}")
    public AjaxResult getInfo(@PathVariable("turntableId") Long turntableId)
    {
        return AjaxResult.success(turntableConfigurationService.selectTurntableConfigurationByTurntableId(turntableId));
    }

    /**
     * 新增转盘配置
     */
    @PreAuthorize("@ss.hasPermi('shopping:turntable:add')")
    @Log(title = "转盘配置", businessType = BusinessType.INSERT)
    @PostMapping()
    public AjaxResult add(@RequestBody TurntableConfiguration turntableConfiguration)
    {
        return toAjax(turntableConfigurationService.insertTurntableConfiguration(turntableConfiguration));
    }

    /**
     * 修改转盘配置
     */
    @PreAuthorize("@ss.hasPermi('shopping:turntable:edit')")
    @Log(title = "转盘配置", businessType = BusinessType.UPDATE)
    @PutMapping()
    public AjaxResult edit(@RequestBody TurntableConfiguration turntableConfiguration)
    {
        return toAjax(turntableConfigurationService.updateTurntableConfiguration(turntableConfiguration));
    }

    /**
     * 删除转盘配置
     */
    @PreAuthorize("@ss.hasPermi('shopping:turntable:remove')")
    @Log(title = "转盘配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{turntableIds}")
    public AjaxResult remove(@PathVariable Long[] turntableIds)
    {
        return toAjax(turntableConfigurationService.deleteTurntableConfigurationByTurntableIds(turntableIds));
    }
}
