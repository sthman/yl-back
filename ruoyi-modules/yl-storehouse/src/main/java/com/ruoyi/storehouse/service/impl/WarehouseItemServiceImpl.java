package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.WarehouseItemMapper;
import com.ruoyi.storehouse.domain.WarehouseItem;
import com.ruoyi.storehouse.service.IWarehouseItemService;

/**
 * 仓库-物品关系Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class WarehouseItemServiceImpl implements IWarehouseItemService 
{
    @Autowired
    private WarehouseItemMapper warehouseItemMapper;

    /**
     * 查询仓库-物品关系
     * 
     * @param warehouseId 仓库-物品关系主键
     * @return 仓库-物品关系
     */
    @Override
    public WarehouseItem selectWarehouseItemByWarehouseId(Long warehouseId)
    {
        return warehouseItemMapper.selectWarehouseItemByWarehouseId(warehouseId);
    }

    /**
     * 查询仓库-物品关系列表
     * 
     * @param warehouseItem 仓库-物品关系
     * @return 仓库-物品关系
     */
    @Override
    public List<WarehouseItem> selectWarehouseItemList(WarehouseItem warehouseItem)
    {
        return warehouseItemMapper.selectWarehouseItemList(warehouseItem);
    }

    /**
     * 新增仓库-物品关系
     * 
     * @param warehouseItem 仓库-物品关系
     * @return 结果
     */
    @Override
    public int insertWarehouseItem(WarehouseItem warehouseItem)
    {
        return warehouseItemMapper.insertWarehouseItem(warehouseItem);
    }

    /**
     * 修改仓库-物品关系
     * 
     * @param warehouseItem 仓库-物品关系
     * @return 结果
     */
    @Override
    public int updateWarehouseItem(WarehouseItem warehouseItem)
    {
        return warehouseItemMapper.updateWarehouseItem(warehouseItem);
    }

    /**
     * 批量删除仓库-物品关系
     * 
     * @param warehouseIds 需要删除的仓库-物品关系主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseItemByWarehouseIds(Long[] warehouseIds)
    {
        return warehouseItemMapper.deleteWarehouseItemByWarehouseIds(warehouseIds);
    }

    /**
     * 删除仓库-物品关系信息
     * 
     * @param warehouseId 仓库-物品关系主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseItemByWarehouseId(Long warehouseId)
    {
        return warehouseItemMapper.deleteWarehouseItemByWarehouseId(warehouseId);
    }
}
