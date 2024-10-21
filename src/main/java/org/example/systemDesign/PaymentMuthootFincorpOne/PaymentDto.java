package org.example.systemDesign.PaymentMuthootFincorpOne;

public class PaymentDto {
    private String payer; // upiId
    private String payee;
    private double amount;

    public PaymentDto(String payer, String payee, double amount) {
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
    }


    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
