package com.ruoyi.organization.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.organization.domain.Organization;
import com.ruoyi.organization.service.IOrganizationService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 机构信息Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/organization")
public class OrganizationController extends BaseController
{
    @Autowired
    private IOrganizationService organizationService;

    /**
     * 查询机构信息列表
     */
    @RequiresPermissions("organization:organization:list")
    @GetMapping("/list")
    public TableDataInfo list(Organization organization)
    {
        startPage();
        List<Organization> list = organizationService.selectOrganizationList(organization);
        return getDataTable(list);
    }

    /**
     * 导出机构信息列表
     */
    @RequiresPermissions("organization:organization:export")
    @Log(title = "机构信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Organization organization)
    {
        List<Organization> list = organizationService.selectOrganizationList(organization);
        ExcelUtil<Organization> util = new ExcelUtil<Organization>(Organization.class);
        util.exportExcel(response, list, "机构信息数据");
    }

    /**
     * 获取机构信息详细信息
     */
    @RequiresPermissions("organization:organization:query")
    @GetMapping(value = "/{orgId}")
    public AjaxResult getInfo(@PathVariable("orgId") Long orgId)
    {
        return success(organizationService.selectOrganizationByOrgId(orgId));
    }

    /**
     * 新增机构信息
     */
    @RequiresPermissions("organization:organization:add")
    @Log(title = "机构信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Organization organization)
    {
        return toAjax(organizationService.insertOrganization(organization));
    }

    /**
     * 修改机构信息
     */
    @RequiresPermissions("organization:organization:edit")
    @Log(title = "机构信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Organization organization)
    {
        return toAjax(organizationService.updateOrganization(organization));
    }

    /**
     * 删除机构信息
     */
    @RequiresPermissions("organization:organization:remove")
    @Log(title = "机构信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orgIds}")
    public AjaxResult remove(@PathVariable Long[] orgIds)
    {
        return toAjax(organizationService.deleteOrganizationByOrgIds(orgIds));
    }


}
