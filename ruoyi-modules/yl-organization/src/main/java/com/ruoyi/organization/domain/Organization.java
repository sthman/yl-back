package com.ruoyi.organization.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 机构信息对象 organization
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Organization extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 机构id */
    private Long orgId;

    /** 机构名称 */
    @Excel(name = "机构名称")
    private String orgName;

    /** 负责人 */
    @Excel(name = "负责人")
    private Long userId;

    /** 地址 */
    @Excel(name = "地址")
    private String orgAddress;

    /** 联系方式 */
    @Excel(name = "联系方式")
    private String orgPhone;

    /** 银行卡 */
    @Excel(name = "银行卡")
    private String orgCard;

    /** 信用积分 */
    @Excel(name = "信用积分")
    private Long orgStar;

    /** 类型id */
    @Excel(name = "类型id")
    private Long orgTypeId;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setOrgName(String orgName) 
    {
        this.orgName = orgName;
    }

    public String getOrgName() 
    {
        return orgName;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setOrgAddress(String orgAddress) 
    {
        this.orgAddress = orgAddress;
    }

    public String getOrgAddress() 
    {
        return orgAddress;
    }
    public void setOrgPhone(String orgPhone) 
    {
        this.orgPhone = orgPhone;
    }

    public String getOrgPhone() 
    {
        return orgPhone;
    }
    public void setOrgCard(String orgCard) 
    {
        this.orgCard = orgCard;
    }

    public String getOrgCard() 
    {
        return orgCard;
    }
    public void setOrgStar(Long orgStar) 
    {
        this.orgStar = orgStar;
    }

    public Long getOrgStar() 
    {
        return orgStar;
    }
    public void setOrgTypeId(Long orgTypeId) 
    {
        this.orgTypeId = orgTypeId;
    }

    public Long getOrgTypeId() 
    {
        return orgTypeId;
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
            .append("orgId", getOrgId())
            .append("orgName", getOrgName())
            .append("userId", getUserId())
            .append("orgAddress", getOrgAddress())
            .append("orgPhone", getOrgPhone())
            .append("orgCard", getOrgCard())
            .append("orgStar", getOrgStar())
            .append("orgTypeId", getOrgTypeId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
