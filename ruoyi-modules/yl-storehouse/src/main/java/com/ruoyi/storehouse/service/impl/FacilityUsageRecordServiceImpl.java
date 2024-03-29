package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.FacilityUsageRecordMapper;
import com.ruoyi.storehouse.domain.FacilityUsageRecord;
import com.ruoyi.storehouse.service.IFacilityUsageRecordService;

/**
 * 设施使用记录Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@Service
public class FacilityUsageRecordServiceImpl implements IFacilityUsageRecordService
{
    @Autowired
    private FacilityUsageRecordMapper facilityUsageRecordMapper;

    /**
     * 查询设施使用记录
     *
     * @param recordId 设施使用记录主键
     * @return 设施使用记录
     */
    @Override
    public FacilityUsageRecord selectFacilityUsageRecordByRecordId(Long recordId)
    {
        return facilityUsageRecordMapper.selectFacilityUsageRecordByRecordId(recordId);
    }

    /**
     * 查询设施使用记录列表
     *
     * @param facilityUsageRecord 设施使用记录
     * @return 设施使用记录
     */
    @Override
    public List<FacilityUsageRecord> selectFacilityUsageRecordList(FacilityUsageRecord facilityUsageRecord)
    {
        return facilityUsageRecordMapper.selectFacilityUsageRecordList(facilityUsageRecord);
    }

    /**
     * 新增设施使用记录
     *
     * @param facilityUsageRecord 设施使用记录
     * @return 结果
     */
    @Override
    public int insertFacilityUsageRecord(FacilityUsageRecord facilityUsageRecord)
    {
        return facilityUsageRecordMapper.insertFacilityUsageRecord(facilityUsageRecord);
    }

    /**
     * 修改设施使用记录
     *
     * @param facilityUsageRecord 设施使用记录
     * @return 结果
     */
    @Override
    public int updateFacilityUsageRecord(FacilityUsageRecord facilityUsageRecord)
    {
        return facilityUsageRecordMapper.updateFacilityUsageRecord(facilityUsageRecord);
    }

    /**
     * 批量删除设施使用记录
     *
     * @param recordIds 需要删除的设施使用记录主键
     * @return 结果
     */
    @Override
    public int deleteFacilityUsageRecordByRecordIds(Long[] recordIds)
    {
        return facilityUsageRecordMapper.deleteFacilityUsageRecordByRecordIds(recordIds);
    }

    /**
     * 删除设施使用记录信息
     *
     * @param recordId 设施使用记录主键
     * @return 结果
     */
    @Override
    public int deleteFacilityUsageRecordByRecordId(Long recordId)
    {
        return facilityUsageRecordMapper.deleteFacilityUsageRecordByRecordId(recordId);
    }
}
