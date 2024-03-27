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
import com.ruoyi.credit.domain.RewardPunishment;
import com.ruoyi.credit.service.IRewardPunishmentService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 奖惩记录Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/punishment")
public class RewardPunishmentController extends BaseController
{
    @Autowired
    private IRewardPunishmentService rewardPunishmentService;

    /**
     * 查询奖惩记录列表
     */
    @RequiresPermissions("credit:punishment:list")
    @GetMapping("/list")
    public TableDataInfo list(RewardPunishment rewardPunishment)
    {
        startPage();
        List<RewardPunishment> list = rewardPunishmentService.selectRewardPunishmentList(rewardPunishment);
        return getDataTable(list);
    }

    /**
     * 导出奖惩记录列表
     */
    @RequiresPermissions("credit:punishment:export")
    @Log(title = "奖惩记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RewardPunishment rewardPunishment)
    {
        List<RewardPunishment> list = rewardPunishmentService.selectRewardPunishmentList(rewardPunishment);
        ExcelUtil<RewardPunishment> util = new ExcelUtil<RewardPunishment>(RewardPunishment.class);
        util.exportExcel(response, list, "奖惩记录数据");
    }

    /**
     * 获取奖惩记录详细信息
     */
    @RequiresPermissions("credit:punishment:query")
    @GetMapping(value = "/{rewardPunishmentId}")
    public AjaxResult getInfo(@PathVariable("rewardPunishmentId") Long rewardPunishmentId)
    {
        return success(rewardPunishmentService.selectRewardPunishmentByRewardPunishmentId(rewardPunishmentId));
    }

    /**
     * 新增奖惩记录
     */
    @RequiresPermissions("credit:punishment:add")
    @Log(title = "奖惩记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RewardPunishment rewardPunishment)
    {
        return toAjax(rewardPunishmentService.insertRewardPunishment(rewardPunishment));
    }

    /**
     * 修改奖惩记录
     */
    @RequiresPermissions("credit:punishment:edit")
    @Log(title = "奖惩记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RewardPunishment rewardPunishment)
    {
        return toAjax(rewardPunishmentService.updateRewardPunishment(rewardPunishment));
    }

    /**
     * 删除奖惩记录
     */
    @RequiresPermissions("credit:punishment:remove")
    @Log(title = "奖惩记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rewardPunishmentIds}")
    public AjaxResult remove(@PathVariable Long[] rewardPunishmentIds)
    {
        return toAjax(rewardPunishmentService.deleteRewardPunishmentByRewardPunishmentIds(rewardPunishmentIds));
    }
}
