package com.sunqiao.myblog.bean;

import java.util.Objects;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 13:43
 * @Since 2019
 */
public class Comment {
    private Integer id;
    private String userIp;
    private String blogId;
    private String content;
    private String commentDate;
    private String state;//状态，一般为0，1
    private String nickName;
    private String mailAddress;
    private String personal;

    public Comment() {
    }

    public Comment(Integer id, String userIp, String blogId, String content, String commentDate, String state, String nickName, String mailAddress, String personal) {
        this.id = id;
        this.userIp = userIp;
        this.blogId = blogId;
        this.content = content;
        this.commentDate = commentDate;
        this.state = state;
        this.nickName = nickName;
        this.mailAddress = mailAddress;
        this.personal = personal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(String commentDate) {
        this.commentDate = commentDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Comment)) return false;
        Comment comment = (Comment) o;
        return getId().equals(comment.getId()) &&
                getUserIp().equals(comment.getUserIp()) &&
                getBlogId().equals(comment.getBlogId()) &&
                getContent().equals(comment.getContent()) &&
                getCommentDate().equals(comment.getCommentDate()) &&
                getState().equals(comment.getState()) &&
                getNickName().equals(comment.getNickName()) &&
                getMailAddress().equals(comment.getMailAddress()) &&
                getPersonal().equals(comment.getPersonal());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserIp(), getBlogId(), getContent(), getCommentDate(), getState(), getNickName(), getMailAddress(), getPersonal());
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", userIp='" + userIp + '\'' +
                ", blogId='" + blogId + '\'' +
                ", content='" + content + '\'' +
                ", commentDate='" + commentDate + '\'' +
                ", state='" + state + '\'' +
                ", nickName='" + nickName + '\'' +
                ", mailAddress='" + mailAddress + '\'' +
                ", personal='" + personal + '\'' +
                '}';
    }
}
