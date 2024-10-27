package org.example.MeeshoInterview;

import org.example.systemDesign.Ecommerce.OrderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class MeeshoMain {
    public static void main(String[] args){
        System.out.println("Ready for a calender application");
       Organiser organiser = Organiser.getInstance();
       Date date1 = new Date(1, 3);
       Date date2 = new Date(2, 13);
       Date date3 = new Date(3, 17);
       Date date4 = new Date(4, 24);
       Guest guest1 = new Guest("Aniket");
       Guest guest2 = new Guest("Mohit");
       Guest guest3 = new Guest("Rahul");
       Guest guest4 = new Guest("Suresh");
       Guest guest5 = new Guest("Ramesh");

       System.out.println("Delta between date1 and date2 is " + date1.getDelta(date2));
       System.out.println("Adding days to date2" + date2.addDays(25).getDay());
       Meetings meetings = organiser.createMeeting(date2, organiser);
       organiser.updateMeeting(meetings, organiser,guest1, true);
       organiser.updateMeeting(meetings, organiser,guest2, true);
       organiser.updateMeeting(meetings, organiser,guest3, true);
       organiser.updateMeeting(meetings, organiser,guest4, true);
       organiser.updateMeeting(meetings, organiser,guest5, true);
       Set<Date> dates = guest2.viewMyCalendar();
       for(Date date : dates){
           System.out.println(date.getMonth() + " " + date.getDay());
       }

       guest2.acceptInvite(meetings);
       guest3.acceptInvite(meetings);
       guest1.declineInvite(meetings);
        Set<Date> dates1 = guest3.viewMyCalendar();
        for(Date date : dates1){
            System.out.println(date.getMonth() + " " + date.getDay());
        }
    }
}
/**
 * Problem statement:
 * Develop a program to build a Calendar where Meets (or events) can be created.
 * Any number of people can be invited to the meeting and they can either Reject it or Accept it.
 * For simplicity, each event will always be of one day duration (in other words,
 * one meet will have one to one mapping with a day). Working with time utilities is recommended,
 * but if not possible then a Date can be assumed to be a pair of integers <month, day>
 *
 * Mandatory use case:
 *
 * 1) Create the “Date” type which is a pair of integers <month, day>.
 * Each month has 30 days and there is no concept of years. Then create two functions:
 * getDelta(): return the number of days between two Dates, both dates included.
 * addDays(n): return the new date after adding n days to a given date.
 *
 * 2) Write method to create a new meeting for a given Date and add guests to it:
 * createMeeting()
 *
 * 3) For the organizer:
 * updateMeeting(): Add or remove guests, only the organizer should be able to update the meeting.
 *
 * 4) Write method from the guest side to:
 * viewMyCalendar(): only show the dates with meetings.
 * acceptInvite(): Accept an invite to a meeting, handle the case even if the meeting was
 * already accepted/declined. If there is one more meeting on the same date, automatically decline it.
 * declineInvite(): Decline an invite to a meeting, handle the case even if the meeting was already accepted/declined.
 *
 * Bonus Use case:
 * Allow the guests to mark themselves unavailable for a date range and automatically decline all
 * existing meetings during that date range. All new meetings should also be automatically declined.
 */