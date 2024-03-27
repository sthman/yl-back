package com.ruoyi.storehouse.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 设施使用记录对象 facility_usage_record
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class FacilityUsageRecord extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 记录id，主键，自增 */
    private Long recordId;

    /** 使用者id，外键（未设置） */
    @Excel(name = "使用者id，外键", readConverterExp = "未=设置")
    private Long userId;

    /** 使用开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "使用开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date usageStartTime;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date usageEndTime;

    /** 机构id，外键（未设置） */
    @Excel(name = "机构id，外键", readConverterExp = "未=设置")
    private Long orgId;

    /** 物品id,外键（未设置） */
    @Excel(name = "物品id,外键", readConverterExp = "未=设置")
    private Long itemId;

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
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setUsageStartTime(Date usageStartTime) 
    {
        this.usageStartTime = usageStartTime;
    }

    public Date getUsageStartTime() 
    {
        return usageStartTime;
    }
    public void setUsageEndTime(Date usageEndTime) 
    {
        this.usageEndTime = usageEndTime;
    }

    public Date getUsageEndTime() 
    {
        return usageEndTime;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
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
            .append("userId", getUserId())
            .append("usageStartTime", getUsageStartTime())
            .append("usageEndTime", getUsageEndTime())
            .append("orgId", getOrgId())
            .append("itemId", getItemId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
