package com.ruoyi.government.service;

import java.util.List;
import com.ruoyi.government.domain.Category;

/**
 * 知识库Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface ICategoryService 
{
    /**
     * 查询知识库
     * 
     * @param categoryId 知识库主键
     * @return 知识库
     */
    public Category selectCategoryByCategoryId(Long categoryId);

    /**
     * 查询知识库列表
     * 
     * @param category 知识库
     * @return 知识库集合
     */
    public List<Category> selectCategoryList(Category category);

    /**
     * 新增知识库
     * 
     * @param category 知识库
     * @return 结果
     */
    public int insertCategory(Category category);

    /**
     * 修改知识库
     * 
     * @param category 知识库
     * @return 结果
     */
    public int updateCategory(Category category);

    /**
     * 批量删除知识库
     * 
     * @param categoryIds 需要删除的知识库主键集合
     * @return 结果
     */
    public int deleteCategoryByCategoryIds(Long[] categoryIds);

    /**
     * 删除知识库信息
     * 
     * @param categoryId 知识库主键
     * @return 结果
     */
    public int deleteCategoryByCategoryId(Long categoryId);
}
