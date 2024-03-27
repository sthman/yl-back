package com.ruoyi.tickets.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tickets.mapper.WorkOrderMapper;
import com.ruoyi.tickets.domain.WorkOrder;
import com.ruoyi.tickets.service.IWorkOrderService;

/**
 * 执行工单Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class WorkOrderServiceImpl implements IWorkOrderService 
{
    @Autowired
    private WorkOrderMapper workOrderMapper;

    /**
     * 查询执行工单
     * 
     * @param workOrderId 执行工单主键
     * @return 执行工单
     */
    @Override
    public WorkOrder selectWorkOrderByWorkOrderId(Long workOrderId)
    {
        return workOrderMapper.selectWorkOrderByWorkOrderId(workOrderId);
    }

    /**
     * 查询执行工单列表
     * 
     * @param workOrder 执行工单
     * @return 执行工单
     */
    @Override
    public List<WorkOrder> selectWorkOrderList(WorkOrder workOrder)
    {
        return workOrderMapper.selectWorkOrderList(workOrder);
    }

    /**
     * 新增执行工单
     * 
     * @param workOrder 执行工单
     * @return 结果
     */
    @Override
    public int insertWorkOrder(WorkOrder workOrder)
    {
        return workOrderMapper.insertWorkOrder(workOrder);
    }

    /**
     * 修改执行工单
     * 
     * @param workOrder 执行工单
     * @return 结果
     */
    @Override
    public int updateWorkOrder(WorkOrder workOrder)
    {
        return workOrderMapper.updateWorkOrder(workOrder);
    }

    /**
     * 批量删除执行工单
     * 
     * @param workOrderIds 需要删除的执行工单主键
     * @return 结果
     */
    @Override
    public int deleteWorkOrderByWorkOrderIds(Long[] workOrderIds)
    {
        return workOrderMapper.deleteWorkOrderByWorkOrderIds(workOrderIds);
    }

    /**
     * 删除执行工单信息
     * 
     * @param workOrderId 执行工单主键
     * @return 结果
     */
    @Override
    public int deleteWorkOrderByWorkOrderId(Long workOrderId)
    {
        return workOrderMapper.deleteWorkOrderByWorkOrderId(workOrderId);
    }
}
