package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("Введите значение в фунтах и нажмите Enter");
	int lb = in.nextInt ();
	double lbtokg = lb * 0.4536;
	int kg = (int) lbtokg;
	double gramm = (lbtokg - kg)*1000;
	gramm = (int)gramm;
		System.out.println("В " + lb + " фунтах " + kg + " килограмм и " + gramm + "  грамм");
    }
}
