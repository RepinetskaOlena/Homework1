package com.company;

public class Main {

    public static void main(String[] args) {
        int var1 = 123;
        int char1 = var1 / 100;
        int char2 = (var1 - char1 * 100) / 10;
        int char3 = (var1 - char1 * 100 - char2 * 10) / 1;
        int var2 = char3 * 100 + char2 * 10 + char1 * 1;
        System.out.println("var1= " + var1 +" " + "var2= " + var2);
    }
}