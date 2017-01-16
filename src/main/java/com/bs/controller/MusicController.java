package com.bs.controller;

import com.alibaba.fastjson.JSON;
import com.bs.pojo.Music;
import com.bs.pojo.MusicComment;
import com.bs.pojo.MusicInfo;
import com.bs.service.imp.MusicServiceImp;
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
@RequestMapping("/music")
public class MusicController {

    //创建logger
    private static Logger logger = Logger.getLogger(MusicController.class);
    @Autowired
    private MusicServiceImp musicServiceImp;

    //请求音乐信息
    @ResponseBody
    @RequestMapping(value = "/queryMusicInfo",produces = "application/json;charset=utf-8")
    public String queryInfo(Integer musicId){

        //获取信息
        List<MusicComment> list = musicServiceImp.queryInfo(musicId);
        Map<String,Object> map = new HashMap<>();
        if (list.size() <= 0){
            map.put("code",-1);
            map.put("message","没有评论");
        }else {
            map.put("code",1);
            map.put("message","有评论");
            map.put("data",list);
        }
        logger.info(map);
        return JSON.toJSONString(map);

    }


    //音乐文章的查询
    @ResponseBody
    @RequestMapping(value = "/queryMusic",produces = "application/json;charset=utf-8")
    public String queryMusic(String userName){

        Music music = musicServiceImp.queryMusic(userName);
        return dealResponse(music);
    }

    //音乐信息的获取
    @ResponseBody
    @RequestMapping(value = "/queryInfo",produces = "application/json;charset=utf-8")
    public String queryMusicInfo(Integer musicId){

        MusicInfo musicInfo = musicServiceImp.queryMusicInfo(musicId);
        return dealResponse(musicInfo);
    }


    //彩礼获取到的信息
    public String dealResponse(Object obj){

        Map<String,Object> map = new HashMap<>();
        if (obj == null){
            map.put("code",-1);
            map.put("message","数据为空");
        }else {

            map.put("code",1);
            map.put("message","获得数据信息");
            map.put("data",obj);
        }

        logger.info(map);
        return JSON.toJSONString(map);
    }
}
