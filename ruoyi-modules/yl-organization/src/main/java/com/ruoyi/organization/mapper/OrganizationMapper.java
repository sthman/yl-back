package com.ruoyi.organization.mapper;

import java.util.List;
import com.ruoyi.organization.domain.Organization;

/**
 * 机构信息Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface OrganizationMapper 
{
    /**
     * 查询机构信息
     * 
     * @param orgId 机构信息主键
     * @return 机构信息
     */
    public Organization selectOrganizationByOrgId(Long orgId);

    /**
     * 查询机构信息列表
     * 
     * @param organization 机构信息
     * @return 机构信息集合
     */
    public List<Organization> selectOrganizationList(Organization organization);

    /**
     * 新增机构信息
     * 
     * @param organization 机构信息
     * @return 结果
     */
    public int insertOrganization(Organization organization);

    /**
     * 修改机构信息
     * 
     * @param organization 机构信息
     * @return 结果
     */
    public int updateOrganization(Organization organization);

    /**
     * 删除机构信息
     * 
     * @param orgId 机构信息主键
     * @return 结果
     */
    public int deleteOrganizationByOrgId(Long orgId);

    /**
     * 批量删除机构信息
     * 
     * @param orgIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrganizationByOrgIds(Long[] orgIds);
}
