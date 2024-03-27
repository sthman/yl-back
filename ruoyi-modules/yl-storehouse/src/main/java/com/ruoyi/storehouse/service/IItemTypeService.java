package com.ruoyi.storehouse.service;

import java.util.List;
import com.ruoyi.storehouse.domain.ItemType;

/**
 * 物品类型Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IItemTypeService 
{
    /**
     * 查询物品类型
     * 
     * @param itemTypeId 物品类型主键
     * @return 物品类型
     */
    public ItemType selectItemTypeByItemTypeId(Long itemTypeId);

    /**
     * 查询物品类型列表
     * 
     * @param itemType 物品类型
     * @return 物品类型集合
     */
    public List<ItemType> selectItemTypeList(ItemType itemType);

    /**
     * 新增物品类型
     * 
     * @param itemType 物品类型
     * @return 结果
     */
    public int insertItemType(ItemType itemType);

    /**
     * 修改物品类型
     * 
     * @param itemType 物品类型
     * @return 结果
     */
    public int updateItemType(ItemType itemType);

    /**
     * 批量删除物品类型
     * 
     * @param itemTypeIds 需要删除的物品类型主键集合
     * @return 结果
     */
    public int deleteItemTypeByItemTypeIds(Long[] itemTypeIds);

    /**
     * 删除物品类型信息
     * 
     * @param itemTypeId 物品类型主键
     * @return 结果
     */
    public int deleteItemTypeByItemTypeId(Long itemTypeId);
}
