package com.ruoyi.volunteer.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.constant.SecurityConstants;
import com.ruoyi.common.core.domain.R;
import com.ruoyi.system.api.RemoteUserService;
import com.ruoyi.system.api.domain.SysUser;
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
import com.ruoyi.volunteer.domain.Volunteer;
import com.ruoyi.volunteer.service.IVolunteerService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 志愿者Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/volunteer")
public class VolunteerController extends BaseController
{
    @Autowired
    private RemoteUserService remoteUserService;
    @Autowired
    private IVolunteerService volunteerService;

    /**
     * 查询志愿者列表
     */
    @RequiresPermissions("volunteer:volunteer:list")
    @GetMapping("/list")
    public TableDataInfo list(Volunteer volunteer)
    {
        startPage();
        List<Volunteer> list = volunteerService.selectVolunteerList(volunteer);
        return getDataTable(list);
    }

    /**
     * 导出志愿者列表
     */
    @RequiresPermissions("volunteer:volunteer:export")
    @Log(title = "志愿者", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Volunteer volunteer)
    {
        List<Volunteer> list = volunteerService.selectVolunteerList(volunteer);
        ExcelUtil<Volunteer> util = new ExcelUtil<Volunteer>(Volunteer.class);
        util.exportExcel(response, list, "志愿者数据");
    }

    /**
     * 获取志愿者详细信息
     */
    @RequiresPermissions("volunteer:volunteer:query")
    @GetMapping(value = "/{vStar}")
    public AjaxResult getInfo(@PathVariable("vStar") Long vStar)
    {
        return success(volunteerService.selectVolunteerByVStar(vStar));
    }

    /**
     * 新增志愿者
     */
    @RequiresPermissions("volunteer:volunteer:add")
    @Log(title = "志愿者", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Volunteer volunteer)
    {
        SysUser sysUser = new SysUser();
        sysUser.setUserName(volunteer.getUserName());
        sysUser.setNickName(volunteer.getUserNikeName());
        sysUser.setStatus(String.valueOf(0));
        Long[] roleIds = {102L};
        sysUser.setRoleIds(roleIds);
        sysUser.setPassword(String.valueOf(123456));

        R<Integer> integerR = remoteUserService.addUserInfo(sysUser, SecurityConstants.INNER);
        Integer userId = integerR.getData();
        volunteer.setUserId(Long.valueOf(userId));
        volunteer.setvStatus(1L);
        return toAjax(volunteerService.insertVolunteer(volunteer));
    }

    /**
     * 修改志愿者
     */
    @RequiresPermissions("volunteer:volunteer:edit")
    @Log(title = "志愿者", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Volunteer volunteer)
    {
        return toAjax(volunteerService.updateVolunteer(volunteer));
    }

    /**
     * 删除志愿者
     */
    @RequiresPermissions("volunteer:volunteer:remove")
    @Log(title = "志愿者", businessType = BusinessType.DELETE)
	@DeleteMapping("/{vStars}")
    public AjaxResult remove(@PathVariable Long[] vStars)
    {
        return toAjax(volunteerService.deleteVolunteerByVStars(vStars));
    }
}
