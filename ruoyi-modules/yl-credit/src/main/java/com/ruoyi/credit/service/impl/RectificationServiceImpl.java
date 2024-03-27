package com.ruoyi.credit.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.credit.mapper.RectificationMapper;
import com.ruoyi.credit.domain.Rectification;
import com.ruoyi.credit.service.IRectificationService;

/**
 * 整改记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class RectificationServiceImpl implements IRectificationService 
{
    @Autowired
    private RectificationMapper rectificationMapper;

    /**
     * 查询整改记录
     * 
     * @param rectificationId 整改记录主键
     * @return 整改记录
     */
    @Override
    public Rectification selectRectificationByRectificationId(Long rectificationId)
    {
        return rectificationMapper.selectRectificationByRectificationId(rectificationId);
    }

    /**
     * 查询整改记录列表
     * 
     * @param rectification 整改记录
     * @return 整改记录
     */
    @Override
    public List<Rectification> selectRectificationList(Rectification rectification)
    {
        return rectificationMapper.selectRectificationList(rectification);
    }

    /**
     * 新增整改记录
     * 
     * @param rectification 整改记录
     * @return 结果
     */
    @Override
    public int insertRectification(Rectification rectification)
    {
        return rectificationMapper.insertRectification(rectification);
    }

    /**
     * 修改整改记录
     * 
     * @param rectification 整改记录
     * @return 结果
     */
    @Override
    public int updateRectification(Rectification rectification)
    {
        return rectificationMapper.updateRectification(rectification);
    }

    /**
     * 批量删除整改记录
     * 
     * @param rectificationIds 需要删除的整改记录主键
     * @return 结果
     */
    @Override
    public int deleteRectificationByRectificationIds(Long[] rectificationIds)
    {
        return rectificationMapper.deleteRectificationByRectificationIds(rectificationIds);
    }

    /**
     * 删除整改记录信息
     * 
     * @param rectificationId 整改记录主键
     * @return 结果
     */
    @Override
    public int deleteRectificationByRectificationId(Long rectificationId)
    {
        return rectificationMapper.deleteRectificationByRectificationId(rectificationId);
    }
}
