package com.bs.service;

import com.bs.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Created by syf on 2017/1/8.
 */
public interface UserService {

    //插入数据
    public int insertUser(User user);
    public User queryUser(String userName,String userPassword);
}
