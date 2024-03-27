package com.ruoyi.health.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 健康信息对象 health_information
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class HealthInformation extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 健康信息id */
    private Long healthInformationId;

    /** 老人id */
    @Excel(name = "老人id")
    private Long olderId;

    /** 检查人姓名 */
    @Excel(name = "检查人姓名")
    private Long userId;

    /** 健康状况 */
    @Excel(name = "健康状况")
    private String healthCondition;

    /** 上传健康信息excel */
    @Excel(name = "上传健康信息excel")
    private String uploadExcel;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setHealthInformationId(Long healthInformationId) 
    {
        this.healthInformationId = healthInformationId;
    }

    public Long getHealthInformationId() 
    {
        return healthInformationId;
    }
    public void setOlderId(Long olderId) 
    {
        this.olderId = olderId;
    }

    public Long getOlderId() 
    {
        return olderId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setHealthCondition(String healthCondition) 
    {
        this.healthCondition = healthCondition;
    }

    public String getHealthCondition() 
    {
        return healthCondition;
    }
    public void setUploadExcel(String uploadExcel) 
    {
        this.uploadExcel = uploadExcel;
    }

    public String getUploadExcel() 
    {
        return uploadExcel;
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
            .append("healthInformationId", getHealthInformationId())
            .append("olderId", getOlderId())
            .append("userId", getUserId())
            .append("healthCondition", getHealthCondition())
            .append("uploadExcel", getUploadExcel())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
