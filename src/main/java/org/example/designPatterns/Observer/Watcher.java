package org.example.designPatterns.Observer;

public interface Watcher {
    public void updateMovieStatus(MovieStatus movieStatus);
    public String getMovieStatus();
}
