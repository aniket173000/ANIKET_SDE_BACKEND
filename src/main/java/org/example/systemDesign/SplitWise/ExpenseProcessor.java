package org.example.systemDesign.SplitWise;


import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class ExpenseProcessor {

    private final EqualExpenseProcessor equalExpenseProcessor = new EqualExpenseProcessor();
    private final ExactExpenseProcessor exactExpenseProcessor = new ExactExpenseProcessor();
    private final PercentExpenseProcessor percentExpenseProcessor = new PercentExpenseProcessor();

    private final Map<ExpenseType, Expense> expenseMap = new EnumMap<>(ExpenseType.class);
    public void initialize() {
        expenseMap.put(ExpenseType.EQUAL, equalExpenseProcessor);
        expenseMap.put(ExpenseType.EXACT, exactExpenseProcessor);
        expenseMap.put(ExpenseType.PERCENTAGE, percentExpenseProcessor);
    }

    public void processExpense(ExpenseDto expenseDto) {
        if(expenseMap.isEmpty()){
            initialize();
        }
        Expense expense = expenseMap.get(expenseDto.getExpenseType());
        expense.createExpense(expenseDto);
    }
}
