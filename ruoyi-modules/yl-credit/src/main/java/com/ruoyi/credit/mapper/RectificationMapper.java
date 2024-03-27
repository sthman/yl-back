package com.ruoyi.credit.mapper;

import java.util.List;
import com.ruoyi.credit.domain.Rectification;

/**
 * 整改记录Mapper接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface RectificationMapper 
{
    /**
     * 查询整改记录
     * 
     * @param rectificationId 整改记录主键
     * @return 整改记录
     */
    public Rectification selectRectificationByRectificationId(Long rectificationId);

    /**
     * 查询整改记录列表
     * 
     * @param rectification 整改记录
     * @return 整改记录集合
     */
    public List<Rectification> selectRectificationList(Rectification rectification);

    /**
     * 新增整改记录
     * 
     * @param rectification 整改记录
     * @return 结果
     */
    public int insertRectification(Rectification rectification);

    /**
     * 修改整改记录
     * 
     * @param rectification 整改记录
     * @return 结果
     */
    public int updateRectification(Rectification rectification);

    /**
     * 删除整改记录
     * 
     * @param rectificationId 整改记录主键
     * @return 结果
     */
    public int deleteRectificationByRectificationId(Long rectificationId);

    /**
     * 批量删除整改记录
     * 
     * @param rectificationIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteRectificationByRectificationIds(Long[] rectificationIds);
}
