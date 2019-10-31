package com.sunqiao.myblog.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 19:03
 * @Since 2019
 */
public class Blog implements Serializable {
    private Integer id;
    private String title;
    private String author;
    private String summary;
    private String imgName;
    private String content;
    private String typeName;
    private String subDate;

    public Blog(Integer id, String title, String author, String summary, String imgName, String content, String typeName, String subDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.imgName = imgName;
        this.content = content;
        this.typeName = typeName;
        this.subDate = subDate;
    }

    public Blog() {
    }

    public Blog(Integer id, String title, String summary, String imgName, String content, String typeName) {
        this.id = id;
        this.title = title;
        this.summary = summary;
        this.imgName = imgName;
        this.content = content;
        this.typeName = typeName;
    }

    public Blog(String title, String author, String summary, String imgName, String content, String typeName, String subDate) {
        this.title = title;
        this.author = author;
        this.summary = summary;
        this.imgName = imgName;
        this.content = content;
        this.typeName = typeName;
        this.subDate = subDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSubDate() {
        return subDate;
    }

    public void setSubDate(String subDate) {
        this.subDate = subDate;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", summary='" + summary + '\'' +
                ", imgName='" + imgName + '\'' +
                ", content='" + content + '\'' +
                ", typeName='" + typeName + '\'' +
                ", subDate='" + subDate + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blog)) return false;
        Blog blog = (Blog) o;
        return getId().equals(blog.getId()) &&
                getTitle().equals(blog.getTitle()) &&
                getAuthor().equals(blog.getAuthor()) &&
                getSummary().equals(blog.getSummary()) &&
                getImgName().equals(blog.getImgName()) &&
                getContent().equals(blog.getContent()) &&
                getTypeName().equals(blog.getTypeName()) &&
                getSubDate().equals(blog.getSubDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getAuthor(), getSummary(), getImgName(), getContent(), getTypeName(), getSubDate());
    }
}
