package com.ruoyi.tickets.controller;

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
import com.ruoyi.tickets.domain.WorkType;
import com.ruoyi.tickets.service.IWorkTypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 工单类型Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/type")
public class WorkTypeController extends BaseController
{
    @Autowired
    private IWorkTypeService workTypeService;

    /**
     * 查询工单类型列表
     */
    @RequiresPermissions("tickets:type:list")
    @GetMapping("/list")
    public TableDataInfo list(WorkType workType)
    {
        startPage();
        List<WorkType> list = workTypeService.selectWorkTypeList(workType);
        return getDataTable(list);
    }

    /**
     * 导出工单类型列表
     */
    @RequiresPermissions("tickets:type:export")
    @Log(title = "工单类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WorkType workType)
    {
        List<WorkType> list = workTypeService.selectWorkTypeList(workType);
        ExcelUtil<WorkType> util = new ExcelUtil<WorkType>(WorkType.class);
        util.exportExcel(response, list, "工单类型数据");
    }

    /**
     * 获取工单类型详细信息
     */
    @RequiresPermissions("tickets:type:query")
    @GetMapping(value = "/{orderTypeId}")
    public AjaxResult getInfo(@PathVariable("orderTypeId") Long orderTypeId)
    {
        return success(workTypeService.selectWorkTypeByOrderTypeId(orderTypeId));
    }

    /**
     * 新增工单类型
     */
    @RequiresPermissions("tickets:type:add")
    @Log(title = "工单类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WorkType workType)
    {
        return toAjax(workTypeService.insertWorkType(workType));
    }

    /**
     * 修改工单类型
     */
    @RequiresPermissions("tickets:type:edit")
    @Log(title = "工单类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WorkType workType)
    {
        return toAjax(workTypeService.updateWorkType(workType));
    }

    /**
     * 删除工单类型
     */
    @RequiresPermissions("tickets:type:remove")
    @Log(title = "工单类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orderTypeIds}")
    public AjaxResult remove(@PathVariable Long[] orderTypeIds)
    {
        return toAjax(workTypeService.deleteWorkTypeByOrderTypeIds(orderTypeIds));
    }
}
