package com.revature.libraryconsoleapp.dao;

import com.revature.libraryconsoleapp.models.Book;
import com.revature.libraryconsoleapp.service.ConnectionService;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InventoryRepoDB {
    public void addInventory(int book_id) {
        try {
            PreparedStatement bookCopyStatement= ConnectionService.getInstance().getConnection().prepareStatement("INSERT INTO Inventory(book_id) VALUES(?)");
            bookCopyStatement.setString(1, Integer.toString(book_id));
        } catch (SQLException e ) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


    public void availableBooks(){}

    public void getCounts() {}


}
