package com.ruoyi.organization.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 房间对象 room
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Room extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 房间ID */
    private Long roomId;

    /** 房间号 */
    @Excel(name = "房间号")
    private Long roomNum;

    /** 房间状态 1：正常 2：维护 3：满员 */
    @Excel(name = "房间状态 1：正常 2：维护 3：满员")
    private Long roomState;

    /** 床位数量 */
    @Excel(name = "床位数量")
    private Long roomAmount;

    /** 所属机构id */
    @Excel(name = "所属机构id")
    private Long orgId;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setRoomId(Long roomId) 
    {
        this.roomId = roomId;
    }

    public Long getRoomId() 
    {
        return roomId;
    }
    public void setRoomNum(Long roomNum) 
    {
        this.roomNum = roomNum;
    }

    public Long getRoomNum() 
    {
        return roomNum;
    }
    public void setRoomState(Long roomState) 
    {
        this.roomState = roomState;
    }

    public Long getRoomState() 
    {
        return roomState;
    }
    public void setRoomAmount(Long roomAmount) 
    {
        this.roomAmount = roomAmount;
    }

    public Long getRoomAmount() 
    {
        return roomAmount;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setBeiyong1(String beiyong1) 
    {
        this.beiyong1 = beiyong1;
    }

    public String getBeiyong1() 
    {
        return beiyong1;
    }
    public void setBeiyong2(String beiyong2) 
    {
        this.beiyong2 = beiyong2;
    }

    public String getBeiyong2() 
    {
        return beiyong2;
    }
    public void setBeiyong3(String beiyong3) 
    {
        this.beiyong3 = beiyong3;
    }

    public String getBeiyong3() 
    {
        return beiyong3;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("roomId", getRoomId())
            .append("roomNum", getRoomNum())
            .append("roomState", getRoomState())
            .append("roomAmount", getRoomAmount())
            .append("orgId", getOrgId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
