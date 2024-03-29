package com.ruoyi.storehouse.service;

import java.util.List;
import com.ruoyi.storehouse.domain.Item;

/**
 * 物品Service接口
 *
 * @author ruoyi
 * @date 2024-03-29
 */
public interface IItemService
{
    /**
     * 查询物品
     *
     * @param itemId 物品主键
     * @return 物品
     */
    public Item selectItemByItemId(Long itemId);

    /**
     * 查询物品列表
     *
     * @param item 物品
     * @return 物品集合
     */
    public List<Item> selectItemList(Item item);

    /**
     * 新增物品
     *
     * @param item 物品
     * @return 结果
     */
    public int insertItem(Item item);

    /**
     * 修改物品
     *
     * @param item 物品
     * @return 结果
     */
    public int updateItem(Item item);

    /**
     * 批量删除物品
     *
     * @param itemIds 需要删除的物品主键集合
     * @return 结果
     */
    public int deleteItemByItemIds(Long[] itemIds);

    /**
     * 删除物品信息
     *
     * @param itemId 物品主键
     * @return 结果
     */
    public int deleteItemByItemId(Long itemId);
}
