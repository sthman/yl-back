package com.ruoyi.health.controller;

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
import com.ruoyi.health.domain.HealthInformation;
import com.ruoyi.health.service.IHealthInformationService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 健康信息Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/information")
public class HealthInformationController extends BaseController
{
    @Autowired
    private IHealthInformationService healthInformationService;

    /**
     * 查询健康信息列表
     */
    @RequiresPermissions("health:information:list")
    @GetMapping("/list")
    public TableDataInfo list(HealthInformation healthInformation)
    {
        startPage();
        List<HealthInformation> list = healthInformationService.selectHealthInformationList(healthInformation);
        return getDataTable(list);
    }

    /**
     * 导出健康信息列表
     */
    @RequiresPermissions("health:information:export")
    @Log(title = "健康信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, HealthInformation healthInformation)
    {
        List<HealthInformation> list = healthInformationService.selectHealthInformationList(healthInformation);
        ExcelUtil<HealthInformation> util = new ExcelUtil<HealthInformation>(HealthInformation.class);
        util.exportExcel(response, list, "健康信息数据");
    }

    /**
     * 获取健康信息详细信息
     */
    @RequiresPermissions("health:information:query")
    @GetMapping(value = "/{healthInformationId}")
    public AjaxResult getInfo(@PathVariable("healthInformationId") Long healthInformationId)
    {
        return success(healthInformationService.selectHealthInformationByHealthInformationId(healthInformationId));
    }

    /**
     * 新增健康信息
     */
    @RequiresPermissions("health:information:add")
    @Log(title = "健康信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody HealthInformation healthInformation)
    {
        return toAjax(healthInformationService.insertHealthInformation(healthInformation));
    }

    /**
     * 修改健康信息
     */
    @RequiresPermissions("health:information:edit")
    @Log(title = "健康信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody HealthInformation healthInformation)
    {
        return toAjax(healthInformationService.updateHealthInformation(healthInformation));
    }

    /**
     * 删除健康信息
     */
    @RequiresPermissions("health:information:remove")
    @Log(title = "健康信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{healthInformationIds}")
    public AjaxResult remove(@PathVariable Long[] healthInformationIds)
    {
        return toAjax(healthInformationService.deleteHealthInformationByHealthInformationIds(healthInformationIds));
    }
}
