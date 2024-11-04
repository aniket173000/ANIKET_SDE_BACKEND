package org.example.systemDesign.BookMyShow;

public class Booking {
    private String bookingId;
    private Show show;
    private Integer seatsRequired;

    public Booking(String bookingId, Show show, Integer seatsRequired) {
        this.bookingId = bookingId;
        this.show = show;
        this.seatsRequired = seatsRequired;
    }

    public Integer getSeatsRequired() {
        return seatsRequired;
    }

    public void setSeatsRequired(Integer seatsRequired) {
        this.seatsRequired = seatsRequired;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }
}
