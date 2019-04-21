package com.epam.model;


import com.epam.controller.InputUtility;
import com.epam.controller.Validator;

import static com.epam.controller.InputUtility.inputInt;
import static com.epam.controller.InputUtility.inputString;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int year;
    private int page;
    private double price;


    public Book() {
    }


    public Book(int id, String title, String author, String publisher, int year, int page, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.page = page;
        this.price = price;
    }



    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book " +
                "id=" + id +
                "; title=" + title  +
                "; author=" + author +
                "; publisher=" + publisher +
                "; year=" + year +
                "; page=" + page +
                "; price=" + price;
    }


    public void changePrice (double percent)  {
        this.price = (double) (price + price * percent / 100);
    }

    public void inputBook () throws StringIndexOutOfBoundsException {

        System.out.println("enter book id");
        id = InputUtility.inputInt();
        System.out.println("enter book title");
        boolean flag = false;
        while ( !flag)
        {
            try
            {
                title = InputUtility.inputString();
                flag = Validator.checkTitle(title);

            }
            catch (Exception e)
            {
                System.out.println(e.getMessage() + "\n");
            }
        }
        System.out.println("enter book author");
        flag = false;
        while ( !flag)
        {
            try
            {
                author = InputUtility.inputString();
                flag = Validator.checkAuthor(author);

            }
            catch (Exception e)
            {
                System.out.print(e.getMessage() + "\n");
            }
        }
        System.out.println("enter book publisher");
        flag = false;
        while ( !flag)
        {
            try
            {
                publisher = InputUtility.inputString();
                flag = Validator.checkPublisher(publisher);

            }
            catch (Exception e)
            {
                System.out.print(e.getMessage() + "\n");
            }
        }
        System.out.println("enter book year");
        flag = false;
        while ( !flag)
        {
            try
            {
                year = InputUtility.inputInt();
                flag = Validator.checkYear(year);

            }
            catch (Exception e)
            {
                System.out.print(e.getMessage() + "\n");
            }
        }
        System.out.println("enter book number of pages");
        flag = false;
        while ( !flag)
        {
            try
            {
                page = InputUtility.inputInt();
                flag = Validator.checkPage(page);

            }
            catch (Exception e)
            {
                System.out.print(e.getMessage() + "\n");
            }
        }

        System.out.println("enter book price");
        flag = false;
        while ( !flag)
        {
            try
            {
               price = InputUtility.inputDouble();
                flag = Validator.checkPrice(price);

            }
            catch (Exception e)
            {
                System.out.print(e.getMessage() + "\n");
            }
        }


    }

}