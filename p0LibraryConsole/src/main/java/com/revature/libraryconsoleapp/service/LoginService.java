package com.revature.libraryconsoleapp.service;

import com.revature.libraryconsoleapp.dao.IUserRepo;
import com.revature.libraryconsoleapp.dao.UserRepoFile;
import com.revature.libraryconsoleapp.models.User;

import java.util.List;
import java.util.Scanner;

public class LoginService {
   private ValidationService inputValidation = new ValidationService();
   private IUserRepo repo = new UserRepoFile();


   public LoginService() {

   }


   //create a user, after checking the user isn't already made.
   //persist it into database.
   //login as the user.
   //have the session as a login

    //this will involve a db  in the future.
   public User checkForUser(String userName, String password) {
      List<User> array = repo.getAllUsers();
      for (User user: array) {
         if(user.getUserName().equals(userName) && user.getPwd().equals(password)) {
           return user;
         }
      }
      return null;
   }



}
