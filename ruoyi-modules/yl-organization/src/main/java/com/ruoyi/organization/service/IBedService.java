package com.ruoyi.organization.service;

import java.util.List;
import com.ruoyi.organization.domain.Bed;

/**
 * 床位Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IBedService 
{
    /**
     * 查询床位
     * 
     * @param bedId 床位主键
     * @return 床位
     */
    public Bed selectBedByBedId(Long bedId);

    /**
     * 查询床位列表
     * 
     * @param bed 床位
     * @return 床位集合
     */
    public List<Bed> selectBedList(Bed bed);

    /**
     * 新增床位
     * 
     * @param bed 床位
     * @return 结果
     */
    public int insertBed(Bed bed);

    /**
     * 修改床位
     * 
     * @param bed 床位
     * @return 结果
     */
    public int updateBed(Bed bed);

    /**
     * 批量删除床位
     * 
     * @param bedIds 需要删除的床位主键集合
     * @return 结果
     */
    public int deleteBedByBedIds(Long[] bedIds);

    /**
     * 删除床位信息
     * 
     * @param bedId 床位主键
     * @return 结果
     */
    public int deleteBedByBedId(Long bedId);
}
