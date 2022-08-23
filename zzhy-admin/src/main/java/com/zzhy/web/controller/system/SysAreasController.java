package com.zzhy.web.controller.system;

import java.util.List;

import com.zzhy.common.core.domain.entity.SysAreas;
import com.zzhy.common.utils.poi.ExcelUtil;
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
import com.zzhy.system.service.ISysAreasService;
import com.zzhy.common.core.page.TableDataInfo;

import javax.servlet.http.HttpServletResponse;

/**
 * 区域Controller
 * 
 * @author ruoyi
 * @date 2021-10-27
 */
@RestController
@RequestMapping("/system/areas")
public class SysAreasController extends BaseController
{
    @Autowired
    private ISysAreasService sysAreasService;

    /**
     * 查询区域列表
     */
    @PreAuthorize("@ss.hasPermi('system:areas:list')")
    @GetMapping("/list")
    public TableDataInfo list(SysAreas sysAreas)
    {
        startPage();
        List<SysAreas> list = sysAreasService.selectSysAreasList(sysAreas);
        return getDataTable(list);
    }

    /**
     * 导出区域列表
     */
    @PreAuthorize("@ss.hasPermi('system:areas:export')")
    @Log(title = "区域", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public AjaxResult export(HttpServletResponse response, SysAreas sysAreas)
    {
        List<SysAreas> list = sysAreasService.selectSysAreasList(sysAreas);
        ExcelUtil<SysAreas> util = new ExcelUtil<SysAreas>(SysAreas.class);
        return util.exportExcel(list, "区域数据");
    }

    /**
     * 获取区域详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:areas:query')")
    @GetMapping(value = "/{areaId}")
    public AjaxResult getInfo(@PathVariable("areaId") Long areaId)
    {
        return AjaxResult.success(sysAreasService.selectSysAreasByAreaId(areaId));
    }

    /**
     * 新增区域
     */
    @PreAuthorize("@ss.hasPermi('system:areas:add')")
    @Log(title = "区域", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SysAreas sysAreas)
    {
        return toAjax(sysAreasService.insertSysAreas(sysAreas));
    }

    /**
     * 修改区域
     */
    @PreAuthorize("@ss.hasPermi('system:areas:edit')")
    @Log(title = "区域", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SysAreas sysAreas)
    {
        return toAjax(sysAreasService.updateSysAreas(sysAreas));
    }

    /**
     * 删除区域
     */
    @PreAuthorize("@ss.hasPermi('system:areas:remove')")
    @Log(title = "区域", businessType = BusinessType.DELETE)
	@DeleteMapping("/{areaIds}")
    public AjaxResult remove(@PathVariable Long[] areaIds)
    {
        return toAjax(sysAreasService.deleteSysAreasByAreaIds(areaIds));
    }


    /**
     * 获取区域树
     */
    @GetMapping(value = "/tree")
    public AjaxResult getAreaTree(SysAreas sysAreas)
    {
        List<SysAreas> sysAreasList = sysAreasService.selectSysAreasList(sysAreas);
        return AjaxResult.success(sysAreasService.findAreaTreeBysysAreas(sysAreasList));
    }
}
