package com.revature.libraryconsoleapp.models;

public class Book {

    //private Long id
    private String title;
    private String isbn;
    private String author;
    private String category;

    public Book(String title, String isbn, String author, String category) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
