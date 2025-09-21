package ngo;

public class Volunteer extends User{
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
}
