package com.company;

public class Main {

    public static void main(String[] args) {
        int var1, var2;
        var1 = 3;
        var2 = 4;
        var1 += var2;
        var2 = var1 - var2;
        var1 -= var2;
        System.out.println("var1=" + var1 + " "+"var2=" + var2);
    }
}
