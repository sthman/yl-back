package com.ruoyi.health.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.health.mapper.ReserviceMapper;
import com.ruoyi.health.domain.Reservice;
import com.ruoyi.health.service.IReserviceService;

/**
 * 定期服务Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class ReserviceServiceImpl implements IReserviceService 
{
    @Autowired
    private ReserviceMapper reserviceMapper;

    /**
     * 查询定期服务
     * 
     * @param reserviceId 定期服务主键
     * @return 定期服务
     */
    @Override
    public Reservice selectReserviceByReserviceId(Long reserviceId)
    {
        return reserviceMapper.selectReserviceByReserviceId(reserviceId);
    }

    /**
     * 查询定期服务列表
     * 
     * @param reservice 定期服务
     * @return 定期服务
     */
    @Override
    public List<Reservice> selectReserviceList(Reservice reservice)
    {
        return reserviceMapper.selectReserviceList(reservice);
    }

    /**
     * 新增定期服务
     * 
     * @param reservice 定期服务
     * @return 结果
     */
    @Override
    public int insertReservice(Reservice reservice)
    {
        return reserviceMapper.insertReservice(reservice);
    }

    /**
     * 修改定期服务
     * 
     * @param reservice 定期服务
     * @return 结果
     */
    @Override
    public int updateReservice(Reservice reservice)
    {
        return reserviceMapper.updateReservice(reservice);
    }

    /**
     * 批量删除定期服务
     * 
     * @param reserviceIds 需要删除的定期服务主键
     * @return 结果
     */
    @Override
    public int deleteReserviceByReserviceIds(Long[] reserviceIds)
    {
        return reserviceMapper.deleteReserviceByReserviceIds(reserviceIds);
    }

    /**
     * 删除定期服务信息
     * 
     * @param reserviceId 定期服务主键
     * @return 结果
     */
    @Override
    public int deleteReserviceByReserviceId(Long reserviceId)
    {
        return reserviceMapper.deleteReserviceByReserviceId(reserviceId);
    }
}
