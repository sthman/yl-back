package com.ruoyi.tickets.service;

import java.util.List;
import com.ruoyi.tickets.domain.WorkOrder;

/**
 * 执行工单Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IWorkOrderService 
{
    /**
     * 查询执行工单
     * 
     * @param workOrderId 执行工单主键
     * @return 执行工单
     */
    public WorkOrder selectWorkOrderByWorkOrderId(Long workOrderId);

    /**
     * 查询执行工单列表
     * 
     * @param workOrder 执行工单
     * @return 执行工单集合
     */
    public List<WorkOrder> selectWorkOrderList(WorkOrder workOrder);

    /**
     * 新增执行工单
     * 
     * @param workOrder 执行工单
     * @return 结果
     */
    public int insertWorkOrder(WorkOrder workOrder);

    /**
     * 修改执行工单
     * 
     * @param workOrder 执行工单
     * @return 结果
     */
    public int updateWorkOrder(WorkOrder workOrder);

    /**
     * 批量删除执行工单
     * 
     * @param workOrderIds 需要删除的执行工单主键集合
     * @return 结果
     */
    public int deleteWorkOrderByWorkOrderIds(Long[] workOrderIds);

    /**
     * 删除执行工单信息
     * 
     * @param workOrderId 执行工单主键
     * @return 结果
     */
    public int deleteWorkOrderByWorkOrderId(Long workOrderId);
}
