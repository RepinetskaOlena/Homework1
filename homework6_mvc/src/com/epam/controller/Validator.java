package com.epam.controller;

import java.util.Date;

public class Validator {

    public static boolean checkAuthor(String str) throws Exception{
        boolean flag = false;
        String regex = "^[a-zA-Z\\s]*$";
        if ( str.matches(regex) && checkEveryAuthor(str) ) {
            flag = true;

            }
            else {
                throw new Exception ("Input only letters for author");

            }

        return flag;
    }

    public static boolean checkYear (int year) throws Exception {
        boolean flag;
        if ( year >=1425 && year < 2019 ) {
            flag = true;
        }
        else {
            throw new Exception ("Input year in range 1425 - 2019");

        }
        return flag;
    }
    public static boolean checkPage (int page) throws Exception {
        boolean flag;
        if ( page > 0 ) {
            flag = true;
        }
        else {
            throw new Exception ("Input positive number of pages");

        }
        return flag;
    }
    public static boolean checkPrice (double price) throws Exception {
        boolean flag;
        if ( price > 0 ) {
            flag = true;
        }
        else {
            throw new Exception ("Input positive price");

        }
        return flag;
    }
    public static boolean checkPercent (double per) throws Exception {
        boolean flag;
        if ( per > 0 ) {
            flag = true;
        }
        else {
            throw new Exception ("Input positive percent");

        }
        return flag;
    }
    public static boolean checkTitle (String str) throws Exception {
        boolean flag = false;

        String regex = "[0-9]+";
        String str1 = "";
        str1 += str.charAt(0);
        if ( checkFirstChar(str)  || str1.matches(regex) ) {
            flag = true;}
       else {
                throw new Exception ("Title should start only from capital letter or number");

            }
            return flag;
    }

    public static boolean checkPublisher (String str) throws  Exception {
        boolean flag = false;
        if ( checkFirstChar(str)  ) {
            flag = true;}
        else {
            throw new Exception ("Publisher should strt only from capital letter");

        }
        return flag;
    }

    private static boolean checkFirstChar (String str) {

        if ( str.charAt(0)>= 'A' && str.charAt(0) <= 'Z' ) {
            return  true;
        }
        else return false;
        }
     private static boolean checkEveryAuthor (String str) {
         boolean flag = false;
         for (char c : str.toCharArray()) {
             int i = str.indexOf(" ");
             char ch = str.charAt(i+1);
             if (  ch >= 'A' && ch <= 'Z' ) {
                 flag = true;

             }

         }

         return flag;
     }
}