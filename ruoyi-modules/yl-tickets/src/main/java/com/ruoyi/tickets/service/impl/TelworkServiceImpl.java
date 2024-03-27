package com.ruoyi.tickets.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tickets.mapper.TelworkMapper;
import com.ruoyi.tickets.domain.Telwork;
import com.ruoyi.tickets.service.ITelworkService;

/**
 * 话务工单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class TelworkServiceImpl implements ITelworkService 
{
    @Autowired
    private TelworkMapper telworkMapper;

    /**
     * 查询话务工单
     * 
     * @param telworkId 话务工单主键
     * @return 话务工单
     */
    @Override
    public Telwork selectTelworkByTelworkId(Long telworkId)
    {
        return telworkMapper.selectTelworkByTelworkId(telworkId);
    }

    /**
     * 查询话务工单列表
     * 
     * @param telwork 话务工单
     * @return 话务工单
     */
    @Override
    public List<Telwork> selectTelworkList(Telwork telwork)
    {
        return telworkMapper.selectTelworkList(telwork);
    }

    /**
     * 新增话务工单
     * 
     * @param telwork 话务工单
     * @return 结果
     */
    @Override
    public int insertTelwork(Telwork telwork)
    {
        return telworkMapper.insertTelwork(telwork);
    }

    /**
     * 修改话务工单
     * 
     * @param telwork 话务工单
     * @return 结果
     */
    @Override
    public int updateTelwork(Telwork telwork)
    {
        return telworkMapper.updateTelwork(telwork);
    }

    /**
     * 批量删除话务工单
     * 
     * @param telworkIds 需要删除的话务工单主键
     * @return 结果
     */
    @Override
    public int deleteTelworkByTelworkIds(Long[] telworkIds)
    {
        return telworkMapper.deleteTelworkByTelworkIds(telworkIds);
    }

    /**
     * 删除话务工单信息
     * 
     * @param telworkId 话务工单主键
     * @return 结果
     */
    @Override
    public int deleteTelworkByTelworkId(Long telworkId)
    {
        return telworkMapper.deleteTelworkByTelworkId(telworkId);
    }
}
