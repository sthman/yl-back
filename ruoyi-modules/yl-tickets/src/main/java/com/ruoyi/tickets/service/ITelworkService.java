package com.ruoyi.tickets.service;

import java.util.List;
import com.ruoyi.tickets.domain.Telwork;

/**
 * 话务工单Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface ITelworkService 
{
    /**
     * 查询话务工单
     * 
     * @param telworkId 话务工单主键
     * @return 话务工单
     */
    public Telwork selectTelworkByTelworkId(Long telworkId);

    /**
     * 查询话务工单列表
     * 
     * @param telwork 话务工单
     * @return 话务工单集合
     */
    public List<Telwork> selectTelworkList(Telwork telwork);

    /**
     * 新增话务工单
     * 
     * @param telwork 话务工单
     * @return 结果
     */
    public int insertTelwork(Telwork telwork);

    /**
     * 修改话务工单
     * 
     * @param telwork 话务工单
     * @return 结果
     */
    public int updateTelwork(Telwork telwork);

    /**
     * 批量删除话务工单
     * 
     * @param telworkIds 需要删除的话务工单主键集合
     * @return 结果
     */
    public int deleteTelworkByTelworkIds(Long[] telworkIds);

    /**
     * 删除话务工单信息
     * 
     * @param telworkId 话务工单主键
     * @return 结果
     */
    public int deleteTelworkByTelworkId(Long telworkId);
}
