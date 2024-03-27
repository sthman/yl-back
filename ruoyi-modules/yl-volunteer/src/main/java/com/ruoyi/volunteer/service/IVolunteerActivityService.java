package com.ruoyi.volunteer.service;

import java.util.List;
import com.ruoyi.volunteer.domain.VolunteerActivity;

/**
 * 志愿者招募Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IVolunteerActivityService 
{
    /**
     * 查询志愿者招募
     * 
     * @param vactivityId 志愿者招募主键
     * @return 志愿者招募
     */
    public VolunteerActivity selectVolunteerActivityByVactivityId(Long vactivityId);

    /**
     * 查询志愿者招募列表
     * 
     * @param volunteerActivity 志愿者招募
     * @return 志愿者招募集合
     */
    public List<VolunteerActivity> selectVolunteerActivityList(VolunteerActivity volunteerActivity);

    /**
     * 新增志愿者招募
     * 
     * @param volunteerActivity 志愿者招募
     * @return 结果
     */
    public int insertVolunteerActivity(VolunteerActivity volunteerActivity);

    /**
     * 修改志愿者招募
     * 
     * @param volunteerActivity 志愿者招募
     * @return 结果
     */
    public int updateVolunteerActivity(VolunteerActivity volunteerActivity);

    /**
     * 批量删除志愿者招募
     * 
     * @param vactivityIds 需要删除的志愿者招募主键集合
     * @return 结果
     */
    public int deleteVolunteerActivityByVactivityIds(Long[] vactivityIds);

    /**
     * 删除志愿者招募信息
     * 
     * @param vactivityId 志愿者招募主键
     * @return 结果
     */
    public int deleteVolunteerActivityByVactivityId(Long vactivityId);
}
