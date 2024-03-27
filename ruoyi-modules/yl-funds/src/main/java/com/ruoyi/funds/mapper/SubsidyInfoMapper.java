package com.ruoyi.funds.mapper;

import java.util.List;
import com.ruoyi.funds.domain.SubsidyInfo;

/**
 * 补贴信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface SubsidyInfoMapper 
{
    /**
     * 查询补贴信息
     * 
     * @param subsidyInfoId 补贴信息主键
     * @return 补贴信息
     */
    public SubsidyInfo selectSubsidyInfoBySubsidyInfoId(Long subsidyInfoId);

    /**
     * 查询补贴信息列表
     * 
     * @param subsidyInfo 补贴信息
     * @return 补贴信息集合
     */
    public List<SubsidyInfo> selectSubsidyInfoList(SubsidyInfo subsidyInfo);

    /**
     * 新增补贴信息
     * 
     * @param subsidyInfo 补贴信息
     * @return 结果
     */
    public int insertSubsidyInfo(SubsidyInfo subsidyInfo);

    /**
     * 修改补贴信息
     * 
     * @param subsidyInfo 补贴信息
     * @return 结果
     */
    public int updateSubsidyInfo(SubsidyInfo subsidyInfo);

    /**
     * 删除补贴信息
     * 
     * @param subsidyInfoId 补贴信息主键
     * @return 结果
     */
    public int deleteSubsidyInfoBySubsidyInfoId(Long subsidyInfoId);

    /**
     * 批量删除补贴信息
     * 
     * @param subsidyInfoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteSubsidyInfoBySubsidyInfoIds(Long[] subsidyInfoIds);
}
