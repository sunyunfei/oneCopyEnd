package com.bs.controller;

import com.alibaba.fastjson.JSON;
import com.bs.pojo.Movie;
import com.bs.pojo.MovieDetails;
import com.bs.service.imp.MovieServiceImp;
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
@RequestMapping("/movie")
public class MovieController {

    //创建logger
    private static Logger logger = Logger.getLogger(MovieController.class);
    @Autowired
    private MovieServiceImp movieServiceImp;

    @ResponseBody
    @RequestMapping(value = "/query",produces = "application/json;charset=utf-8")
    //查询所有
    public String queryAllData(){

        List<Movie> list = movieServiceImp.queryAllData();
        //判断是否有数据
        Map<String,Object> map = new HashMap<>();
        if (list.size() <= 0){
            map.put("code",-1);
            map.put("message","没有数据");
        }else {

            map.put("code",1);
            map.put("message","有数据");
            map.put("data",list);
        }
        return JSON.toJSONString(map);
    }

    //查询详细
    @ResponseBody
    @RequestMapping(value = "/queryDetails",produces = "application/json;charset=utf-8")
    public  String queryDetails(Integer movieId){

        MovieDetails movieDetails = movieServiceImp.queryDetails(movieId);
        Map<String,Object> map = new HashMap<>();
        //判断
        if (movieDetails == null){

            map.put("code",-1);
            map.put("message","没有数据");
        }else {

            map.put("code",1);
            map.put("message","有数据");
            map.put("data",movieDetails);
        }
        logger.info(map);
        return JSON.toJSONString(map);
    }
}
