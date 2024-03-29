package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.WarehouseMapper;
import com.ruoyi.storehouse.domain.Warehouse;
import com.ruoyi.storehouse.service.IWarehouseService;

/**
 * 仓库Service业务层处理
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@Service
public class WarehouseServiceImpl implements IWarehouseService
{
    @Autowired
    private WarehouseMapper warehouseMapper;

    /**
     * 查询仓库
     *
     * @param warehouseId 仓库主键
     * @return 仓库
     */
    @Override
    public Warehouse selectWarehouseByWarehouseId(Long warehouseId)
    {
        return warehouseMapper.selectWarehouseByWarehouseId(warehouseId);
    }

    /**
     * 查询仓库列表
     *
     * @param warehouse 仓库
     * @return 仓库
     */
    @Override
    public List<Warehouse> selectWarehouseList(Warehouse warehouse)
    {
        return warehouseMapper.selectWarehouseList(warehouse);
    }

    /**
     * 新增仓库
     *
     * @param warehouse 仓库
     * @return 结果
     */
    @Override
    public int insertWarehouse(Warehouse warehouse)
    {
        return warehouseMapper.insertWarehouse(warehouse);
    }

    /**
     * 修改仓库
     *
     * @param warehouse 仓库
     * @return 结果
     */
    @Override
    public int updateWarehouse(Warehouse warehouse)
    {
        return warehouseMapper.updateWarehouse(warehouse);
    }

    /**
     * 批量删除仓库
     *
     * @param warehouseIds 需要删除的仓库主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseByWarehouseIds(Long[] warehouseIds)
    {
        return warehouseMapper.deleteWarehouseByWarehouseIds(warehouseIds);
    }

    /**
     * 删除仓库信息
     *
     * @param warehouseId 仓库主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseByWarehouseId(Long warehouseId)
    {
        return warehouseMapper.deleteWarehouseByWarehouseId(warehouseId);
    }
}
