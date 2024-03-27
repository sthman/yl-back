package com.ruoyi.volunteer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.volunteer.mapper.ActivityMapper;
import com.ruoyi.volunteer.domain.Activity;
import com.ruoyi.volunteer.service.IActivityService;

/**
 * 活动人员Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class ActivityServiceImpl implements IActivityService 
{
    @Autowired
    private ActivityMapper activityMapper;

    /**
     * 查询活动人员
     * 
     * @param activityId 活动人员主键
     * @return 活动人员
     */
    @Override
    public Activity selectActivityByActivityId(Long activityId)
    {
        return activityMapper.selectActivityByActivityId(activityId);
    }

    /**
     * 查询活动人员列表
     * 
     * @param activity 活动人员
     * @return 活动人员
     */
    @Override
    public List<Activity> selectActivityList(Activity activity)
    {
        return activityMapper.selectActivityList(activity);
    }

    /**
     * 新增活动人员
     * 
     * @param activity 活动人员
     * @return 结果
     */
    @Override
    public int insertActivity(Activity activity)
    {
        return activityMapper.insertActivity(activity);
    }

    /**
     * 修改活动人员
     * 
     * @param activity 活动人员
     * @return 结果
     */
    @Override
    public int updateActivity(Activity activity)
    {
        return activityMapper.updateActivity(activity);
    }

    /**
     * 批量删除活动人员
     * 
     * @param activityIds 需要删除的活动人员主键
     * @return 结果
     */
    @Override
    public int deleteActivityByActivityIds(Long[] activityIds)
    {
        return activityMapper.deleteActivityByActivityIds(activityIds);
    }

    /**
     * 删除活动人员信息
     * 
     * @param activityId 活动人员主键
     * @return 结果
     */
    @Override
    public int deleteActivityByActivityId(Long activityId)
    {
        return activityMapper.deleteActivityByActivityId(activityId);
    }
}
