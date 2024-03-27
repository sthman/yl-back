package com.ruoyi.credit.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 奖惩记录对象 reward_punishment
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class RewardPunishment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 奖惩id */
    private Long rewardPunishmentId;

    /** 奖惩级别id */
    @Excel(name = "奖惩级别id")
    private Long rewardPunishmentLevelId;

    /** 机构id */
    @Excel(name = "机构id")
    private Long orgId;

    /** 原因 */
    @Excel(name = "原因")
    private String reason;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setRewardPunishmentId(Long rewardPunishmentId) 
    {
        this.rewardPunishmentId = rewardPunishmentId;
    }

    public Long getRewardPunishmentId() 
    {
        return rewardPunishmentId;
    }
    public void setRewardPunishmentLevelId(Long rewardPunishmentLevelId) 
    {
        this.rewardPunishmentLevelId = rewardPunishmentLevelId;
    }

    public Long getRewardPunishmentLevelId() 
    {
        return rewardPunishmentLevelId;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setReason(String reason) 
    {
        this.reason = reason;
    }

    public String getReason() 
    {
        return reason;
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
            .append("rewardPunishmentId", getRewardPunishmentId())
            .append("rewardPunishmentLevelId", getRewardPunishmentLevelId())
            .append("orgId", getOrgId())
            .append("reason", getReason())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
