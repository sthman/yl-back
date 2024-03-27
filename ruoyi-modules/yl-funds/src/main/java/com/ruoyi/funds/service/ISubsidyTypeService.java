package com.ruoyi.funds.service;

import java.util.List;
import com.ruoyi.funds.domain.SubsidyType;

/**
 * 补贴类型Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface ISubsidyTypeService 
{
    /**
     * 查询补贴类型
     * 
     * @param subsidyTypeId 补贴类型主键
     * @return 补贴类型
     */
    public SubsidyType selectSubsidyTypeBySubsidyTypeId(Long subsidyTypeId);

    /**
     * 查询补贴类型列表
     * 
     * @param subsidyType 补贴类型
     * @return 补贴类型集合
     */
    public List<SubsidyType> selectSubsidyTypeList(SubsidyType subsidyType);

    /**
     * 新增补贴类型
     * 
     * @param subsidyType 补贴类型
     * @return 结果
     */
    public int insertSubsidyType(SubsidyType subsidyType);

    /**
     * 修改补贴类型
     * 
     * @param subsidyType 补贴类型
     * @return 结果
     */
    public int updateSubsidyType(SubsidyType subsidyType);

    /**
     * 批量删除补贴类型
     * 
     * @param subsidyTypeIds 需要删除的补贴类型主键集合
     * @return 结果
     */
    public int deleteSubsidyTypeBySubsidyTypeIds(Long[] subsidyTypeIds);

    /**
     * 删除补贴类型信息
     * 
     * @param subsidyTypeId 补贴类型主键
     * @return 结果
     */
    public int deleteSubsidyTypeBySubsidyTypeId(Long subsidyTypeId);
}
