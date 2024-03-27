package com.ruoyi.bank.service;

import java.util.List;
import com.ruoyi.bank.domain.Bank;

/**
 * 银行信息Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IBankService 
{
    /**
     * 查询银行信息
     * 
     * @param bankId 银行信息主键
     * @return 银行信息
     */
    public Bank selectBankByBankId(Long bankId);

    /**
     * 查询银行信息列表
     * 
     * @param bank 银行信息
     * @return 银行信息集合
     */
    public List<Bank> selectBankList(Bank bank);

    /**
     * 新增银行信息
     * 
     * @param bank 银行信息
     * @return 结果
     */
    public int insertBank(Bank bank);

    /**
     * 修改银行信息
     * 
     * @param bank 银行信息
     * @return 结果
     */
    public int updateBank(Bank bank);

    /**
     * 批量删除银行信息
     * 
     * @param bankIds 需要删除的银行信息主键集合
     * @return 结果
     */
    public int deleteBankByBankIds(Long[] bankIds);

    /**
     * 删除银行信息信息
     * 
     * @param bankId 银行信息主键
     * @return 结果
     */
    public int deleteBankByBankId(Long bankId);
}
