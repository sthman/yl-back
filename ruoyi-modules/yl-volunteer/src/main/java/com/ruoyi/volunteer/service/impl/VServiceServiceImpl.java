package com.ruoyi.volunteer.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ruoyi.volunteer.domain.PointsUsageRecord;
import com.ruoyi.volunteer.service.IPointsUsageRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.volunteer.mapper.VServiceMapper;
import com.ruoyi.volunteer.domain.VService;
import com.ruoyi.volunteer.service.IVServiceService;

/**
 * 积分服务Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class VServiceServiceImpl implements IVServiceService 
{
    @Autowired
    private VServiceMapper vServiceMapper;
    @Autowired
    private IPointsUsageRecordService iPointsUsageRecordService;

    /**
     * 查询积分服务
     * 
     * @param vServiceId 积分服务主键
     * @return 积分服务
     */
    @Override
    public VService selectVServiceByVServiceId(Long vServiceId)
    {
        return vServiceMapper.selectVServiceByVServiceId(vServiceId);
    }

    /**
     * 查询积分服务列表
     * 
     * @param vService 积分服务
     * @return 积分服务
     */
    @Override
    public List<VService> selectVServiceList(VService vService)
    {
        return vServiceMapper.selectVServiceList(vService);
    }

    /**
     * 新增积分服务
     * 
     * @param vService 积分服务
     * @return 结果
     */
    @Override
    public int insertVService(VService vService)
    {
        return vServiceMapper.insertVService(vService);
    }

    /**
     * 修改积分服务
     * 
     * @param vService 积分服务
     * @return 结果
     */
    @Override
    public int updateVService(VService vService)
    {
        return vServiceMapper.updateVService(vService);
    }

    /**
     * 批量删除积分服务
     * 
     * @param vServiceIds 需要删除的积分服务主键
     * @return 结果
     */
    @Override
    public int deleteVServiceByVServiceIds(Long[] vServiceIds)
    {
        return vServiceMapper.deleteVServiceByVServiceIds(vServiceIds);
    }

    /**
     * 删除积分服务信息
     * 
     * @param vServiceId 积分服务主键
     * @return 结果
     */
    @Override
    public int deleteVServiceByVServiceId(Long vServiceId)
    {
        return vServiceMapper.deleteVServiceByVServiceId(vServiceId);
    }

    //购买积分服务
    @Override
    public int buyVservice(PointsUsageRecord pointsUsageRecord) {
        pointsUsageRecord.setUsageTime(new Date());
        return iPointsUsageRecordService.insertPointsUsageRecord(pointsUsageRecord);
    }
}
