package com.ruoyi.storehouse.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 仓库对象 warehouse
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Warehouse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 仓库id，主键，自增 */
    private Long warehouseId;

    /** 所属机构id，外键（未设置） */
    @Excel(name = "所属机构id，外键", readConverterExp = "未=设置")
    private Long orgId;

    /** 仓库类型id，外键（未设置） */
    @Excel(name = "仓库类型id，外键", readConverterExp = "未=设置")
    private Long warehouseTypeId;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setWarehouseId(Long warehouseId) 
    {
        this.warehouseId = warehouseId;
    }

    public Long getWarehouseId() 
    {
        return warehouseId;
    }
    public void setOrgId(Long orgId) 
    {
        this.orgId = orgId;
    }

    public Long getOrgId() 
    {
        return orgId;
    }
    public void setWarehouseTypeId(Long warehouseTypeId) 
    {
        this.warehouseTypeId = warehouseTypeId;
    }

    public Long getWarehouseTypeId() 
    {
        return warehouseTypeId;
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
            .append("warehouseId", getWarehouseId())
            .append("orgId", getOrgId())
            .append("warehouseTypeId", getWarehouseTypeId())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
