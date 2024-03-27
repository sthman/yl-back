package com.ruoyi.tickets.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 执行工单对象 work_order
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class WorkOrder extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 工单id */
    private Long workOrderId;

    /** 工单名称 */
    @Excel(name = "工单名称")
    private String workOrderName;

    /** 工单执行机构id */
    @Excel(name = "工单执行机构id")
    private Long orgId;

    /** 执行负责人id */
    @Excel(name = "执行负责人id")
    private Long responsiblePerson;

    /** 工单创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "工单创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 工单结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "工单结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 话务工单id */
    @Excel(name = "话务工单id")
    private Long telworkId;

    /** 执行工单状态 */
    @Excel(name = "执行工单状态")
    private Long executedStatus;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setWorkOrderId(Long workOrderId) 
    {
        this.workOrderId = workOrderId;
    }

    public Long getWorkOrderId() 
    {
        return workOrderId;
    }
    public void setWorkOrderName(String workOrderName) 
    {
        this.workOrderName = workOrderName;
    }

    public String getWorkOrderName() 
    {
        return workOrderName;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setResponsiblePerson(Long responsiblePerson) 
    {
        this.responsiblePerson = responsiblePerson;
    }

    public Long getResponsiblePerson() 
    {
        return responsiblePerson;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setTelworkId(Long telworkId) 
    {
        this.telworkId = telworkId;
    }

    public Long getTelworkId() 
    {
        return telworkId;
    }
    public void setExecutedStatus(Long executedStatus) 
    {
        this.executedStatus = executedStatus;
    }

    public Long getExecutedStatus() 
    {
        return executedStatus;
    }
    public void setBeiyong1(String beiyong1) 
    {
        this.beiyong1 = beiyong1;
    }

    public String getBeiyong1() 
    {
        return beiyong1;
    }
    public void setBeiyong2(String beiyong2) 
    {
        this.beiyong2 = beiyong2;
    }

    public String getBeiyong2() 
    {
        return beiyong2;
    }
    public void setBeiyong3(String beiyong3) 
    {
        this.beiyong3 = beiyong3;
    }

    public String getBeiyong3() 
    {
        return beiyong3;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("workOrderId", getWorkOrderId())
            .append("workOrderName", getWorkOrderName())
            .append("orgId", getOrgId())
            .append("responsiblePerson", getResponsiblePerson())
            .append("createdTime", getCreatedTime())
            .append("endTime", getEndTime())
            .append("telworkId", getTelworkId())
            .append("executedStatus", getExecutedStatus())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
