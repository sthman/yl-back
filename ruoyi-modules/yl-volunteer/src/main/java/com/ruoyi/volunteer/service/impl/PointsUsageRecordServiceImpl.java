package com.ruoyi.volunteer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.volunteer.mapper.PointsUsageRecordMapper;
import com.ruoyi.volunteer.domain.PointsUsageRecord;
import com.ruoyi.volunteer.service.IPointsUsageRecordService;

/**
 * 积分使用记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class PointsUsageRecordServiceImpl implements IPointsUsageRecordService 
{
    @Autowired
    private PointsUsageRecordMapper pointsUsageRecordMapper;

    /**
     * 查询积分使用记录
     * 
     * @param recordId 积分使用记录主键
     * @return 积分使用记录
     */
    @Override
    public PointsUsageRecord selectPointsUsageRecordByRecordId(Long recordId)
    {
        return pointsUsageRecordMapper.selectPointsUsageRecordByRecordId(recordId);
    }

    /**
     * 查询积分使用记录列表
     * 
     * @param pointsUsageRecord 积分使用记录
     * @return 积分使用记录
     */
    @Override
    public List<PointsUsageRecord> selectPointsUsageRecordList(PointsUsageRecord pointsUsageRecord)
    {
        return pointsUsageRecordMapper.selectPointsUsageRecordList(pointsUsageRecord);
    }

    /**
     * 新增积分使用记录
     * 
     * @param pointsUsageRecord 积分使用记录
     * @return 结果
     */
    @Override
    public int insertPointsUsageRecord(PointsUsageRecord pointsUsageRecord)
    {
        return pointsUsageRecordMapper.insertPointsUsageRecord(pointsUsageRecord);
    }

    /**
     * 修改积分使用记录
     * 
     * @param pointsUsageRecord 积分使用记录
     * @return 结果
     */
    @Override
    public int updatePointsUsageRecord(PointsUsageRecord pointsUsageRecord)
    {
        return pointsUsageRecordMapper.updatePointsUsageRecord(pointsUsageRecord);
    }

    /**
     * 批量删除积分使用记录
     * 
     * @param recordIds 需要删除的积分使用记录主键
     * @return 结果
     */
    @Override
    public int deletePointsUsageRecordByRecordIds(Long[] recordIds)
    {
        return pointsUsageRecordMapper.deletePointsUsageRecordByRecordIds(recordIds);
    }

    /**
     * 删除积分使用记录信息
     * 
     * @param recordId 积分使用记录主键
     * @return 结果
     */
    @Override
    public int deletePointsUsageRecordByRecordId(Long recordId)
    {
        return pointsUsageRecordMapper.deletePointsUsageRecordByRecordId(recordId);
    }
}
