package com.ruoyi.organization.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.organization.mapper.OrganizationtypeMapper;
import com.ruoyi.organization.domain.Organizationtype;
import com.ruoyi.organization.service.IOrganizationtypeService;

/**
 * 机构类型Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class OrganizationtypeServiceImpl implements IOrganizationtypeService 
{
    @Autowired
    private OrganizationtypeMapper organizationtypeMapper;

    /**
     * 查询机构类型
     * 
     * @param orgTypeId 机构类型主键
     * @return 机构类型
     */
    @Override
    public Organizationtype selectOrganizationtypeByOrgTypeId(Long orgTypeId)
    {
        return organizationtypeMapper.selectOrganizationtypeByOrgTypeId(orgTypeId);
    }

    /**
     * 查询机构类型列表
     * 
     * @param organizationtype 机构类型
     * @return 机构类型
     */
    @Override
    public List<Organizationtype> selectOrganizationtypeList(Organizationtype organizationtype)
    {
        return organizationtypeMapper.selectOrganizationtypeList(organizationtype);
    }

    /**
     * 新增机构类型
     * 
     * @param organizationtype 机构类型
     * @return 结果
     */
    @Override
    public int insertOrganizationtype(Organizationtype organizationtype)
    {
        return organizationtypeMapper.insertOrganizationtype(organizationtype);
    }

    /**
     * 修改机构类型
     * 
     * @param organizationtype 机构类型
     * @return 结果
     */
    @Override
    public int updateOrganizationtype(Organizationtype organizationtype)
    {
        return organizationtypeMapper.updateOrganizationtype(organizationtype);
    }

    /**
     * 批量删除机构类型
     * 
     * @param orgTypeIds 需要删除的机构类型主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationtypeByOrgTypeIds(Long[] orgTypeIds)
    {
        return organizationtypeMapper.deleteOrganizationtypeByOrgTypeIds(orgTypeIds);
    }

    /**
     * 删除机构类型信息
     * 
     * @param orgTypeId 机构类型主键
     * @return 结果
     */
    @Override
    public int deleteOrganizationtypeByOrgTypeId(Long orgTypeId)
    {
        return organizationtypeMapper.deleteOrganizationtypeByOrgTypeId(orgTypeId);
    }
}
