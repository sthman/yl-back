package com.ruoyi.volunteer.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 志愿者招募对象 volunteer_activity
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class VolunteerActivity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 志愿活动id */
    private Long vactivityId;

    /** 志愿活动名称 */
    @Excel(name = "志愿活动名称")
    private String vactivityName;

    /** 志愿活动内容 */
    @Excel(name = "志愿活动内容")
    private String vactivityContent;

    /** 发布机构id */
    @Excel(name = "发布机构id")
    private Long publishingOrgId;

    /** 发布机构类型 */
    @Excel(name = "发布机构类型")
    private Long publishingOrgType;

    /** 招募人数 */
    @Excel(name = "招募人数")
    private Long vactivityNum;

    /** 剩余人数 */
    @Excel(name = "剩余人数")
    private Long remainingCount;

    /** 开始时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 活动状态 */
    @Excel(name = "活动状态")
    private Long vactivityStatus;

    /** 活动地点 */
    @Excel(name = "活动地点")
    private String vactivityAddress;

    /** 活动积分 */
    @Excel(name = "活动积分")
    private Long vactivityStar;

    /** 结束时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setVactivityId(Long vactivityId) 
    {
        this.vactivityId = vactivityId;
    }

    public Long getVactivityId() 
    {
        return vactivityId;
    }
    public void setVactivityName(String vactivityName) 
    {
        this.vactivityName = vactivityName;
    }

    public String getVactivityName() 
    {
        return vactivityName;
    }
    public void setVactivityContent(String vactivityContent) 
    {
        this.vactivityContent = vactivityContent;
    }

    public String getVactivityContent() 
    {
        return vactivityContent;
    }
    public void setPublishingOrgId(Long publishingOrgId) 
    {
        this.publishingOrgId = publishingOrgId;
    }

    public Long getPublishingOrgId() 
    {
        return publishingOrgId;
    }
    public void setPublishingOrgType(Long publishingOrgType) 
    {
        this.publishingOrgType = publishingOrgType;
    }

    public Long getPublishingOrgType() 
    {
        return publishingOrgType;
    }
    public void setVactivityNum(Long vactivityNum) 
    {
        this.vactivityNum = vactivityNum;
    }

    public Long getVactivityNum() 
    {
        return vactivityNum;
    }
    public void setRemainingCount(Long remainingCount) 
    {
        this.remainingCount = remainingCount;
    }

    public Long getRemainingCount() 
    {
        return remainingCount;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setVactivityStatus(Long vactivityStatus) 
    {
        this.vactivityStatus = vactivityStatus;
    }

    public Long getVactivityStatus() 
    {
        return vactivityStatus;
    }
    public void setVactivityAddress(String vactivityAddress) 
    {
        this.vactivityAddress = vactivityAddress;
    }

    public String getVactivityAddress() 
    {
        return vactivityAddress;
    }
    public void setVactivityStar(Long vactivityStar) 
    {
        this.vactivityStar = vactivityStar;
    }

    public Long getVactivityStar() 
    {
        return vactivityStar;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
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
            .append("vactivityId", getVactivityId())
            .append("vactivityName", getVactivityName())
            .append("vactivityContent", getVactivityContent())
            .append("publishingOrgId", getPublishingOrgId())
            .append("publishingOrgType", getPublishingOrgType())
            .append("vactivityNum", getVactivityNum())
            .append("remainingCount", getRemainingCount())
            .append("startTime", getStartTime())
            .append("vactivityStatus", getVactivityStatus())
            .append("vactivityAddress", getVactivityAddress())
            .append("vactivityStar", getVactivityStar())
            .append("endTime", getEndTime())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
