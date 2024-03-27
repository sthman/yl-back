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
import com.ruoyi.credit.domain.RewardPunishmentLevel;
import com.ruoyi.credit.service.IRewardPunishmentLevelService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 奖惩级别Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/level")
public class RewardPunishmentLevelController extends BaseController
{
    @Autowired
    private IRewardPunishmentLevelService rewardPunishmentLevelService;

    /**
     * 查询奖惩级别列表
     */
    @RequiresPermissions("credit:level:list")
    @GetMapping("/list")
    public TableDataInfo list(RewardPunishmentLevel rewardPunishmentLevel)
    {
        startPage();
        List<RewardPunishmentLevel> list = rewardPunishmentLevelService.selectRewardPunishmentLevelList(rewardPunishmentLevel);
        return getDataTable(list);
    }

    /**
     * 导出奖惩级别列表
     */
    @RequiresPermissions("credit:level:export")
    @Log(title = "奖惩级别", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, RewardPunishmentLevel rewardPunishmentLevel)
    {
        List<RewardPunishmentLevel> list = rewardPunishmentLevelService.selectRewardPunishmentLevelList(rewardPunishmentLevel);
        ExcelUtil<RewardPunishmentLevel> util = new ExcelUtil<RewardPunishmentLevel>(RewardPunishmentLevel.class);
        util.exportExcel(response, list, "奖惩级别数据");
    }

    /**
     * 获取奖惩级别详细信息
     */
    @RequiresPermissions("credit:level:query")
    @GetMapping(value = "/{rewardPunishmentLevelId}")
    public AjaxResult getInfo(@PathVariable("rewardPunishmentLevelId") Long rewardPunishmentLevelId)
    {
        return success(rewardPunishmentLevelService.selectRewardPunishmentLevelByRewardPunishmentLevelId(rewardPunishmentLevelId));
    }

    /**
     * 新增奖惩级别
     */
    @RequiresPermissions("credit:level:add")
    @Log(title = "奖惩级别", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody RewardPunishmentLevel rewardPunishmentLevel)
    {
        return toAjax(rewardPunishmentLevelService.insertRewardPunishmentLevel(rewardPunishmentLevel));
    }

    /**
     * 修改奖惩级别
     */
    @RequiresPermissions("credit:level:edit")
    @Log(title = "奖惩级别", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody RewardPunishmentLevel rewardPunishmentLevel)
    {
        return toAjax(rewardPunishmentLevelService.updateRewardPunishmentLevel(rewardPunishmentLevel));
    }

    /**
     * 删除奖惩级别
     */
    @RequiresPermissions("credit:level:remove")
    @Log(title = "奖惩级别", businessType = BusinessType.DELETE)
	@DeleteMapping("/{rewardPunishmentLevelIds}")
    public AjaxResult remove(@PathVariable Long[] rewardPunishmentLevelIds)
    {
        return toAjax(rewardPunishmentLevelService.deleteRewardPunishmentLevelByRewardPunishmentLevelIds(rewardPunishmentLevelIds));
    }
}
