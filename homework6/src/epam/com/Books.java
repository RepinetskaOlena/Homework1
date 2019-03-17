package epam.com;

import java.util.Arrays;
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



    public void viewSet() {
        System.out.println("________________________________________________");

                for (int i = 0; i <= bookSet.length - 1; i++) {
                bookSet[i].view();
                System.out.println();
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
            } else {
                System.out.println("No books of" + author);
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

    }

