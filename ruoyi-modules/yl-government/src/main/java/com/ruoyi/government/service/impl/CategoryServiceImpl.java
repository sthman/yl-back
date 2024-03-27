package com.ruoyi.government.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.government.mapper.CategoryMapper;
import com.ruoyi.government.domain.Category;
import com.ruoyi.government.service.ICategoryService;

/**
 * 知识库Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class CategoryServiceImpl implements ICategoryService 
{
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 查询知识库
     * 
     * @param categoryId 知识库主键
     * @return 知识库
     */
    @Override
    public Category selectCategoryByCategoryId(Long categoryId)
    {
        return categoryMapper.selectCategoryByCategoryId(categoryId);
    }

    /**
     * 查询知识库列表
     * 
     * @param category 知识库
     * @return 知识库
     */
    @Override
    public List<Category> selectCategoryList(Category category)
    {
        return categoryMapper.selectCategoryList(category);
    }

    /**
     * 新增知识库
     * 
     * @param category 知识库
     * @return 结果
     */
    @Override
    public int insertCategory(Category category)
    {
        return categoryMapper.insertCategory(category);
    }

    /**
     * 修改知识库
     * 
     * @param category 知识库
     * @return 结果
     */
    @Override
    public int updateCategory(Category category)
    {
        return categoryMapper.updateCategory(category);
    }

    /**
     * 批量删除知识库
     * 
     * @param categoryIds 需要删除的知识库主键
     * @return 结果
     */
    @Override
    public int deleteCategoryByCategoryIds(Long[] categoryIds)
    {
        return categoryMapper.deleteCategoryByCategoryIds(categoryIds);
    }

    /**
     * 删除知识库信息
     * 
     * @param categoryId 知识库主键
     * @return 结果
     */
    @Override
    public int deleteCategoryByCategoryId(Long categoryId)
    {
        return categoryMapper.deleteCategoryByCategoryId(categoryId);
    }
}
