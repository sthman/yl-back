package com.ruoyi.government.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.government.mapper.OlderMapper;
import com.ruoyi.government.domain.Older;
import com.ruoyi.government.service.IOlderService;

/**
 * 老人信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class OlderServiceImpl implements IOlderService 
{
    @Autowired
    private OlderMapper olderMapper;

    /**
     * 查询老人信息
     * 
     * @param olderAge 老人信息主键
     * @return 老人信息
     */
    @Override
    public Older selectOlderByOlderAge(Long olderAge)
    {
        return olderMapper.selectOlderByOlderAge(olderAge);
    }

    /**
     * 查询老人信息列表
     * 
     * @param older 老人信息
     * @return 老人信息
     */
    @Override
    public List<Older> selectOlderList(Older older)
    {
        return olderMapper.selectOlderList(older);
    }

    /**
     * 新增老人信息
     * 
     * @param older 老人信息
     * @return 结果
     */
    @Override
    public int insertOlder(Older older)
    {
        return olderMapper.insertOlder(older);
    }

    /**
     * 修改老人信息
     * 
     * @param older 老人信息
     * @return 结果
     */
    @Override
    public int updateOlder(Older older)
    {
        return olderMapper.updateOlder(older);
    }

    /**
     * 批量删除老人信息
     * 
     * @param olderAges 需要删除的老人信息主键
     * @return 结果
     */
    @Override
    public int deleteOlderByOlderAges(Long[] olderAges)
    {
        return olderMapper.deleteOlderByOlderAges(olderAges);
    }

    /**
     * 删除老人信息信息
     * 
     * @param olderAge 老人信息主键
     * @return 结果
     */
    @Override
    public int deleteOlderByOlderAge(Long olderAge)
    {
        return olderMapper.deleteOlderByOlderAge(olderAge);
    }
}
