package com.bs.service;

import com.bs.pojo.Home;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
public interface HomeService {

    //获取所有信息
    public List<Home> queryHomeData(Integer userId);
}
