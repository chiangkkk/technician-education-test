package com.zzhy.shopping.controller;

import com.zzhy.common.core.controller.BaseController;
import com.zzhy.common.core.domain.AjaxResult;
import com.zzhy.common.core.page.TableDataInfo;
import com.zzhy.shopping.domain.WxUserAwardRecord;
import com.zzhy.shopping.dto.AwardRecordDTO;
import com.zzhy.shopping.service.WxUserAwardRecordService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ChiangKai
 * @date 2022/9/7 17:19
 */
@RestController
@AllArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/shopping/award/record")
public class AwardRecordController extends BaseController {


    private final WxUserAwardRecordService wxUserAwardRecordService;

    @GetMapping("/list")
    public TableDataInfo list(WxUserAwardRecord record){
        startPage();
        List<AwardRecordDTO> list =wxUserAwardRecordService.getAwardList(record);
        return getDataTable(list);
    }


    /**
     * 删除中奖记录
     */
    @DeleteMapping("/{id}")
    public AjaxResult delete(@PathVariable Long id) {
        return AjaxResult.success(wxUserAwardRecordService.delete(id));
    }

    /**
     * 更新中奖记录
     */
    @PutMapping
    public AjaxResult update(@RequestBody WxUserAwardRecord record){
        return AjaxResult.success(wxUserAwardRecordService.updateByPrimaryKey(record));
    }
}
