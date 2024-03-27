package com.ruoyi.credit.service;

import java.util.List;
import com.ruoyi.credit.domain.InspectionType;

/**
 * 检查记录类型Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IInspectionTypeService 
{
    /**
     * 查询检查记录类型
     * 
     * @param inspectionTypeId 检查记录类型主键
     * @return 检查记录类型
     */
    public InspectionType selectInspectionTypeByInspectionTypeId(Long inspectionTypeId);

    /**
     * 查询检查记录类型列表
     * 
     * @param inspectionType 检查记录类型
     * @return 检查记录类型集合
     */
    public List<InspectionType> selectInspectionTypeList(InspectionType inspectionType);

    /**
     * 新增检查记录类型
     * 
     * @param inspectionType 检查记录类型
     * @return 结果
     */
    public int insertInspectionType(InspectionType inspectionType);

    /**
     * 修改检查记录类型
     * 
     * @param inspectionType 检查记录类型
     * @return 结果
     */
    public int updateInspectionType(InspectionType inspectionType);

    /**
     * 批量删除检查记录类型
     * 
     * @param inspectionTypeIds 需要删除的检查记录类型主键集合
     * @return 结果
     */
    public int deleteInspectionTypeByInspectionTypeIds(Long[] inspectionTypeIds);

    /**
     * 删除检查记录类型信息
     * 
     * @param inspectionTypeId 检查记录类型主键
     * @return 结果
     */
    public int deleteInspectionTypeByInspectionTypeId(Long inspectionTypeId);
}
