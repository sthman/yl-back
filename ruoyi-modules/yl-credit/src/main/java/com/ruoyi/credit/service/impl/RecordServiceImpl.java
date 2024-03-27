package com.ruoyi.credit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.credit.mapper.RecordMapper;
import com.ruoyi.credit.domain.Record;
import com.ruoyi.credit.service.IRecordService;

/**
 * 机构信用记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class RecordServiceImpl implements IRecordService 
{
    @Autowired
    private RecordMapper recordMapper;

    /**
     * 查询机构信用记录
     * 
     * @param recordId 机构信用记录主键
     * @return 机构信用记录
     */
    @Override
    public Record selectRecordByRecordId(Long recordId)
    {
        return recordMapper.selectRecordByRecordId(recordId);
    }

    /**
     * 查询机构信用记录列表
     * 
     * @param record 机构信用记录
     * @return 机构信用记录
     */
    @Override
    public List<Record> selectRecordList(Record record)
    {
        return recordMapper.selectRecordList(record);
    }

    /**
     * 新增机构信用记录
     * 
     * @param record 机构信用记录
     * @return 结果
     */
    @Override
    public int insertRecord(Record record)
    {
        return recordMapper.insertRecord(record);
    }

    /**
     * 修改机构信用记录
     * 
     * @param record 机构信用记录
     * @return 结果
     */
    @Override
    public int updateRecord(Record record)
    {
        return recordMapper.updateRecord(record);
    }

    /**
     * 批量删除机构信用记录
     * 
     * @param recordIds 需要删除的机构信用记录主键
     * @return 结果
     */
    @Override
    public int deleteRecordByRecordIds(Long[] recordIds)
    {
        return recordMapper.deleteRecordByRecordIds(recordIds);
    }

    /**
     * 删除机构信用记录信息
     * 
     * @param recordId 机构信用记录主键
     * @return 结果
     */
    @Override
    public int deleteRecordByRecordId(Long recordId)
    {
        return recordMapper.deleteRecordByRecordId(recordId);
    }
}
