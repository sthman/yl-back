package com.ruoyi.credit.service;

import java.util.List;
import com.ruoyi.credit.domain.RewardPunishment;

/**
 * 奖惩记录Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IRewardPunishmentService 
{
    /**
     * 查询奖惩记录
     * 
     * @param rewardPunishmentId 奖惩记录主键
     * @return 奖惩记录
     */
    public RewardPunishment selectRewardPunishmentByRewardPunishmentId(Long rewardPunishmentId);

    /**
     * 查询奖惩记录列表
     * 
     * @param rewardPunishment 奖惩记录
     * @return 奖惩记录集合
     */
    public List<RewardPunishment> selectRewardPunishmentList(RewardPunishment rewardPunishment);

    /**
     * 新增奖惩记录
     * 
     * @param rewardPunishment 奖惩记录
     * @return 结果
     */
    public int insertRewardPunishment(RewardPunishment rewardPunishment);

    /**
     * 修改奖惩记录
     * 
     * @param rewardPunishment 奖惩记录
     * @return 结果
     */
    public int updateRewardPunishment(RewardPunishment rewardPunishment);

    /**
     * 批量删除奖惩记录
     * 
     * @param rewardPunishmentIds 需要删除的奖惩记录主键集合
     * @return 结果
     */
    public int deleteRewardPunishmentByRewardPunishmentIds(Long[] rewardPunishmentIds);

    /**
     * 删除奖惩记录信息
     * 
     * @param rewardPunishmentId 奖惩记录主键
     * @return 结果
     */
    public int deleteRewardPunishmentByRewardPunishmentId(Long rewardPunishmentId);
}
