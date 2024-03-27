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
import com.ruoyi.credit.domain.Inspection;
import com.ruoyi.credit.service.IInspectionService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 检查记录Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/inspection")
public class InspectionController extends BaseController
{
    @Autowired
    private IInspectionService inspectionService;

    /**
     * 查询检查记录列表
     */
    @RequiresPermissions("credit:inspection:list")
    @GetMapping("/list")
    public TableDataInfo list(Inspection inspection)
    {
        startPage();
        List<Inspection> list = inspectionService.selectInspectionList(inspection);
        return getDataTable(list);
    }

    /**
     * 导出检查记录列表
     */
    @RequiresPermissions("credit:inspection:export")
    @Log(title = "检查记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Inspection inspection)
    {
        List<Inspection> list = inspectionService.selectInspectionList(inspection);
        ExcelUtil<Inspection> util = new ExcelUtil<Inspection>(Inspection.class);
        util.exportExcel(response, list, "检查记录数据");
    }

    /**
     * 获取检查记录详细信息
     */
    @RequiresPermissions("credit:inspection:query")
    @GetMapping(value = "/{inspectionId}")
    public AjaxResult getInfo(@PathVariable("inspectionId") Long inspectionId)
    {
        return success(inspectionService.selectInspectionByInspectionId(inspectionId));
    }

    /**
     * 新增检查记录
     */
    @RequiresPermissions("credit:inspection:add")
    @Log(title = "检查记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Inspection inspection)
    {
        return toAjax(inspectionService.insertInspection(inspection));
    }

    /**
     * 修改检查记录
     */
    @RequiresPermissions("credit:inspection:edit")
    @Log(title = "检查记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Inspection inspection)
    {
        return toAjax(inspectionService.updateInspection(inspection));
    }

    /**
     * 删除检查记录
     */
    @RequiresPermissions("credit:inspection:remove")
    @Log(title = "检查记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{inspectionIds}")
    public AjaxResult remove(@PathVariable Long[] inspectionIds)
    {
        return toAjax(inspectionService.deleteInspectionByInspectionIds(inspectionIds));
    }
}
