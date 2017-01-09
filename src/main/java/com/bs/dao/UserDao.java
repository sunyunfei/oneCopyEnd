package com.bs.dao;

<<<<<<< Updated upstream
/**
 * Created by syf on 2017/1/8.
 */
public class UserDao {
=======
import com.bs.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public interface UserDao {

    //插入用户数据
    int insertUser(User user);

    //查询数据
    User queryUser(@Param("userName") String userName,@Param("userPassword") String userPassword);
>>>>>>> Stashed changes
}
