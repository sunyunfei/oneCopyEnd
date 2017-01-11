package com.bs.service;

import com.bs.pojo.Movie;
import com.bs.pojo.MovieDetails;

import java.util.List;

/**
 * Created by syf on 2017/1/8.
 */
public interface MovieService {

    //查询所有movie
    List<Movie> queryAllData();
    //查询详细
    MovieDetails queryDetails(Integer movieId);
}
