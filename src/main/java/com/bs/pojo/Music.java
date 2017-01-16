package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class Music {

    private String userName;
    private String albumPic;
    private String singerName;
    private String singerIntro;
    private String songName;
    private String time;
    private String title;
    private String writerName;
    private String content;
    private int zanNum;
    private int commentNum;
    private int shareNum;
    private boolean isZan;
    private String songContent;
    private String editorName;
    private String songAlbunName;
    private String songWriterName;
    private String contentWriterName;
    private String albumCompanyName;
    private String soldTime;
    private String albumType;
    private Integer musicId;

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAlbumPic() {
        return albumPic;
    }

    public void setAlbumPic(String albumPic) {
        this.albumPic = albumPic;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public String getSingerIntro() {
        return singerIntro;
    }

    public void setSingerIntro(String singerIntro) {
        this.singerIntro = singerIntro;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public int getZanNum() {
        return zanNum;
    }

    public void setZanNum(int zanNum) {
        this.zanNum = zanNum;
    }

    public int getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(int commentNum) {
        this.commentNum = commentNum;
    }

    public int getShareNum() {
        return shareNum;
    }

    public void setShareNum(int shareNum) {
        this.shareNum = shareNum;
    }

    public boolean isZan() {
        return isZan;
    }

    public void setZan(boolean zan) {
        isZan = zan;
    }

    public String getSongContent() {
        return songContent;
    }

    public void setSongContent(String songContent) {
        this.songContent = songContent;
    }

    public String getEditorName() {
        return editorName;
    }

    public void setEditorName(String editorName) {
        this.editorName = editorName;
    }

    public String getSongAlbunName() {
        return songAlbunName;
    }

    public void setSongAlbunName(String songAlbunName) {
        this.songAlbunName = songAlbunName;
    }

    public String getSongWriterName() {
        return songWriterName;
    }

    public void setSongWriterName(String songWriterName) {
        this.songWriterName = songWriterName;
    }

    public String getContentWriterName() {
        return contentWriterName;
    }

    public void setContentWriterName(String contentWriterName) {
        this.contentWriterName = contentWriterName;
    }

    public String getAlbumCompanyName() {
        return albumCompanyName;
    }

    public void setAlbumCompanyName(String albumCompanyName) {
        this.albumCompanyName = albumCompanyName;
    }

    public String getSoldTime() {
        return soldTime;
    }

    public void setSoldTime(String soldTime) {
        this.soldTime = soldTime;
    }

    public String getAlbumType() {
        return albumType;
    }

    public void setAlbumType(String albumType) {
        this.albumType = albumType;
    }

    @Override
    public String toString() {
        return "Music{" +
                "userName='" + userName + '\'' +
                ", albumPic='" + albumPic + '\'' +
                ", singerName='" + singerName + '\'' +
                ", singerIntro='" + singerIntro + '\'' +
                ", songName='" + songName + '\'' +
                ", time='" + time + '\'' +
                ", title='" + title + '\'' +
                ", writerName='" + writerName + '\'' +
                ", content='" + content + '\'' +
                ", zanNum=" + zanNum +
                ", commentNum=" + commentNum +
                ", shareNum=" + shareNum +
                ", isZan=" + isZan +
                ", songContent='" + songContent + '\'' +
                ", editorName='" + editorName + '\'' +
                ", songAlbunName='" + songAlbunName + '\'' +
                ", songWriterName='" + songWriterName + '\'' +
                ", contentWriterName='" + contentWriterName + '\'' +
                ", albumCompanyName='" + albumCompanyName + '\'' +
                ", soldTime='" + soldTime + '\'' +
                ", albumType='" + albumType + '\'' +
                '}';
    }
}
