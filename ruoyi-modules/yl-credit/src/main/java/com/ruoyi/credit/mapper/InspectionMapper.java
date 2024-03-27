package com.ruoyi.credit.mapper;

import java.util.List;
import com.ruoyi.credit.domain.Inspection;

/**
 * 检查记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface InspectionMapper 
{
    /**
     * 查询检查记录
     * 
     * @param inspectionId 检查记录主键
     * @return 检查记录
     */
    public Inspection selectInspectionByInspectionId(Long inspectionId);

    /**
     * 查询检查记录列表
     * 
     * @param inspection 检查记录
     * @return 检查记录集合
     */
    public List<Inspection> selectInspectionList(Inspection inspection);

    /**
     * 新增检查记录
     * 
     * @param inspection 检查记录
     * @return 结果
     */
    public int insertInspection(Inspection inspection);

    /**
     * 修改检查记录
     * 
     * @param inspection 检查记录
     * @return 结果
     */
    public int updateInspection(Inspection inspection);

    /**
     * 删除检查记录
     * 
     * @param inspectionId 检查记录主键
     * @return 结果
     */
    public int deleteInspectionByInspectionId(Long inspectionId);

    /**
     * 批量删除检查记录
     * 
     * @param inspectionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteInspectionByInspectionIds(Long[] inspectionIds);
}
