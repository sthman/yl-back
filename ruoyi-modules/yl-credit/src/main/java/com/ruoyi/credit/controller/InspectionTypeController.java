package com.ruoyi.credit.controller;

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
import com.ruoyi.credit.domain.InspectionType;
import com.ruoyi.credit.service.IInspectionTypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 检查记录类型Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/type")
public class InspectionTypeController extends BaseController
{
    @Autowired
    private IInspectionTypeService inspectionTypeService;

    /**
     * 查询检查记录类型列表
     */
    @RequiresPermissions("credit:type:list")
    @GetMapping("/list")
    public TableDataInfo list(InspectionType inspectionType)
    {
        startPage();
        List<InspectionType> list = inspectionTypeService.selectInspectionTypeList(inspectionType);
        return getDataTable(list);
    }

    /**
     * 导出检查记录类型列表
     */
    @RequiresPermissions("credit:type:export")
    @Log(title = "检查记录类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, InspectionType inspectionType)
    {
        List<InspectionType> list = inspectionTypeService.selectInspectionTypeList(inspectionType);
        ExcelUtil<InspectionType> util = new ExcelUtil<InspectionType>(InspectionType.class);
        util.exportExcel(response, list, "检查记录类型数据");
    }

    /**
     * 获取检查记录类型详细信息
     */
    @RequiresPermissions("credit:type:query")
    @GetMapping(value = "/{inspectionTypeId}")
    public AjaxResult getInfo(@PathVariable("inspectionTypeId") Long inspectionTypeId)
    {
        return success(inspectionTypeService.selectInspectionTypeByInspectionTypeId(inspectionTypeId));
    }

    /**
     * 新增检查记录类型
     */
    @RequiresPermissions("credit:type:add")
    @Log(title = "检查记录类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody InspectionType inspectionType)
    {
        return toAjax(inspectionTypeService.insertInspectionType(inspectionType));
    }

    /**
     * 修改检查记录类型
     */
    @RequiresPermissions("credit:type:edit")
    @Log(title = "检查记录类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody InspectionType inspectionType)
    {
        return toAjax(inspectionTypeService.updateInspectionType(inspectionType));
    }

    /**
     * 删除检查记录类型
     */
    @RequiresPermissions("credit:type:remove")
    @Log(title = "检查记录类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{inspectionTypeIds}")
    public AjaxResult remove(@PathVariable Long[] inspectionTypeIds)
    {
        return toAjax(inspectionTypeService.deleteInspectionTypeByInspectionTypeIds(inspectionTypeIds));
    }
}
