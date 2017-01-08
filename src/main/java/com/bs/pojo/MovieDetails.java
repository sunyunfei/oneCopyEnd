package com.bs.pojo;

/**
 * Created by syf on 2017/1/8.
 */
public class MovieDetails {

    private Integer movieId;
    private String movieImage;
    private String movieContent;

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

    public String getMovieContent() {
        return movieContent;
    }

    public void setMovieContent(String movieContent) {
        this.movieContent = movieContent;
    }

    @Override
    public String toString() {
        return "MovieDetails{" +
                "movieId=" + movieId +
                ", movieImage='" + movieImage + '\'' +
                ", movieContent='" + movieContent + '\'' +
                '}';
    }
}
