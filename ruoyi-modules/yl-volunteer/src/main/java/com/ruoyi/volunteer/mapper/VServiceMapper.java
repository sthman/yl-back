package com.ruoyi.volunteer.mapper;

import java.math.BigDecimal;
import java.util.List;
import com.ruoyi.volunteer.domain.VService;

/**
 * 积分服务Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface VServiceMapper 
{
    /**
     * 查询积分服务
     * 
     * @param vServiceId 积分服务主键
     * @return 积分服务
     */
    public VService selectVServiceByVServiceId(Long vServiceId);

    /**
     * 查询积分服务列表
     * 
     * @param vService 积分服务
     * @return 积分服务集合
     */
    public List<VService> selectVServiceList(VService vService);

    /**
     * 新增积分服务
     * 
     * @param vService 积分服务
     * @return 结果
     */
    public int insertVService(VService vService);

    /**
     * 修改积分服务
     * 
     * @param vService 积分服务
     * @return 结果
     */
    public int updateVService(VService vService);

    /**
     * 删除积分服务
     * 
     * @param vServiceId 积分服务主键
     * @return 结果
     */
    public int deleteVServiceByVServiceId(Long vServiceId);

    /**
     * 批量删除积分服务
     * 
     * @param vServiceIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVServiceByVServiceIds(Long[] vServiceIds);


}
