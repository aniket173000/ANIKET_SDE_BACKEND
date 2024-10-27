package org.example.MeeshoInterview;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Guest {
    private final String userId;
    private final Set<Meetings> meetings = new HashSet<>();

    public Guest(String userId) {
        this.userId = userId;
    }

    public String getGuestId() {
        return userId;
    }

    public void addMeeting(Meetings meeting) {
        meetings.add(meeting);
    }

    public void removeMeeting(Meetings meeting) {
        meetings.remove(meeting);
    }

    public Set<Date> viewMyCalendar() {
        Set<Date> meetingDates = new HashSet<>();
        for (Meetings meeting : meetings) {
            meetingDates.add(meeting.getDate());
        }
        return meetingDates;
    }

    public void acceptInvite(Meetings meeting) {
        if (meeting.isDateConflicted(this)) {
            meeting.declineInvite(this);
        } else {
            meeting.acceptInvite(this);
        }
    }

    public void declineInvite(Meetings meeting) {
        meeting.declineInvite(this);
    }
}
