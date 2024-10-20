package org.example.systemDesign.SplitWise;

import java.util.List;

public interface Show {
    void showAllUsersExpenses(List<User> allUsers);
    void showAllExpenses( User user);
}
