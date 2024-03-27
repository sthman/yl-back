package com.ruoyi.government.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.government.mapper.CategoryTypeMapper;
import com.ruoyi.government.domain.CategoryType;
import com.ruoyi.government.service.ICategoryTypeService;

/**
 * 知识库类别Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class CategoryTypeServiceImpl implements ICategoryTypeService 
{
    @Autowired
    private CategoryTypeMapper categoryTypeMapper;

    /**
     * 查询知识库类别
     * 
     * @param categoryTypeId 知识库类别主键
     * @return 知识库类别
     */
    @Override
    public CategoryType selectCategoryTypeByCategoryTypeId(Long categoryTypeId)
    {
        return categoryTypeMapper.selectCategoryTypeByCategoryTypeId(categoryTypeId);
    }

    /**
     * 查询知识库类别列表
     * 
     * @param categoryType 知识库类别
     * @return 知识库类别
     */
    @Override
    public List<CategoryType> selectCategoryTypeList(CategoryType categoryType)
    {
        return categoryTypeMapper.selectCategoryTypeList(categoryType);
    }

    /**
     * 新增知识库类别
     * 
     * @param categoryType 知识库类别
     * @return 结果
     */
    @Override
    public int insertCategoryType(CategoryType categoryType)
    {
        return categoryTypeMapper.insertCategoryType(categoryType);
    }

    /**
     * 修改知识库类别
     * 
     * @param categoryType 知识库类别
     * @return 结果
     */
    @Override
    public int updateCategoryType(CategoryType categoryType)
    {
        return categoryTypeMapper.updateCategoryType(categoryType);
    }

    /**
     * 批量删除知识库类别
     * 
     * @param categoryTypeIds 需要删除的知识库类别主键
     * @return 结果
     */
    @Override
    public int deleteCategoryTypeByCategoryTypeIds(Long[] categoryTypeIds)
    {
        return categoryTypeMapper.deleteCategoryTypeByCategoryTypeIds(categoryTypeIds);
    }

    /**
     * 删除知识库类别信息
     * 
     * @param categoryTypeId 知识库类别主键
     * @return 结果
     */
    @Override
    public int deleteCategoryTypeByCategoryTypeId(Long categoryTypeId)
    {
        return categoryTypeMapper.deleteCategoryTypeByCategoryTypeId(categoryTypeId);
    }
}
