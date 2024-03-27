package com.ruoyi.government.service;

import java.util.List;
import com.ruoyi.government.domain.Older;

/**
 * 老人信息Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IOlderService 
{
    /**
     * 查询老人信息
     * 
     * @param olderAge 老人信息主键
     * @return 老人信息
     */
    public Older selectOlderByOlderAge(Long olderAge);

    /**
     * 查询老人信息列表
     * 
     * @param older 老人信息
     * @return 老人信息集合
     */
    public List<Older> selectOlderList(Older older);

    /**
     * 新增老人信息
     * 
     * @param older 老人信息
     * @return 结果
     */
    public int insertOlder(Older older);

    /**
     * 修改老人信息
     * 
     * @param older 老人信息
     * @return 结果
     */
    public int updateOlder(Older older);

    /**
     * 批量删除老人信息
     * 
     * @param olderAges 需要删除的老人信息主键集合
     * @return 结果
     */
    public int deleteOlderByOlderAges(Long[] olderAges);

    /**
     * 删除老人信息信息
     * 
     * @param olderAge 老人信息主键
     * @return 结果
     */
    public int deleteOlderByOlderAge(Long olderAge);
}
