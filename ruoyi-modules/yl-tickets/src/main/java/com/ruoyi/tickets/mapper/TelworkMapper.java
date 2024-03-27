package com.ruoyi.tickets.mapper;

import java.util.List;
import com.ruoyi.tickets.domain.Telwork;

/**
 * 话务工单Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface TelworkMapper 
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
     * 删除话务工单
     * 
     * @param telworkId 话务工单主键
     * @return 结果
     */
    public int deleteTelworkByTelworkId(Long telworkId);

    /**
     * 批量删除话务工单
     * 
     * @param telworkIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTelworkByTelworkIds(Long[] telworkIds);
}
