package com.epam.controller;


import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.epam.model.Book;
import com.epam.controller.Validator;

public class InputUtility {
    private static Scanner sc =
            new Scanner(System.in);
    Book book = new Book();


    public static int inputInt () {
        {
            while (true)
            {
                try
                {
                    return sc.nextInt();
                }
                catch (InputMismatchException e)
                {
                    sc.next();
                    System.out.print("Please, input only number");
                }
            }
        }
    }
    public static String inputString () {
        while (true) {
            try {
                return sc.nextLine();
            } catch (StringIndexOutOfBoundsException e) {
                sc.next();
            }
        }
    }

    public static Double inputDouble () {
        while (true)
    {
        try
        {
            return  sc.nextDouble();
        }
        catch (InputMismatchException e)
        {
            sc.nextDouble();
            System.out.print("Please, input only number");
        }
    }
    }
}





