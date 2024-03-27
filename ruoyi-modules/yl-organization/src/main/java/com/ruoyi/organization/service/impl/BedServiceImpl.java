package com.ruoyi.organization.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.organization.mapper.BedMapper;
import com.ruoyi.organization.domain.Bed;
import com.ruoyi.organization.service.IBedService;

/**
 * 床位Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class BedServiceImpl implements IBedService 
{
    @Autowired
    private BedMapper bedMapper;

    /**
     * 查询床位
     * 
     * @param bedId 床位主键
     * @return 床位
     */
    @Override
    public Bed selectBedByBedId(Long bedId)
    {
        return bedMapper.selectBedByBedId(bedId);
    }

    /**
     * 查询床位列表
     * 
     * @param bed 床位
     * @return 床位
     */
    @Override
    public List<Bed> selectBedList(Bed bed)
    {
        return bedMapper.selectBedList(bed);
    }

    /**
     * 新增床位
     * 
     * @param bed 床位
     * @return 结果
     */
    @Override
    public int insertBed(Bed bed)
    {
        return bedMapper.insertBed(bed);
    }

    /**
     * 修改床位
     * 
     * @param bed 床位
     * @return 结果
     */
    @Override
    public int updateBed(Bed bed)
    {
        return bedMapper.updateBed(bed);
    }

    /**
     * 批量删除床位
     * 
     * @param bedIds 需要删除的床位主键
     * @return 结果
     */
    @Override
    public int deleteBedByBedIds(Long[] bedIds)
    {
        return bedMapper.deleteBedByBedIds(bedIds);
    }

    /**
     * 删除床位信息
     * 
     * @param bedId 床位主键
     * @return 结果
     */
    @Override
    public int deleteBedByBedId(Long bedId)
    {
        return bedMapper.deleteBedByBedId(bedId);
    }
}
