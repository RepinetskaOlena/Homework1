package com.company;

public class Main {

    public static void main(String[] args) {
	int row = 1;
	int row_num = 5;
	if (row < row_num) {
	while (row < row_num) {
	    int star = 1 + (row - 1) * 2;
	    int space = row_num - row;
	    while (space >= 1) {
	        System.out.print(" ");
	        space--;
        }
	    while (star >= 1) {
	        System.out.print("*");
	        star--;
        }
	    row++;
	    System.out.println();
    }
    }
	if (row >= row_num) {

    int newrow = 1;
        while (newrow < row_num) {
            int star = 1 + (newrow - 1) * 2;
            int space = row_num - newrow;
            while ( space >=1 ) {
                System.out.print(" ");
                space--;
            }
            while (star >= 1) {
                System.out.print("*");
                star--;
            }
            newrow++;
            System.out.println();

    }}}}
