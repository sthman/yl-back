package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.ItemMapper;
import com.ruoyi.storehouse.domain.Item;
import com.ruoyi.storehouse.service.IItemService;

/**
 * 物品Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class ItemServiceImpl implements IItemService 
{
    @Autowired
    private ItemMapper itemMapper;

    /**
     * 查询物品
     * 
     * @param itemId 物品主键
     * @return 物品
     */
    @Override
    public Item selectItemByItemId(Long itemId)
    {
        return itemMapper.selectItemByItemId(itemId);
    }

    /**
     * 查询物品列表
     * 
     * @param item 物品
     * @return 物品
     */
    @Override
    public List<Item> selectItemList(Item item)
    {
        return itemMapper.selectItemList(item);
    }

    /**
     * 新增物品
     * 
     * @param item 物品
     * @return 结果
     */
    @Override
    public int insertItem(Item item)
    {
        return itemMapper.insertItem(item);
    }

    /**
     * 修改物品
     * 
     * @param item 物品
     * @return 结果
     */
    @Override
    public int updateItem(Item item)
    {
        return itemMapper.updateItem(item);
    }

    /**
     * 批量删除物品
     * 
     * @param itemIds 需要删除的物品主键
     * @return 结果
     */
    @Override
    public int deleteItemByItemIds(Long[] itemIds)
    {
        return itemMapper.deleteItemByItemIds(itemIds);
    }

    /**
     * 删除物品信息
     * 
     * @param itemId 物品主键
     * @return 结果
     */
    @Override
    public int deleteItemByItemId(Long itemId)
    {
        return itemMapper.deleteItemByItemId(itemId);
    }
}
