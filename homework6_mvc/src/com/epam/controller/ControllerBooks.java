package com.epam.controller;


import com.epam.model.Book;
import com.epam.model.Books;
import com.epam.view.View;

public class ControllerBooks {
    private Books books;
    private View viewSet = new View();

    public void run() throws Exception {
        viewSet.view("Enter size -> ");
        int size = InputUtility.inputInt();
        books = new Books(size);
        Book [] bookArr = new Book[size];
        for (int i = 0; i < bookArr.length ; i++) {
        bookArr[i] = new Book();
        bookArr[i].inputBook();
        }
        for (int j = 0; j < bookArr.length ; j++) {
            books.addBookToSet(bookArr[j]);
        }
        viewSet.view(books.toString());
        viewSet.view(books.sortByAuthor());
        viewSet.view(books.sortByPublisher());

        viewSet.view(books.sortByPrice());

        viewSet.view("\nEnter percent -> ");
        boolean flag = false;
        while (!flag) {

            try {
                double per = InputUtility.inputDouble();
                books.changePrice(per);
                flag = Validator.checkPercent(per);

            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
        viewSet.view(books.toString());
        viewSet.view("\nEnter author -> ");
        flag = false;
        while (!flag) {

            try {
                String author = InputUtility.inputString();
                Books nBooks = books.findByAuthor(author);
                viewSet.view(nBooks.toString());
                flag = Validator.checkAuthor(author);

            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }



    }
}