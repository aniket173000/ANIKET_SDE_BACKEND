package org.example.systemDesign.BookMyShow;

public class Movie {

    private final String movieName;

    public Movie(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }
}
