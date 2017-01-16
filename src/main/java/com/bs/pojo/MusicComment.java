package com.bs.pojo;

/**
 * Created by syf on 2017/1/16.
 */
public class MusicComment {

    private Integer musicId;
    private String commentUserName;
    private String commentUserPic;
    private String commentTime;
    private int zanNum;
    private String content;
    private boolean haveReply;
    private boolean isShowAll;
    private int commentId;
    private String replyContent;

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent;
    }

    public Integer getMusicId() {
        return musicId;
    }

    public void setMusicId(Integer musicId) {
        this.musicId = musicId;
    }

    public String getCommentUserName() {
        return commentUserName;
    }

    public void setCommentUserName(String commentUserName) {
        this.commentUserName = commentUserName;
    }

    public String getCommentUserPic() {
        return commentUserPic;
    }

    public void setCommentUserPic(String commentUserPic) {
        this.commentUserPic = commentUserPic;
    }

    public String getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(String commentTime) {
        this.commentTime = commentTime;
    }

    public int getZanNum() {
        return zanNum;
    }

    public void setZanNum(int zanNum) {
        this.zanNum = zanNum;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isHaveReply() {
        return haveReply;
    }

    public void setHaveReply(boolean haveReply) {
        this.haveReply = haveReply;
    }

    public boolean isShowAll() {
        return isShowAll;
    }

    public void setShowAll(boolean showAll) {
        isShowAll = showAll;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Override
    public String toString() {
        return "MusicComment{" +
                "musicId=" + musicId +
                ", commentUserName='" + commentUserName + '\'' +
                ", commentUserPic='" + commentUserPic + '\'' +
                ", commentTime='" + commentTime + '\'' +
                ", zanNum=" + zanNum +
                ", content='" + content + '\'' +
                ", haveReply=" + haveReply +
                ", isShowAll=" + isShowAll +
                ", commentId=" + commentId +
                '}';
    }
}
