package com.ruoyi.organization.mapper;

import java.util.List;
import com.ruoyi.organization.domain.Organizationtype;

/**
 * 机构类型Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface OrganizationtypeMapper 
{
    /**
     * 查询机构类型
     * 
     * @param orgTypeId 机构类型主键
     * @return 机构类型
     */
    public Organizationtype selectOrganizationtypeByOrgTypeId(Long orgTypeId);

    /**
     * 查询机构类型列表
     * 
     * @param organizationtype 机构类型
     * @return 机构类型集合
     */
    public List<Organizationtype> selectOrganizationtypeList(Organizationtype organizationtype);

    /**
     * 新增机构类型
     * 
     * @param organizationtype 机构类型
     * @return 结果
     */
    public int insertOrganizationtype(Organizationtype organizationtype);

    /**
     * 修改机构类型
     * 
     * @param organizationtype 机构类型
     * @return 结果
     */
    public int updateOrganizationtype(Organizationtype organizationtype);

    /**
     * 删除机构类型
     * 
     * @param orgTypeId 机构类型主键
     * @return 结果
     */
    public int deleteOrganizationtypeByOrgTypeId(Long orgTypeId);

    /**
     * 批量删除机构类型
     * 
     * @param orgTypeIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteOrganizationtypeByOrgTypeIds(Long[] orgTypeIds);
}
