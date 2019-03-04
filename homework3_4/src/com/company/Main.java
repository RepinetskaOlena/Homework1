package com.company;

public class Main {

    public static void main(String[] args) {
        int row = 1;
        int row_num = 5;
        if (row <= row_num) {
            while (row <= row_num) {
                int star = row;
                int space = row_num - star;
                while (space >= 1) {
                    System.out.print(" ");
                    space--;}
                while (star >= 1) {
                    System.out.print("*");
                    star--;
                }
                System.out.println();
                row++;
            }
        }
        if (row > row_num) {
            int newrow = 1;
            while (newrow > 0 && newrow <= row_num) {
                int space =  newrow;
                int star = row_num - space;
                while (space >= 1) {
                    System.out.print(" ");
                    space--;
                }
                while (star >= 1) {
                    System.out.print("*");
                    star--;
                }
                System.out.println();
                newrow++;
            }


        }
    }
}
