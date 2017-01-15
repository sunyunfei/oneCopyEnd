package com.bs.service;

import com.bs.pojo.ReadContent;
import com.bs.pojo.ReadImage;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
public interface ReadService {

    //查询头图
    List<ReadImage> queryReadImage(Integer userId);

    //查询内容
    List<ReadContent> queryReadContent(String userName);
}
