package com.sunqiao.myblog.bean;

import java.util.Objects;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:14
 * @Since 2019
 */
public class Link {
    private Integer id;
    private String linkName;
    private String linkUrl;
    private String imgName;
    private String describes;
    private String addTime;
    private String contact;
    private String contactWay;

    public Link() {
    }

    public Link(Integer id, String linkName, String linkUrl, String imgName, String describes, String addTime, String contact, String contactWay) {
        this.id = id;
        this.linkName = linkName;
        this.linkUrl = linkUrl;
        this.imgName = imgName;
        this.describes = describes;
        this.addTime = addTime;
        this.contact = contact;
        this.contactWay = contactWay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkName() {
        return linkName;
    }

    public void setLinkName(String linkName) {
        this.linkName = linkName;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public String getImgName() {
        return imgName;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public String getDescribes() {
        return describes;
    }

    public void setDescribes(String describes) {
        this.describes = describes;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContactWay() {
        return contactWay;
    }

    public void setContactWay(String contactWay) {
        this.contactWay = contactWay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Link)) return false;
        Link link = (Link) o;
        return getId().equals(link.getId()) &&
                getLinkName().equals(link.getLinkName()) &&
                getLinkUrl().equals(link.getLinkUrl()) &&
                getImgName().equals(link.getImgName()) &&
                getDescribes().equals(link.getDescribes()) &&
                getAddTime().equals(link.getAddTime()) &&
                getContact().equals(link.getContact()) &&
                getContactWay().equals(link.getContactWay());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLinkName(), getLinkUrl(), getImgName(), getDescribes(), getAddTime(), getContact(), getContactWay());
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", linkName='" + linkName + '\'' +
                ", linkUrl='" + linkUrl + '\'' +
                ", imgName='" + imgName + '\'' +
                ", describes='" + describes + '\'' +
                ", addTime='" + addTime + '\'' +
                ", contact='" + contact + '\'' +
                ", contactWay='" + contactWay + '\'' +
                '}';
    }
}
