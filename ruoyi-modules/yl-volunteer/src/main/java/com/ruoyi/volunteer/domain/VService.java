package com.ruoyi.volunteer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 积分服务对象 v_service
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class VService extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 服务表id */
    private Long vServiceId;

    /** 服务名称 */
    @Excel(name = "服务名称")
    private String vServiceName;

    /** 消耗积分 */
    @Excel(name = "消耗积分")
    private Long spendPoints;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setvServiceId(Long vServiceId) 
    {
        this.vServiceId = vServiceId;
    }

    public Long getvServiceId() 
    {
        return vServiceId;
    }
    public void setvServiceName(String vServiceName) 
    {
        this.vServiceName = vServiceName;
    }

    public String getvServiceName() 
    {
        return vServiceName;
    }
    public void setSpendPoints(Long spendPoints) 
    {
        this.spendPoints = spendPoints;
    }

    public Long getSpendPoints() 
    {
        return spendPoints;
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
            .append("vServiceId", getvServiceId())
            .append("vServiceName", getvServiceName())
            .append("spendPoints", getSpendPoints())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
