package org.example.designPatterns.Observer;

public interface Movie {

    public void addMovieObserver(Watcher watcher);
    public void removeMovieObserver(Watcher watcher);

    public void notifyMovieObservers(MovieStatus movieStatus);

    public void setMovieStatus(MovieStatus movieStatus);


}
