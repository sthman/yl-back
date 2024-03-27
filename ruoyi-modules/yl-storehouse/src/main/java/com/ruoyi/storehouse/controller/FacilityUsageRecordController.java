package com.ruoyi.storehouse.controller;

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
import com.ruoyi.storehouse.domain.FacilityUsageRecord;
import com.ruoyi.storehouse.service.IFacilityUsageRecordService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 设施使用记录Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/record")
public class FacilityUsageRecordController extends BaseController
{
    @Autowired
    private IFacilityUsageRecordService facilityUsageRecordService;

    /**
     * 查询设施使用记录列表
     */
    @RequiresPermissions("storehouse:record:list")
    @GetMapping("/list")
    public TableDataInfo list(FacilityUsageRecord facilityUsageRecord)
    {
        startPage();
        List<FacilityUsageRecord> list = facilityUsageRecordService.selectFacilityUsageRecordList(facilityUsageRecord);
        return getDataTable(list);
    }

    /**
     * 导出设施使用记录列表
     */
    @RequiresPermissions("storehouse:record:export")
    @Log(title = "设施使用记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, FacilityUsageRecord facilityUsageRecord)
    {
        List<FacilityUsageRecord> list = facilityUsageRecordService.selectFacilityUsageRecordList(facilityUsageRecord);
        ExcelUtil<FacilityUsageRecord> util = new ExcelUtil<FacilityUsageRecord>(FacilityUsageRecord.class);
        util.exportExcel(response, list, "设施使用记录数据");
    }

    /**
     * 获取设施使用记录详细信息
     */
    @RequiresPermissions("storehouse:record:query")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") Long recordId)
    {
        return success(facilityUsageRecordService.selectFacilityUsageRecordByRecordId(recordId));
    }

    /**
     * 新增设施使用记录
     */
    @RequiresPermissions("storehouse:record:add")
    @Log(title = "设施使用记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody FacilityUsageRecord facilityUsageRecord)
    {
        return toAjax(facilityUsageRecordService.insertFacilityUsageRecord(facilityUsageRecord));
    }

    /**
     * 修改设施使用记录
     */
    @RequiresPermissions("storehouse:record:edit")
    @Log(title = "设施使用记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody FacilityUsageRecord facilityUsageRecord)
    {
        return toAjax(facilityUsageRecordService.updateFacilityUsageRecord(facilityUsageRecord));
    }

    /**
     * 删除设施使用记录
     */
    @RequiresPermissions("storehouse:record:remove")
    @Log(title = "设施使用记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable Long[] recordIds)
    {
        return toAjax(facilityUsageRecordService.deleteFacilityUsageRecordByRecordIds(recordIds));
    }
}
