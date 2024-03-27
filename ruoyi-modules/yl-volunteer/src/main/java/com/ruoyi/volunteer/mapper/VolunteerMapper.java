package com.ruoyi.volunteer.mapper;

import java.util.List;
import com.ruoyi.volunteer.domain.Volunteer;

/**
 * 志愿者Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface VolunteerMapper 
{
    /**
     * 查询志愿者
     * 
     * @param vStar 志愿者主键
     * @return 志愿者
     */
    public Volunteer selectVolunteerByVStar(Long vStar);

    /**
     * 查询志愿者列表
     * 
     * @param volunteer 志愿者
     * @return 志愿者集合
     */
    public List<Volunteer> selectVolunteerList(Volunteer volunteer);

    /**
     * 新增志愿者
     * 
     * @param volunteer 志愿者
     * @return 结果
     */
    public int insertVolunteer(Volunteer volunteer);

    /**
     * 修改志愿者
     * 
     * @param volunteer 志愿者
     * @return 结果
     */
    public int updateVolunteer(Volunteer volunteer);

    /**
     * 删除志愿者
     * 
     * @param vStar 志愿者主键
     * @return 结果
     */
    public int deleteVolunteerByVStar(Long vStar);

    /**
     * 批量删除志愿者
     * 
     * @param vStars 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVolunteerByVStars(Long[] vStars);
}
