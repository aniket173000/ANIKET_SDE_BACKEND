package org.example.MeeshoInterview;

import java.util.HashMap;
import java.util.Map;

public class Meetings {

    private final Date date;
    private final Organiser organizer;
    private final Map<Guest, GuestMeetingStatus> guestResponses = new HashMap<>();

    public Meetings(Date date, Organiser organizer) {
        this.date = date;
        this.organizer = organizer;
    }

    public Date getDate() {
        return date;
    }

    public void addGuest(Guest guest) {
        guestResponses.putIfAbsent(guest, GuestMeetingStatus.NOT_RESPONDED);
    }

    public void removeGuest(Guest guest) {
        guestResponses.remove(guest);
    }

    public void acceptInvite(Guest guest) {
        if (guestResponses.containsKey(guest)) {
            guestResponses.put(guest, GuestMeetingStatus.ACCEPTED);
            guest.addMeeting(this);
        }
    }

    public void declineInvite(Guest guest) {
        if (guestResponses.containsKey(guest)) {
            guestResponses.put(guest, GuestMeetingStatus.DECLINED);
            guest.removeMeeting(this);
        }
    }

    public boolean isDateConflicted(Guest guest) {
        for (Date date1 : guest.viewMyCalendar()) {
            if (date1.equals(this.date)) {
                return true;
            }
        }
        return false;
    }

    public boolean isOrganizer(Organiser user) {
        return user.equals(organizer);
    }
}
