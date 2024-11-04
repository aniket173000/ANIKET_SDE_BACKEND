package org.example.systemDesign.BookMyShow;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void createBooking(Booking booking){
        Show show = booking.getShow();
        Integer seatsRequired = booking.getSeatsRequired();
        Screen screen = show.getScreen();
        Integer seatsAvailable = screen.getSeatsAvailable();
        if(seatsAvailable < seatsRequired){
            System.out.println("Not enough seats available");
        }else{
            screen.setBookedSeats(screen.getBookedSeats() + seatsRequired);
        }

    }
}
