package org.example.systemDesign.BookMyShow;

public class Screen {
    private final String id;
    private Integer totalSeats;
    private Integer bookedSeats;

    public Screen(String id, Integer totalSeats) {
        this.id = id;
        this.totalSeats = totalSeats;
        this.bookedSeats = 0;
    }

    public String getId() {
        return id;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }
    public Integer getSeatsAvailable() {
        return this.totalSeats-this.bookedSeats;
    }

    public void setTotalSeats(Integer totalSeats) {
        this.totalSeats = totalSeats;
    }

    public Integer getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(Integer bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
