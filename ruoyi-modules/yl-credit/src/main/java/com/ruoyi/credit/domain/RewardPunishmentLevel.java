package com.ruoyi.credit.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 奖惩级别对象 reward_punishment_level
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class RewardPunishmentLevel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 奖惩级别id */
    private Long rewardPunishmentLevelId;

    /** 奖惩内容 */
    @Excel(name = "奖惩内容")
    private Long rewardPunishmentLevelContent;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setRewardPunishmentLevelId(Long rewardPunishmentLevelId) 
    {
        this.rewardPunishmentLevelId = rewardPunishmentLevelId;
    }

    public Long getRewardPunishmentLevelId() 
    {
        return rewardPunishmentLevelId;
    }
    public void setRewardPunishmentLevelContent(Long rewardPunishmentLevelContent) 
    {
        this.rewardPunishmentLevelContent = rewardPunishmentLevelContent;
    }

    public Long getRewardPunishmentLevelContent() 
    {
        return rewardPunishmentLevelContent;
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
            .append("rewardPunishmentLevelId", getRewardPunishmentLevelId())
            .append("rewardPunishmentLevelContent", getRewardPunishmentLevelContent())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
