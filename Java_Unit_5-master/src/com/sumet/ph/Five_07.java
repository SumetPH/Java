package com.sumet.ph;

import java.util.Scanner;

public class Five_07 {
    public static void main(String[] args) {
        //instance
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Input ISBN 10 : ");
        String isbn_10 = sc.nextLine();

        //process
        isbn_10 = isbn_10.substring(0, 9);
        isbn_10 = "978" + isbn_10;
        int result = 0;
        for (int i = 0; i <= 11; i++) {
            if (i % 2 == 0) {
                result += Integer.parseInt(String.valueOf(isbn_10.charAt(i)));
            } else {
                result += 3 * Integer.parseInt(String.valueOf(isbn_10.charAt(i)));
            }
        }
        String isbn_13 = String.valueOf(isbn_10) + ((10 - (result % 10)) % 10);

        //output
        System.out.println("ISBN-13 : " + isbn_13);
    }
}
