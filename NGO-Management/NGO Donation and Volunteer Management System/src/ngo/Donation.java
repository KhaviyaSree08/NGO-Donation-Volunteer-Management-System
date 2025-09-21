package ngo;

import java.time.LocalDate;

public class Donation {
    private int donationId;
    private double amount;
    private String paymentMode;
    private LocalDate donationDate;

    public Donation(int donationId,double amount,String paymentMode) {
        this.donationId=donationId;
        this.amount=amount;
        this.paymentMode=paymentMode;
        this.donationDate=LocalDate.now();
    }

    public double getAmount() {
        return amount;
    }

    public void generateReceipt() {
        System.out.println("Receipt: ID="+donationId+", Amount=Rs."+amount+", Mode="+paymentMode+", Date="+donationDate);
    }

    @Override
    public String toString() {
        return "[Donation ID: "+donationId+",Amount: Rs." +amount+", Mode: "+ paymentMode+", Date: "+donationDate + "]";
    }
}
