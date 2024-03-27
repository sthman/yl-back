package com.ruoyi.volunteer.mapper;

import java.util.List;
import com.ruoyi.volunteer.domain.Activity;

/**
 * 活动人员Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface ActivityMapper 
{
    /**
     * 查询活动人员
     * 
     * @param activityId 活动人员主键
     * @return 活动人员
     */
    public Activity selectActivityByActivityId(Long activityId);

    /**
     * 查询活动人员列表
     * 
     * @param activity 活动人员
     * @return 活动人员集合
     */
    public List<Activity> selectActivityList(Activity activity);

    /**
     * 新增活动人员
     * 
     * @param activity 活动人员
     * @return 结果
     */
    public int insertActivity(Activity activity);

    /**
     * 修改活动人员
     * 
     * @param activity 活动人员
     * @return 结果
     */
    public int updateActivity(Activity activity);

    /**
     * 删除活动人员
     * 
     * @param activityId 活动人员主键
     * @return 结果
     */
    public int deleteActivityByActivityId(Long activityId);

    /**
     * 批量删除活动人员
     * 
     * @param activityIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteActivityByActivityIds(Long[] activityIds);
}
