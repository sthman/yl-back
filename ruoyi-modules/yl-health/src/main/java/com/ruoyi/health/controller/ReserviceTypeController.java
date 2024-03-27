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
import com.ruoyi.health.domain.ReserviceType;
import com.ruoyi.health.service.IReserviceTypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 服务类型Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/type")
public class ReserviceTypeController extends BaseController
{
    @Autowired
    private IReserviceTypeService reserviceTypeService;

    /**
     * 查询服务类型列表
     */
    @RequiresPermissions("health:type:list")
    @GetMapping("/list")
    public TableDataInfo list(ReserviceType reserviceType)
    {
        startPage();
        List<ReserviceType> list = reserviceTypeService.selectReserviceTypeList(reserviceType);
        return getDataTable(list);
    }

    /**
     * 导出服务类型列表
     */
    @RequiresPermissions("health:type:export")
    @Log(title = "服务类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ReserviceType reserviceType)
    {
        List<ReserviceType> list = reserviceTypeService.selectReserviceTypeList(reserviceType);
        ExcelUtil<ReserviceType> util = new ExcelUtil<ReserviceType>(ReserviceType.class);
        util.exportExcel(response, list, "服务类型数据");
    }

    /**
     * 获取服务类型详细信息
     */
    @RequiresPermissions("health:type:query")
    @GetMapping(value = "/{reserviceTypeId}")
    public AjaxResult getInfo(@PathVariable("reserviceTypeId") Long reserviceTypeId)
    {
        return success(reserviceTypeService.selectReserviceTypeByReserviceTypeId(reserviceTypeId));
    }

    /**
     * 新增服务类型
     */
    @RequiresPermissions("health:type:add")
    @Log(title = "服务类型", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ReserviceType reserviceType)
    {
        return toAjax(reserviceTypeService.insertReserviceType(reserviceType));
    }

    /**
     * 修改服务类型
     */
    @RequiresPermissions("health:type:edit")
    @Log(title = "服务类型", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ReserviceType reserviceType)
    {
        return toAjax(reserviceTypeService.updateReserviceType(reserviceType));
    }

    /**
     * 删除服务类型
     */
    @RequiresPermissions("health:type:remove")
    @Log(title = "服务类型", businessType = BusinessType.DELETE)
	@DeleteMapping("/{reserviceTypeIds}")
    public AjaxResult remove(@PathVariable Long[] reserviceTypeIds)
    {
        return toAjax(reserviceTypeService.deleteReserviceTypeByReserviceTypeIds(reserviceTypeIds));
    }
}
