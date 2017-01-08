package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class MusicInfo {

    private Integer userId;
    private Integer musicId;//音乐id
    private String musicName;//歌曲名字
    private String musicSpecial;//专辑
    private String musicSinger;//演唱者
    private String musicWrite;//作词者
    private String musicCompose;//作曲者
    private String musicCompany;//公司
    private String musicCreate;//发行时间
    private String musicArt;//专辑
    private String musicEdit;//编辑

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicSpecial() {
        return musicSpecial;
    }

    public void setMusicSpecial(String musicSpecial) {
        this.musicSpecial = musicSpecial;
    }

    public String getMusicSinger() {
        return musicSinger;
    }

    public void setMusicSinger(String musicSinger) {
        this.musicSinger = musicSinger;
    }

    public String getMusicWrite() {
        return musicWrite;
    }

    public void setMusicWrite(String musicWrite) {
        this.musicWrite = musicWrite;
    }

    public String getMusicCompose() {
        return musicCompose;
    }

    public void setMusicCompose(String musicCompose) {
        this.musicCompose = musicCompose;
    }

    public String getMusicCompany() {
        return musicCompany;
    }

    public void setMusicCompany(String musicCompany) {
        this.musicCompany = musicCompany;
    }

    public String getMusicCreate() {
        return musicCreate;
    }

    public void setMusicCreate(String musicCreate) {
        this.musicCreate = musicCreate;
    }

    public String getMusicArt() {
        return musicArt;
    }

    public void setMusicArt(String musicArt) {
        this.musicArt = musicArt;
    }

    public String getMusicEdit() {
        return musicEdit;
    }

    public void setMusicEdit(String musicEdit) {
        this.musicEdit = musicEdit;
    }

    @Override
    public String toString() {
        return "MusicInfo{" +
                "userId=" + userId +
                ", musicId=" + musicId +
                ", musicName='" + musicName + '\'' +
                ", musicSpecial='" + musicSpecial + '\'' +
                ", musicSinger='" + musicSinger + '\'' +
                ", musicWrite='" + musicWrite + '\'' +
                ", musicCompose='" + musicCompose + '\'' +
                ", musicCompany='" + musicCompany + '\'' +
                ", musicCreate='" + musicCreate + '\'' +
                ", musicArt='" + musicArt + '\'' +
                ", musicEdit='" + musicEdit + '\'' +
                '}';
    }
}
