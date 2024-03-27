package com.ruoyi.credit.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 检查记录对象 inspection
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Inspection extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 检查id */
    private Long inspectionId;

    /** 检查类型 */
    @Excel(name = "检查类型")
    private Long inspectionTypeId;

    /** 被检查机构id */
    @Excel(name = "被检查机构id")
    private Long orgId;

    /** 是否需要整改 */
    @Excel(name = "是否需要整改")
    private String requiresCorrection;

    /** 需要整改的问题 */
    @Excel(name = "需要整改的问题")
    private String correctionIssues;

    /** 图片1 */
    @Excel(name = "图片1")
    private String image1;

    /** 图片2 */
    @Excel(name = "图片2")
    private String image2;

    /** 图片3 */
    @Excel(name = "图片3")
    private String image3;

    /** 检查时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "检查时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date inspectionTime;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setInspectionId(Long inspectionId) 
    {
        this.inspectionId = inspectionId;
    }

    public Long getInspectionId() 
    {
        return inspectionId;
    }
    public void setInspectionTypeId(Long inspectionTypeId) 
    {
        this.inspectionTypeId = inspectionTypeId;
    }

    public Long getInspectionTypeId() 
    {
        return inspectionTypeId;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setRequiresCorrection(String requiresCorrection) 
    {
        this.requiresCorrection = requiresCorrection;
    }

    public String getRequiresCorrection() 
    {
        return requiresCorrection;
    }
    public void setCorrectionIssues(String correctionIssues) 
    {
        this.correctionIssues = correctionIssues;
    }

    public String getCorrectionIssues() 
    {
        return correctionIssues;
    }
    public void setImage1(String image1) 
    {
        this.image1 = image1;
    }

    public String getImage1() 
    {
        return image1;
    }
    public void setImage2(String image2) 
    {
        this.image2 = image2;
    }

    public String getImage2() 
    {
        return image2;
    }
    public void setImage3(String image3) 
    {
        this.image3 = image3;
    }

    public String getImage3() 
    {
        return image3;
    }
    public void setInspectionTime(Date inspectionTime) 
    {
        this.inspectionTime = inspectionTime;
    }

    public Date getInspectionTime() 
    {
        return inspectionTime;
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
            .append("inspectionId", getInspectionId())
            .append("inspectionTypeId", getInspectionTypeId())
            .append("orgId", getOrgId())
            .append("requiresCorrection", getRequiresCorrection())
            .append("correctionIssues", getCorrectionIssues())
            .append("image1", getImage1())
            .append("image2", getImage2())
            .append("image3", getImage3())
            .append("inspectionTime", getInspectionTime())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
