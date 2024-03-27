package com.ruoyi.credit.mapper;

import java.util.List;
import com.ruoyi.credit.domain.Record;

/**
 * 机构信用记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface RecordMapper 
{
    /**
     * 查询机构信用记录
     * 
     * @param recordId 机构信用记录主键
     * @return 机构信用记录
     */
    public Record selectRecordByRecordId(Long recordId);

    /**
     * 查询机构信用记录列表
     * 
     * @param record 机构信用记录
     * @return 机构信用记录集合
     */
    public List<Record> selectRecordList(Record record);

    /**
     * 新增机构信用记录
     * 
     * @param record 机构信用记录
     * @return 结果
     */
    public int insertRecord(Record record);

    /**
     * 修改机构信用记录
     * 
     * @param record 机构信用记录
     * @return 结果
     */
    public int updateRecord(Record record);

    /**
     * 删除机构信用记录
     * 
     * @param recordId 机构信用记录主键
     * @return 结果
     */
    public int deleteRecordByRecordId(Long recordId);

    /**
     * 批量删除机构信用记录
     * 
     * @param recordIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRecordByRecordIds(Long[] recordIds);
}
