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
import com.ruoyi.organization.domain.Bed;
import com.ruoyi.organization.service.IBedService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 床位Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/bed")
public class BedController extends BaseController
{
    @Autowired
    private IBedService bedService;

    /**
     * 查询床位列表
     */
    @RequiresPermissions("organization:bed:list")
    @GetMapping("/list")
    public TableDataInfo list(Bed bed)
    {
        startPage();
        List<Bed> list = bedService.selectBedList(bed);
        return getDataTable(list);
    }

    /**
     * 导出床位列表
     */
    @RequiresPermissions("organization:bed:export")
    @Log(title = "床位", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Bed bed)
    {
        List<Bed> list = bedService.selectBedList(bed);
        ExcelUtil<Bed> util = new ExcelUtil<Bed>(Bed.class);
        util.exportExcel(response, list, "床位数据");
    }

    /**
     * 获取床位详细信息
     */
    @RequiresPermissions("organization:bed:query")
    @GetMapping(value = "/{bedId}")
    public AjaxResult getInfo(@PathVariable("bedId") Long bedId)
    {
        return success(bedService.selectBedByBedId(bedId));
    }

    /**
     * 新增床位
     */
    @RequiresPermissions("organization:bed:add")
    @Log(title = "床位", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Bed bed)
    {
        return toAjax(bedService.insertBed(bed));
    }

    /**
     * 修改床位
     */
    @RequiresPermissions("organization:bed:edit")
    @Log(title = "床位", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Bed bed)
    {
        return toAjax(bedService.updateBed(bed));
    }

    /**
     * 删除床位
     */
    @RequiresPermissions("organization:bed:remove")
    @Log(title = "床位", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bedIds}")
    public AjaxResult remove(@PathVariable Long[] bedIds)
    {
        return toAjax(bedService.deleteBedByBedIds(bedIds));
    }
}
