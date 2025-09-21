package ngo;

public class Volunteer extends User{
//Event Class
    public class Event{
    private String eventName;

    public Event(String eventName) {
        this.eventName=eventName;
    }

    public String getEventName() {
        return eventName;
    }
}

    private String skills;
    private String availability;

    public Volunteer(int iuserId,String sname,String semail,String sphone,String skills,String availability) {
        super(iuserId,sname,semail,sphone);
        this.skills=skills;
        this.availability=availability;
    }

    public void updateAvailability(String newAvailability) {
        this.availability=newAvailability;
        System.out.println(sname+"'s availability updated to "+availability);
    }

    public void assignToEvent(Event event) {
        System.out.println(sname +" assigned to event: "+event.getEventName());
    }

    @Override
    public String toString() {
        return super.toString()+", Skills: "+skills+", Availability: "+availability;
    }
    // Add this inside Volunteer.java, after the class definition
    public static void main(String[] args) {
        Volunteer volunteer = new Volunteer(3,"Aishu","aishu@gmail.com","8453265198","Teaching","Weekends");
        Volunteer.Event event = volunteer.new Event("Health Camp");
        volunteer.updateAvailability("Weekdays");
        volunteer.assignToEvent(event);
        System.out.println(volunteer);
    }
}
