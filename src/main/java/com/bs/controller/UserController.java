package com.bs.controller;

import com.alibaba.fastjson.JSON;
import com.bs.dao.UserDao;
import com.bs.pojo.User;
import com.bs.service.imp.UserServiceImp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    //创建logger
    private static Logger logger = Logger.getLogger(UserController.class);
    //获取到service对象
    @Autowired
    private UserServiceImp userServiceImp;


    //插入用户数据
    @ResponseBody
    @RequestMapping(value = "/insertUser",produces = "application/json;charset=utf-8")
    public String insertUser(@RequestParam(value = "userName") String userName,@RequestParam(value = "userPassword") String userPassword){

        //获取数据
        User user = new User();
        user.setUserName(userName);
        user.setUserPassword(userPassword);
        //数据库请求
        int code = userServiceImp.insertUser(user);
        //返回前端数据
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("code",code);
        map.put("message","注册成功");
        //日志
        logger.info(map);
        return JSON.toJSONString(map);
    }

    //查询用户数据
    @ResponseBody
    @RequestMapping(value = "/queryUser",produces = "application/json;charset=utf-8")
    public String queryUser(@RequestParam(value = "userName") String userName,@RequestParam(value = "userPassword") String userPassword){

        System.out.println("我的数据username:"+userName + " userpassword:"+userPassword);
        //查询
       User user = userServiceImp.queryUser("15501079053","123456");
        Map<String,Object> map = new HashMap<String, Object>();
        //判断是否查询成功
        if (user == null){

            map.put("code",-1);
            map.put("message","账户还没有注册");
        }else {

            map.put("code",1);
            map.put("message","账号查询成功");
            map.put("data",user);
        }

        //日志
        logger.info(map);
        return JSON.toJSONString(map);
    }
}
