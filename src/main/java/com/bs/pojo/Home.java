package com.bs.pojo;

<<<<<<< Updated upstream
/**
 * Created by syf on 2017/1/8.
 */
public class Home {

    private Integer userId;//用户id
=======
import org.springframework.stereotype.Controller;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public class Home {

    private Integer userId;//用户id
    private Integer homeId;//homeId
>>>>>>> Stashed changes
    private String homeImage;//图片
    private String homeName;//发表人
    private String homeContent;//内容
    private String homeTime;//发表时间
    private String homeLike;//喜欢人数
    private String homeNum;//序号

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

<<<<<<< Updated upstream
=======
    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

>>>>>>> Stashed changes
    public String getHomeImage() {
        return homeImage;
    }

    public void setHomeImage(String homeImage) {
        this.homeImage = homeImage;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getHomeContent() {
        return homeContent;
    }

    public void setHomeContent(String homeContent) {
        this.homeContent = homeContent;
    }

    public String getHomeTime() {
        return homeTime;
    }

    public void setHomeTime(String homeTime) {
        this.homeTime = homeTime;
    }

    public String getHomeLike() {
        return homeLike;
    }

    public void setHomeLike(String homeLike) {
        this.homeLike = homeLike;
    }

    public String getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum;
    }


    @Override
    public String toString() {
        return "Home{" +
                "userId=" + userId +
<<<<<<< Updated upstream
=======
                ", homeId=" + homeId +
>>>>>>> Stashed changes
                ", homeImage='" + homeImage + '\'' +
                ", homeName='" + homeName + '\'' +
                ", homeContent='" + homeContent + '\'' +
                ", homeTime='" + homeTime + '\'' +
                ", homeLike='" + homeLike + '\'' +
                ", homeNum='" + homeNum + '\'' +
                '}';
    }
}
