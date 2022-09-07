package com.zzhy.shopping.controller;

import com.zzhy.common.annotation.Log;
import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.common.enums.BusinessType;
import com.zzhy.common.utils.poi.ExcelUtil;
import com.zzhy.shopping.domain.TurntableDraw;
import com.zzhy.shopping.service.ITurntableDrawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 转盘抽奖详情Controller
 * 
 * @author zzhy
 * @date 2022-09-05
 */
@RestController
@RequestMapping("/shopping/draw")
public class TurntableDrawController extends BaseController
{
    @Autowired
    private ITurntableDrawService turntableDrawService;


    /**
     *
     * 获取对应配置轮盘的列表
     * @param tid 抽奖配置ID
     * @return
     */
    @GetMapping("/list/{tid}")
    public AjaxResult getDrawList(@PathVariable Long tid){
        return AjaxResult.success(turntableDrawService.getByTurnTableConfigId(tid));
    }

    /**
     * 查询转盘抽奖列表
     */
    @PreAuthorize("@ss.hasPermi('shopping:draw:list')")
    @GetMapping("/list")
    public TableDataInfo list(TurntableDraw turntableDraw)
    {
        startPage();
        List<TurntableDraw> list = turntableDrawService.selectTurntableDrawList(turntableDraw);
        return getDataTable(list);
    }

    /**
     * 导出转盘抽奖列表
     */
    @PreAuthorize("@ss.hasPermi('shopping:draw:export')")
    @Log(title = "转盘抽奖", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TurntableDraw turntableDraw)
    {
        List<TurntableDraw> list = turntableDrawService.selectTurntableDrawList(turntableDraw);
        ExcelUtil<TurntableDraw> util = new ExcelUtil<TurntableDraw>(TurntableDraw.class);
        util.exportExcel(response, list, "转盘抽奖数据");
    }

    /**
     * 获取转盘抽奖详细信息
     */
    @PreAuthorize("@ss.hasPermi('shopping:draw:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return AjaxResult.success(turntableDrawService.getInfo(id));
    }

    /**
     * 新增转盘抽奖
     */
    @PreAuthorize("@ss.hasPermi('shopping:draw:add')")
    @Log(title = "转盘抽奖", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TurntableDraw turntableDraw)
    {
        return toAjax(turntableDrawService.insertTurntableDraw(turntableDraw));
    }

    /**
     * 修改转盘抽奖
     */
    @PreAuthorize("@ss.hasPermi('shopping:draw:edit')")
    @Log(title = "转盘抽奖", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TurntableDraw turntableDraw)
    {
        return toAjax(turntableDrawService.updateTurntableDraw(turntableDraw));
    }

    /**
     * 删除转盘抽奖
     */
    @PreAuthorize("@ss.hasPermi('shopping:draw:remove')")
    @Log(title = "转盘抽奖", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(turntableDrawService.deleteTurntableDrawByIds(ids));
    }

    @Log(title = "转盘抽奖状态修改", businessType = BusinessType.UPDATE)
    @GetMapping("/changeStatus/{id}")
    public AjaxResult changeStatus(@PathVariable Long id){
        return toAjax(turntableDrawService.changeStatus(id));
    }


}
