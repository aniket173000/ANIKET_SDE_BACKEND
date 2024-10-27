package org.example.designPatterns.Observer;

public class ObserverMain {
    public static void main(String[] args){
        System.out.println("Hey we are testing observer pattern");
        Watcher androidWatcher = new AndroidWatcher();
        Watcher iosWatcher = new IOSWatcher();
        Watcher windowsWatcher = new WindowsWatcher();
        Watcher macWatcher = new MacWatcher();
        Movie movie = new MovieImpl(MovieStatus.NOT_AVAILABLE);
        movie.addMovieObserver(androidWatcher);
        movie.addMovieObserver(iosWatcher);
        movie.addMovieObserver(windowsWatcher);
        movie.addMovieObserver(macWatcher);
        movie.setMovieStatus(MovieStatus.AVAILABLE);
        movie.removeMovieObserver(iosWatcher);
        movie.setMovieStatus(MovieStatus.NOT_AVAILABLE);
        System.out.println("Android Movie status is " + androidWatcher.getMovieStatus());
        System.out.println("iOS Movie status is " + iosWatcher.getMovieStatus());
        System.out.println("Windows Movie status is " + windowsWatcher.getMovieStatus());
        System.out.println("Mac Movie status is " + macWatcher.getMovieStatus());

    }
}
