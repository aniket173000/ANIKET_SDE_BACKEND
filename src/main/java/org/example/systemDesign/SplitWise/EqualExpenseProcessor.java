package org.example.systemDesign.SplitWise;

import java.util.List;
import java.util.Map;

public class EqualExpenseProcessor implements Expense{
    @Override
    public void createExpense(ExpenseDto expenseDto) {
        double totalAmount = expenseDto.getTotalAmount();
        int totalUsers = expenseDto.getAllUsers().size();
        double amountPerUser = totalAmount / totalUsers;
        setPayerUserExpenses(expenseDto, totalAmount, totalUsers, amountPerUser);
        List<User> allUsers = expenseDto.getAllUsers();
        setOtherUsersExpenses(allUsers, amountPerUser, expenseDto.getPayerUser());
    }

    private void setOtherUsersExpenses(List<User> allUsers, double amountPerUser, User payerUser) {
        Map<String, Double> balancesMap = payerUser.getBalances();
        for(User user: allUsers){
            if (!user.equals(payerUser)) {
            user.setExpenses(user.getExpenses() + amountPerUser);
            handlePayerBalanceMap(balancesMap, user, amountPerUser);
            handlePayeeBalanceMap(user, amountPerUser, payerUser.getUserId());
        }
    }
    }

    private void handlePayeeBalanceMap(User user, double amountPerUser, String payerUserId) {
        Map<String, Double> balancesMap = user.getBalances();
        if (balancesMap.containsKey(payerUserId)) {
            double currBalance = balancesMap.get(payerUserId);
            currBalance = currBalance - amountPerUser;
            balancesMap.remove(user.getUserId());
            balancesMap.put(user.getUserId(), currBalance);
        } else {
            balancesMap.put(payerUserId, -amountPerUser);
        }
    }

    private void handlePayerBalanceMap(Map<String, Double> balancesMap, User user, double amountPerUser) {
        if(balancesMap.containsKey(user.getUserId())){
            double currBalance = balancesMap.get(user.getUserId());
            currBalance = currBalance + amountPerUser;
            balancesMap.remove(user.getUserId());
            balancesMap.put(user.getUserId(), currBalance);
        }else{
            balancesMap.put(user.getUserId(), amountPerUser);
        }
    }

    private void setPayerUserExpenses(ExpenseDto expenseDto, double totalAmount, int totalUsers, double amountPerUser) {
        double getExtraAmount = getExtraAmount(amountPerUser, totalUsers, totalAmount);
        User user = expenseDto.getPayerUser();
        user.setExpenses(user.getExpenses() + amountPerUser + getExtraAmount);
    }

    private double getExtraAmount(double amountPerUser, int totalUsers, double totalAmount) {
        double currAmount = amountPerUser*totalUsers;
        return totalAmount - currAmount;
    }
}
