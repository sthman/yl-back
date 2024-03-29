package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.RecipeMapper;
import com.ruoyi.storehouse.domain.Recipe;
import com.ruoyi.storehouse.service.IRecipeService;

/**
 * 食谱Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@Service
public class RecipeServiceImpl implements IRecipeService
{
    @Autowired
    private RecipeMapper recipeMapper;

    /**
     * 查询食谱
     *
     * @param recipeId 食谱主键
     * @return 食谱
     */
    @Override
    public Recipe selectRecipeByRecipeId(Long recipeId)
    {
        return recipeMapper.selectRecipeByRecipeId(recipeId);
    }

    /**
     * 查询食谱列表
     *
     * @param recipe 食谱
     * @return 食谱
     */
    @Override
    public List<Recipe> selectRecipeList(Recipe recipe)
    {
        return recipeMapper.selectRecipeList(recipe);
    }

    /**
     * 新增食谱
     *
     * @param recipe 食谱
     * @return 结果
     */
    @Override
    public int insertRecipe(Recipe recipe)
    {
        return recipeMapper.insertRecipe(recipe);
    }

    /**
     * 修改食谱
     *
     * @param recipe 食谱
     * @return 结果
     */
    @Override
    public int updateRecipe(Recipe recipe)
    {
        return recipeMapper.updateRecipe(recipe);
    }

    /**
     * 批量删除食谱
     *
     * @param recipeIds 需要删除的食谱主键
     * @return 结果
     */
    @Override
    public int deleteRecipeByRecipeIds(Long[] recipeIds)
    {
        return recipeMapper.deleteRecipeByRecipeIds(recipeIds);
    }

    /**
     * 删除食谱信息
     *
     * @param recipeId 食谱主键
     * @return 结果
     */
    @Override
    public int deleteRecipeByRecipeId(Long recipeId)
    {
        return recipeMapper.deleteRecipeByRecipeId(recipeId);
    }
}
