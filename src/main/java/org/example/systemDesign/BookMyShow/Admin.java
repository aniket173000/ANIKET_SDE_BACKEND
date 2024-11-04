package org.example.systemDesign.BookMyShow;

import java.util.List;
import java.util.Map;

public class Admin {
    private List<Movie> movieList;
    private List<Screen> screenList;
    private Map<String, Show> showMap;

    public Admin(List<Movie> movieList, List<Screen> screenList, Map<String, Show> showMap) {
        this.movieList = movieList;
        this.screenList = screenList;
        this.showMap = showMap;
    }

    public void createShow(Show show){
        showMap.put(show.getId(), show);
    }
    public void deleteShow(String showId){
        showMap.remove(showId);
    }
    public Map<String, Show> getAdminShowMap() {
        return showMap;
    }

    public Movie createMovie(String movieName){
        Movie movie = new Movie(movieName);
        movieList.add(movie);
        return movie;
    }

    public Screen createScreen(String id, Integer totalSeats){
        Screen screen = new Screen(id, totalSeats);
        screenList.add(screen);
        return screen;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void setMovieList(List<Movie> movieList) {
        this.movieList = movieList;
    }

    public List<Screen> getScreenList() {
        return screenList;
    }

    public void setScreenList(List<Screen> screenList) {
        this.screenList = screenList;
    }

    public Map<String, Show> getShowMap() {
        return showMap;
    }

    public void setShowMap(Map<String, Show> showMap) {
        this.showMap= showMap;
    }
}
