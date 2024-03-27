package com.ruoyi.tickets.controller;

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
import com.ruoyi.tickets.domain.Telwork;
import com.ruoyi.tickets.service.ITelworkService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 话务工单Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/telwork")
public class TelworkController extends BaseController
{
    @Autowired
    private ITelworkService telworkService;

    /**
     * 查询话务工单列表
     */
    @RequiresPermissions("tickets:telwork:list")
    @GetMapping("/list")
    public TableDataInfo list(Telwork telwork)
    {
        startPage();
        List<Telwork> list = telworkService.selectTelworkList(telwork);
        return getDataTable(list);
    }

    /**
     * 导出话务工单列表
     */
    @RequiresPermissions("tickets:telwork:export")
    @Log(title = "话务工单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Telwork telwork)
    {
        List<Telwork> list = telworkService.selectTelworkList(telwork);
        ExcelUtil<Telwork> util = new ExcelUtil<Telwork>(Telwork.class);
        util.exportExcel(response, list, "话务工单数据");
    }

    /**
     * 获取话务工单详细信息
     */
    @RequiresPermissions("tickets:telwork:query")
    @GetMapping(value = "/{telworkId}")
    public AjaxResult getInfo(@PathVariable("telworkId") Long telworkId)
    {
        return success(telworkService.selectTelworkByTelworkId(telworkId));
    }

    /**
     * 新增话务工单
     */
    @RequiresPermissions("tickets:telwork:add")
    @Log(title = "话务工单", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Telwork telwork)
    {
        return toAjax(telworkService.insertTelwork(telwork));
    }

    /**
     * 修改话务工单
     */
    @RequiresPermissions("tickets:telwork:edit")
    @Log(title = "话务工单", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Telwork telwork)
    {
        return toAjax(telworkService.updateTelwork(telwork));
    }

    /**
     * 删除话务工单
     */
    @RequiresPermissions("tickets:telwork:remove")
    @Log(title = "话务工单", businessType = BusinessType.DELETE)
	@DeleteMapping("/{telworkIds}")
    public AjaxResult remove(@PathVariable Long[] telworkIds)
    {
        return toAjax(telworkService.deleteTelworkByTelworkIds(telworkIds));
    }
}
