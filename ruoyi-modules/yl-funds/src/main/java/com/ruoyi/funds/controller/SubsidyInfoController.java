package com.ruoyi.funds.controller;

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
import com.ruoyi.funds.domain.SubsidyInfo;
import com.ruoyi.funds.service.ISubsidyInfoService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 补贴信息Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/info")
public class SubsidyInfoController extends BaseController
{
    @Autowired
    private ISubsidyInfoService subsidyInfoService;

    /**
     * 查询补贴信息列表
     */
    @RequiresPermissions("funds:info:list")
    @GetMapping("/list")
    public TableDataInfo list(SubsidyInfo subsidyInfo)
    {
        startPage();
        List<SubsidyInfo> list = subsidyInfoService.selectSubsidyInfoList(subsidyInfo);
        return getDataTable(list);
    }

    /**
     * 导出补贴信息列表
     */
    @RequiresPermissions("funds:info:export")
    @Log(title = "补贴信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, SubsidyInfo subsidyInfo)
    {
        List<SubsidyInfo> list = subsidyInfoService.selectSubsidyInfoList(subsidyInfo);
        ExcelUtil<SubsidyInfo> util = new ExcelUtil<SubsidyInfo>(SubsidyInfo.class);
        util.exportExcel(response, list, "补贴信息数据");
    }

    /**
     * 获取补贴信息详细信息
     */
    @RequiresPermissions("funds:info:query")
    @GetMapping(value = "/{subsidyInfoId}")
    public AjaxResult getInfo(@PathVariable("subsidyInfoId") Long subsidyInfoId)
    {
        return success(subsidyInfoService.selectSubsidyInfoBySubsidyInfoId(subsidyInfoId));
    }

    /**
     * 新增补贴信息
     */
    @RequiresPermissions("funds:info:add")
    @Log(title = "补贴信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody SubsidyInfo subsidyInfo)
    {
        return toAjax(subsidyInfoService.insertSubsidyInfo(subsidyInfo));
    }

    /**
     * 修改补贴信息
     */
    @RequiresPermissions("funds:info:edit")
    @Log(title = "补贴信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody SubsidyInfo subsidyInfo)
    {
        return toAjax(subsidyInfoService.updateSubsidyInfo(subsidyInfo));
    }

    /**
     * 删除补贴信息
     */
    @RequiresPermissions("funds:info:remove")
    @Log(title = "补贴信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{subsidyInfoIds}")
    public AjaxResult remove(@PathVariable Long[] subsidyInfoIds)
    {
        return toAjax(subsidyInfoService.deleteSubsidyInfoBySubsidyInfoIds(subsidyInfoIds));
    }
}
