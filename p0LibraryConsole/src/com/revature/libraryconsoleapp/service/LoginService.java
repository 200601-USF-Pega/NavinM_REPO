package com.revature.libraryconsoleapp.service;

import com.revature.libraryconsoleapp.dao.IUserRepo;
import com.revature.libraryconsoleapp.dao.UserRepoFile;
import com.revature.libraryconsoleapp.models.User;

import java.util.List;
import java.util.Scanner;

public class LoginService {
   private ValidationService inputValidation = new ValidationService();
   private IUserRepo repo = new UserRepoFile();
   private String userName;
   private String password;


   public LoginService() {

   }

   public User userLogin(){
       userName = inputValidation.getValidStringInput("Please enter your username: ");
       password = inputValidation.getValidStringInput("Please enter your password: ");
       User userFound= checkForUser(userName, password);
       if(userFound != null) {
            System.out.println("You are logged in.");
         } else {
            System.out.println("Wrong username / password.");
       }
       return userFound;
   }
   //create a user, after checking the user isn't already made.
   //persist it into database.
   //login as the user.
   //have the session as a login

   private User checkForUser(String userName, String password) {
      List<User> array = repo.getAllUsers();
      for (User user: array) {
         if(user.getUserName().equals(userName) && user.getPwd().equals(password)) {
           return user;
         }
      }
      return null;
   }



}
