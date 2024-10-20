package org.example.systemDesign.SplitWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User {
    private final String userId;
    private Map<String, Double> balances;
    private double expenses;
    private List<Transactions> transactions;

    public User(String userId) {
        this.userId = userId;
        this.balances = new HashMap<>();
        this.expenses = 0.00;
        this.transactions = new ArrayList<>();
    }

    public List<Transactions> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transactions> transactions) {
        this.transactions = transactions;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public String getUserId() {
        return userId;
    }

    public Map<String, Double> getBalances() {
        return balances;
    }

    public void setBalances(Map<String, Double> balances) {
        this.balances = balances;
    }

}
