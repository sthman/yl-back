package com.ruoyi.volunteer.service.impl;

import java.math.BigDecimal;
import java.util.List;

import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.api.RemoteUserService;
import com.ruoyi.system.api.domain.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.volunteer.mapper.VolunteerMapper;
import com.ruoyi.volunteer.domain.Volunteer;
import com.ruoyi.volunteer.service.IVolunteerService;

/**
 * 志愿者Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class VolunteerServiceImpl implements IVolunteerService 
{
    @Autowired
    private VolunteerMapper volunteerMapper;
    @Autowired
    private RemoteUserService remoteUserService;

    /**
     * 查询志愿者
     * 
     * @param vStar 志愿者主键
     * @return 志愿者
     */
    @Override
    public Volunteer selectVolunteerByVStar(Long vStar)
    {
        return volunteerMapper.selectVolunteerByVStar(vStar);
    }

    /**
     * 查询志愿者列表
     * 
     * @param volunteer 志愿者
     * @return 志愿者
     */
    @Override
    public List<Volunteer> selectVolunteerList(Volunteer volunteer)
    {
        List<Volunteer> volunteers = volunteerMapper.selectVolunteerList(volunteer);
        for (Volunteer v : volunteers) {
            R<SysUser> user = remoteUserService.findUserByUserId(v.getUserId());
            v.setUserName(user.getData().getUserName());
        }
        return volunteers;
    }

    /**
     * 新增志愿者
     * 
     * @param volunteer 志愿者
     * @return 结果
     */
    @Override
    public int insertVolunteer(Volunteer volunteer)
    {
        return volunteerMapper.insertVolunteer(volunteer);
    }

    /**
     * 修改志愿者
     * 
     * @param volunteer 志愿者
     * @return 结果
     */
    @Override
    public int updateVolunteer(Volunteer volunteer)
    {
        return volunteerMapper.updateVolunteer(volunteer);
    }

    /**
     * 批量删除志愿者
     * 
     * @param vStars 需要删除的志愿者主键
     * @return 结果
     */
    @Override
    public int deleteVolunteerByVStars(Long[] vStars)
    {
        return volunteerMapper.deleteVolunteerByVStars(vStars);
    }

    /**
     * 删除志愿者信息
     * 
     * @param vStar 志愿者主键
     * @return 结果
     */
    @Override
    public int deleteVolunteerByVStar(Long vStar)
    {
        return volunteerMapper.deleteVolunteerByVStar(vStar);
    }

    /**
     * 根据userId查询积分
     * @param userId
     * @return
     */
    @Override
    public BigDecimal findStarByUserId(Long userId) {
        BigDecimal starByUserId = volunteerMapper.findStarByUserId(userId);
        return starByUserId;
    }
}
