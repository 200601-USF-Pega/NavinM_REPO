package com.revature.libraryconsoleapp.menu;

import com.revature.libraryconsoleapp.dao.BookRepoDB;
import com.revature.libraryconsoleapp.models.Author;
import com.revature.libraryconsoleapp.models.Book;
import com.revature.libraryconsoleapp.service.AuthorService;
import com.revature.libraryconsoleapp.service.CategoryService;
import com.revature.libraryconsoleapp.service.ValidationService;

import java.util.List;

public class BooksListingMenu implements IMenu {
    //MenuFactory menuFactory = new MenuFactory();
    //IMenu currentMenu;
    private ValidationService validationService = new ValidationService();
    private AuthorService authorService = new AuthorService();
    private CategoryService categoryService = new CategoryService();
    private BookRepoDB bookRepoDB  = new BookRepoDB();


    @Override
    public void start() {


        //first get all the authors in the database.
        Author author = authorService.authorSelector();
        //get category
        String category = categoryService.categorySelector();
        System.out.println(category);
        String title = validationService.getValidStringInput("Enter the title for your book: ");
        Book book = new Book(title, author, category);
        bookRepoDB.addBook(book);



    }


}
