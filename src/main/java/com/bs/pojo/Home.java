package com.bs.pojo;

import org.springframework.stereotype.Controller;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public class Home {

    private String user_name;//用户
    private Integer volNum;
    private String writerName;
    private String content;
    private Integer zanNum;
    private String writeTime;
    private String picUrl;
    private Boolean isZan;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getVolNum() {
        return volNum;
    }

    public void setVolNum(Integer volNum) {
        this.volNum = volNum;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getZanNum() {
        return zanNum;
    }

    public void setZanNum(Integer zanNum) {
        this.zanNum = zanNum;
    }

    public String getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(String writeTime) {
        this.writeTime = writeTime;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public Boolean getZan() {
        return isZan;
    }

    public void setZan(Boolean zan) {
        isZan = zan;
    }

    @Override
    public String toString() {
        return "Home{" +
                "user_name='" + user_name + '\'' +
                ", volNum=" + volNum +
                ", writerName='" + writerName + '\'' +
                ", content='" + content + '\'' +
                ", zanNum=" + zanNum +
                ", writeTime='" + writeTime + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", isZan=" + isZan +
                '}';
    }
}
