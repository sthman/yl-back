package com.ruoyi.health.service;

import java.util.List;
import com.ruoyi.health.domain.HealthInformation;

/**
 * 健康信息Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IHealthInformationService 
{
    /**
     * 查询健康信息
     * 
     * @param healthInformationId 健康信息主键
     * @return 健康信息
     */
    public HealthInformation selectHealthInformationByHealthInformationId(Long healthInformationId);

    /**
     * 查询健康信息列表
     * 
     * @param healthInformation 健康信息
     * @return 健康信息集合
     */
    public List<HealthInformation> selectHealthInformationList(HealthInformation healthInformation);

    /**
     * 新增健康信息
     * 
     * @param healthInformation 健康信息
     * @return 结果
     */
    public int insertHealthInformation(HealthInformation healthInformation);

    /**
     * 修改健康信息
     * 
     * @param healthInformation 健康信息
     * @return 结果
     */
    public int updateHealthInformation(HealthInformation healthInformation);

    /**
     * 批量删除健康信息
     * 
     * @param healthInformationIds 需要删除的健康信息主键集合
     * @return 结果
     */
    public int deleteHealthInformationByHealthInformationIds(Long[] healthInformationIds);

    /**
     * 删除健康信息信息
     * 
     * @param healthInformationId 健康信息主键
     * @return 结果
     */
    public int deleteHealthInformationByHealthInformationId(Long healthInformationId);
}
