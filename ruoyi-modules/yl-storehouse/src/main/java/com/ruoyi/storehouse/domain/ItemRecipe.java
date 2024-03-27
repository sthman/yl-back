package com.ruoyi.storehouse.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 物品-食谱关系对象 item_recipe
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class ItemRecipe extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 物品id，外键（未设置） */
    @Excel(name = "物品id，外键", readConverterExp = "未=设置")
    private Long itemId;

    /** 食谱id，外键（未设置） */
    @Excel(name = "食谱id，外键", readConverterExp = "未=设置")
    private Long recipeId;

    public void setItemId(Long itemId) 
    {
        this.itemId = itemId;
    }

    public Long getItemId() 
    {
        return itemId;
    }
    public void setRecipeId(Long recipeId) 
    {
        this.recipeId = recipeId;
    }

    public Long getRecipeId() 
    {
        return recipeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("itemId", getItemId())
            .append("recipeId", getRecipeId())
            .toString();
    }
}
