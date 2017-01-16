package com.bs.controller;

import com.alibaba.fastjson.JSON;
import com.bs.pojo.ReadContent;
import com.bs.pojo.ReadImage;
import com.bs.service.imp.ReadServiceImp;
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
@RequestMapping("/read")
public class ReadController {

    //创建logger
    private static Logger logger = Logger.getLogger(ReadController.class);
    @Autowired
    private ReadServiceImp readServiceImp;

    //查询头图
    @ResponseBody
    @RequestMapping(value = "/queryImage",produces = "application/json;charset=utf-8")
    public String queryAllImage(String userName){

        List<ReadImage> list = readServiceImp.queryReadImage(userName);
        return dealList(list);
    }

    //查询内容
    @ResponseBody
    @RequestMapping(value = "/queryContent",produces = "application/json;charset=utf-8")
    public String queryAllContent(String userName){

        List<ReadContent> list = readServiceImp.queryReadContent(userName);
        return dealList(list);
    }


    //返回String
    public String dealList(List list){

        Map<String,Object> map = new HashMap<String,Object>();
        if (list.size() <= 0){

            map.put("code",-1);
            map.put("message","没有数据");
        }else {

            map.put("code",1);
            map.put("message","有数据");
            map.put("data",list);
        }
        logger.info(map);
        return JSON.toJSONString(map);
    }
}
