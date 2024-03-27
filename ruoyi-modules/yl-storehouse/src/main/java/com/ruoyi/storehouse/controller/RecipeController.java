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
import com.ruoyi.storehouse.domain.Recipe;
import com.ruoyi.storehouse.service.IRecipeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 食谱Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/recipe")
public class RecipeController extends BaseController
{
    @Autowired
    private IRecipeService recipeService;

    /**
     * 查询食谱列表
     */
    @RequiresPermissions("storehouse:recipe:list")
    @GetMapping("/list")
    public TableDataInfo list(Recipe recipe)
    {
        startPage();
        List<Recipe> list = recipeService.selectRecipeList(recipe);
        return getDataTable(list);
    }

    /**
     * 导出食谱列表
     */
    @RequiresPermissions("storehouse:recipe:export")
    @Log(title = "食谱", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Recipe recipe)
    {
        List<Recipe> list = recipeService.selectRecipeList(recipe);
        ExcelUtil<Recipe> util = new ExcelUtil<Recipe>(Recipe.class);
        util.exportExcel(response, list, "食谱数据");
    }

    /**
     * 获取食谱详细信息
     */
    @RequiresPermissions("storehouse:recipe:query")
    @GetMapping(value = "/{recipeId}")
    public AjaxResult getInfo(@PathVariable("recipeId") Long recipeId)
    {
        return success(recipeService.selectRecipeByRecipeId(recipeId));
    }

    /**
     * 新增食谱
     */
    @RequiresPermissions("storehouse:recipe:add")
    @Log(title = "食谱", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Recipe recipe)
    {
        return toAjax(recipeService.insertRecipe(recipe));
    }

    /**
     * 修改食谱
     */
    @RequiresPermissions("storehouse:recipe:edit")
    @Log(title = "食谱", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Recipe recipe)
    {
        return toAjax(recipeService.updateRecipe(recipe));
    }

    /**
     * 删除食谱
     */
    @RequiresPermissions("storehouse:recipe:remove")
    @Log(title = "食谱", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recipeIds}")
    public AjaxResult remove(@PathVariable Long[] recipeIds)
    {
        return toAjax(recipeService.deleteRecipeByRecipeIds(recipeIds));
    }
}
