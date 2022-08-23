package com.zzhy.common.core.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 小程序表格分页数据对象
 *
 * @author ruoyi
 */
@Data
public class ApiTableDataInfo implements Serializable
{
    private static final long serialVersionUID = 1L;

    /** 总记录数 */
    private long total;

    /** 列表数据 */
    private List<?> rows;
}
