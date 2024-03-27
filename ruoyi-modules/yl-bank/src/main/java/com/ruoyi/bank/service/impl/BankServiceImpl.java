package com.ruoyi.bank.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.bank.mapper.BankMapper;
import com.ruoyi.bank.domain.Bank;
import com.ruoyi.bank.service.IBankService;

/**
 * 银行信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class BankServiceImpl implements IBankService 
{
    @Autowired
    private BankMapper bankMapper;

    /**
     * 查询银行信息
     * 
     * @param bankId 银行信息主键
     * @return 银行信息
     */
    @Override
    public Bank selectBankByBankId(Long bankId)
    {
        return bankMapper.selectBankByBankId(bankId);
    }

    /**
     * 查询银行信息列表
     * 
     * @param bank 银行信息
     * @return 银行信息
     */
    @Override
    public List<Bank> selectBankList(Bank bank)
    {
        return bankMapper.selectBankList(bank);
    }

    /**
     * 新增银行信息
     * 
     * @param bank 银行信息
     * @return 结果
     */
    @Override
    public int insertBank(Bank bank)
    {
        return bankMapper.insertBank(bank);
    }

    /**
     * 修改银行信息
     * 
     * @param bank 银行信息
     * @return 结果
     */
    @Override
    public int updateBank(Bank bank)
    {
        return bankMapper.updateBank(bank);
    }

    /**
     * 批量删除银行信息
     * 
     * @param bankIds 需要删除的银行信息主键
     * @return 结果
     */
    @Override
    public int deleteBankByBankIds(Long[] bankIds)
    {
        return bankMapper.deleteBankByBankIds(bankIds);
    }

    /**
     * 删除银行信息信息
     * 
     * @param bankId 银行信息主键
     * @return 结果
     */
    @Override
    public int deleteBankByBankId(Long bankId)
    {
        return bankMapper.deleteBankByBankId(bankId);
    }
}
