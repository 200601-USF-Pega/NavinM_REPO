package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.models.User;

import java.util.List;

public class ViewClass {

    public static void printSessionHeader(String menuName, User user) {
        System.out.println("============================================");
        System.out.println(menuName +" Menu." + " Current User: " + user.getUserName());
        System.out.println("============================================");
    }

    public static void UserListView(List<User> userList){
        System.out.println("User List");
        int index = 0;
        for(User user : userList) {
            System.out.println("No:" + index + "   " + user.toString());
            index++;
        }
    }

}
