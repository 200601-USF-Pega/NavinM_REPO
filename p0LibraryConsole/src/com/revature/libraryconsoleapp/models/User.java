package com.revature.libraryconsoleapp.models;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String pwd;
    private String firstName;
    private String lastName;
    private Access acess;
    //private Access acess = Access.USER;
    //enum for the type of user.

    public User() {

    }

    public User(String userName, String pwd, String firstName, String lastName, Access acess) {
        this.userName = userName;
        this.pwd = pwd;
        this.firstName = firstName;
        this.lastName = lastName;
        this.acess = acess;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Access getAcess() {
        return acess;
    }

    public void setAcess(Access acess) {
        this.acess = acess;
    }
}
