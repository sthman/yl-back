package com.ruoyi.health.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.health.mapper.HealthInformationMapper;
import com.ruoyi.health.domain.HealthInformation;
import com.ruoyi.health.service.IHealthInformationService;

/**
 * 健康信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class HealthInformationServiceImpl implements IHealthInformationService 
{
    @Autowired
    private HealthInformationMapper healthInformationMapper;

    /**
     * 查询健康信息
     * 
     * @param healthInformationId 健康信息主键
     * @return 健康信息
     */
    @Override
    public HealthInformation selectHealthInformationByHealthInformationId(Long healthInformationId)
    {
        return healthInformationMapper.selectHealthInformationByHealthInformationId(healthInformationId);
    }

    /**
     * 查询健康信息列表
     * 
     * @param healthInformation 健康信息
     * @return 健康信息
     */
    @Override
    public List<HealthInformation> selectHealthInformationList(HealthInformation healthInformation)
    {
        return healthInformationMapper.selectHealthInformationList(healthInformation);
    }

    /**
     * 新增健康信息
     * 
     * @param healthInformation 健康信息
     * @return 结果
     */
    @Override
    public int insertHealthInformation(HealthInformation healthInformation)
    {
        return healthInformationMapper.insertHealthInformation(healthInformation);
    }

    /**
     * 修改健康信息
     * 
     * @param healthInformation 健康信息
     * @return 结果
     */
    @Override
    public int updateHealthInformation(HealthInformation healthInformation)
    {
        return healthInformationMapper.updateHealthInformation(healthInformation);
    }

    /**
     * 批量删除健康信息
     * 
     * @param healthInformationIds 需要删除的健康信息主键
     * @return 结果
     */
    @Override
    public int deleteHealthInformationByHealthInformationIds(Long[] healthInformationIds)
    {
        return healthInformationMapper.deleteHealthInformationByHealthInformationIds(healthInformationIds);
    }

    /**
     * 删除健康信息信息
     * 
     * @param healthInformationId 健康信息主键
     * @return 结果
     */
    @Override
    public int deleteHealthInformationByHealthInformationId(Long healthInformationId)
    {
        return healthInformationMapper.deleteHealthInformationByHealthInformationId(healthInformationId);
    }
}
