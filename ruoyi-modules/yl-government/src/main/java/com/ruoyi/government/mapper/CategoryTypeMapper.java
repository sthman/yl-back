package com.ruoyi.government.mapper;

import java.util.List;
import com.ruoyi.government.domain.CategoryType;

/**
 * 知识库类别Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface CategoryTypeMapper 
{
    /**
     * 查询知识库类别
     * 
     * @param categoryTypeId 知识库类别主键
     * @return 知识库类别
     */
    public CategoryType selectCategoryTypeByCategoryTypeId(Long categoryTypeId);

    /**
     * 查询知识库类别列表
     * 
     * @param categoryType 知识库类别
     * @return 知识库类别集合
     */
    public List<CategoryType> selectCategoryTypeList(CategoryType categoryType);

    /**
     * 新增知识库类别
     * 
     * @param categoryType 知识库类别
     * @return 结果
     */
    public int insertCategoryType(CategoryType categoryType);

    /**
     * 修改知识库类别
     * 
     * @param categoryType 知识库类别
     * @return 结果
     */
    public int updateCategoryType(CategoryType categoryType);

    /**
     * 删除知识库类别
     * 
     * @param categoryTypeId 知识库类别主键
     * @return 结果
     */
    public int deleteCategoryTypeByCategoryTypeId(Long categoryTypeId);

    /**
     * 批量删除知识库类别
     * 
     * @param categoryTypeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteCategoryTypeByCategoryTypeIds(Long[] categoryTypeIds);
}
