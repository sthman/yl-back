package com.ruoyi.storehouse.mapper;

import java.util.List;
import com.ruoyi.storehouse.domain.FacilityUsageRecord;

/**
 * 设施使用记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface FacilityUsageRecordMapper 
{
    /**
     * 查询设施使用记录
     * 
     * @param recordId 设施使用记录主键
     * @return 设施使用记录
     */
    public FacilityUsageRecord selectFacilityUsageRecordByRecordId(Long recordId);

    /**
     * 查询设施使用记录列表
     * 
     * @param facilityUsageRecord 设施使用记录
     * @return 设施使用记录集合
     */
    public List<FacilityUsageRecord> selectFacilityUsageRecordList(FacilityUsageRecord facilityUsageRecord);

    /**
     * 新增设施使用记录
     * 
     * @param facilityUsageRecord 设施使用记录
     * @return 结果
     */
    public int insertFacilityUsageRecord(FacilityUsageRecord facilityUsageRecord);

    /**
     * 修改设施使用记录
     * 
     * @param facilityUsageRecord 设施使用记录
     * @return 结果
     */
    public int updateFacilityUsageRecord(FacilityUsageRecord facilityUsageRecord);

    /**
     * 删除设施使用记录
     * 
     * @param recordId 设施使用记录主键
     * @return 结果
     */
    public int deleteFacilityUsageRecordByRecordId(Long recordId);

    /**
     * 批量删除设施使用记录
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFacilityUsageRecordByRecordIds(Long[] recordIds);
}
