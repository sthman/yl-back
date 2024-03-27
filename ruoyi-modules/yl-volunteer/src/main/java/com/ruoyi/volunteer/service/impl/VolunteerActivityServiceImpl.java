package com.ruoyi.volunteer.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.volunteer.mapper.VolunteerActivityMapper;
import com.ruoyi.volunteer.domain.VolunteerActivity;
import com.ruoyi.volunteer.service.IVolunteerActivityService;

/**
 * 志愿者招募Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class VolunteerActivityServiceImpl implements IVolunteerActivityService 
{
    @Autowired
    private VolunteerActivityMapper volunteerActivityMapper;

    /**
     * 查询志愿者招募
     * 
     * @param vactivityId 志愿者招募主键
     * @return 志愿者招募
     */
    @Override
    public VolunteerActivity selectVolunteerActivityByVactivityId(Long vactivityId)
    {
        return volunteerActivityMapper.selectVolunteerActivityByVactivityId(vactivityId);
    }

    /**
     * 查询志愿者招募列表
     * 
     * @param volunteerActivity 志愿者招募
     * @return 志愿者招募
     */
    @Override
    public List<VolunteerActivity> selectVolunteerActivityList(VolunteerActivity volunteerActivity)
    {
        return volunteerActivityMapper.selectVolunteerActivityList(volunteerActivity);
    }

    /**
     * 新增志愿者招募
     * 
     * @param volunteerActivity 志愿者招募
     * @return 结果
     */
    @Override
    public int insertVolunteerActivity(VolunteerActivity volunteerActivity)
    {
        return volunteerActivityMapper.insertVolunteerActivity(volunteerActivity);
    }

    /**
     * 修改志愿者招募
     * 
     * @param volunteerActivity 志愿者招募
     * @return 结果
     */
    @Override
    public int updateVolunteerActivity(VolunteerActivity volunteerActivity)
    {
        return volunteerActivityMapper.updateVolunteerActivity(volunteerActivity);
    }

    /**
     * 批量删除志愿者招募
     * 
     * @param vactivityIds 需要删除的志愿者招募主键
     * @return 结果
     */
    @Override
    public int deleteVolunteerActivityByVactivityIds(Long[] vactivityIds)
    {
        return volunteerActivityMapper.deleteVolunteerActivityByVactivityIds(vactivityIds);
    }

    /**
     * 删除志愿者招募信息
     * 
     * @param vactivityId 志愿者招募主键
     * @return 结果
     */
    @Override
    public int deleteVolunteerActivityByVactivityId(Long vactivityId)
    {
        return volunteerActivityMapper.deleteVolunteerActivityByVactivityId(vactivityId);
    }
}
