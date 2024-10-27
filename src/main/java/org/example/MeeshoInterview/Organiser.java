package org.example.MeeshoInterview;



import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Organiser {
    private static Organiser organiser;
    private Organiser(){
        System.out.println("Organiser is created");
    }

    public static Organiser getInstance(){
        if(organiser == null){
            organiser = new Organiser();
        }
        return organiser;
    }

    private final List<Meetings> meetings = new ArrayList<>();

    public Meetings createMeeting(Date date, Organiser organizer) {
        Meetings meeting = new Meetings(date, organizer);
        meetings.add(meeting);
        return meeting;
    }

    public void updateMeeting(Meetings meeting, Organiser organizer, Guest guest, boolean add) {
        if (meeting.isOrganizer(organizer)) {
            if (add) {
                meeting.addGuest(guest);
            } else {
                meeting.removeGuest(guest);
            }
        }
    }

    public void setUserAvailability(Guest user, Date start, Date end) {
        for (Meetings meeting : meetings) {
            if (meeting.getDate().getDelta(start) >= 0 && meeting.getDate().getDelta(end) <= 0) {
                meeting.declineInvite(user);
            }
        }
    }
}
