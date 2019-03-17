package epam.com;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books in your collection");
        int dim = sc.nextInt();
        Book [] newSet = new Book[dim];
        for (int i = 0; i < newSet.length ; i++) {
          newSet [i]  = new Book();
          inputBook(newSet[i]);
        }

        Books set1 = new Books(dim);
        for (int i = 0; i < newSet.length; i++) {
            set1.addBookToSet(newSet[i]);
        }

        set1.viewSet();

        System.out.println("Enter percent to increase the price");
        double percent = sc.nextDouble();
        set1.changePrice(percent);
        set1.viewSet();

        System.out.println("Enter author to find the books");
        String author = sc.next();
        set1.findByAuthor(author).viewSet();

        System.out.println("Enter year to find the books");
        int year = sc.nextInt();
        set1.findPublishedAfter(year).viewSet();



               }
               static void  inputBook (Book new_book) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input book ID");
            new_book.setId(sc.nextInt());
            System.out.println("Input book title");
            new_book.setTitle(sc.nextLine());
            System.out.println("Input book author");
            new_book.setAuthor(sc.nextLine());
            System.out.println("Input book publisher");
            new_book.setPublisher(sc.nextLine());
            System.out.println("Input book year");
            new_book.setYear(sc.nextInt());
            System.out.println("Input book Number of pages");
            new_book.setPage(sc.nextInt());
            System.out.println("Input book price");
            new_book.setPrice(sc.nextInt());
        }




}

