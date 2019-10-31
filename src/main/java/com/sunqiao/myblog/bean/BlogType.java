package com.sunqiao.myblog.bean;

import java.util.Objects;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 20:05
 * @Since 2019
 */
public class BlogType {
    private Integer id;
    private String typeName;

    public BlogType() {
    }

    public BlogType(Integer id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlogType)) return false;
        BlogType blogType = (BlogType) o;
        return getId().equals(blogType.getId()) &&
                getTypeName().equals(blogType.getTypeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTypeName());
    }

    @Override
    public String toString() {
        return "BlogType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                '}';
    }



}
