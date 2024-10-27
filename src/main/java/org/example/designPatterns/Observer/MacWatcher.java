package org.example.designPatterns.Observer;

public class MacWatcher implements Watcher {

    private String movieStatus;
    @Override
    public void updateMovieStatus(MovieStatus movieStatus) {
        System.out.println("Mac OS watcher is watching the movie");
        System.out.println("Movie status is " + movieStatus.toString());
        this.movieStatus = movieStatus.toString();
    }

    public String getMovieStatus() {
        return movieStatus;
    }
}
