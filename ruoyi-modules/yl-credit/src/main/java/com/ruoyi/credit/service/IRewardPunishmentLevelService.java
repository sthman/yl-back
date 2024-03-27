package com.ruoyi.credit.service;

import java.util.List;
import com.ruoyi.credit.domain.RewardPunishmentLevel;

/**
 * 奖惩级别Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IRewardPunishmentLevelService 
{
    /**
     * 查询奖惩级别
     * 
     * @param rewardPunishmentLevelId 奖惩级别主键
     * @return 奖惩级别
     */
    public RewardPunishmentLevel selectRewardPunishmentLevelByRewardPunishmentLevelId(Long rewardPunishmentLevelId);

    /**
     * 查询奖惩级别列表
     * 
     * @param rewardPunishmentLevel 奖惩级别
     * @return 奖惩级别集合
     */
    public List<RewardPunishmentLevel> selectRewardPunishmentLevelList(RewardPunishmentLevel rewardPunishmentLevel);

    /**
     * 新增奖惩级别
     * 
     * @param rewardPunishmentLevel 奖惩级别
     * @return 结果
     */
    public int insertRewardPunishmentLevel(RewardPunishmentLevel rewardPunishmentLevel);

    /**
     * 修改奖惩级别
     * 
     * @param rewardPunishmentLevel 奖惩级别
     * @return 结果
     */
    public int updateRewardPunishmentLevel(RewardPunishmentLevel rewardPunishmentLevel);

    /**
     * 批量删除奖惩级别
     * 
     * @param rewardPunishmentLevelIds 需要删除的奖惩级别主键集合
     * @return 结果
     */
    public int deleteRewardPunishmentLevelByRewardPunishmentLevelIds(Long[] rewardPunishmentLevelIds);

    /**
     * 删除奖惩级别信息
     * 
     * @param rewardPunishmentLevelId 奖惩级别主键
     * @return 结果
     */
    public int deleteRewardPunishmentLevelByRewardPunishmentLevelId(Long rewardPunishmentLevelId);
}
