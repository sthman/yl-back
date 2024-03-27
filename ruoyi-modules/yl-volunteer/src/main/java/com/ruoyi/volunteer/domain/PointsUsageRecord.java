package com.ruoyi.volunteer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 积分使用记录对象 points_usage_record
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class PointsUsageRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录id */
    private Long recordId;

    /** 使用时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "使用时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date usageTime;

    /** 使用详情（原因） */
    @Excel(name = "使用详情", readConverterExp = "原=因")
    private String usageDetails;

    /** 服务id */
    @Excel(name = "服务id")
    private Long serviceId;

    /** 服务次数 */
    @Excel(name = "服务次数")
    private Long serviceTimes;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setRecordId(Long recordId) 
    {
        this.recordId = recordId;
    }

    public Long getRecordId() 
    {
        return recordId;
    }
    public void setUsageTime(Date usageTime) 
    {
        this.usageTime = usageTime;
    }

    public Date getUsageTime() 
    {
        return usageTime;
    }
    public void setUsageDetails(String usageDetails) 
    {
        this.usageDetails = usageDetails;
    }

    public String getUsageDetails() 
    {
        return usageDetails;
    }
    public void setServiceId(Long serviceId) 
    {
        this.serviceId = serviceId;
    }

    public Long getServiceId() 
    {
        return serviceId;
    }
    public void setServiceTimes(Long serviceTimes) 
    {
        this.serviceTimes = serviceTimes;
    }

    public Long getServiceTimes() 
    {
        return serviceTimes;
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
            .append("recordId", getRecordId())
            .append("usageTime", getUsageTime())
            .append("usageDetails", getUsageDetails())
            .append("serviceId", getServiceId())
            .append("serviceTimes", getServiceTimes())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
