package com.ruoyi.funds.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 补贴信息对象 subsidy_info
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class SubsidyInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 补贴信息id */
    private Long subsidyInfoId;

    /** 补贴类型id */
    @Excel(name = "补贴类型id")
    private Long subsidyTypeId;

    /** 资金数量 */
    @Excel(name = "资金数量")
    private Long amountFunds;

    /** 发放时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发放时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date distributionTime;

    /** 发放银行id */
    @Excel(name = "发放银行id")
    private Long bankId;

    /** 收款人id */
    @Excel(name = "收款人id")
    private Long userId;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setSubsidyInfoId(Long subsidyInfoId) 
    {
        this.subsidyInfoId = subsidyInfoId;
    }

    public Long getSubsidyInfoId() 
    {
        return subsidyInfoId;
    }
    public void setSubsidyTypeId(Long subsidyTypeId) 
    {
        this.subsidyTypeId = subsidyTypeId;
    }

    public Long getSubsidyTypeId() 
    {
        return subsidyTypeId;
    }
    public void setAmountFunds(Long amountFunds) 
    {
        this.amountFunds = amountFunds;
    }

    public Long getAmountFunds() 
    {
        return amountFunds;
    }
    public void setDistributionTime(Date distributionTime) 
    {
        this.distributionTime = distributionTime;
    }

    public Date getDistributionTime() 
    {
        return distributionTime;
    }
    public void setBankId(Long bankId) 
    {
        this.bankId = bankId;
    }

    public Long getBankId() 
    {
        return bankId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
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
            .append("subsidyInfoId", getSubsidyInfoId())
            .append("subsidyTypeId", getSubsidyTypeId())
            .append("amountFunds", getAmountFunds())
            .append("distributionTime", getDistributionTime())
            .append("bankId", getBankId())
            .append("userId", getUserId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
