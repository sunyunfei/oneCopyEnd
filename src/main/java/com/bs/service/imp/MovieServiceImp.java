package com.bs.service.imp;

import com.bs.dao.MovieDao;
import com.bs.pojo.Movie;
import com.bs.pojo.MovieDetails;
import com.bs.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public class MovieServiceImp implements MovieService {

    @Autowired
    private MovieDao movieDao;

    //请求所有
    @Override
    public List<Movie> queryAllData() {
        return movieDao.queryAllData();
    }

    //请求详细
    @Override
    public MovieDetails queryDetails(Integer movieId) {
        return movieDao.queryDetails(movieId);
    }
}
