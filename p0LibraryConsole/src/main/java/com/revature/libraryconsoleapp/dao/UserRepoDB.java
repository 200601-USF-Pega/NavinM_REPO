package com.revature.libraryconsoleapp.dao;

import com.revature.libraryconsoleapp.models.Access;
import com.revature.libraryconsoleapp.models.User;
import com.revature.libraryconsoleapp.service.ConnectionService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserRepoDB implements IUserRepo{


    ConnectionService connectionService;

    public UserRepoDB (ConnectionService connectionService) {
        this.connectionService = connectionService;
    }

    @Override
    public User addUser(User user) {
        try {
            PreparedStatement userStatement = connectionService.getConnection().prepareStatement(
                    "INSERT INTO Users VALUES (?, ?, ?, ?, ?)");
                    userStatement.setString(1, user.getUserName());
                    userStatement.setString(2, user.getPwd());
                    userStatement.setString(3,  user.getFirstName());
                    userStatement.setString(4,  user.getLastName());
                    userStatement.setString(5, user.getAccess().toString());
                    userStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUsers = new ArrayList();
        try {
            Statement userStatement = connectionService.getConnection().createStatement();
            userStatement.executeQuery("SELECT * from Users;");
            ResultSet rs = userStatement.getResultSet();
            while (rs.next()) {
                User user = new User();
                user.setUserName(rs.getString("user_name"));
                user.setPwd(rs.getString("pwd"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setAccess(Access.valueOf(rs.getString("access")));
                allUsers.add(user);
            }
            return allUsers;

        } catch(SQLException e) {
            System.out.println("Exception: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
