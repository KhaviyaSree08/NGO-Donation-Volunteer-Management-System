package ngo;

import java.util.ArrayList;
import java.util.List;

public class Event {
    private int eventId;
    private String eventName;
    private String date;
    private String location;
    private List<Volunteer> volunteers = new ArrayList<>();

    public Event(int eventId,String eventName,String date,String location) {
        this.eventId=eventId;
        this.eventName=eventName;
        this.date=date;
        this.location=location;
    }

    public void assignVolunteer(Volunteer volunteer) {
        volunteers.add(volunteer);
        System.out.println("Volunteer "+volunteer.sname +" assigned to event "+eventName);
    }

    public String getEventName() {
        return eventName;
    }

    public int getEventId(){
        return eventId;   }

    @Override
    public String toString() {
        return "Event ID: " + eventId + ",Name: "+eventName+", Date: "+date+", Location: "+location;
    }
}

