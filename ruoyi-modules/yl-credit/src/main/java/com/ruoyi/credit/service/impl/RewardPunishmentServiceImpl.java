package com.ruoyi.credit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.credit.mapper.RewardPunishmentMapper;
import com.ruoyi.credit.domain.RewardPunishment;
import com.ruoyi.credit.service.IRewardPunishmentService;

/**
 * 奖惩记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class RewardPunishmentServiceImpl implements IRewardPunishmentService 
{
    @Autowired
    private RewardPunishmentMapper rewardPunishmentMapper;

    /**
     * 查询奖惩记录
     * 
     * @param rewardPunishmentId 奖惩记录主键
     * @return 奖惩记录
     */
    @Override
    public RewardPunishment selectRewardPunishmentByRewardPunishmentId(Long rewardPunishmentId)
    {
        return rewardPunishmentMapper.selectRewardPunishmentByRewardPunishmentId(rewardPunishmentId);
    }

    /**
     * 查询奖惩记录列表
     * 
     * @param rewardPunishment 奖惩记录
     * @return 奖惩记录
     */
    @Override
    public List<RewardPunishment> selectRewardPunishmentList(RewardPunishment rewardPunishment)
    {
        return rewardPunishmentMapper.selectRewardPunishmentList(rewardPunishment);
    }

    /**
     * 新增奖惩记录
     * 
     * @param rewardPunishment 奖惩记录
     * @return 结果
     */
    @Override
    public int insertRewardPunishment(RewardPunishment rewardPunishment)
    {
        return rewardPunishmentMapper.insertRewardPunishment(rewardPunishment);
    }

    /**
     * 修改奖惩记录
     * 
     * @param rewardPunishment 奖惩记录
     * @return 结果
     */
    @Override
    public int updateRewardPunishment(RewardPunishment rewardPunishment)
    {
        return rewardPunishmentMapper.updateRewardPunishment(rewardPunishment);
    }

    /**
     * 批量删除奖惩记录
     * 
     * @param rewardPunishmentIds 需要删除的奖惩记录主键
     * @return 结果
     */
    @Override
    public int deleteRewardPunishmentByRewardPunishmentIds(Long[] rewardPunishmentIds)
    {
        return rewardPunishmentMapper.deleteRewardPunishmentByRewardPunishmentIds(rewardPunishmentIds);
    }

    /**
     * 删除奖惩记录信息
     * 
     * @param rewardPunishmentId 奖惩记录主键
     * @return 结果
     */
    @Override
    public int deleteRewardPunishmentByRewardPunishmentId(Long rewardPunishmentId)
    {
        return rewardPunishmentMapper.deleteRewardPunishmentByRewardPunishmentId(rewardPunishmentId);
    }
}
