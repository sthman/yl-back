package com.ruoyi.storehouse.mapper;

import java.util.List;
import com.ruoyi.storehouse.domain.WarehouseItem;

/**
 * 仓库-物品关系Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface WarehouseItemMapper 
{
    /**
     * 查询仓库-物品关系
     * 
     * @param warehouseId 仓库-物品关系主键
     * @return 仓库-物品关系
     */
    public WarehouseItem selectWarehouseItemByWarehouseId(Long warehouseId);

    /**
     * 查询仓库-物品关系列表
     * 
     * @param warehouseItem 仓库-物品关系
     * @return 仓库-物品关系集合
     */
    public List<WarehouseItem> selectWarehouseItemList(WarehouseItem warehouseItem);

    /**
     * 新增仓库-物品关系
     * 
     * @param warehouseItem 仓库-物品关系
     * @return 结果
     */
    public int insertWarehouseItem(WarehouseItem warehouseItem);

    /**
     * 修改仓库-物品关系
     * 
     * @param warehouseItem 仓库-物品关系
     * @return 结果
     */
    public int updateWarehouseItem(WarehouseItem warehouseItem);

    /**
     * 删除仓库-物品关系
     * 
     * @param warehouseId 仓库-物品关系主键
     * @return 结果
     */
    public int deleteWarehouseItemByWarehouseId(Long warehouseId);

    /**
     * 批量删除仓库-物品关系
     * 
     * @param warehouseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWarehouseItemByWarehouseIds(Long[] warehouseIds);
}
