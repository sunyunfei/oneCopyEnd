package com.bs.service.imp;

<<<<<<< Updated upstream
import com.bs.service.HomeService;
=======
import com.bs.dao.HomeDao;
import com.bs.pojo.Home;
import com.bs.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
>>>>>>> Stashed changes

/**
 * Created by syf on 2017/1/8.
 */
<<<<<<< Updated upstream
public class HomeServiceImp implements HomeService {
=======
@Controller
public class HomeServiceImp implements HomeService {

    @Autowired
    private HomeDao homeDao;

    @Override
    public List<Home> queryHomeData(Integer userId) {

        return homeDao.queryHomeData(userId);
    }
>>>>>>> Stashed changes
}
