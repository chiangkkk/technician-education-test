package com.zzhy.system.service;

import java.util.List;
import com.zzhy.system.domain.Gb14;

/**
 * 空白毕业证领用信息Service接口
 * 
 * @author zzhy
 * @date 2021-12-21
 */
public interface IGb14Service 
{
    /**
     * 查询空白毕业证领用信息
     * 
     * @param age544 空白毕业证领用信息主键
     * @return 空白毕业证领用信息
     */
    public Gb14 selectGb14ByAge544(String age544);

    /**
     * 查询空白毕业证领用信息列表
     * 
     * @param gb14 空白毕业证领用信息
     * @return 空白毕业证领用信息集合
     */
    public List<Gb14> selectGb14List(Gb14 gb14);

    /**
     * 新增空白毕业证领用信息
     * 
     * @param gb14 空白毕业证领用信息
     * @return 结果
     */
    public int insertGb14(Gb14 gb14);

    /**
     * 修改空白毕业证领用信息
     * 
     * @param gb14 空白毕业证领用信息
     * @return 结果
     */
    public int updateGb14(Gb14 gb14);

    /**
     * 批量删除空白毕业证领用信息
     * 
     * @param age544s 需要删除的空白毕业证领用信息主键集合
     * @return 结果
     */
    public int deleteGb14ByAge544s(String[] age544s);

    /**
     * 删除空白毕业证领用信息信息
     * 
     * @param age544 空白毕业证领用信息主键
     * @return 结果
     */
    public int deleteGb14ByAge544(String age544);
}
