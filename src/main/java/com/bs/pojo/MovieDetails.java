package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class MovieDetails {

    private String movieId;
    private String icon;
    private String des;
    private String content;
    private String image;
    private String name;
    private String type;
    private String time;
    private String actor;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    @Override
    public String toString() {
        return "MovieDetails{" +
                "movieId='" + movieId + '\'' +
                ", icon='" + icon + '\'' +
                ", des='" + des + '\'' +
                ", content='" + content + '\'' +
                ", image='" + image + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", time='" + time + '\'' +
                ", actor='" + actor + '\'' +
                '}';
    }
}
