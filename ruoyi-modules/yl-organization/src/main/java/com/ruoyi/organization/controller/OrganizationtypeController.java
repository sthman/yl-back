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
import com.ruoyi.organization.domain.Organizationtype;
import com.ruoyi.organization.service.IOrganizationtypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 机构类型Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/organizationtype")
public class OrganizationtypeController extends BaseController
{
    @Autowired
    private IOrganizationtypeService organizationtypeService;

    /**
     * 查询机构类型列表
     */
    @RequiresPermissions("organization:organizationtype:list")
    @GetMapping("/list")
    public TableDataInfo list(Organizationtype organizationtype)
    {
        startPage();
        List<Organizationtype> list = organizationtypeService.selectOrganizationtypeList(organizationtype);
        return getDataTable(list);
    }

    /**
     * 导出机构类型列表
     */
    @RequiresPermissions("organization:organizationtype:export")
    @Log(title = "机构类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Organizationtype organizationtype)
    {
        List<Organizationtype> list = organizationtypeService.selectOrganizationtypeList(organizationtype);
        ExcelUtil<Organizationtype> util = new ExcelUtil<Organizationtype>(Organizationtype.class);
        util.exportExcel(response, list, "机构类型数据");
    }

    /**
     * 获取机构类型详细信息
     */
    @RequiresPermissions("organization:organizationtype:query")
    @GetMapping(value = "/{orgTypeId}")
    public AjaxResult getInfo(@PathVariable("orgTypeId") Long orgTypeId)
    {
        return success(organizationtypeService.selectOrganizationtypeByOrgTypeId(orgTypeId));
    }

    /**
     * 新增机构类型
     */
    @RequiresPermissions("organization:organizationtype:add")
    @Log(title = "机构类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Organizationtype organizationtype)
    {
        return toAjax(organizationtypeService.insertOrganizationtype(organizationtype));
    }

    /**
     * 修改机构类型
     */
    @RequiresPermissions("organization:organizationtype:edit")
    @Log(title = "机构类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Organizationtype organizationtype)
    {
        return toAjax(organizationtypeService.updateOrganizationtype(organizationtype));
    }

    /**
     * 删除机构类型
     */
    @RequiresPermissions("organization:organizationtype:remove")
    @Log(title = "机构类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{orgTypeIds}")
    public AjaxResult remove(@PathVariable Long[] orgTypeIds)
    {
        return toAjax(organizationtypeService.deleteOrganizationtypeByOrgTypeIds(orgTypeIds));
    }
}
