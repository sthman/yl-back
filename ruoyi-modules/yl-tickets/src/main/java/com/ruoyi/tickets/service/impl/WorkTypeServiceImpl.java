package com.ruoyi.tickets.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.tickets.mapper.WorkTypeMapper;
import com.ruoyi.tickets.domain.WorkType;
import com.ruoyi.tickets.service.IWorkTypeService;

/**
 * 工单类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class WorkTypeServiceImpl implements IWorkTypeService 
{
    @Autowired
    private WorkTypeMapper workTypeMapper;

    /**
     * 查询工单类型
     * 
     * @param orderTypeId 工单类型主键
     * @return 工单类型
     */
    @Override
    public WorkType selectWorkTypeByOrderTypeId(Long orderTypeId)
    {
        return workTypeMapper.selectWorkTypeByOrderTypeId(orderTypeId);
    }

    /**
     * 查询工单类型列表
     * 
     * @param workType 工单类型
     * @return 工单类型
     */
    @Override
    public List<WorkType> selectWorkTypeList(WorkType workType)
    {
        return workTypeMapper.selectWorkTypeList(workType);
    }

    /**
     * 新增工单类型
     * 
     * @param workType 工单类型
     * @return 结果
     */
    @Override
    public int insertWorkType(WorkType workType)
    {
        return workTypeMapper.insertWorkType(workType);
    }

    /**
     * 修改工单类型
     * 
     * @param workType 工单类型
     * @return 结果
     */
    @Override
    public int updateWorkType(WorkType workType)
    {
        return workTypeMapper.updateWorkType(workType);
    }

    /**
     * 批量删除工单类型
     * 
     * @param orderTypeIds 需要删除的工单类型主键
     * @return 结果
     */
    @Override
    public int deleteWorkTypeByOrderTypeIds(Long[] orderTypeIds)
    {
        return workTypeMapper.deleteWorkTypeByOrderTypeIds(orderTypeIds);
    }

    /**
     * 删除工单类型信息
     * 
     * @param orderTypeId 工单类型主键
     * @return 结果
     */
    @Override
    public int deleteWorkTypeByOrderTypeId(Long orderTypeId)
    {
        return workTypeMapper.deleteWorkTypeByOrderTypeId(orderTypeId);
    }
}
