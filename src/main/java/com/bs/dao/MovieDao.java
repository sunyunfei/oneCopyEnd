package com.bs.dao;

import com.bs.pojo.Movie;
import com.bs.pojo.MovieDetails;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
@Controller
public interface MovieDao {

    //查询所有movie
    List<Movie> queryAllData();
    //查询详细
    MovieDetails queryDetails(Integer movieId);
}
