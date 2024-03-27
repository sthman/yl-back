package com.ruoyi.health.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 定期服务对象 reservice
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Reservice extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 服务id */
    private Long reserviceId;

    /** 服务类型id */
    @Excel(name = "服务类型id")
    private Long reserviceTypeId;

    /** 服务机构id */
    @Excel(name = "服务机构id")
    private Long orgId;

    /** 服务人 */
    @Excel(name = "服务人")
    private Long userId;

    /** 健康信息表id */
    @Excel(name = "健康信息表id")
    private Long healthInformationId;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setReserviceId(Long reserviceId) 
    {
        this.reserviceId = reserviceId;
    }

    public Long getReserviceId() 
    {
        return reserviceId;
    }
    public void setReserviceTypeId(Long reserviceTypeId) 
    {
        this.reserviceTypeId = reserviceTypeId;
    }

    public Long getReserviceTypeId() 
    {
        return reserviceTypeId;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setHealthInformationId(Long healthInformationId) 
    {
        this.healthInformationId = healthInformationId;
    }

    public Long getHealthInformationId() 
    {
        return healthInformationId;
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
            .append("reserviceId", getReserviceId())
            .append("reserviceTypeId", getReserviceTypeId())
            .append("orgId", getOrgId())
            .append("userId", getUserId())
            .append("healthInformationId", getHealthInformationId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
