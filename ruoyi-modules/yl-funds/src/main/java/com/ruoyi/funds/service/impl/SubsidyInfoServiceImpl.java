package com.ruoyi.funds.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.funds.mapper.SubsidyInfoMapper;
import com.ruoyi.funds.domain.SubsidyInfo;
import com.ruoyi.funds.service.ISubsidyInfoService;

/**
 * 补贴信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class SubsidyInfoServiceImpl implements ISubsidyInfoService 
{
    @Autowired
    private SubsidyInfoMapper subsidyInfoMapper;

    /**
     * 查询补贴信息
     * 
     * @param subsidyInfoId 补贴信息主键
     * @return 补贴信息
     */
    @Override
    public SubsidyInfo selectSubsidyInfoBySubsidyInfoId(Long subsidyInfoId)
    {
        return subsidyInfoMapper.selectSubsidyInfoBySubsidyInfoId(subsidyInfoId);
    }

    /**
     * 查询补贴信息列表
     * 
     * @param subsidyInfo 补贴信息
     * @return 补贴信息
     */
    @Override
    public List<SubsidyInfo> selectSubsidyInfoList(SubsidyInfo subsidyInfo)
    {
        return subsidyInfoMapper.selectSubsidyInfoList(subsidyInfo);
    }

    /**
     * 新增补贴信息
     * 
     * @param subsidyInfo 补贴信息
     * @return 结果
     */
    @Override
    public int insertSubsidyInfo(SubsidyInfo subsidyInfo)
    {
        return subsidyInfoMapper.insertSubsidyInfo(subsidyInfo);
    }

    /**
     * 修改补贴信息
     * 
     * @param subsidyInfo 补贴信息
     * @return 结果
     */
    @Override
    public int updateSubsidyInfo(SubsidyInfo subsidyInfo)
    {
        return subsidyInfoMapper.updateSubsidyInfo(subsidyInfo);
    }

    /**
     * 批量删除补贴信息
     * 
     * @param subsidyInfoIds 需要删除的补贴信息主键
     * @return 结果
     */
    @Override
    public int deleteSubsidyInfoBySubsidyInfoIds(Long[] subsidyInfoIds)
    {
        return subsidyInfoMapper.deleteSubsidyInfoBySubsidyInfoIds(subsidyInfoIds);
    }

    /**
     * 删除补贴信息信息
     * 
     * @param subsidyInfoId 补贴信息主键
     * @return 结果
     */
    @Override
    public int deleteSubsidyInfoBySubsidyInfoId(Long subsidyInfoId)
    {
        return subsidyInfoMapper.deleteSubsidyInfoBySubsidyInfoId(subsidyInfoId);
    }
}
