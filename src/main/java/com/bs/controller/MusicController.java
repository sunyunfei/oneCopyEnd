package com.bs.controller;

import com.alibaba.fastjson.JSON;
import com.bs.pojo.Music;
import com.bs.pojo.MusicInfo;
import com.bs.service.imp.MusicServiceImp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
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
        MusicInfo musicInfo = musicServiceImp.queryInfo(musicId);
        return dealResponse(musicInfo);
    }


    //音乐文章的查询
    @ResponseBody
    @RequestMapping(value = "/queryMusic",produces = "application/json;charset=utf-8")
    public String queryMusic(Integer musicId){

        Music music = musicServiceImp.queryMusic(musicId);
        return dealResponse(music);
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
