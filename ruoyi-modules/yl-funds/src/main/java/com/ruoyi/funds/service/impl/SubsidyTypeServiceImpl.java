package com.ruoyi.funds.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.funds.mapper.SubsidyTypeMapper;
import com.ruoyi.funds.domain.SubsidyType;
import com.ruoyi.funds.service.ISubsidyTypeService;

/**
 * 补贴类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class SubsidyTypeServiceImpl implements ISubsidyTypeService 
{
    @Autowired
    private SubsidyTypeMapper subsidyTypeMapper;

    /**
     * 查询补贴类型
     * 
     * @param subsidyTypeId 补贴类型主键
     * @return 补贴类型
     */
    @Override
    public SubsidyType selectSubsidyTypeBySubsidyTypeId(Long subsidyTypeId)
    {
        return subsidyTypeMapper.selectSubsidyTypeBySubsidyTypeId(subsidyTypeId);
    }

    /**
     * 查询补贴类型列表
     * 
     * @param subsidyType 补贴类型
     * @return 补贴类型
     */
    @Override
    public List<SubsidyType> selectSubsidyTypeList(SubsidyType subsidyType)
    {
        return subsidyTypeMapper.selectSubsidyTypeList(subsidyType);
    }

    /**
     * 新增补贴类型
     * 
     * @param subsidyType 补贴类型
     * @return 结果
     */
    @Override
    public int insertSubsidyType(SubsidyType subsidyType)
    {
        return subsidyTypeMapper.insertSubsidyType(subsidyType);
    }

    /**
     * 修改补贴类型
     * 
     * @param subsidyType 补贴类型
     * @return 结果
     */
    @Override
    public int updateSubsidyType(SubsidyType subsidyType)
    {
        return subsidyTypeMapper.updateSubsidyType(subsidyType);
    }

    /**
     * 批量删除补贴类型
     * 
     * @param subsidyTypeIds 需要删除的补贴类型主键
     * @return 结果
     */
    @Override
    public int deleteSubsidyTypeBySubsidyTypeIds(Long[] subsidyTypeIds)
    {
        return subsidyTypeMapper.deleteSubsidyTypeBySubsidyTypeIds(subsidyTypeIds);
    }

    /**
     * 删除补贴类型信息
     * 
     * @param subsidyTypeId 补贴类型主键
     * @return 结果
     */
    @Override
    public int deleteSubsidyTypeBySubsidyTypeId(Long subsidyTypeId)
    {
        return subsidyTypeMapper.deleteSubsidyTypeBySubsidyTypeId(subsidyTypeId);
    }
}
