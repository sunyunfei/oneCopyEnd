package com.bs.controller;

import com.alibaba.fastjson.JSON;
import com.bs.pojo.Home;
import com.bs.service.imp.HomeServiceImp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    //创建logger
    private static Logger logger = Logger.getLogger(HomeController.class);
    @Autowired
    private HomeServiceImp homeServiceImp;

    //查询所有数据
    @ResponseBody
    @RequestMapping(value = "/query",produces = "application/json;charset=utf-8")
    public String queryHomeData(Integer userId){

        List<Home> list = homeServiceImp.queryHomeData(userId);
        Map<String,Object> map = new HashMap<String,Object>();
        //判断是否有数据
        if (list.size() <= 0){
            map.put("code",-1);
            map.put("message","暂无数据");
            //日志
            logger.debug(map);
            return JSON.toJSONString(map);
        }
        map.put("code",1);
        map.put("data",list);
        map.put("message","数据请求成功");

        //日志
        logger.debug(map);
        return JSON.toJSONString(map);
    }
}
