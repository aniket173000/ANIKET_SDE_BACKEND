package org.example.systemDesign.BookMyShow;

public class Show {
    private final String id;
    private Slot slot;
    private Screen screen;
    private Movie movie;
    public Show(String id, Slot slot, Screen screen, Movie movie) {
        this.id = id;
        this.slot = slot;
        this.screen = screen;
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public String getId() {
        return id;
    }

}
