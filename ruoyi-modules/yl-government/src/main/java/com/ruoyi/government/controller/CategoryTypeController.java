package com.ruoyi.government.controller;

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
import com.ruoyi.government.domain.CategoryType;
import com.ruoyi.government.service.ICategoryTypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 知识库类别Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/type")
public class CategoryTypeController extends BaseController
{
    @Autowired
    private ICategoryTypeService categoryTypeService;

    /**
     * 查询知识库类别列表
     */
    @RequiresPermissions("government:type:list")
    @GetMapping("/list")
    public TableDataInfo list(CategoryType categoryType)
    {
        startPage();
        List<CategoryType> list = categoryTypeService.selectCategoryTypeList(categoryType);
        return getDataTable(list);
    }

    /**
     * 导出知识库类别列表
     */
    @RequiresPermissions("government:type:export")
    @Log(title = "知识库类别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, CategoryType categoryType)
    {
        List<CategoryType> list = categoryTypeService.selectCategoryTypeList(categoryType);
        ExcelUtil<CategoryType> util = new ExcelUtil<CategoryType>(CategoryType.class);
        util.exportExcel(response, list, "知识库类别数据");
    }

    /**
     * 获取知识库类别详细信息
     */
    @RequiresPermissions("government:type:query")
    @GetMapping(value = "/{categoryTypeId}")
    public AjaxResult getInfo(@PathVariable("categoryTypeId") Long categoryTypeId)
    {
        return success(categoryTypeService.selectCategoryTypeByCategoryTypeId(categoryTypeId));
    }

    /**
     * 新增知识库类别
     */
    @RequiresPermissions("government:type:add")
    @Log(title = "知识库类别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody CategoryType categoryType)
    {
        return toAjax(categoryTypeService.insertCategoryType(categoryType));
    }

    /**
     * 修改知识库类别
     */
    @RequiresPermissions("government:type:edit")
    @Log(title = "知识库类别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody CategoryType categoryType)
    {
        return toAjax(categoryTypeService.updateCategoryType(categoryType));
    }

    /**
     * 删除知识库类别
     */
    @RequiresPermissions("government:type:remove")
    @Log(title = "知识库类别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{categoryTypeIds}")
    public AjaxResult remove(@PathVariable Long[] categoryTypeIds)
    {
        return toAjax(categoryTypeService.deleteCategoryTypeByCategoryTypeIds(categoryTypeIds));
    }
}
