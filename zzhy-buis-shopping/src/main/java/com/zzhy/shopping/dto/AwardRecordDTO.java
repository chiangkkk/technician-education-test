package com.zzhy.shopping.dto;

import com.zzhy.shopping.domain.NideshopUser;
import com.zzhy.shopping.domain.WxUserAwardRecord;
import lombok.Data;

/**
 * @author ChiangKai
 * @date 2022/9/7 17:28
 */
@Data
public class AwardRecordDTO extends WxUserAwardRecord {
    private NideshopUser user;
}
