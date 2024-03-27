package com.ruoyi.volunteer.controller;

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
import com.ruoyi.volunteer.domain.PointsUsageRecord;
import com.ruoyi.volunteer.service.IPointsUsageRecordService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 积分使用记录Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/record")
public class PointsUsageRecordController extends BaseController
{
    @Autowired
    private IPointsUsageRecordService pointsUsageRecordService;

    /**
     * 查询积分使用记录列表
     */
    @RequiresPermissions("volunteer:record:list")
    @GetMapping("/list")
    public TableDataInfo list(PointsUsageRecord pointsUsageRecord)
    {
        startPage();
        List<PointsUsageRecord> list = pointsUsageRecordService.selectPointsUsageRecordList(pointsUsageRecord);
        return getDataTable(list);
    }

    /**
     * 导出积分使用记录列表
     */
    @RequiresPermissions("volunteer:record:export")
    @Log(title = "积分使用记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PointsUsageRecord pointsUsageRecord)
    {
        List<PointsUsageRecord> list = pointsUsageRecordService.selectPointsUsageRecordList(pointsUsageRecord);
        ExcelUtil<PointsUsageRecord> util = new ExcelUtil<PointsUsageRecord>(PointsUsageRecord.class);
        util.exportExcel(response, list, "积分使用记录数据");
    }

    /**
     * 获取积分使用记录详细信息
     */
    @RequiresPermissions("volunteer:record:query")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") Long recordId)
    {
        return success(pointsUsageRecordService.selectPointsUsageRecordByRecordId(recordId));
    }

    /**
     * 新增积分使用记录
     */
    @RequiresPermissions("volunteer:record:add")
    @Log(title = "积分使用记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PointsUsageRecord pointsUsageRecord)
    {
        return toAjax(pointsUsageRecordService.insertPointsUsageRecord(pointsUsageRecord));
    }

    /**
     * 修改积分使用记录
     */
    @RequiresPermissions("volunteer:record:edit")
    @Log(title = "积分使用记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PointsUsageRecord pointsUsageRecord)
    {
        return toAjax(pointsUsageRecordService.updatePointsUsageRecord(pointsUsageRecord));
    }

    /**
     * 删除积分使用记录
     */
    @RequiresPermissions("volunteer:record:remove")
    @Log(title = "积分使用记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable Long[] recordIds)
    {
        return toAjax(pointsUsageRecordService.deletePointsUsageRecordByRecordIds(recordIds));
    }
}
