package com.ruoyi.volunteer.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.system.api.domain.SysUser;
import com.ruoyi.system.api.model.LoginUser;
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
import com.ruoyi.volunteer.domain.VolunteerActivity;
import com.ruoyi.volunteer.service.IVolunteerActivityService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 志愿者招募Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/vactivity")

public class VolunteerActivityController extends BaseController
{
    @Autowired
    private IVolunteerActivityService volunteerActivityService;

    /**
     * 查询志愿者招募列表
     */
    @RequiresPermissions("volunteer:vactivity:list")
    @GetMapping("/list")
    public TableDataInfo list(VolunteerActivity volunteerActivity)
    {
        startPage();
        List<VolunteerActivity> list = volunteerActivityService.selectVolunteerActivityList(volunteerActivity);
        return getDataTable(list);
    }

    /**
     * 导出志愿者招募列表
     */
    @RequiresPermissions("volunteer:vactivity:export")
    @Log(title = "志愿者招募", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VolunteerActivity volunteerActivity)
    {
        List<VolunteerActivity> list = volunteerActivityService.selectVolunteerActivityList(volunteerActivity);
        ExcelUtil<VolunteerActivity> util = new ExcelUtil<VolunteerActivity>(VolunteerActivity.class);
        util.exportExcel(response, list, "志愿者招募数据");
    }

    /**
     * 获取志愿者招募详细信息
     */
    @RequiresPermissions("volunteer:vactivity:query")
    @GetMapping(value = "/{vactivityId}")
    public AjaxResult getInfo(@PathVariable("vactivityId") Long vactivityId)
    {
        return success(volunteerActivityService.selectVolunteerActivityByVactivityId(vactivityId));
    }

    /**
     * 新增志愿者招募
     */
    @RequiresPermissions("volunteer:vactivity:add")
    @Log(title = "志愿者招募", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VolunteerActivity volunteerActivity)
    {
        //获取当前登录用户id
        Long userId = SecurityUtils.getUserId();
        volunteerActivity.setPublishingOrgId(userId);

        //TODO 需要当前登录的管理员所属的机构id和机构类型


//        SysUser sysUser = SecurityUtils.getLoginUser().getSysUser();


        //初始化剩余人数
        volunteerActivity.setRemainingCount(volunteerActivity.getVactivityNum());
        //初始化招募状态
        volunteerActivity.setVactivityStatus(1L);
        System.out.println("volunteerActivity = " + volunteerActivity);


        return null;
//        return toAjax(volunteerActivityService.insertVolunteerActivity(volunteerActivity));
    }

    /**
     * 修改志愿者招募
     */
    @RequiresPermissions("volunteer:vactivity:edit")
    @Log(title = "志愿者招募", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VolunteerActivity volunteerActivity)
    {
        return toAjax(volunteerActivityService.updateVolunteerActivity(volunteerActivity));
    }

    /**
     * 删除志愿者招募
     */
    @RequiresPermissions("volunteer:vactivity:remove")
    @Log(title = "志愿者招募", businessType = BusinessType.DELETE)
	@DeleteMapping("/{vactivityIds}")
    public AjaxResult remove(@PathVariable Long[] vactivityIds)
    {
        return toAjax(volunteerActivityService.deleteVolunteerActivityByVactivityIds(vactivityIds));
    }
}
