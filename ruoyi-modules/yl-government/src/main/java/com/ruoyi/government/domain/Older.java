package com.ruoyi.government.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.ruoyi.system.api.domain.SysUser;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 老人信息对象 older
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Older extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 年龄 */
    @Excel(name = "年龄")
    private Long olderAge;

    /** 出生日期 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "出生日期", width = 30, dateFormat = "yyyy-MM-dd")
    private Date olderBirthdate;

    /** 地址 */
    @Excel(name = "地址")
    private String olderAddress;

    /** 养老方式 */
    @Excel(name = "养老方式")
    private String olderCaremethod;

    /** 银行卡号 */
    @Excel(name = "银行卡号")
    private String olderBankCardNumber;

    /** 用户状态 */
    @Excel(name = "用户状态")
    private Long olderUserStatus;

    /** 用户id */
    @Excel(name = "用户id")
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

    private SysUser user;

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public void setOlderAge(Long olderAge)
    {
        this.olderAge = olderAge;
    }

    public Long getOlderAge() 
    {
        return olderAge;
    }
    public void setOlderBirthdate(Date olderBirthdate) 
    {
        this.olderBirthdate = olderBirthdate;
    }

    public Date getOlderBirthdate() 
    {
        return olderBirthdate;
    }
    public void setOlderAddress(String olderAddress) 
    {
        this.olderAddress = olderAddress;
    }

    public String getOlderAddress() 
    {
        return olderAddress;
    }
    public void setOlderCaremethod(String olderCaremethod) 
    {
        this.olderCaremethod = olderCaremethod;
    }

    public String getOlderCaremethod() 
    {
        return olderCaremethod;
    }
    public void setOlderBankCardNumber(String olderBankCardNumber) 
    {
        this.olderBankCardNumber = olderBankCardNumber;
    }

    public String getOlderBankCardNumber() 
    {
        return olderBankCardNumber;
    }
    public void setOlderUserStatus(Long olderUserStatus) 
    {
        this.olderUserStatus = olderUserStatus;
    }

    public Long getOlderUserStatus() 
    {
        return olderUserStatus;
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
            .append("olderAge", getOlderAge())
            .append("olderBirthdate", getOlderBirthdate())
            .append("olderAddress", getOlderAddress())
            .append("olderCaremethod", getOlderCaremethod())
            .append("olderBankCardNumber", getOlderBankCardNumber())
            .append("olderUserStatus", getOlderUserStatus())
            .append("userId", getUserId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
