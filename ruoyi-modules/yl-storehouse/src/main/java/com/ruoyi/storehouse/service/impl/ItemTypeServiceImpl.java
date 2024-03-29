package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.ItemTypeMapper;
import com.ruoyi.storehouse.domain.ItemType;
import com.ruoyi.storehouse.service.IItemTypeService;

/**
 * 物品类型Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@Service
public class ItemTypeServiceImpl implements IItemTypeService
{
    @Autowired
    private ItemTypeMapper itemTypeMapper;

    /**
     * 查询物品类型
     *
     * @param itemTypeId 物品类型主键
     * @return 物品类型
     */
    @Override
    public ItemType selectItemTypeByItemTypeId(Long itemTypeId)
    {
        return itemTypeMapper.selectItemTypeByItemTypeId(itemTypeId);
    }

    /**
     * 查询物品类型列表
     *
     * @param itemType 物品类型
     * @return 物品类型
     */
    @Override
    public List<ItemType> selectItemTypeList(ItemType itemType)
    {
        return itemTypeMapper.selectItemTypeList(itemType);
    }

    /**
     * 新增物品类型
     *
     * @param itemType 物品类型
     * @return 结果
     */
    @Override
    public int insertItemType(ItemType itemType)
    {
        return itemTypeMapper.insertItemType(itemType);
    }

    /**
     * 修改物品类型
     *
     * @param itemType 物品类型
     * @return 结果
     */
    @Override
    public int updateItemType(ItemType itemType)
    {
        return itemTypeMapper.updateItemType(itemType);
    }

    /**
     * 批量删除物品类型
     *
     * @param itemTypeIds 需要删除的物品类型主键
     * @return 结果
     */
    @Override
    public int deleteItemTypeByItemTypeIds(Long[] itemTypeIds)
    {
        return itemTypeMapper.deleteItemTypeByItemTypeIds(itemTypeIds);
    }

    /**
     * 删除物品类型信息
     *
     * @param itemTypeId 物品类型主键
     * @return 结果
     */
    @Override
    public int deleteItemTypeByItemTypeId(Long itemTypeId)
    {
        return itemTypeMapper.deleteItemTypeByItemTypeId(itemTypeId);
    }
}
