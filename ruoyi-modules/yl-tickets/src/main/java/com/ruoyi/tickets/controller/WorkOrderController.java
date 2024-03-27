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
import com.ruoyi.tickets.domain.WorkOrder;
import com.ruoyi.tickets.service.IWorkOrderService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 执行工单Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/worder")
public class WorkOrderController extends BaseController
{
    @Autowired
    private IWorkOrderService workOrderService;

    /**
     * 查询执行工单列表
     */
    @RequiresPermissions("tickets:worder:list")
    @GetMapping("/list")
    public TableDataInfo list(WorkOrder workOrder)
    {
        startPage();
        List<WorkOrder> list = workOrderService.selectWorkOrderList(workOrder);
        return getDataTable(list);
    }

    /**
     * 导出执行工单列表
     */
    @RequiresPermissions("tickets:worder:export")
    @Log(title = "执行工单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, WorkOrder workOrder)
    {
        List<WorkOrder> list = workOrderService.selectWorkOrderList(workOrder);
        ExcelUtil<WorkOrder> util = new ExcelUtil<WorkOrder>(WorkOrder.class);
        util.exportExcel(response, list, "执行工单数据");
    }

    /**
     * 获取执行工单详细信息
     */
    @RequiresPermissions("tickets:worder:query")
    @GetMapping(value = "/{workOrderId}")
    public AjaxResult getInfo(@PathVariable("workOrderId") Long workOrderId)
    {
        return success(workOrderService.selectWorkOrderByWorkOrderId(workOrderId));
    }

    /**
     * 新增执行工单
     */
    @RequiresPermissions("tickets:worder:add")
    @Log(title = "执行工单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody WorkOrder workOrder)
    {
        return toAjax(workOrderService.insertWorkOrder(workOrder));
    }

    /**
     * 修改执行工单
     */
    @RequiresPermissions("tickets:worder:edit")
    @Log(title = "执行工单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody WorkOrder workOrder)
    {
        return toAjax(workOrderService.updateWorkOrder(workOrder));
    }

    /**
     * 删除执行工单
     */
    @RequiresPermissions("tickets:worder:remove")
    @Log(title = "执行工单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{workOrderIds}")
    public AjaxResult remove(@PathVariable Long[] workOrderIds)
    {
        return toAjax(workOrderService.deleteWorkOrderByWorkOrderIds(workOrderIds));
    }
}
