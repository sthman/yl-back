package com.ruoyi.credit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.credit.mapper.RewardPunishmentLevelMapper;
import com.ruoyi.credit.domain.RewardPunishmentLevel;
import com.ruoyi.credit.service.IRewardPunishmentLevelService;

/**
 * 奖惩级别Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class RewardPunishmentLevelServiceImpl implements IRewardPunishmentLevelService 
{
    @Autowired
    private RewardPunishmentLevelMapper rewardPunishmentLevelMapper;

    /**
     * 查询奖惩级别
     * 
     * @param rewardPunishmentLevelId 奖惩级别主键
     * @return 奖惩级别
     */
    @Override
    public RewardPunishmentLevel selectRewardPunishmentLevelByRewardPunishmentLevelId(Long rewardPunishmentLevelId)
    {
        return rewardPunishmentLevelMapper.selectRewardPunishmentLevelByRewardPunishmentLevelId(rewardPunishmentLevelId);
    }

    /**
     * 查询奖惩级别列表
     * 
     * @param rewardPunishmentLevel 奖惩级别
     * @return 奖惩级别
     */
    @Override
    public List<RewardPunishmentLevel> selectRewardPunishmentLevelList(RewardPunishmentLevel rewardPunishmentLevel)
    {
        return rewardPunishmentLevelMapper.selectRewardPunishmentLevelList(rewardPunishmentLevel);
    }

    /**
     * 新增奖惩级别
     * 
     * @param rewardPunishmentLevel 奖惩级别
     * @return 结果
     */
    @Override
    public int insertRewardPunishmentLevel(RewardPunishmentLevel rewardPunishmentLevel)
    {
        return rewardPunishmentLevelMapper.insertRewardPunishmentLevel(rewardPunishmentLevel);
    }

    /**
     * 修改奖惩级别
     * 
     * @param rewardPunishmentLevel 奖惩级别
     * @return 结果
     */
    @Override
    public int updateRewardPunishmentLevel(RewardPunishmentLevel rewardPunishmentLevel)
    {
        return rewardPunishmentLevelMapper.updateRewardPunishmentLevel(rewardPunishmentLevel);
    }

    /**
     * 批量删除奖惩级别
     * 
     * @param rewardPunishmentLevelIds 需要删除的奖惩级别主键
     * @return 结果
     */
    @Override
    public int deleteRewardPunishmentLevelByRewardPunishmentLevelIds(Long[] rewardPunishmentLevelIds)
    {
        return rewardPunishmentLevelMapper.deleteRewardPunishmentLevelByRewardPunishmentLevelIds(rewardPunishmentLevelIds);
    }

    /**
     * 删除奖惩级别信息
     * 
     * @param rewardPunishmentLevelId 奖惩级别主键
     * @return 结果
     */
    @Override
    public int deleteRewardPunishmentLevelByRewardPunishmentLevelId(Long rewardPunishmentLevelId)
    {
        return rewardPunishmentLevelMapper.deleteRewardPunishmentLevelByRewardPunishmentLevelId(rewardPunishmentLevelId);
    }
}
