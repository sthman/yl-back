package com.ruoyi.volunteer.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;


import com.ruoyi.volunteer.domain.PointsUsageRecord;
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
import com.ruoyi.volunteer.domain.VService;
import com.ruoyi.volunteer.service.IVServiceService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 积分服务Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/vservice")
public class VServiceController extends BaseController
{
    @Autowired
    private IVServiceService vServiceService;

    /**
     * 查询积分服务列表
     */
    @RequiresPermissions("volunteer:vservice:list")
    @GetMapping("/list")
    public TableDataInfo list(VService vService)
    {
        startPage();
        List<VService> list = vServiceService.selectVServiceList(vService);
        return getDataTable(list);
    }

    /**
     * 导出积分服务列表
     */
    @RequiresPermissions("volunteer:vservice:export")
    @Log(title = "积分服务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VService vService)
    {
        List<VService> list = vServiceService.selectVServiceList(vService);
        ExcelUtil<VService> util = new ExcelUtil<VService>(VService.class);
        util.exportExcel(response, list, "积分服务数据");
    }

    /**
     * 获取积分服务详细信息
     */
    @RequiresPermissions("volunteer:vservice:query")
    @GetMapping(value = "/{vServiceId}")
    public AjaxResult getInfo(@PathVariable("vServiceId") Long vServiceId)
    {
        return success(vServiceService.selectVServiceByVServiceId(vServiceId));
    }

    /**
     * 新增积分服务
     */
    @RequiresPermissions("volunteer:vservice:add")
    @Log(title = "积分服务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VService vService)
    {
        return toAjax(vServiceService.insertVService(vService));
    }

    /**
     * 修改积分服务
     */
    @RequiresPermissions("volunteer:vservice:edit")
    @Log(title = "积分服务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VService vService)
    {
        return toAjax(vServiceService.updateVService(vService));
    }

    /**
     * 删除积分服务
     */
    @RequiresPermissions("volunteer:vservice:remove")
    @Log(title = "积分服务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{vServiceIds}")
    public AjaxResult remove(@PathVariable Long[] vServiceIds)
    {
        return toAjax(vServiceService.deleteVServiceByVServiceIds(vServiceIds));
    }

    /**
     * 购买积分服务
     */

    @PostMapping("/buyVservice")
    public AjaxResult buyVservice(@RequestBody PointsUsageRecord pointsUsageRecord){
        return toAjax(vServiceService.buyVservice(pointsUsageRecord));
    }

}
