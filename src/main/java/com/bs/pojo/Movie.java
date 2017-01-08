package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class Movie {

    private Integer movieId;
    private String movieImage;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(String movieImage) {
        this.movieImage = movieImage;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieImage='" + movieImage + '\'' +
                '}';
    }
}
