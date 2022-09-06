package com.zzhy.shopping.dto;

import com.zzhy.shopping.domain.TurntableDraw;
import com.zzhy.shopping.domain.WxGoods;
import com.zzhy.shopping.domain.WxSku;
import lombok.Data;

/**
 * @author ChiangKai
 * @date 2022/9/6 16:35
 */
@Data
public class DrawDTO extends TurntableDraw {
    WxGoods wxGoods;
    WxSku wxSku;
}
