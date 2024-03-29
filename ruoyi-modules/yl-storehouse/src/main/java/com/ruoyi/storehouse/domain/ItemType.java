package com.ruoyi.storehouse.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 物品类型对象 item_type
 *
 * @author ruoyi
 * @date 2024-03-29
 */
public class ItemType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物品类型id，主键，自增 */
    private Long itemTypeId;

    /** 物品类型名称 */
    @Excel(name = "物品类型名称")
    private String itemTypeName;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setItemTypeId(Long itemTypeId)
    {
        this.itemTypeId = itemTypeId;
    }

    public Long getItemTypeId()
    {
        return itemTypeId;
    }
    public void setItemTypeName(String itemTypeName)
    {
        this.itemTypeName = itemTypeName;
    }

    public String getItemTypeName()
    {
        return itemTypeName;
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
            .append("itemTypeId", getItemTypeId())
            .append("itemTypeName", getItemTypeName())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
