package org.example.systemDesign.SplitWise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SplitWiseMain {
    public static void main(String[] args) {
        System.out.println("Hey get ready for the Splitwise Challenge");

        User u1 = new User("1");
        User u2 = new User("2");
        User u3 = new User("3");
        User u4 = new User("4");
        User u5 = new User("5");
        Show show = new ShowImpl();
        ExpenseProcessor expenseProcessor = new ExpenseProcessor();
        List<User> allUsers = new ArrayList<>();
        allUsers.add(u1);
        allUsers.add(u2);
        allUsers.add(u3);
        allUsers.add(u4);
        Map<String, NonEqualExpense> nonEqualExpenses = new HashMap<>();
//        show.showAllUsersExpenses(allUsers);
//        show.showAllExpenses(u1);
        ExpenseDto expenseDto = new ExpenseDto(u1,allUsers,ExpenseType.EQUAL,1000.00, nonEqualExpenses);
        expenseProcessor.processExpense(expenseDto);
//        show.showAllExpenses(u4);
//        show.showAllExpenses(u1);
//        allUsers.remove(u4);
        Map<String, NonEqualExpense> nonEqualExpenses1 = new HashMap<>();
        nonEqualExpenses1.put("2", new NonEqualExpense("2",370.00, false));
        nonEqualExpenses1.put("3", new NonEqualExpense("3",880.00, false));
        ExpenseDto expenseDto1 = new ExpenseDto(u1,allUsers,ExpenseType.EXACT,1250.00, nonEqualExpenses1);
        expenseProcessor.processExpense(expenseDto1);
        nonEqualExpenses1.clear();
        nonEqualExpenses1.put("2", new NonEqualExpense("2",420.00, false));
        nonEqualExpenses1.put("1", new NonEqualExpense("1",270.00, false));
        nonEqualExpenses1.put("3", new NonEqualExpense("3",100.00, false));
        nonEqualExpenses1.put("4", new NonEqualExpense("4",557.00, false));
        ExpenseDto expenseDto2 = new ExpenseDto(u3,allUsers,ExpenseType.EXACT,1347.00, nonEqualExpenses1);
        expenseProcessor.processExpense(expenseDto2);
        show.showAllUsersExpenses(allUsers);

}
}
