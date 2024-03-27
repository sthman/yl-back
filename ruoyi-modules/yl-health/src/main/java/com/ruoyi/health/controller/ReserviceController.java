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
import com.ruoyi.health.domain.Reservice;
import com.ruoyi.health.service.IReserviceService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 定期服务Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/reservice")
public class ReserviceController extends BaseController
{
    @Autowired
    private IReserviceService reserviceService;

    /**
     * 查询定期服务列表
     */
    @RequiresPermissions("health:reservice:list")
    @GetMapping("/list")
    public TableDataInfo list(Reservice reservice)
    {
        startPage();
        List<Reservice> list = reserviceService.selectReserviceList(reservice);
        return getDataTable(list);
    }

    /**
     * 导出定期服务列表
     */
    @RequiresPermissions("health:reservice:export")
    @Log(title = "定期服务", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Reservice reservice)
    {
        List<Reservice> list = reserviceService.selectReserviceList(reservice);
        ExcelUtil<Reservice> util = new ExcelUtil<Reservice>(Reservice.class);
        util.exportExcel(response, list, "定期服务数据");
    }

    /**
     * 获取定期服务详细信息
     */
    @RequiresPermissions("health:reservice:query")
    @GetMapping(value = "/{reserviceId}")
    public AjaxResult getInfo(@PathVariable("reserviceId") Long reserviceId)
    {
        return success(reserviceService.selectReserviceByReserviceId(reserviceId));
    }

    /**
     * 新增定期服务
     */
    @RequiresPermissions("health:reservice:add")
    @Log(title = "定期服务", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Reservice reservice)
    {
        return toAjax(reserviceService.insertReservice(reservice));
    }

    /**
     * 修改定期服务
     */
    @RequiresPermissions("health:reservice:edit")
    @Log(title = "定期服务", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Reservice reservice)
    {
        return toAjax(reserviceService.updateReservice(reservice));
    }

    /**
     * 删除定期服务
     */
    @RequiresPermissions("health:reservice:remove")
    @Log(title = "定期服务", businessType = BusinessType.DELETE)
	@DeleteMapping("/{reserviceIds}")
    public AjaxResult remove(@PathVariable Long[] reserviceIds)
    {
        return toAjax(reserviceService.deleteReserviceByReserviceIds(reserviceIds));
    }
}
