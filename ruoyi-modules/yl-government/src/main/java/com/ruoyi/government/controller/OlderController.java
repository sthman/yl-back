package com.ruoyi.government.controller;

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
import com.ruoyi.government.domain.Older;
import com.ruoyi.government.service.IOlderService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 老人信息Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/older")
public class OlderController extends BaseController
{
    @Autowired
    private IOlderService olderService;

    /**
     * 查询老人信息列表
     */
    @RequiresPermissions("government:older:list")
    @GetMapping("/list")
    public TableDataInfo list(Older older)
    {
        startPage();
        List<Older> list = olderService.selectOlderList(older);
        return getDataTable(list);
    }

    /**
     * 导出老人信息列表
     */
    @RequiresPermissions("government:older:export")
    @Log(title = "老人信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Older older)
    {
        List<Older> list = olderService.selectOlderList(older);
        ExcelUtil<Older> util = new ExcelUtil<Older>(Older.class);
        util.exportExcel(response, list, "老人信息数据");
    }

    /**
     * 获取老人信息详细信息
     */
    @RequiresPermissions("government:older:query")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return success(olderService.selectOlderByUserId(userId));
    }

    /**
     * 新增老人信息
     */
    @RequiresPermissions("government:older:add")
    @Log(title = "老人信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Older older)
    {
        return toAjax(olderService.insertOlder(older));
    }

    /**
     * 修改老人信息
     */
    @RequiresPermissions("government:older:edit")
    @Log(title = "老人信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Older older)
    {
        return toAjax(olderService.updateOlder(older));
    }

    /**
     * 删除老人信息
     */
    @RequiresPermissions("government:older:remove")
    @Log(title = "老人信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{olderAges}")
    public AjaxResult remove(@PathVariable Long[] olderAges)
    {
        return toAjax(olderService.deleteOlderByOlderAges(olderAges));
    }


    /**
     * 新增用户时新增老人信息
     */
    @RequiresPermissions("government:older:add")
    @Log(title = "老人信息", businessType = BusinessType.INSERT)
    @PostMapping("/addOlderByAddUser")
    public AjaxResult addOlderByAddUser(@RequestBody Long userId)
    {
        return toAjax(olderService.addOlderByAddUser(userId));
    }
}
