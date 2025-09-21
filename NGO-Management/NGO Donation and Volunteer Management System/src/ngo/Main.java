package ngo;

import java.util.*;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static List<Donor> donors=new ArrayList<>();
    private static List<Donation> donations=new ArrayList<>();
    private static List<Volunteer> volunteers=new ArrayList<>();
    private static List<Event> events=new ArrayList<>();

    private static int donorIdCounter=1;
    private static int donationIdCounter=1;
    private static int volunteerIdCounter=1;
    private static int eventIdCounter=1;

    public static void main(String[] args) {
        System.out.println("=== NGO Donation & Volunteer Management System ===");
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1.Register Donor");
            System.out.println("2.Make Donation");
            System.out.println("3.Register Volunteer");
            System.out.println("4.Create Event");
            System.out.println("5.Assign Volunteer to Event");
            System.out.println("6.Generate Reports (Admin)");
            System.out.println("7.Exit");

            int choice = sc.nextInt(); sc.nextLine();

            switch (choice) {
                case 1 ->registerDonor();
                case 2 ->makeDonation();
                case 3 ->registerVolunteer();
                case 4 ->createEvent();
                case 5 ->assignVolunteer();
                case 6 ->generateReports();
                case 7 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
    private static void registerDonor() {
        System.out.print("Enter Name: "); 
	    String name=sc.nextLine();
        System.out.print("Enter Email: "); 
	    String email=sc.nextLine();
        System.out.print("Enter Phone: "); 
	    String phone=sc.nextLine();
        Donor donor=new Donor(donorIdCounter++, name, email, phone);
        donors.add(donor);
        System.out.println("Donor registered: " +donor);
    }

    private static void makeDonation() {
        if(donors.isEmpty()) { 
		System.out.println("No donors registered!");
		return; 
	}
        System.out.println("Select Donor by ID:");
        donors.forEach(System.out::println);
        int id=sc.nextInt();
	    sc.nextLine();
        Donor donor=donors.stream().filter(d -> d.iuserId==id).findFirst().orElse(null);
        if(donor!=null) {
            System.out.print("Enter Amount: "); 
            double amount=sc.nextDouble(); 		   
	    sc.nextLine();
            System.out.print("Enter Payment Mode: ");
	    String mode=sc.nextLine();
            Donation donation=new Donation(donationIdCounter++, amount, mode);
            donor.makeDonation(donation);
            donations.add(donation);
            donation.generateReceipt();
        }else System.out.println("Invalid Donor ID!");
    }
    private static void registerVolunteer() {
        System.out.print("Enter Name: "); 
	    String name=sc.nextLine();
        System.out.print("Enter Email: ");
	    String email=sc.nextLine();
        System.out.print("Enter Phone: ");
	    String phone=sc.nextLine();
        System.out.print("Enter Skills: "); 
	    String skills=sc.nextLine();
        System.out.print("Enter Availability: ");
	    String availability=sc.nextLine();
        Volunteer volunteer=new Volunteer(volunteerIdCounter++, name,email,phone,skills,availability);
	    volunteers.add(volunteer);
        System.out.println("Volunteer registered: "+volunteer);
    }

    private static void createEvent() {
        System.out.print("Enter Event Name: "); 
	    String name=sc.nextLine();
        System.out.print("Enter Event Date: ");
	    String date=sc.nextLine();
        System.out.print("Enter Event Location: ");
	    String location=sc.nextLine();
        Event event=new Event(eventIdCounter++,name,date,location);
        events.add(event);
        System.out.println("Event created: "+event);
    }
    private static void assignVolunteer() {
        if(events.isEmpty()||volunteers.isEmpty()) { 
	        System.out.println("No events or volunteers!");
	        return; 
	    }
        System.out.println("Select Event by ID:"); 
	    events.forEach(System.out::println);
        int eid=sc.nextInt(); 
	    sc.nextLine();
        Event event=events.stream().filter(e -> e.eventId==eid).findFirst().orElse(null);
        if (event==null){ 
		System.out.println("Invalid Event ID!");
		return; 
	    }

        System.out.println("Select Volunteer by ID:"); 
	    volunteers.forEach(System.out::println);
        int vid=sc.nextInt(); 
	    sc.nextLine();
        Volunteer volunteer = volunteers.stream().filter(v -> v.userId == vid).findFirst().orElse(null);
        if(volunteer!=null) {
            event.assignVolunteer(volunteer);
            volunteer.assignToEvent(event);
        }else System.out.println("Invalid Volunteer ID!");
    }

    private static void generateReports() {
        Admin admin=new Admin(0,"Admin","admin@ngo.org","6543210987");
        admin.generateReports(donors);
        admin.manageVolunteers(volunteers);
    }
}





    
