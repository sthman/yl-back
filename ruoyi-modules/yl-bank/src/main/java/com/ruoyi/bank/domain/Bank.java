package com.ruoyi.bank.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 银行信息对象 bank
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Bank extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 银行id */
    private Long bankId;

    /** 银行名称 */
    @Excel(name = "银行名称")
    private String bankName;

    /** 银行负责人 */
    @Excel(name = "银行负责人")
    private String bankHead;

    /** 银行地址 */
    @Excel(name = "银行地址")
    private String bankAddress;

    /** 银行对公账户 */
    @Excel(name = "银行对公账户")
    private String bankPublicAccount;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setBankId(Long bankId) 
    {
        this.bankId = bankId;
    }

    public Long getBankId() 
    {
        return bankId;
    }
    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }
    public void setBankHead(String bankHead) 
    {
        this.bankHead = bankHead;
    }

    public String getBankHead() 
    {
        return bankHead;
    }
    public void setBankAddress(String bankAddress) 
    {
        this.bankAddress = bankAddress;
    }

    public String getBankAddress() 
    {
        return bankAddress;
    }
    public void setBankPublicAccount(String bankPublicAccount) 
    {
        this.bankPublicAccount = bankPublicAccount;
    }

    public String getBankPublicAccount() 
    {
        return bankPublicAccount;
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
            .append("bankId", getBankId())
            .append("bankName", getBankName())
            .append("bankHead", getBankHead())
            .append("bankAddress", getBankAddress())
            .append("bankPublicAccount", getBankPublicAccount())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
