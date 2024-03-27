package com.ruoyi.funds.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 补贴类型对象 subsidy_type
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class SubsidyType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 补贴类型id */
    private Long subsidyTypeId;

    /** 补贴类型名称 */
    @Excel(name = "补贴类型名称")
    private String subsidyTypeName;

    /** 补贴金额 */
    @Excel(name = "补贴金额")
    private Long subsidyAmount;

    /** 发放时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发放时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date distributionTime;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setSubsidyTypeId(Long subsidyTypeId) 
    {
        this.subsidyTypeId = subsidyTypeId;
    }

    public Long getSubsidyTypeId() 
    {
        return subsidyTypeId;
    }
    public void setSubsidyTypeName(String subsidyTypeName) 
    {
        this.subsidyTypeName = subsidyTypeName;
    }

    public String getSubsidyTypeName() 
    {
        return subsidyTypeName;
    }
    public void setSubsidyAmount(Long subsidyAmount) 
    {
        this.subsidyAmount = subsidyAmount;
    }

    public Long getSubsidyAmount() 
    {
        return subsidyAmount;
    }
    public void setDistributionTime(Date distributionTime) 
    {
        this.distributionTime = distributionTime;
    }

    public Date getDistributionTime() 
    {
        return distributionTime;
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
            .append("subsidyTypeId", getSubsidyTypeId())
            .append("subsidyTypeName", getSubsidyTypeName())
            .append("subsidyAmount", getSubsidyAmount())
            .append("distributionTime", getDistributionTime())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
