package com.ruoyi.funds.controller;

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
import com.ruoyi.funds.domain.SubsidyType;
import com.ruoyi.funds.service.ISubsidyTypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 补贴类型Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/type")
public class SubsidyTypeController extends BaseController
{
    @Autowired
    private ISubsidyTypeService subsidyTypeService;

    /**
     * 查询补贴类型列表
     */
    @RequiresPermissions("funds:type:list")
    @GetMapping("/list")
    public TableDataInfo list(SubsidyType subsidyType)
    {
        startPage();
        List<SubsidyType> list = subsidyTypeService.selectSubsidyTypeList(subsidyType);
        return getDataTable(list);
    }

    /**
     * 导出补贴类型列表
     */
    @RequiresPermissions("funds:type:export")
    @Log(title = "补贴类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SubsidyType subsidyType)
    {
        List<SubsidyType> list = subsidyTypeService.selectSubsidyTypeList(subsidyType);
        ExcelUtil<SubsidyType> util = new ExcelUtil<SubsidyType>(SubsidyType.class);
        util.exportExcel(response, list, "补贴类型数据");
    }

    /**
     * 获取补贴类型详细信息
     */
    @RequiresPermissions("funds:type:query")
    @GetMapping(value = "/{subsidyTypeId}")
    public AjaxResult getInfo(@PathVariable("subsidyTypeId") Long subsidyTypeId)
    {
        return success(subsidyTypeService.selectSubsidyTypeBySubsidyTypeId(subsidyTypeId));
    }

    /**
     * 新增补贴类型
     */
    @RequiresPermissions("funds:type:add")
    @Log(title = "补贴类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SubsidyType subsidyType)
    {
        return toAjax(subsidyTypeService.insertSubsidyType(subsidyType));
    }

    /**
     * 修改补贴类型
     */
    @RequiresPermissions("funds:type:edit")
    @Log(title = "补贴类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SubsidyType subsidyType)
    {
        return toAjax(subsidyTypeService.updateSubsidyType(subsidyType));
    }

    /**
     * 删除补贴类型
     */
    @RequiresPermissions("funds:type:remove")
    @Log(title = "补贴类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{subsidyTypeIds}")
    public AjaxResult remove(@PathVariable Long[] subsidyTypeIds)
    {
        return toAjax(subsidyTypeService.deleteSubsidyTypeBySubsidyTypeIds(subsidyTypeIds));
    }
}
