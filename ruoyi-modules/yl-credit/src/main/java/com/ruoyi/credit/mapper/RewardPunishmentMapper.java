package com.ruoyi.credit.mapper;

import java.util.List;
import com.ruoyi.credit.domain.RewardPunishment;

/**
 * 奖惩记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface RewardPunishmentMapper 
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
     * 删除奖惩记录
     * 
     * @param rewardPunishmentId 奖惩记录主键
     * @return 结果
     */
    public int deleteRewardPunishmentByRewardPunishmentId(Long rewardPunishmentId);

    /**
     * 批量删除奖惩记录
     * 
     * @param rewardPunishmentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRewardPunishmentByRewardPunishmentIds(Long[] rewardPunishmentIds);
}
