package com.revature.libraryconsoleapp.service;

import com.revature.libraryconsoleapp.models.Access;
import com.revature.libraryconsoleapp.models.User;

//this provides the various session capabilities.
public class SessionService {
    public SessionService() {
    }

    public void sessionStart(User user) {
        if (user == null){

        } else {
            System.out.println("User " + user.getUserName() + " session has started.");
            if(user.getAcess() == Access.ADMIN) {
                System.out.println("Admin Actions");
                System.out.println("1. Create User");
                System.out.println("2. Look at borrowed books");
                System.out.println("3. Add Books ");
                System.out.println("4. Create Books");
                System.out.println("5. Delete Books");
            } else{
                System.out.println("User Actions");
            }
        }
    }

    public void adminSession() {

    }

    public void userSession() {

    }


}
