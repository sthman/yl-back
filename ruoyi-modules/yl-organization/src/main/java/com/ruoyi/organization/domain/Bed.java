package com.ruoyi.organization.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 床位对象 bed
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Bed extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 床位ID */
    private Long bedId;

    /** 床位号 */
    @Excel(name = "床位号")
    private Long bedNum;

    /** 房间ID */
    @Excel(name = "房间ID")
    private Long roomId;

    /** 老人id */
    @Excel(name = "老人id")
    private Long userId;

    /** 床位备注 */
    @Excel(name = "床位备注")
    private String bedRemark;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setBedId(Long bedId) 
    {
        this.bedId = bedId;
    }

    public Long getBedId() 
    {
        return bedId;
    }
    public void setBedNum(Long bedNum) 
    {
        this.bedNum = bedNum;
    }

    public Long getBedNum() 
    {
        return bedNum;
    }
    public void setRoomId(Long roomId) 
    {
        this.roomId = roomId;
    }

    public Long getRoomId() 
    {
        return roomId;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }
    public void setBedRemark(String bedRemark) 
    {
        this.bedRemark = bedRemark;
    }

    public String getBedRemark() 
    {
        return bedRemark;
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
            .append("bedId", getBedId())
            .append("bedNum", getBedNum())
            .append("roomId", getRoomId())
            .append("userId", getUserId())
            .append("bedRemark", getBedRemark())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
