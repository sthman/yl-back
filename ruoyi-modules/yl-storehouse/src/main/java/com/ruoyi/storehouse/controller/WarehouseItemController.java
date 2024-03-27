package com.ruoyi.storehouse.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.storehouse.domain.WarehouseItem;
import com.ruoyi.storehouse.service.IWarehouseItemService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 仓库-物品关系Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/witem")
public class WarehouseItemController extends BaseController
{
    @Autowired
    private IWarehouseItemService warehouseItemService;

    /**
     * 查询仓库-物品关系列表
     */
    @RequiresPermissions("storehouse:witem:list")
    @GetMapping("/list")
    public TableDataInfo list(WarehouseItem warehouseItem)
    {
        startPage();
        List<WarehouseItem> list = warehouseItemService.selectWarehouseItemList(warehouseItem);
        return getDataTable(list);
    }

    /**
     * 导出仓库-物品关系列表
     */
    @RequiresPermissions("storehouse:witem:export")
    @Log(title = "仓库-物品关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WarehouseItem warehouseItem)
    {
        List<WarehouseItem> list = warehouseItemService.selectWarehouseItemList(warehouseItem);
        ExcelUtil<WarehouseItem> util = new ExcelUtil<WarehouseItem>(WarehouseItem.class);
        util.exportExcel(response, list, "仓库-物品关系数据");
    }

    /**
     * 获取仓库-物品关系详细信息
     */
    @RequiresPermissions("storehouse:witem:query")
    @GetMapping(value = "/{warehouseId}")
    public AjaxResult getInfo(@PathVariable("warehouseId") Long warehouseId)
    {
        return success(warehouseItemService.selectWarehouseItemByWarehouseId(warehouseId));
    }

    /**
     * 新增仓库-物品关系
     */
    @RequiresPermissions("storehouse:witem:add")
    @Log(title = "仓库-物品关系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WarehouseItem warehouseItem)
    {
        return toAjax(warehouseItemService.insertWarehouseItem(warehouseItem));
    }

    /**
     * 修改仓库-物品关系
     */
    @RequiresPermissions("storehouse:witem:edit")
    @Log(title = "仓库-物品关系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WarehouseItem warehouseItem)
    {
        return toAjax(warehouseItemService.updateWarehouseItem(warehouseItem));
    }

    /**
     * 删除仓库-物品关系
     */
    @RequiresPermissions("storehouse:witem:remove")
    @Log(title = "仓库-物品关系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{warehouseIds}")
    public AjaxResult remove(@PathVariable Long[] warehouseIds)
    {
        return toAjax(warehouseItemService.deleteWarehouseItemByWarehouseIds(warehouseIds));
    }
}
