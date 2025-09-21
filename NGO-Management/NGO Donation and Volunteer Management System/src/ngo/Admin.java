package ngo;

import java.util.List;

public class Admin extends User{

    public Admin(int iuserId,String sname,String semail,String sphone){
        super(iuserId,sname,semail,sphone);
    }

    public void createEvent(List<Event> events,Event event){
        events.add(event);
        System.out.println("Admin created event: "+event.getEventName());
    }

    public void manageVolunteers(List<Volunteer> volunteers) {
        System.out.println("Managing Volunteers:");
        for (Volunteer v:volunteers) {
            System.out.println(v);
        }
    }

    public void generateReports(List<Donor> donors) {
        System.out.println("Donation Report:");
        for (Donor d:donors) {
            System.out.println(d.sname+" donated total Rs."+d.getTotaldonated());
        }
    }
}

