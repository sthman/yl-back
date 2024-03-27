package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.ItemRecipeMapper;
import com.ruoyi.storehouse.domain.ItemRecipe;
import com.ruoyi.storehouse.service.IItemRecipeService;

/**
 * 物品-食谱关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class ItemRecipeServiceImpl implements IItemRecipeService 
{
    @Autowired
    private ItemRecipeMapper itemRecipeMapper;

    /**
     * 查询物品-食谱关系
     * 
     * @param itemId 物品-食谱关系主键
     * @return 物品-食谱关系
     */
    @Override
    public ItemRecipe selectItemRecipeByItemId(Long itemId)
    {
        return itemRecipeMapper.selectItemRecipeByItemId(itemId);
    }

    /**
     * 查询物品-食谱关系列表
     * 
     * @param itemRecipe 物品-食谱关系
     * @return 物品-食谱关系
     */
    @Override
    public List<ItemRecipe> selectItemRecipeList(ItemRecipe itemRecipe)
    {
        return itemRecipeMapper.selectItemRecipeList(itemRecipe);
    }

    /**
     * 新增物品-食谱关系
     * 
     * @param itemRecipe 物品-食谱关系
     * @return 结果
     */
    @Override
    public int insertItemRecipe(ItemRecipe itemRecipe)
    {
        return itemRecipeMapper.insertItemRecipe(itemRecipe);
    }

    /**
     * 修改物品-食谱关系
     * 
     * @param itemRecipe 物品-食谱关系
     * @return 结果
     */
    @Override
    public int updateItemRecipe(ItemRecipe itemRecipe)
    {
        return itemRecipeMapper.updateItemRecipe(itemRecipe);
    }

    /**
     * 批量删除物品-食谱关系
     * 
     * @param itemIds 需要删除的物品-食谱关系主键
     * @return 结果
     */
    @Override
    public int deleteItemRecipeByItemIds(Long[] itemIds)
    {
        return itemRecipeMapper.deleteItemRecipeByItemIds(itemIds);
    }

    /**
     * 删除物品-食谱关系信息
     * 
     * @param itemId 物品-食谱关系主键
     * @return 结果
     */
    @Override
    public int deleteItemRecipeByItemId(Long itemId)
    {
        return itemRecipeMapper.deleteItemRecipeByItemId(itemId);
    }
}
