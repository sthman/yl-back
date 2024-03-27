package com.ruoyi.storehouse.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.storehouse.mapper.WarehouseCategoryMapper;
import com.ruoyi.storehouse.domain.WarehouseCategory;
import com.ruoyi.storehouse.service.IWarehouseCategoryService;

/**
 * 仓库类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class WarehouseCategoryServiceImpl implements IWarehouseCategoryService 
{
    @Autowired
    private WarehouseCategoryMapper warehouseCategoryMapper;

    /**
     * 查询仓库类型
     * 
     * @param warehouseTypeId 仓库类型主键
     * @return 仓库类型
     */
    @Override
    public WarehouseCategory selectWarehouseCategoryByWarehouseTypeId(Long warehouseTypeId)
    {
        return warehouseCategoryMapper.selectWarehouseCategoryByWarehouseTypeId(warehouseTypeId);
    }

    /**
     * 查询仓库类型列表
     * 
     * @param warehouseCategory 仓库类型
     * @return 仓库类型
     */
    @Override
    public List<WarehouseCategory> selectWarehouseCategoryList(WarehouseCategory warehouseCategory)
    {
        return warehouseCategoryMapper.selectWarehouseCategoryList(warehouseCategory);
    }

    /**
     * 新增仓库类型
     * 
     * @param warehouseCategory 仓库类型
     * @return 结果
     */
    @Override
    public int insertWarehouseCategory(WarehouseCategory warehouseCategory)
    {
        return warehouseCategoryMapper.insertWarehouseCategory(warehouseCategory);
    }

    /**
     * 修改仓库类型
     * 
     * @param warehouseCategory 仓库类型
     * @return 结果
     */
    @Override
    public int updateWarehouseCategory(WarehouseCategory warehouseCategory)
    {
        return warehouseCategoryMapper.updateWarehouseCategory(warehouseCategory);
    }

    /**
     * 批量删除仓库类型
     * 
     * @param warehouseTypeIds 需要删除的仓库类型主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseCategoryByWarehouseTypeIds(Long[] warehouseTypeIds)
    {
        return warehouseCategoryMapper.deleteWarehouseCategoryByWarehouseTypeIds(warehouseTypeIds);
    }

    /**
     * 删除仓库类型信息
     * 
     * @param warehouseTypeId 仓库类型主键
     * @return 结果
     */
    @Override
    public int deleteWarehouseCategoryByWarehouseTypeId(Long warehouseTypeId)
    {
        return warehouseCategoryMapper.deleteWarehouseCategoryByWarehouseTypeId(warehouseTypeId);
    }
}
