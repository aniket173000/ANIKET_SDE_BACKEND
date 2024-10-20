package org.example.systemDesign.SplitWise;

public class NonEqualExpense {
    private String userId;
    private double amount;
    private double percentAmount;

    public NonEqualExpense(String userId, double amount, Boolean isPercent) {
        this.userId = userId;
        if(isPercent){
            this.percentAmount = amount;
        } else {
            this.amount = amount;
        }
    }

    public double getAmount() {
        return amount;
    }

    public double getPercentAmount() {
        return percentAmount;
    }

    public String getUserId() {
        return userId;
    }
}
