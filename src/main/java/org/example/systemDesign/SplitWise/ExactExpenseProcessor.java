package org.example.systemDesign.SplitWise;

import java.util.List;
import java.util.Map;

public class ExactExpenseProcessor implements Expense{
    @Override
    public void createExpense(ExpenseDto expenseDto) {
      double totalAmount = expenseDto.getTotalAmount();
      Map<String, NonEqualExpense> nonEqualExpenses = expenseDto.getNonEqualExpenses();
      double extraAmount = getExtraAmount(totalAmount, nonEqualExpenses);
      if(extraAmount>0.00){
          System.out.println("Split Not happened Equally .....Extra amount is: "+extraAmount);
      }
      User user = expenseDto.getPayerUser();
      setPayerExpenses(user, extraAmount, nonEqualExpenses);
      setOtherUserExpenses(user, nonEqualExpenses);
      handleOtherUser(user, nonEqualExpenses, expenseDto.getAllUsers());
    }

    private void handleOtherUser(User user, Map<String, NonEqualExpense> nonEqualExpenses, List<User> allUsers) {
        for(Map.Entry<String, NonEqualExpense> entry: nonEqualExpenses.entrySet()){
            String userId = entry.getValue().getUserId();
            double amount = entry.getValue().getAmount();
            User currUser  = allUsers.get(Integer.parseInt(userId)-1);
            Map<String, Double> balanceMap = currUser.getBalances();
            if(balanceMap.containsKey(user.getUserId())){
                double currAmount = balanceMap.get(user.getUserId());
                currAmount = currAmount - amount;
                balanceMap.remove(user.getUserId());
                balanceMap.put(user.getUserId(), currAmount);
            } else {
                balanceMap.put(user.getUserId(), -amount);
            }
        }
    }

    private void setOtherUserExpenses(User user, Map<String, NonEqualExpense> nonEqualExpenses) {
        Map<String, Double> balanceMap = user.getBalances();
        for(Map.Entry<String, NonEqualExpense> entry: nonEqualExpenses.entrySet()){
            String userId = entry.getValue().getUserId();
            if(!userId.equals(user.getUserId())){
                if(balanceMap.containsKey(userId)){
                    double currAmount = balanceMap.get(userId);
                    currAmount = currAmount + entry.getValue().getAmount();
                    balanceMap.remove(userId);
                    balanceMap.put(userId, currAmount);
                }else{
                    balanceMap.put(userId, +entry.getValue().getAmount());
                }
            }
        }
    }

    private void setPayerExpenses(User user, double extraAmount, Map<String, NonEqualExpense> nonEqualExpenses) {
        NonEqualExpense nonEqualExpense = nonEqualExpenses.get(user.getUserId());
        if(nonEqualExpense!= null){
            user.setExpenses(user.getExpenses() + extraAmount + nonEqualExpense.getAmount());
        }else{
            user.setExpenses(user.getExpenses() + extraAmount);
        }

    }

    private double getExtraAmount(double totalAmount, Map<String, NonEqualExpense> nonEqualExpenses) {
        double totalSum = 0.00;
        for(Map.Entry<String, NonEqualExpense> entry: nonEqualExpenses.entrySet()){
            totalSum += entry.getValue().getAmount();
        }
        return totalAmount - totalSum;
    }


}
