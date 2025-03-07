package com.ruoyi.storehouse.mapper;

import java.util.List;
import com.ruoyi.storehouse.domain.Warehouse;

/**
 * 仓库Mapper接口
 *
 * @author ruoyi
 * @date 2024-03-29
 */
public interface WarehouseMapper
{
    /**
     * 查询仓库
     *
     * @param warehouseId 仓库主键
     * @return 仓库
     */
    public Warehouse selectWarehouseByWarehouseId(Long warehouseId);

    /**
     * 查询仓库列表
     *
     * @param warehouse 仓库
     * @return 仓库集合
     */
    public List<Warehouse> selectWarehouseList(Warehouse warehouse);

    /**
     * 新增仓库
     *
     * @param warehouse 仓库
     * @return 结果
     */
    public int insertWarehouse(Warehouse warehouse);

    /**
     * 修改仓库
     *
     * @param warehouse 仓库
     * @return 结果
     */
    public int updateWarehouse(Warehouse warehouse);

    /**
     * 删除仓库
     *
     * @param warehouseId 仓库主键
     * @return 结果
     */
    public int deleteWarehouseByWarehouseId(Long warehouseId);

    /**
     * 批量删除仓库
     *
     * @param warehouseIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWarehouseByWarehouseIds(Long[] warehouseIds);
}
