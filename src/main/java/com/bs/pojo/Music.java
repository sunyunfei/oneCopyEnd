package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class Music {

    private Integer userId;
    private Integer musicId;//音乐id
    private String musicImage;//歌曲图片
    private String musicName;//歌曲文章名字
    private String musicAuthor;//歌曲作者
    private String musicContent;//内容
    private String musicLyric;//歌词
    private String musicLike;//歌曲喜欢人数
    private String musicComment;//歌曲评论人数
    private String musicShare;//歌曲分享次数

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

    public String getMusicImage() {
        return musicImage;
    }

    public void setMusicImage(String musicImage) {
        this.musicImage = musicImage;
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String musicName) {
        this.musicName = musicName;
    }

    public String getMusicAuthor() {
        return musicAuthor;
    }

    public void setMusicAuthor(String musicAuthor) {
        this.musicAuthor = musicAuthor;
    }

    public String getMusicContent() {
        return musicContent;
    }

    public void setMusicContent(String musicContent) {
        this.musicContent = musicContent;
    }

    public String getMusicLyric() {
        return musicLyric;
    }

    public void setMusicLyric(String musicLyric) {
        this.musicLyric = musicLyric;
    }

    public String getMusicLike() {
        return musicLike;
    }

    public void setMusicLike(String musicLike) {
        this.musicLike = musicLike;
    }

    public String getMusicComment() {
        return musicComment;
    }

    public void setMusicComment(String musicComment) {
        this.musicComment = musicComment;
    }

    public String getMusicShare() {
        return musicShare;
    }

    public void setMusicShare(String musicShare) {
        this.musicShare = musicShare;
    }

    @Override
    public String toString() {
        return "Music{" +
                "userId=" + userId +
                ", musicId=" + musicId +
                ", musicImage='" + musicImage + '\'' +
                ", musicName='" + musicName + '\'' +
                ", musicAuthor='" + musicAuthor + '\'' +
                ", musicContent='" + musicContent + '\'' +
                ", musicLyric='" + musicLyric + '\'' +
                ", musicLike='" + musicLike + '\'' +
                ", musicComment='" + musicComment + '\'' +
                ", musicShare='" + musicShare + '\'' +
                '}';
    }
}
