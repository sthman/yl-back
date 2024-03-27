package com.ruoyi.credit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.credit.mapper.InspectionMapper;
import com.ruoyi.credit.domain.Inspection;
import com.ruoyi.credit.service.IInspectionService;

/**
 * 检查记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class InspectionServiceImpl implements IInspectionService 
{
    @Autowired
    private InspectionMapper inspectionMapper;

    /**
     * 查询检查记录
     * 
     * @param inspectionId 检查记录主键
     * @return 检查记录
     */
    @Override
    public Inspection selectInspectionByInspectionId(Long inspectionId)
    {
        return inspectionMapper.selectInspectionByInspectionId(inspectionId);
    }

    /**
     * 查询检查记录列表
     * 
     * @param inspection 检查记录
     * @return 检查记录
     */
    @Override
    public List<Inspection> selectInspectionList(Inspection inspection)
    {
        return inspectionMapper.selectInspectionList(inspection);
    }

    /**
     * 新增检查记录
     * 
     * @param inspection 检查记录
     * @return 结果
     */
    @Override
    public int insertInspection(Inspection inspection)
    {
        return inspectionMapper.insertInspection(inspection);
    }

    /**
     * 修改检查记录
     * 
     * @param inspection 检查记录
     * @return 结果
     */
    @Override
    public int updateInspection(Inspection inspection)
    {
        return inspectionMapper.updateInspection(inspection);
    }

    /**
     * 批量删除检查记录
     * 
     * @param inspectionIds 需要删除的检查记录主键
     * @return 结果
     */
    @Override
    public int deleteInspectionByInspectionIds(Long[] inspectionIds)
    {
        return inspectionMapper.deleteInspectionByInspectionIds(inspectionIds);
    }

    /**
     * 删除检查记录信息
     * 
     * @param inspectionId 检查记录主键
     * @return 结果
     */
    @Override
    public int deleteInspectionByInspectionId(Long inspectionId)
    {
        return inspectionMapper.deleteInspectionByInspectionId(inspectionId);
    }
}
