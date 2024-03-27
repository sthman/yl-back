package com.ruoyi.government.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 知识库类别对象 category_type
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class CategoryType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 知识库类别id */
    private Long categoryTypeId;

    /** 知识库类别名称 */
    @Excel(name = "知识库类别名称")
    private String categoryTypeName;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setCategoryTypeId(Long categoryTypeId) 
    {
        this.categoryTypeId = categoryTypeId;
    }

    public Long getCategoryTypeId() 
    {
        return categoryTypeId;
    }
    public void setCategoryTypeName(String categoryTypeName) 
    {
        this.categoryTypeName = categoryTypeName;
    }

    public String getCategoryTypeName() 
    {
        return categoryTypeName;
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
            .append("categoryTypeId", getCategoryTypeId())
            .append("categoryTypeName", getCategoryTypeName())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
