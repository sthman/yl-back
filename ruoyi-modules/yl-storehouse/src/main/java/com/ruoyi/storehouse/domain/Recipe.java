package com.ruoyi.storehouse.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 食谱对象 recipe
 *
 * @author ruoyi
 * @date 2024-03-29
 */
public class Recipe extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 食谱id，主键，自增 */
    private Long recipeId;

    /** 食谱名称 */
    @Excel(name = "食谱名称")
    private String recipeName;

    /** 时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date recipeTime;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setRecipeId(Long recipeId)
    {
        this.recipeId = recipeId;
    }

    public Long getRecipeId()
    {
        return recipeId;
    }
    public void setRecipeName(String recipeName)
    {
        this.recipeName = recipeName;
    }

    public String getRecipeName()
    {
        return recipeName;
    }
    public void setRecipeTime(Date recipeTime)
    {
        this.recipeTime = recipeTime;
    }

    public Date getRecipeTime()
    {
        return recipeTime;
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
            .append("recipeId", getRecipeId())
            .append("recipeName", getRecipeName())
            .append("recipeTime", getRecipeTime())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
