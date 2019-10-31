package com.sunqiao.myblog.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author SUNQIAO
 * @Date 2019-10-24 14:14
 * @Since 2019
 */
public class Admin implements Serializable {
    private Integer id;
    private String userName;
    private String password;
    private String sign;
    private String location;
    private String callself;
    private String nickName;
    private String imageName;

    public Admin() {
    }

    public Admin(Integer id, String userName, String password, String sign, String location, String callself, String nickName, String imageName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.sign = sign;
        this.location = location;
        this.callself = callself;
        this.nickName = nickName;
        this.imageName = imageName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCallself() {
        return callself;
    }

    public void setCallself(String callself) {
        this.callself = callself;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", sign='" + sign + '\'' +
                ", location='" + location + '\'' +
                ", callself='" + callself + '\'' +
                ", nickName='" + nickName + '\'' +
                ", imageName='" + imageName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return getId().equals(admin.getId()) &&
                getUserName().equals(admin.getUserName()) &&
                getPassword().equals(admin.getPassword()) &&
                getSign().equals(admin.getSign()) &&
                getLocation().equals(admin.getLocation()) &&
                getCallself().equals(admin.getCallself()) &&
                getNickName().equals(admin.getNickName()) &&
                getImageName().equals(admin.getImageName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getUserName(), getPassword(), getSign(), getLocation(), getCallself(), getNickName(), getImageName());
    }
}
