package ngo;

import java.util.ArrayList;
import java.util.List;

public class Donor extends User {
    // Inner Donation class
    public class Donation {
        private double amount;

        public Donation(double amount) {
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Donation: Rs." + amount;
        }
    }

    private double totaldonated;
    private List<Donation> donations = new ArrayList<>();

    public Donor(int iuserId, String sname, String semail, String sphone) {
        super(iuserId, sname, semail, sphone);
        this.totaldonated = 0;
    }

    public void makeDonation(Donation donation) {
        donations.add(donation);
        totaldonated += donation.getAmount();
        System.out.println(sname + " donated Rs." + donation.getAmount());
    }

    public void viewDonationHistory() {
        System.out.println("Donation History for " + sname + ":");
        for (Donation d : donations) {
            System.out.println(d);
        }
    }

    public double getTotaldonated() {
        return totaldonated;
    }

    public static void main(String[] args) {
        Donor donor = new Donor(2, "Oviya", "oviya@gmail.com", "986543210");
        Donor.Donation donation1 = donor.new Donation(1000);
        Donor.Donation donation2 = donor.new Donation(500);
        donor.makeDonation(donation1);
        donor.makeDonation(donation2);
        donor.viewDonationHistory();
        System.out.println("Total Donated: Rs." + donor.getTotaldonated());
    }
}
