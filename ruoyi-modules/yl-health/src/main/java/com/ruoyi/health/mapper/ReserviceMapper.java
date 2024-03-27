package com.ruoyi.health.mapper;

import java.util.List;
import com.ruoyi.health.domain.Reservice;

/**
 * 定期服务Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface ReserviceMapper 
{
    /**
     * 查询定期服务
     * 
     * @param reserviceId 定期服务主键
     * @return 定期服务
     */
    public Reservice selectReserviceByReserviceId(Long reserviceId);

    /**
     * 查询定期服务列表
     * 
     * @param reservice 定期服务
     * @return 定期服务集合
     */
    public List<Reservice> selectReserviceList(Reservice reservice);

    /**
     * 新增定期服务
     * 
     * @param reservice 定期服务
     * @return 结果
     */
    public int insertReservice(Reservice reservice);

    /**
     * 修改定期服务
     * 
     * @param reservice 定期服务
     * @return 结果
     */
    public int updateReservice(Reservice reservice);

    /**
     * 删除定期服务
     * 
     * @param reserviceId 定期服务主键
     * @return 结果
     */
    public int deleteReserviceByReserviceId(Long reserviceId);

    /**
     * 批量删除定期服务
     * 
     * @param reserviceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteReserviceByReserviceIds(Long[] reserviceIds);
}
