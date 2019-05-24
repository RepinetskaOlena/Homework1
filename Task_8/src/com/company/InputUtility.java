package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtility {
    private static Scanner sc = new Scanner(System.in);
    public static int inputInt() {
        {
            while (true) {
                try {
                    return sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.print("Please, input only number");
                }
            }
        }
    }
}
