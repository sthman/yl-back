package com.ruoyi.organization.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.organization.mapper.RoomMapper;
import com.ruoyi.organization.domain.Room;
import com.ruoyi.organization.service.IRoomService;

/**
 * 房间Service业务层处理
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
@Service
public class RoomServiceImpl implements IRoomService 
{
    @Autowired
    private RoomMapper roomMapper;

    /**
     * 查询房间
     * 
     * @param roomId 房间主键
     * @return 房间
     */
    @Override
    public Room selectRoomByRoomId(Long roomId)
    {
        return roomMapper.selectRoomByRoomId(roomId);
    }

    /**
     * 查询房间列表
     * 
     * @param room 房间
     * @return 房间
     */
    @Override
    public List<Room> selectRoomList(Room room)
    {
        return roomMapper.selectRoomList(room);
    }

    /**
     * 新增房间
     * 
     * @param room 房间
     * @return 结果
     */
    @Override
    public int insertRoom(Room room)
    {
        return roomMapper.insertRoom(room);
    }

    /**
     * 修改房间
     * 
     * @param room 房间
     * @return 结果
     */
    @Override
    public int updateRoom(Room room)
    {
        return roomMapper.updateRoom(room);
    }

    /**
     * 批量删除房间
     * 
     * @param roomIds 需要删除的房间主键
     * @return 结果
     */
    @Override
    public int deleteRoomByRoomIds(Long[] roomIds)
    {
        return roomMapper.deleteRoomByRoomIds(roomIds);
    }

    /**
     * 删除房间信息
     * 
     * @param roomId 房间主键
     * @return 结果
     */
    @Override
    public int deleteRoomByRoomId(Long roomId)
    {
        return roomMapper.deleteRoomByRoomId(roomId);
    }
}
