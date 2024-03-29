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
import com.ruoyi.storehouse.domain.ItemType;
import com.ruoyi.storehouse.service.IItemTypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 物品类型Controller
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@RestController
@RequestMapping("/type")
public class ItemTypeController extends BaseController
{
    @Autowired
    private IItemTypeService itemTypeService;

    /**
     * 查询物品类型列表
     */
    @RequiresPermissions("storehouse:type:list")
    @GetMapping("/list")
    public TableDataInfo list(ItemType itemType)
    {
        startPage();
        List<ItemType> list = itemTypeService.selectItemTypeList(itemType);
        return getDataTable(list);
    }

    /**
     * 导出物品类型列表
     */
    @RequiresPermissions("storehouse:type:export")
    @Log(title = "物品类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ItemType itemType)
    {
        List<ItemType> list = itemTypeService.selectItemTypeList(itemType);
        ExcelUtil<ItemType> util = new ExcelUtil<ItemType>(ItemType.class);
        util.exportExcel(response, list, "物品类型数据");
    }

    /**
     * 获取物品类型详细信息
     */
    @RequiresPermissions("storehouse:type:query")
    @GetMapping(value = "/{itemTypeId}")
    public AjaxResult getInfo(@PathVariable("itemTypeId") Long itemTypeId)
    {
        return success(itemTypeService.selectItemTypeByItemTypeId(itemTypeId));
    }

    /**
     * 新增物品类型
     */
    @RequiresPermissions("storehouse:type:add")
    @Log(title = "物品类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ItemType itemType)
    {
        return toAjax(itemTypeService.insertItemType(itemType));
    }

    /**
     * 修改物品类型
     */
    @RequiresPermissions("storehouse:type:edit")
    @Log(title = "物品类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ItemType itemType)
    {
        return toAjax(itemTypeService.updateItemType(itemType));
    }

    /**
     * 删除物品类型
     */
    @RequiresPermissions("storehouse:type:remove")
    @Log(title = "物品类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{itemTypeIds}")
    public AjaxResult remove(@PathVariable Long[] itemTypeIds)
    {
        return toAjax(itemTypeService.deleteItemTypeByItemTypeIds(itemTypeIds));
    }
}
