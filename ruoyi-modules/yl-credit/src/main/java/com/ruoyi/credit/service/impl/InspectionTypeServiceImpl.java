package com.ruoyi.credit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.credit.mapper.InspectionTypeMapper;
import com.ruoyi.credit.domain.InspectionType;
import com.ruoyi.credit.service.IInspectionTypeService;

/**
 * 检查记录类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class InspectionTypeServiceImpl implements IInspectionTypeService 
{
    @Autowired
    private InspectionTypeMapper inspectionTypeMapper;

    /**
     * 查询检查记录类型
     * 
     * @param inspectionTypeId 检查记录类型主键
     * @return 检查记录类型
     */
    @Override
    public InspectionType selectInspectionTypeByInspectionTypeId(Long inspectionTypeId)
    {
        return inspectionTypeMapper.selectInspectionTypeByInspectionTypeId(inspectionTypeId);
    }

    /**
     * 查询检查记录类型列表
     * 
     * @param inspectionType 检查记录类型
     * @return 检查记录类型
     */
    @Override
    public List<InspectionType> selectInspectionTypeList(InspectionType inspectionType)
    {
        return inspectionTypeMapper.selectInspectionTypeList(inspectionType);
    }

    /**
     * 新增检查记录类型
     * 
     * @param inspectionType 检查记录类型
     * @return 结果
     */
    @Override
    public int insertInspectionType(InspectionType inspectionType)
    {
        return inspectionTypeMapper.insertInspectionType(inspectionType);
    }

    /**
     * 修改检查记录类型
     * 
     * @param inspectionType 检查记录类型
     * @return 结果
     */
    @Override
    public int updateInspectionType(InspectionType inspectionType)
    {
        return inspectionTypeMapper.updateInspectionType(inspectionType);
    }

    /**
     * 批量删除检查记录类型
     * 
     * @param inspectionTypeIds 需要删除的检查记录类型主键
     * @return 结果
     */
    @Override
    public int deleteInspectionTypeByInspectionTypeIds(Long[] inspectionTypeIds)
    {
        return inspectionTypeMapper.deleteInspectionTypeByInspectionTypeIds(inspectionTypeIds);
    }

    /**
     * 删除检查记录类型信息
     * 
     * @param inspectionTypeId 检查记录类型主键
     * @return 结果
     */
    @Override
    public int deleteInspectionTypeByInspectionTypeId(Long inspectionTypeId)
    {
        return inspectionTypeMapper.deleteInspectionTypeByInspectionTypeId(inspectionTypeId);
    }
}
