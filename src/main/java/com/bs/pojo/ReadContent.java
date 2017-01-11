package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class ReadContent {

    private Integer userId;
    private String readName;//文章名字
    private String readStyle;//文章类型
    private String readAuthor;//文章作者
    private String readContent;//文章内容

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

    public String getReadContent() {
        return readContent;
    }

    public void setReadContent(String readContent) {
        this.readContent = readContent;
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
