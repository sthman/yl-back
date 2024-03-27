package com.ruoyi.organization.service;

import java.util.List;
import com.ruoyi.organization.domain.Room;

/**
 * 房间Service接口
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public interface IRoomService 
{
    /**
     * 查询房间
     * 
     * @param roomId 房间主键
     * @return 房间
     */
    public Room selectRoomByRoomId(Long roomId);

    /**
     * 查询房间列表
     * 
     * @param room 房间
     * @return 房间集合
     */
    public List<Room> selectRoomList(Room room);

    /**
     * 新增房间
     * 
     * @param room 房间
     * @return 结果
     */
    public int insertRoom(Room room);

    /**
     * 修改房间
     * 
     * @param room 房间
     * @return 结果
     */
    public int updateRoom(Room room);

    /**
     * 批量删除房间
     * 
     * @param roomIds 需要删除的房间主键集合
     * @return 结果
     */
    public int deleteRoomByRoomIds(Long[] roomIds);

    /**
     * 删除房间信息
     * 
     * @param roomId 房间主键
     * @return 结果
     */
    public int deleteRoomByRoomId(Long roomId);
}
