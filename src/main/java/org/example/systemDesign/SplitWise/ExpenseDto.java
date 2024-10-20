package org.example.systemDesign.SplitWise;

import java.util.List;
import java.util.Map;

public class ExpenseDto {
    private User payerUser;
    private List<User> allUsers;
    private ExpenseType expenseType;
    private double totalAmount;
    private Map<String, NonEqualExpense> nonEqualExpenses;

    public ExpenseDto(User payerUser, List<User> allUsers, ExpenseType expenseType, double totalAmount, Map<String, NonEqualExpense> nonEqualExpenses) {
        this.payerUser = payerUser;
        this.allUsers = allUsers;
        this.expenseType = expenseType;
        this.totalAmount = totalAmount;
        this.nonEqualExpenses = nonEqualExpenses;
    }

    public List<User> getAllUsers() {
        return allUsers;
    }

    public ExpenseType getExpenseType() {
        return expenseType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public User getPayerUser() {
        return payerUser;
    }

    public Map<String, NonEqualExpense> getNonEqualExpenses() {
        return nonEqualExpenses;
    }

    public void setNonEqualExpenses(Map<String, NonEqualExpense> nonEqualExpenses) {
        this.nonEqualExpenses = nonEqualExpenses;
    }
}
