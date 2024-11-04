package org.example.systemDesign.BookMyShow;

public class BookMyShowMain {
    public static void main(String[] args){
        System.out.println("Hello from Book My Show Service");
    }
}
/**
 * requirements :
 * Admin:
 * create a movie
 * create a show with that movie and
 * add that show with slot and screen
 * delete a show
 * show all the shows on given day
 *
 * User:
 * Book a show with number of peoples( handle the case when show is full)
 * cancel a booking
 * if a user 1 books a show with x seats out of total t seats then
 * user 2 should be able to see only t-x seats available in show
 */