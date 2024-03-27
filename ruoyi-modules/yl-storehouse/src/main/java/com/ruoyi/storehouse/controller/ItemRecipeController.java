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
import com.ruoyi.storehouse.domain.ItemRecipe;
import com.ruoyi.storehouse.service.IItemRecipeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 物品-食谱关系Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/itemrecipe")
public class ItemRecipeController extends BaseController
{
    @Autowired
    private IItemRecipeService itemRecipeService;

    /**
     * 查询物品-食谱关系列表
     */
    @RequiresPermissions("storehouse:itemrecipe:list")
    @GetMapping("/list")
    public TableDataInfo list(ItemRecipe itemRecipe)
    {
        startPage();
        List<ItemRecipe> list = itemRecipeService.selectItemRecipeList(itemRecipe);
        return getDataTable(list);
    }

    /**
     * 导出物品-食谱关系列表
     */
    @RequiresPermissions("storehouse:itemrecipe:export")
    @Log(title = "物品-食谱关系", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ItemRecipe itemRecipe)
    {
        List<ItemRecipe> list = itemRecipeService.selectItemRecipeList(itemRecipe);
        ExcelUtil<ItemRecipe> util = new ExcelUtil<ItemRecipe>(ItemRecipe.class);
        util.exportExcel(response, list, "物品-食谱关系数据");
    }

    /**
     * 获取物品-食谱关系详细信息
     */
    @RequiresPermissions("storehouse:itemrecipe:query")
    @GetMapping(value = "/{itemId}")
    public AjaxResult getInfo(@PathVariable("itemId") Long itemId)
    {
        return success(itemRecipeService.selectItemRecipeByItemId(itemId));
    }

    /**
     * 新增物品-食谱关系
     */
    @RequiresPermissions("storehouse:itemrecipe:add")
    @Log(title = "物品-食谱关系", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ItemRecipe itemRecipe)
    {
        return toAjax(itemRecipeService.insertItemRecipe(itemRecipe));
    }

    /**
     * 修改物品-食谱关系
     */
    @RequiresPermissions("storehouse:itemrecipe:edit")
    @Log(title = "物品-食谱关系", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ItemRecipe itemRecipe)
    {
        return toAjax(itemRecipeService.updateItemRecipe(itemRecipe));
    }

    /**
     * 删除物品-食谱关系
     */
    @RequiresPermissions("storehouse:itemrecipe:remove")
    @Log(title = "物品-食谱关系", businessType = BusinessType.DELETE)
	@DeleteMapping("/{itemIds}")
    public AjaxResult remove(@PathVariable Long[] itemIds)
    {
        return toAjax(itemRecipeService.deleteItemRecipeByItemIds(itemIds));
    }
}
