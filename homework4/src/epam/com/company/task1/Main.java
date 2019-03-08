package epam.com.company.task1;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = sc.nextInt();
        System.out.println("Число " + number + " в двоичной системе равно " + changeToBinary(number));
    }

    public static String changeToBinary(int number) {

        String result = "";
        if (number >= 0) {
            while (number > 0) {
                result = ( (number % 2) == 0 ? "0" : "1") + result;
                number = number / 2;

            }

        }
        else {
            while ( Math.abs(number) > 0) {
                result = ( (number % 2) == 0 ? "1" : "0") + result;
                number = number / 2;

            }


        }

           return result;
    }
    }

