package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class ReadImage {

    private Integer userId;
    private String readImage;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getReadImage() {
        return readImage;
    }

    public void setReadImage(String readImage) {
        this.readImage = readImage;
    }

    @Override
    public String toString() {
        return "ReadImage{" +
                "userId=" + userId +
                ", readImage='" + readImage + '\'' +
                '}';
    }
}
