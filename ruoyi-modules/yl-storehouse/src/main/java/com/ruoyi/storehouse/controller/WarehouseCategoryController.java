package com.ruoyi.storehouse.controller;

import java.util.List;
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
import com.ruoyi.storehouse.domain.WarehouseCategory;
import com.ruoyi.storehouse.service.IWarehouseCategoryService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 仓库类型Controller
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@RestController
@RequestMapping("/category")
public class WarehouseCategoryController extends BaseController
{
    @Autowired
    private IWarehouseCategoryService warehouseCategoryService;

    /**
     * 查询仓库类型列表
     */
    @RequiresPermissions("storehouse:category:list")
    @GetMapping("/list")
    public TableDataInfo list(WarehouseCategory warehouseCategory)
    {
        startPage();
        List<WarehouseCategory> list = warehouseCategoryService.selectWarehouseCategoryList(warehouseCategory);
        return getDataTable(list);
    }

    /**
     * 导出仓库类型列表
     */
    @RequiresPermissions("storehouse:category:export")
    @Log(title = "仓库类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WarehouseCategory warehouseCategory)
    {
        List<WarehouseCategory> list = warehouseCategoryService.selectWarehouseCategoryList(warehouseCategory);
        ExcelUtil<WarehouseCategory> util = new ExcelUtil<WarehouseCategory>(WarehouseCategory.class);
        util.exportExcel(response, list, "仓库类型数据");
    }

    /**
     * 获取仓库类型详细信息
     */
    @RequiresPermissions("storehouse:category:query")
    @GetMapping(value = "/{warehouseTypeId}")
    public AjaxResult getInfo(@PathVariable("warehouseTypeId") Long warehouseTypeId)
    {
        return success(warehouseCategoryService.selectWarehouseCategoryByWarehouseTypeId(warehouseTypeId));
    }

    /**
     * 新增仓库类型
     */
    @RequiresPermissions("storehouse:category:add")
    @Log(title = "仓库类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WarehouseCategory warehouseCategory)
    {
        return toAjax(warehouseCategoryService.insertWarehouseCategory(warehouseCategory));
    }

    /**
     * 修改仓库类型
     */
    @RequiresPermissions("storehouse:category:edit")
    @Log(title = "仓库类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WarehouseCategory warehouseCategory)
    {
        return toAjax(warehouseCategoryService.updateWarehouseCategory(warehouseCategory));
    }

    /**
     * 删除仓库类型
     */
    @RequiresPermissions("storehouse:category:remove")
    @Log(title = "仓库类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{warehouseTypeIds}")
    public AjaxResult remove(@PathVariable Long[] warehouseTypeIds)
    {
        return toAjax(warehouseCategoryService.deleteWarehouseCategoryByWarehouseTypeIds(warehouseTypeIds));
    }
}
