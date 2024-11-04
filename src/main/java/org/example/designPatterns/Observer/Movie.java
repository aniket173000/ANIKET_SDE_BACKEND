package org.example.designPatterns.Observer;

public interface Movie {

    void addMovieObserver(Watcher watcher);
    void removeMovieObserver(Watcher watcher);

    void notifyMovieObservers(MovieStatus movieStatus);

    void setMovieStatus(MovieStatus movieStatus);


}
