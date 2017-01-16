package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class ReadImage {

    private String userName;
    private String img;
    private String link;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "ReadImage{" +
                "userName='" + userName + '\'' +
                ", img='" + img + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
