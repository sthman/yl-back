package com.ruoyi.organization.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.organization.mapper.OrganizationMapper;
import com.ruoyi.organization.domain.Organization;
import com.ruoyi.organization.service.IOrganizationService;

/**
 * 机构信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class OrganizationServiceImpl implements IOrganizationService 
{
    @Autowired
    private OrganizationMapper organizationMapper;

    /**
     * 查询机构信息
     * 
     * @param orgId 机构信息主键
     * @return 机构信息
     */
    @Override
    public Organization selectOrganizationByOrgId(Long orgId)
    {
        return organizationMapper.selectOrganizationByOrgId(orgId);
    }

    /**
     * 查询机构信息列表
     * 
     * @param organization 机构信息
     * @return 机构信息
     */
    @Override
    public List<Organization> selectOrganizationList(Organization organization)
    {
        return organizationMapper.selectOrganizationList(organization);
    }

    /**
     * 新增机构信息
     * 
     * @param organization 机构信息
     * @return 结果
     */
    @Override
    public int insertOrganization(Organization organization)
    {
        return organizationMapper.insertOrganization(organization);
    }

    /**
     * 修改机构信息
     * 
     * @param organization 机构信息
     * @return 结果
     */
    @Override
    public int updateOrganization(Organization organization)
    {
        return organizationMapper.updateOrganization(organization);
    }

    /**
     * 批量删除机构信息
     * 
     * @param orgIds 需要删除的机构信息主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationByOrgIds(Long[] orgIds)
    {
        return organizationMapper.deleteOrganizationByOrgIds(orgIds);
    }

    /**
     * 删除机构信息信息
     * 
     * @param orgId 机构信息主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationByOrgId(Long orgId)
    {
        return organizationMapper.deleteOrganizationByOrgId(orgId);
    }
}
