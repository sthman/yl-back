package com.ruoyi.health.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.health.mapper.ReserviceTypeMapper;
import com.ruoyi.health.domain.ReserviceType;
import com.ruoyi.health.service.IReserviceTypeService;

/**
 * 服务类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class ReserviceTypeServiceImpl implements IReserviceTypeService 
{
    @Autowired
    private ReserviceTypeMapper reserviceTypeMapper;

    /**
     * 查询服务类型
     * 
     * @param reserviceTypeId 服务类型主键
     * @return 服务类型
     */
    @Override
    public ReserviceType selectReserviceTypeByReserviceTypeId(Long reserviceTypeId)
    {
        return reserviceTypeMapper.selectReserviceTypeByReserviceTypeId(reserviceTypeId);
    }

    /**
     * 查询服务类型列表
     * 
     * @param reserviceType 服务类型
     * @return 服务类型
     */
    @Override
    public List<ReserviceType> selectReserviceTypeList(ReserviceType reserviceType)
    {
        return reserviceTypeMapper.selectReserviceTypeList(reserviceType);
    }

    /**
     * 新增服务类型
     * 
     * @param reserviceType 服务类型
     * @return 结果
     */
    @Override
    public int insertReserviceType(ReserviceType reserviceType)
    {
        return reserviceTypeMapper.insertReserviceType(reserviceType);
    }

    /**
     * 修改服务类型
     * 
     * @param reserviceType 服务类型
     * @return 结果
     */
    @Override
    public int updateReserviceType(ReserviceType reserviceType)
    {
        return reserviceTypeMapper.updateReserviceType(reserviceType);
    }

    /**
     * 批量删除服务类型
     * 
     * @param reserviceTypeIds 需要删除的服务类型主键
     * @return 结果
     */
    @Override
    public int deleteReserviceTypeByReserviceTypeIds(Long[] reserviceTypeIds)
    {
        return reserviceTypeMapper.deleteReserviceTypeByReserviceTypeIds(reserviceTypeIds);
    }

    /**
     * 删除服务类型信息
     * 
     * @param reserviceTypeId 服务类型主键
     * @return 结果
     */
    @Override
    public int deleteReserviceTypeByReserviceTypeId(Long reserviceTypeId)
    {
        return reserviceTypeMapper.deleteReserviceTypeByReserviceTypeId(reserviceTypeId);
    }
}
