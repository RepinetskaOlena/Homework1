package epam.com.company.task1;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите cтроку");
       String str = sc.nextLine();
        System.out.println("Оригинальные символы -> " + findOriginalChars(str));
    }
   public static  String findOriginalChars (String str) {
       if (str.length() > 0) {
           int len = str.length();
           String result = "";
           int index = 0;
           while (index < len) {
               char ch = str.charAt(index);
               if ((str.indexOf(ch) - index) == 0) {
                   result = result + ch;
               }
               index++;
           }
           return result;
       }
       return null;
       }

    }
