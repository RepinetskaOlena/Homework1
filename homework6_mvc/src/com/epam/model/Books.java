package com.epam.model;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Books {
    int index = 0;
    Book[] bookSet;

    public Books() {
    }

    public Books(int num) {
        bookSet = new Book[num];
    }



    public void addBookToSet(Book newBook) {
        if (index != bookSet.length) {
            bookSet[index] = newBook;
            index++;
        } else {
            System.out.println("Book can't be added");
        }
    }


    @Override
    public String toString () {
        if (index == 0) {
         return "Library is empty";
        } else {
            String books = "";
            for (int i = 0; i < index; i++) {
                books += bookSet[i] + "\n";
            }
            return books;
        }
    }


    public void changePrice (double percent) {
        for (int i = 0; i < bookSet.length; i++) {
            double price = bookSet[i].getPrice();
            price += (price / 100 * percent);
            bookSet[i].setPrice(price);
        }


    }


    public Books findByAuthor (String author) {
        int count = 0;
        for (int i = 0; i <= bookSet.length - 1; i++) {
            if (bookSet[i].getAuthor().equals(author)) {
                count++;
            }
        }
        if (count > 0) {
            Books setByAuthor = new Books(count);
            for (int i = 0; i < bookSet.length; i++) {
                if (bookSet[i].getAuthor().equals(author)) {
                    setByAuthor.addBookToSet(bookSet[i]);
                }
            }
            return setByAuthor;
        }
        return new Books(0);
    }

    public Books findPublishedAfter (int year){
        {
            int count = 0;
            for (int i = 0; i <= bookSet.length - 1; i++) {
                if (bookSet[i].getYear() >  year) {
                    count++;
                }
            }
            if (count > 0) {
                Books setByYear = new Books(count);
                for (int i = 0; i < bookSet.length; i++) {
                    if (bookSet[i].getYear() >  year) {
                        setByYear.addBookToSet(bookSet[i]);
                    }
                }
                return setByYear;
            } else {
                System.out.println("No books published after " + year);
            }
            return new Books(0);
        }

    }

    public String sortByAuthor () {

        Book [] arr_Author= Arrays.copyOf(bookSet , index);
        Arrays.sort(arr_Author, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return "Sorted by author" + Arrays.toString(arr_Author).toString();
    }

    public String sortByPublisher () {

        Book [] arr_Publisher= Arrays.copyOf(bookSet , index);
        Arrays.sort(arr_Publisher, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublisher().compareTo(o2.getPublisher());
            }
        });
        return "Sorted by publisher" + Arrays.toString(arr_Publisher).toString();
    }

    public String sortByPrice () {

        Book [] arr_Price= Arrays.copyOf(bookSet , index);
        Arrays.sort(arr_Price, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                double pr1 = o1.getPrice();
                double pr2 = o2.getPrice();
                if (pr1 > pr2) {
                    return -1;
                }
                else if (pr1 < pr2) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
        return "Sorted by price" + Arrays.toString(arr_Price).toString();
    }
}
