package com.company;

public class Main {

    public static void main(String[] args) {
        int row = 1;
        int row_num = 5;
        if (row <= row_num) {
            while (row <= row_num) {
                int star = row;
                while (star >= 1) {
                    System.out.print("*");
                    star--;
                }
                System.out.println();
                row++;
            }
        }
        if (row > row_num) {
            int newrow = row;
            while (newrow > 0) {
                int star = newrow;
                while (star >= 1) {
                    System.out.print("*");
                    star--;
                }
                System.out.println();
                newrow--;
            }
        }
    }
}