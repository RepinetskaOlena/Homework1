package com.company.task_9_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Generator generator = new Generator(inputParameters());
        System.out.println(generator);
    }

    public static int[]  inputParameters () {
        int [] arr = new int[3];
        System.out.println("Please, input size");
        boolean flag = false;
        while ( !flag)
        {
            try
            {
                arr[0] = inputInt();
                flag = validateSize(arr[0]);

            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage() + "\n");

            }
        }
        System.out.println("Please, input first number of range");
        arr[1] = inputInt();
        System.out.println("Please, input last number of range");
        flag = false;
        while ( !flag)
        {
            try
            {
                arr[2] = inputInt();
                flag = validateRange(arr[0], arr[1], arr[2]);

            }
            catch (IllegalArgumentException e)
            {
                System.out.print(e.getMessage() + "\n");
                arr[2] = inputInt();
            }
        }


        return arr;
    }

    private static int inputInt () {
        {
            Scanner sc = new Scanner(System.in);
            while (true) {
                try {
                    return sc.nextInt();
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.print("Please, input only number /n");
                }
            }
        }

    }
    public static boolean validateSize (int size) {

        if ( size > 1 ) {
            return true;
        }
        else {
            throw new IllegalArgumentException ("Number of elements should be greater then 1");
        }

    }

    public static boolean validateRange (int size, int range1, int range2) {
        boolean flag = true;
        if (range2 < range1) {
            flag = false;
            throw new IllegalArgumentException("Second number of range should be greater than first, input again");

        }
        else if (range2 - range1 < size)  {
            int r2 = range1 + size;
            flag = false;
            throw new IllegalArgumentException("To generate such amount of set elements second number of range should " +
                    "be greater than " +
                    r2);
        }

        return flag;

    }
}
