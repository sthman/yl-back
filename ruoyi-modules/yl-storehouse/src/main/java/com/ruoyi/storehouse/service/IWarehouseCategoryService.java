package com.ruoyi.storehouse.service;

import java.util.List;
import com.ruoyi.storehouse.domain.WarehouseCategory;

/**
 * 仓库类型Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IWarehouseCategoryService 
{
    /**
     * 查询仓库类型
     * 
     * @param warehouseTypeId 仓库类型主键
     * @return 仓库类型
     */
    public WarehouseCategory selectWarehouseCategoryByWarehouseTypeId(Long warehouseTypeId);

    /**
     * 查询仓库类型列表
     * 
     * @param warehouseCategory 仓库类型
     * @return 仓库类型集合
     */
    public List<WarehouseCategory> selectWarehouseCategoryList(WarehouseCategory warehouseCategory);

    /**
     * 新增仓库类型
     * 
     * @param warehouseCategory 仓库类型
     * @return 结果
     */
    public int insertWarehouseCategory(WarehouseCategory warehouseCategory);

    /**
     * 修改仓库类型
     * 
     * @param warehouseCategory 仓库类型
     * @return 结果
     */
    public int updateWarehouseCategory(WarehouseCategory warehouseCategory);

    /**
     * 批量删除仓库类型
     * 
     * @param warehouseTypeIds 需要删除的仓库类型主键集合
     * @return 结果
     */
    public int deleteWarehouseCategoryByWarehouseTypeIds(Long[] warehouseTypeIds);

    /**
     * 删除仓库类型信息
     * 
     * @param warehouseTypeId 仓库类型主键
     * @return 结果
     */
    public int deleteWarehouseCategoryByWarehouseTypeId(Long warehouseTypeId);
}
