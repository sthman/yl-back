package com.ruoyi.storehouse.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 仓库类型对象 warehouse_category
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class WarehouseCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 仓库类型id，主键，自增 */
    private Long warehouseTypeId;

    /** 仓库类型名称 */
    @Excel(name = "仓库类型名称")
    private String warehouseTypeName;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setWarehouseTypeId(Long warehouseTypeId) 
    {
        this.warehouseTypeId = warehouseTypeId;
    }

    public Long getWarehouseTypeId() 
    {
        return warehouseTypeId;
    }
    public void setWarehouseTypeName(String warehouseTypeName) 
    {
        this.warehouseTypeName = warehouseTypeName;
    }

    public String getWarehouseTypeName() 
    {
        return warehouseTypeName;
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
            .append("warehouseTypeId", getWarehouseTypeId())
            .append("warehouseTypeName", getWarehouseTypeName())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
