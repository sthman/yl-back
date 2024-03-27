package com.ruoyi.government.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 知识库对象 category
 * 
 * @author ruoyi
 * @date 2024-03-27
 */
public class Category extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 知识库id */
    private Long categoryId;

    /** 知识库名称 */
    @Excel(name = "知识库名称")
    private String knowledgeName;

    /** 知识库类别id */
    @Excel(name = "知识库类别id")
    private Long categoryTypeId;

    /** 知识库内容 */
    @Excel(name = "知识库内容")
    private String knowledgeContent;

    /** 内容状态 */
    @Excel(name = "内容状态")
    private Long contentStatus;

    /** 备用列1 */
    @Excel(name = "备用列1")
    private String beiyong1;

    /** 备用列2 */
    @Excel(name = "备用列2")
    private String beiyong2;

    /** 备用列3 */
    @Excel(name = "备用列3")
    private String beiyong3;

    public void setCategoryId(Long categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Long getCategoryId() 
    {
        return categoryId;
    }
    public void setKnowledgeName(String knowledgeName) 
    {
        this.knowledgeName = knowledgeName;
    }

    public String getKnowledgeName() 
    {
        return knowledgeName;
    }
    public void setCategoryTypeId(Long categoryTypeId) 
    {
        this.categoryTypeId = categoryTypeId;
    }

    public Long getCategoryTypeId() 
    {
        return categoryTypeId;
    }
    public void setKnowledgeContent(String knowledgeContent) 
    {
        this.knowledgeContent = knowledgeContent;
    }

    public String getKnowledgeContent() 
    {
        return knowledgeContent;
    }
    public void setContentStatus(Long contentStatus) 
    {
        this.contentStatus = contentStatus;
    }

    public Long getContentStatus() 
    {
        return contentStatus;
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
            .append("categoryId", getCategoryId())
            .append("knowledgeName", getKnowledgeName())
            .append("categoryTypeId", getCategoryTypeId())
            .append("knowledgeContent", getKnowledgeContent())
            .append("contentStatus", getContentStatus())
            .append("beiyong1", getBeiyong1())
            .append("beiyong2", getBeiyong2())
            .append("beiyong3", getBeiyong3())
            .toString();
    }
}
