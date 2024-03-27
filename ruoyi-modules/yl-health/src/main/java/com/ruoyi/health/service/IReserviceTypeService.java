package com.ruoyi.health.service;

import java.util.List;
import com.ruoyi.health.domain.ReserviceType;

/**
 * 服务类型Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IReserviceTypeService 
{
    /**
     * 查询服务类型
     * 
     * @param reserviceTypeId 服务类型主键
     * @return 服务类型
     */
    public ReserviceType selectReserviceTypeByReserviceTypeId(Long reserviceTypeId);

    /**
     * 查询服务类型列表
     * 
     * @param reserviceType 服务类型
     * @return 服务类型集合
     */
    public List<ReserviceType> selectReserviceTypeList(ReserviceType reserviceType);

    /**
     * 新增服务类型
     * 
     * @param reserviceType 服务类型
     * @return 结果
     */
    public int insertReserviceType(ReserviceType reserviceType);

    /**
     * 修改服务类型
     * 
     * @param reserviceType 服务类型
     * @return 结果
     */
    public int updateReserviceType(ReserviceType reserviceType);

    /**
     * 批量删除服务类型
     * 
     * @param reserviceTypeIds 需要删除的服务类型主键集合
     * @return 结果
     */
    public int deleteReserviceTypeByReserviceTypeIds(Long[] reserviceTypeIds);

    /**
     * 删除服务类型信息
     * 
     * @param reserviceTypeId 服务类型主键
     * @return 结果
     */
    public int deleteReserviceTypeByReserviceTypeId(Long reserviceTypeId);
}
