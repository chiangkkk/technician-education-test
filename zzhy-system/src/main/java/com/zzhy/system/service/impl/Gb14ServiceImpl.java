package com.zzhy.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zzhy.system.mapper.Gb14Mapper;
import com.zzhy.system.domain.Gb14;
import com.zzhy.system.service.IGb14Service;

/**
 * 空白毕业证领用信息Service业务层处理
 * 
 * @author zzhy
 * @date 2021-12-21
 */
@Service
public class Gb14ServiceImpl implements IGb14Service 
{
    @Autowired
    private Gb14Mapper gb14Mapper;

    /**
     * 查询空白毕业证领用信息
     * 
     * @param age544 空白毕业证领用信息主键
     * @return 空白毕业证领用信息
     */
    @Override
    public Gb14 selectGb14ByAge544(String age544)
    {
        return gb14Mapper.selectGb14ByAge544(age544);
    }

    /**
     * 查询空白毕业证领用信息列表
     * 
     * @param gb14 空白毕业证领用信息
     * @return 空白毕业证领用信息
     */
    @Override
    public List<Gb14> selectGb14List(Gb14 gb14)
    {
        return gb14Mapper.selectGb14List(gb14);
    }

    /**
     * 新增空白毕业证领用信息
     * 
     * @param gb14 空白毕业证领用信息
     * @return 结果
     */
    @Override
    public int insertGb14(Gb14 gb14)
    {
        return gb14Mapper.insertGb14(gb14);
    }

    /**
     * 修改空白毕业证领用信息
     * 
     * @param gb14 空白毕业证领用信息
     * @return 结果
     */
    @Override
    public int updateGb14(Gb14 gb14)
    {
        return gb14Mapper.updateGb14(gb14);
    }

    /**
     * 批量删除空白毕业证领用信息
     * 
     * @param age544s 需要删除的空白毕业证领用信息主键
     * @return 结果
     */
    @Override
    public int deleteGb14ByAge544s(String[] age544s)
    {
        return gb14Mapper.deleteGb14ByAge544s(age544s);
    }

    /**
     * 删除空白毕业证领用信息信息
     * 
     * @param age544 空白毕业证领用信息主键
     * @return 结果
     */
    @Override
    public int deleteGb14ByAge544(String age544)
    {
        return gb14Mapper.deleteGb14ByAge544(age544);
    }
}
