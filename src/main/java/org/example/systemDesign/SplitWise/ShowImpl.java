package org.example.systemDesign.SplitWise;

import java.util.List;
import java.util.Map;

public class ShowImpl implements Show {
    @Override
    public void showAllUsersExpenses(List<User> allUsers) {
        for(User user: allUsers) {
            showAllExpenses(user);
        }
    }

    @Override
    public void showAllExpenses(User user) {

        Map<String, Double> userBalances = user.getBalances();
        if(!userBalances.isEmpty()){
            System.out.println("Following are the Money which is owed to " + user.getUserId());
            for(Map.Entry<String, Double> entry: userBalances.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
