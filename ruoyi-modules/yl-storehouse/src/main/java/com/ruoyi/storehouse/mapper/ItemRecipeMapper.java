package com.ruoyi.storehouse.mapper;

import java.util.List;
import com.ruoyi.storehouse.domain.ItemRecipe;

/**
 * 物品-食谱关系Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface ItemRecipeMapper 
{
    /**
     * 查询物品-食谱关系
     * 
     * @param itemId 物品-食谱关系主键
     * @return 物品-食谱关系
     */
    public ItemRecipe selectItemRecipeByItemId(Long itemId);

    /**
     * 查询物品-食谱关系列表
     * 
     * @param itemRecipe 物品-食谱关系
     * @return 物品-食谱关系集合
     */
    public List<ItemRecipe> selectItemRecipeList(ItemRecipe itemRecipe);

    /**
     * 新增物品-食谱关系
     * 
     * @param itemRecipe 物品-食谱关系
     * @return 结果
     */
    public int insertItemRecipe(ItemRecipe itemRecipe);

    /**
     * 修改物品-食谱关系
     * 
     * @param itemRecipe 物品-食谱关系
     * @return 结果
     */
    public int updateItemRecipe(ItemRecipe itemRecipe);

    /**
     * 删除物品-食谱关系
     * 
     * @param itemId 物品-食谱关系主键
     * @return 结果
     */
    public int deleteItemRecipeByItemId(Long itemId);

    /**
     * 批量删除物品-食谱关系
     * 
     * @param itemIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteItemRecipeByItemIds(Long[] itemIds);
}
