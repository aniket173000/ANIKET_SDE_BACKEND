package org.example.designPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class MovieImpl implements Movie {
    private List<Watcher> watcherList;
    private MovieStatus movieStatus;

    public MovieImpl(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
        this.watcherList = new ArrayList<>();
    }
    @Override
    public void addMovieObserver(Watcher watcher) {
        watcherList.add(watcher);
    }

    @Override
    public void removeMovieObserver(Watcher watcher) {
        watcherList.remove(watcher);
    }

    @Override
    public void notifyMovieObservers(MovieStatus movieStatus) {
           for (Watcher watcher : watcherList) {
               watcher.updateMovieStatus(movieStatus);
           }
    }

    @Override
    public void setMovieStatus(MovieStatus movieStatus) {
        this.movieStatus = movieStatus;
        notifyMovieObservers(movieStatus);
    }

    public MovieStatus getMovieStatus() {
        return movieStatus;
    }
}
