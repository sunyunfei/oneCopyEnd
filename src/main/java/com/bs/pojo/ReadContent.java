package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class ReadContent {

    private Integer userId;
    private String readName;//文章名字
    private String readStyle;//文章类型
    private String readAuthor;//文章作者

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReadName() {
        return readName;
    }

    public void setReadName(String readName) {
        this.readName = readName;
    }

    public String getReadStyle() {
        return readStyle;
    }

    public void setReadStyle(String readStyle) {
        this.readStyle = readStyle;
    }

    public String getReadAuthor() {
        return readAuthor;
    }

    public void setReadAuthor(String readAuthor) {
        this.readAuthor = readAuthor;
    }

    @Override
    public String toString() {
        return "ReadContent{" +
                "userId=" + userId +
                ", readName='" + readName + '\'' +
                ", readStyle='" + readStyle + '\'' +
                ", readAuthor='" + readAuthor + '\'' +
                '}';
    }
}
