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
import com.ruoyi.storehouse.domain.Item;
import com.ruoyi.storehouse.service.IItemService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 物品Controller
 *
 * @author ruoyi
 * @date 2024-03-29
 */
@RestController
@RequestMapping("/item")
public class ItemController extends BaseController
{
    @Autowired
    private IItemService itemService;

    /**
     * 查询物品列表
     */
    @RequiresPermissions("storehouse:item:list")
    @GetMapping("/list")
    public TableDataInfo list(Item item)
    {
        startPage();
        List<Item> list = itemService.selectItemList(item);
        return getDataTable(list);
    }

    /**
     * 导出物品列表
     */
    @RequiresPermissions("storehouse:item:export")
    @Log(title = "物品", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Item item)
    {
        List<Item> list = itemService.selectItemList(item);
        ExcelUtil<Item> util = new ExcelUtil<Item>(Item.class);
        util.exportExcel(response, list, "物品数据");
    }

    /**
     * 获取物品详细信息
     */
    @RequiresPermissions("storehouse:item:query")
    @GetMapping(value = "/{itemId}")
    public AjaxResult getInfo(@PathVariable("itemId") Long itemId)
    {
        return success(itemService.selectItemByItemId(itemId));
    }

    /**
     * 新增物品
     */
    @RequiresPermissions("storehouse:item:add")
    @Log(title = "物品", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Item item)
    {
        return toAjax(itemService.insertItem(item));
    }

    /**
     * 修改物品
     */
    @RequiresPermissions("storehouse:item:edit")
    @Log(title = "物品", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Item item)
    {
        return toAjax(itemService.updateItem(item));
    }

    /**
     * 删除物品
     */
    @RequiresPermissions("storehouse:item:remove")
    @Log(title = "物品", businessType = BusinessType.DELETE)
	@DeleteMapping("/{itemIds}")
    public AjaxResult remove(@PathVariable Long[] itemIds)
    {
        return toAjax(itemService.deleteItemByItemIds(itemIds));
    }
}
