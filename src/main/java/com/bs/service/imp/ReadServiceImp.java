package com.bs.service.imp;

import com.bs.dao.ReadDao;
import com.bs.pojo.ReadContent;
import com.bs.pojo.ReadImage;
import com.bs.service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public class ReadServiceImp implements ReadService {

    @Autowired
    private ReadDao readDao;

    //查询头图
    @Override
    public List<ReadImage> queryReadImage(Integer userId) {

        return readDao.queryReadImage(userId);
    }

    //查询内容
   public List<ReadContent> queryReadContent(String userName){

       return readDao.queryReadContent(userName);

   }
}
