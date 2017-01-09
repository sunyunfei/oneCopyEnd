package com.bs.service.imp;

<<<<<<< Updated upstream
import com.bs.service.UserService;
=======
import com.bs.dao.UserDao;
import com.bs.pojo.User;
import com.bs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
>>>>>>> Stashed changes

/**
 * Created by syf on 2017/1/8.
 */
<<<<<<< Updated upstream
public class UserServiceImp implements UserService {
=======
@Controller
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;

    //插入方法
    @Override
    public int insertUser(User user) {

        return userDao.insertUser(user);
    }

    //查询方法
    @Override
    public User queryUser(String userName,String userPassword) {

        return userDao.queryUser(userName,userPassword);
    }
>>>>>>> Stashed changes
}
