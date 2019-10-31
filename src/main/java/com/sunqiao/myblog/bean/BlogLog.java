package com.sunqiao.myblog.bean;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author SUNQIAO
 * @Date 2019-10-25 11:46
 * @Since 2019
 */
public class BlogLog implements Serializable {

    private Integer lid;
    private String info;
    private String releasedate;

    public BlogLog(Integer lid, String info) {
        this.lid = lid;
        this.info = info;
    }

    public BlogLog(String info, String releasedate) {
        this.info = info;
        this.releasedate = releasedate;
    }

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(String releasedate) {
        this.releasedate = releasedate;
    }

    public BlogLog() {
    }

    public BlogLog(Integer lid, String info, String releasedate) {
        this.lid = lid;
        this.info = info;
        this.releasedate = releasedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BlogLog)) return false;
        BlogLog blogLog = (BlogLog) o;
        return Objects.equals(getLid(), blogLog.getLid()) &&
                Objects.equals(getInfo(), blogLog.getInfo()) &&
                Objects.equals(getReleasedate(), blogLog.getReleasedate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLid(), getInfo(), getReleasedate());
    }

    @Override
    public String toString() {
        return "BlogLog{" +
                "lid=" + lid +
                ", info='" + info + '\'' +
                ", releasedate='" + releasedate + '\'' +
                '}';
    }
}
