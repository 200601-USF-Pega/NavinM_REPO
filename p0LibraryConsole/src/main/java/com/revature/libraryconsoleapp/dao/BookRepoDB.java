package com.revature.libraryconsoleapp.dao;

import com.revature.libraryconsoleapp.models.Book;
import com.revature.libraryconsoleapp.service.ConnectionService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookRepoDB {
    public BookRepoDB() {}

    public Book addBook(Book book) {
        try {
            int author_id = getAuthorID(book.getAuthor().getFirstName());
            System.out.println(author_id);
            int category_id = getCategoryID(book.getCategory());
            System.out.println(category_id);
            PreparedStatement bookStatement = ConnectionService.getInstance().getConnection()
                    .prepareStatement("INSERT INTO Books(title, author_id, category_id) VALUES(?, ?, ?)");
            bookStatement.setString(1, book.getTitle());
            bookStatement.setString(2, Integer.toString(author_id));
            bookStatement.setString(3, Integer.toString(category_id));
            bookStatement.executeUpdate();
            return book;

        } catch (SQLException e) {
            System.out.println("Exception; " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    private int getAuthorID(String firstName){
        int authorID = -1;
        try{
            Statement authIDStatement = ConnectionService.getInstance().getConnection().createStatement();
            authIDStatement.executeQuery("SELECT author_id from Authors where first_name =\""+firstName+"\";");
            ResultSet rs = authIDStatement.getResultSet();
            while(rs.next()){
                authorID = Integer.parseInt(rs.getString("author_id"));
            }
            return authorID;
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return authorID;
    }

    private int getCategoryID(String category){
        int categoryID= -1;
        try{
            Statement categoryIDStatement= ConnectionService.getInstance().getConnection().createStatement();
            categoryIDStatement.executeQuery("SELECT category_id from Category where category=\""+category+"\";");
            ResultSet rs = categoryIDStatement.getResultSet();
            while(rs.next()){
                categoryID= Integer.parseInt(rs.getString("category_id"));
            }
            return categoryID;
        } catch (SQLException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        return categoryID;
    }


}
