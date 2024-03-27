package com.ruoyi.credit.controller;

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
import com.ruoyi.credit.domain.Rectification;
import com.ruoyi.credit.service.IRectificationService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 整改记录Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/rectification")
public class RectificationController extends BaseController
{
    @Autowired
    private IRectificationService rectificationService;

    /**
     * 查询整改记录列表
     */
    @RequiresPermissions("credit:rectification:list")
    @GetMapping("/list")
    public TableDataInfo list(Rectification rectification)
    {
        startPage();
        List<Rectification> list = rectificationService.selectRectificationList(rectification);
        return getDataTable(list);
    }

    /**
     * 导出整改记录列表
     */
    @RequiresPermissions("credit:rectification:export")
    @Log(title = "整改记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Rectification rectification)
    {
        List<Rectification> list = rectificationService.selectRectificationList(rectification);
        ExcelUtil<Rectification> util = new ExcelUtil<Rectification>(Rectification.class);
        util.exportExcel(response, list, "整改记录数据");
    }

    /**
     * 获取整改记录详细信息
     */
    @RequiresPermissions("credit:rectification:query")
    @GetMapping(value = "/{rectificationId}")
    public AjaxResult getInfo(@PathVariable("rectificationId") Long rectificationId)
    {
        return success(rectificationService.selectRectificationByRectificationId(rectificationId));
    }

    /**
     * 新增整改记录
     */
    @RequiresPermissions("credit:rectification:add")
    @Log(title = "整改记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Rectification rectification)
    {
        return toAjax(rectificationService.insertRectification(rectification));
    }

    /**
     * 修改整改记录
     */
    @RequiresPermissions("credit:rectification:edit")
    @Log(title = "整改记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Rectification rectification)
    {
        return toAjax(rectificationService.updateRectification(rectification));
    }

    /**
     * 删除整改记录
     */
    @RequiresPermissions("credit:rectification:remove")
    @Log(title = "整改记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rectificationIds}")
    public AjaxResult remove(@PathVariable Long[] rectificationIds)
    {
        return toAjax(rectificationService.deleteRectificationByRectificationIds(rectificationIds));
    }
}
