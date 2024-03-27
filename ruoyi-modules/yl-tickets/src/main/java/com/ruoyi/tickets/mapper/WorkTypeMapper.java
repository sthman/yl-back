package com.ruoyi.tickets.mapper;

import java.util.List;
import com.ruoyi.tickets.domain.WorkType;

/**
 * 工单类型Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface WorkTypeMapper 
{
    /**
     * 查询工单类型
     * 
     * @param orderTypeId 工单类型主键
     * @return 工单类型
     */
    public WorkType selectWorkTypeByOrderTypeId(Long orderTypeId);

    /**
     * 查询工单类型列表
     * 
     * @param workType 工单类型
     * @return 工单类型集合
     */
    public List<WorkType> selectWorkTypeList(WorkType workType);

    /**
     * 新增工单类型
     * 
     * @param workType 工单类型
     * @return 结果
     */
    public int insertWorkType(WorkType workType);

    /**
     * 修改工单类型
     * 
     * @param workType 工单类型
     * @return 结果
     */
    public int updateWorkType(WorkType workType);

    /**
     * 删除工单类型
     * 
     * @param orderTypeId 工单类型主键
     * @return 结果
     */
    public int deleteWorkTypeByOrderTypeId(Long orderTypeId);

    /**
     * 批量删除工单类型
     * 
     * @param orderTypeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteWorkTypeByOrderTypeIds(Long[] orderTypeIds);
}
