package com.ruoyi.credit.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 整改记录对象 rectification
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Rectification extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 整改id */
    private Long rectificationId;

    /** 整改内容 */
    @Excel(name = "整改内容")
    private String rectificationContent;

    /** 整改后图片 */
    @Excel(name = "整改后图片")
    private String rectifyingImage;

    /** 整改提交时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "整改提交时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date submissionTime;

    /** 整改机构id */
    @Excel(name = "整改机构id")
    private Long orgId;

    /** 整改状态 */
    @Excel(name = "整改状态")
    private Long rectificationStatus;

    /** 整改结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "整改结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date rectificationTime;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setRectificationId(Long rectificationId) 
    {
        this.rectificationId = rectificationId;
    }

    public Long getRectificationId() 
    {
        return rectificationId;
    }
    public void setRectificationContent(String rectificationContent) 
    {
        this.rectificationContent = rectificationContent;
    }

    public String getRectificationContent() 
    {
        return rectificationContent;
    }
    public void setRectifyingImage(String rectifyingImage) 
    {
        this.rectifyingImage = rectifyingImage;
    }

    public String getRectifyingImage() 
    {
        return rectifyingImage;
    }
    public void setSubmissionTime(Date submissionTime) 
    {
        this.submissionTime = submissionTime;
    }

    public Date getSubmissionTime() 
    {
        return submissionTime;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setRectificationStatus(Long rectificationStatus) 
    {
        this.rectificationStatus = rectificationStatus;
    }

    public Long getRectificationStatus() 
    {
        return rectificationStatus;
    }
    public void setRectificationTime(Date rectificationTime) 
    {
        this.rectificationTime = rectificationTime;
    }

    public Date getRectificationTime() 
    {
        return rectificationTime;
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
            .append("rectificationId", getRectificationId())
            .append("rectificationContent", getRectificationContent())
            .append("rectifyingImage", getRectifyingImage())
            .append("submissionTime", getSubmissionTime())
            .append("orgId", getOrgId())
            .append("rectificationStatus", getRectificationStatus())
            .append("rectificationTime", getRectificationTime())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
