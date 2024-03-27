package com.ruoyi.volunteer.mapper;

import java.util.List;
import com.ruoyi.volunteer.domain.PointsUsageRecord;

/**
 * 积分使用记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface PointsUsageRecordMapper 
{
    /**
     * 查询积分使用记录
     * 
     * @param recordId 积分使用记录主键
     * @return 积分使用记录
     */
    public PointsUsageRecord selectPointsUsageRecordByRecordId(Long recordId);

    /**
     * 查询积分使用记录列表
     * 
     * @param pointsUsageRecord 积分使用记录
     * @return 积分使用记录集合
     */
    public List<PointsUsageRecord> selectPointsUsageRecordList(PointsUsageRecord pointsUsageRecord);

    /**
     * 新增积分使用记录
     * 
     * @param pointsUsageRecord 积分使用记录
     * @return 结果
     */
    public int insertPointsUsageRecord(PointsUsageRecord pointsUsageRecord);

    /**
     * 修改积分使用记录
     * 
     * @param pointsUsageRecord 积分使用记录
     * @return 结果
     */
    public int updatePointsUsageRecord(PointsUsageRecord pointsUsageRecord);

    /**
     * 删除积分使用记录
     * 
     * @param recordId 积分使用记录主键
     * @return 结果
     */
    public int deletePointsUsageRecordByRecordId(Long recordId);

    /**
     * 批量删除积分使用记录
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePointsUsageRecordByRecordIds(Long[] recordIds);
}
