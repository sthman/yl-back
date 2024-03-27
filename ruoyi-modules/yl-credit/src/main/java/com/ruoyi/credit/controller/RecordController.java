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
import com.ruoyi.credit.domain.Record;
import com.ruoyi.credit.service.IRecordService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 机构信用记录Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/record")
public class RecordController extends BaseController
{
    @Autowired
    private IRecordService recordService;

    /**
     * 查询机构信用记录列表
     */
    @RequiresPermissions("credit:record:list")
    @GetMapping("/list")
    public TableDataInfo list(Record record)
    {
        startPage();
        List<Record> list = recordService.selectRecordList(record);
        return getDataTable(list);
    }

    /**
     * 导出机构信用记录列表
     */
    @RequiresPermissions("credit:record:export")
    @Log(title = "机构信用记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Record record)
    {
        List<Record> list = recordService.selectRecordList(record);
        ExcelUtil<Record> util = new ExcelUtil<Record>(Record.class);
        util.exportExcel(response, list, "机构信用记录数据");
    }

    /**
     * 获取机构信用记录详细信息
     */
    @RequiresPermissions("credit:record:query")
    @GetMapping(value = "/{recordId}")
    public AjaxResult getInfo(@PathVariable("recordId") Long recordId)
    {
        return success(recordService.selectRecordByRecordId(recordId));
    }

    /**
     * 新增机构信用记录
     */
    @RequiresPermissions("credit:record:add")
    @Log(title = "机构信用记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Record record)
    {
        return toAjax(recordService.insertRecord(record));
    }

    /**
     * 修改机构信用记录
     */
    @RequiresPermissions("credit:record:edit")
    @Log(title = "机构信用记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Record record)
    {
        return toAjax(recordService.updateRecord(record));
    }

    /**
     * 删除机构信用记录
     */
    @RequiresPermissions("credit:record:remove")
    @Log(title = "机构信用记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{recordIds}")
    public AjaxResult remove(@PathVariable Long[] recordIds)
    {
        return toAjax(recordService.deleteRecordByRecordIds(recordIds));
    }
}
