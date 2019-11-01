package com.sunqiao.myblog.bean;

import java.util.Objects;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 14:36
 * @Since 2019
 */
public class Reply {
    private Integer id;
    private String comId;
    private String userIp;
    private String blogId;
    private String replyContent;
    private String replyDate;
    private String replyState;
    private String cName;
    private String eAdd;
    private String personal;
    private String level;

    public Reply(Integer id, String comId, String userIp, String blogId, String replyContent, String replyDate, String replyState, String cName, String eAdd, String personal, String level) {
        this.id = id;
        this.comId = comId;
        this.userIp = userIp;
        this.blogId = blogId;
        this.replyContent = replyContent;
        this.replyDate = replyDate;
        this.replyState = replyState;
        this.cName = cName;
        this.eAdd = eAdd;
        this.personal = personal;
        this.level = level;
    }

    public Reply() {
    }

    public Reply(String comId, String userIp, String blogId, String replyContent, String replyDate, String replyState, String cName, String eAdd, String personal, String level) {
        this.comId = comId;
        this.userIp = userIp;
        this.blogId = blogId;
        this.replyContent = replyContent;
        this.replyDate = replyDate;
        this.replyState = replyState;
        this.cName = cName;
        this.eAdd = eAdd;
        this.personal = personal;
        this.level = level;
    }

    public Reply(String comId, String userIp, String blogId, String replyContent, String replyState, String cName, String eAdd, String personal, String level) {
        this.comId = comId;
        this.userIp = userIp;
        this.blogId = blogId;
        this.replyContent = replyContent;
        this.replyState = replyState;
        this.cName = cName;
        this.eAdd = eAdd;
        this.personal = personal;
        this.level = level;
    }

    public Reply(Integer id, String replyContent, String cName, String eAdd) {
        this.id = id;
        this.replyContent = replyContent;
        this.cName = cName;
        this.eAdd = eAdd;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComId() {
        return comId;
    }

    public void setComId(String comId) {
        this.comId = comId;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public String getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }

    public String getReplyState() {
        return replyState;
    }

    public void setReplyState(String replyState) {
        this.replyState = replyState;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String geteAdd() {
        return eAdd;
    }

    public void seteAdd(String eAdd) {
        this.eAdd = eAdd;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Reply)) return false;
        Reply reply = (Reply) o;
        return getId().equals(reply.getId()) &&
                getComId().equals(reply.getComId()) &&
                getUserIp().equals(reply.getUserIp()) &&
                getBlogId().equals(reply.getBlogId()) &&
                getReplyContent().equals(reply.getReplyContent()) &&
                getReplyDate().equals(reply.getReplyDate()) &&
                getReplyState().equals(reply.getReplyState()) &&
                getcName().equals(reply.getcName()) &&
                geteAdd().equals(reply.geteAdd()) &&
                getPersonal().equals(reply.getPersonal()) &&
                getLevel().equals(reply.getLevel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getComId(), getUserIp(), getBlogId(), getReplyContent(), getReplyDate(), getReplyState(), getcName(), geteAdd(), getPersonal(), getLevel());
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", comId='" + comId + '\'' +
                ", userIp='" + userIp + '\'' +
                ", blogId='" + blogId + '\'' +
                ", replyContent='" + replyContent + '\'' +
                ", replyDate='" + replyDate + '\'' +
                ", replyState='" + replyState + '\'' +
                ", cName='" + cName + '\'' +
                ", eAdd='" + eAdd + '\'' +
                ", personal='" + personal + '\'' +
                ", level='" + level + '\'' +
                '}';
    }
}
