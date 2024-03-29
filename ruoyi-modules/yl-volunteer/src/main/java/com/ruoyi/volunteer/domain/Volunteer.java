package com.ruoyi.volunteer.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 志愿者对象 volunteer
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Volunteer extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 积分 */
    @Excel(name = "积分")
    private Long vStar;

    /** 用户状态 */
    @Excel(name = "用户状态")
    private Long vStatus;

    /** 用户id */
    @Excel(name = "用户id")
    private Long userId;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;
    @Excel(name = "用户名字")
    private String userName;
    @Excel(name = "用户昵称")
    private String userNikeName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNikeName() {
        return userNikeName;
    }

    public void setUserNikeName(String userNikeName) {
        this.userNikeName = userNikeName;
    }

    public void setvStar(Long vStar)
    {
        this.vStar = vStar;
    }

    public Long getvStar() 
    {
        return vStar;
    }
    public void setvStatus(Long vStatus) 
    {
        this.vStatus = vStatus;
    }

    public Long getvStatus() 
    {
        return vStatus;
    }
    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
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
            .append("vStar", getvStar())
            .append("vStatus", getvStatus())
            .append("userId", getUserId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .append("userName",getUserName())
            .append("userNikeName",getUserNikeName())
            .toString();
    }
}
