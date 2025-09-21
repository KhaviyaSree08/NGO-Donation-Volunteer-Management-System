package ngo;

import java.util.ArrayList;
import java.util.List;

public class Donor extends User {
    private double totaldonated;
    private List<Donation> donations=new ArrayList<>();

    public Donor(int iuserId,String sname,String semail,String sphone) {
        super(iuserId, sname, semail, sphone);
        this.totaldonated = 0;
    }

    public void makeDonation(Donation donation) {
        donations.add(donation);
        totaldonated +=donation.getAmount();
        System.out.println(sname+" donated Rs."+donation.getAmount());
    }

    public void viewDonationHistory() {
        System.out.println("Donation History for " + sname + ":");
        for (Donation d:donations) {
            System.out.println(d);
        }
    }

    public double getTotaldonated() {
        return totaldonated;
    }
}
