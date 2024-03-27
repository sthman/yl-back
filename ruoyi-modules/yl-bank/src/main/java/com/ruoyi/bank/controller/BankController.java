package com.ruoyi.bank.controller;

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
import com.ruoyi.bank.domain.Bank;
import com.ruoyi.bank.service.IBankService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 银行信息Controller
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@RestController
@RequestMapping("/bank")
public class BankController extends BaseController
{
    @Autowired
    private IBankService bankService;

    /**
     * 查询银行信息列表
     */
    @RequiresPermissions("bank:bank:list")
    @GetMapping("/list")
    public TableDataInfo list(Bank bank)
    {
        startPage();
        List<Bank> list = bankService.selectBankList(bank);
        return getDataTable(list);
    }

    /**
     * 导出银行信息列表
     */
    @RequiresPermissions("bank:bank:export")
    @Log(title = "银行信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Bank bank)
    {
        List<Bank> list = bankService.selectBankList(bank);
        ExcelUtil<Bank> util = new ExcelUtil<Bank>(Bank.class);
        util.exportExcel(response, list, "银行信息数据");
    }

    /**
     * 获取银行信息详细信息
     */
    @RequiresPermissions("bank:bank:query")
    @GetMapping(value = "/{bankId}")
    public AjaxResult getInfo(@PathVariable("bankId") Long bankId)
    {
        return success(bankService.selectBankByBankId(bankId));
    }

    /**
     * 新增银行信息
     */
    @RequiresPermissions("bank:bank:add")
    @Log(title = "银行信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Bank bank)
    {
        return toAjax(bankService.insertBank(bank));
    }

    /**
     * 修改银行信息
     */
    @RequiresPermissions("bank:bank:edit")
    @Log(title = "银行信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Bank bank)
    {
        return toAjax(bankService.updateBank(bank));
    }

    /**
     * 删除银行信息
     */
    @RequiresPermissions("bank:bank:remove")
    @Log(title = "银行信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{bankIds}")
    public AjaxResult remove(@PathVariable Long[] bankIds)
    {
        return toAjax(bankService.deleteBankByBankIds(bankIds));
    }
}
