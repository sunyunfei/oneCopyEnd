package com.bs.dao;

import com.bs.pojo.Home;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */

@Controller
public interface HomeDao {

    //获取所有信息
    List<Home> queryHomeData(@Param("userName") String userName);
}
