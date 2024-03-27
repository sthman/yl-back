package com.ruoyi.tickets.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 话务工单对象 telwork
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Telwork extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 话务工单id */
    private Long telworkId;

    /** 话务工单单号 */
    @Excel(name = "话务工单单号")
    private String telworkNumber;

    /** 话务工单名称 */
    @Excel(name = "话务工单名称")
    private String telworkName;

    /** 话务工单申请人id */
    @Excel(name = "话务工单申请人id")
    private Long userId;

    /** 申请人手机号 */
    @Excel(name = "申请人手机号")
    private String userPhone;

    /** 话务工单负责机构id */
    @Excel(name = "话务工单负责机构id")
    private Long orgId;

    /** 话务工单调度人id */
    @Excel(name = "话务工单调度人id")
    private Long applicanDispatcherId;

    /** 话务工单创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "话务工单创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date creationTime;

    /** 话务工单状态 */
    @Excel(name = "话务工单状态")
    private Long orderStatus;

    /** 话务工单类型 */
    @Excel(name = "话务工单类型")
    private Long orderTypeId;

    /** 工单具体执行人员id */
    @Excel(name = "工单具体执行人员id")
    private Long executionPersonnel;

    /** 话务工单负责机构类型 */
    @Excel(name = "话务工单负责机构类型")
    private String responsibleOrgType;

    /** 话务工单内容 */
    @Excel(name = "话务工单内容")
    private String workOrderContent;

    /** 话务工单结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "话务工单结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setTelworkId(Long telworkId) 
    {
        this.telworkId = telworkId;
    }

    public Long getTelworkId() 
    {
        return telworkId;
    }
    public void setTelworkNumber(String telworkNumber) 
    {
        this.telworkNumber = telworkNumber;
    }

    public String getTelworkNumber() 
    {
        return telworkNumber;
    }
    public void setTelworkName(String telworkName) 
    {
        this.telworkName = telworkName;
    }

    public String getTelworkName() 
    {
        return telworkName;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUserPhone(String userPhone) 
    {
        this.userPhone = userPhone;
    }

    public String getUserPhone() 
    {
        return userPhone;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setApplicanDispatcherId(Long applicanDispatcherId) 
    {
        this.applicanDispatcherId = applicanDispatcherId;
    }

    public Long getApplicanDispatcherId() 
    {
        return applicanDispatcherId;
    }
    public void setCreationTime(Date creationTime) 
    {
        this.creationTime = creationTime;
    }

    public Date getCreationTime() 
    {
        return creationTime;
    }
    public void setOrderStatus(Long orderStatus) 
    {
        this.orderStatus = orderStatus;
    }

    public Long getOrderStatus() 
    {
        return orderStatus;
    }
    public void setOrderTypeId(Long orderTypeId) 
    {
        this.orderTypeId = orderTypeId;
    }

    public Long getOrderTypeId() 
    {
        return orderTypeId;
    }
    public void setExecutionPersonnel(Long executionPersonnel) 
    {
        this.executionPersonnel = executionPersonnel;
    }

    public Long getExecutionPersonnel() 
    {
        return executionPersonnel;
    }
    public void setResponsibleOrgType(String responsibleOrgType) 
    {
        this.responsibleOrgType = responsibleOrgType;
    }

    public String getResponsibleOrgType() 
    {
        return responsibleOrgType;
    }
    public void setWorkOrderContent(String workOrderContent) 
    {
        this.workOrderContent = workOrderContent;
    }

    public String getWorkOrderContent() 
    {
        return workOrderContent;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
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
            .append("telworkId", getTelworkId())
            .append("telworkNumber", getTelworkNumber())
            .append("telworkName", getTelworkName())
            .append("userId", getUserId())
            .append("userPhone", getUserPhone())
            .append("orgId", getOrgId())
            .append("applicanDispatcherId", getApplicanDispatcherId())
            .append("creationTime", getCreationTime())
            .append("orderStatus", getOrderStatus())
            .append("orderTypeId", getOrderTypeId())
            .append("executionPersonnel", getExecutionPersonnel())
            .append("responsibleOrgType", getResponsibleOrgType())
            .append("workOrderContent", getWorkOrderContent())
            .append("endTime", getEndTime())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
