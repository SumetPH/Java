package com.sumet.ph;

import java.util.Scanner;

public class Five_08 {
    public static void main(String[] args) {
        //instance
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Input ISBN 9 : ");
        String isbn_9 = scanner.nextLine();

        //process
        int result = 0;
        for (int i = 0, j = 10; i <= 8; i++, j--) {
            result += j * Integer.parseInt(String.valueOf(isbn_9.charAt(i)));
        }
        result = 11 - (result % 11);

        String isbn_10 = "";
        if (result == 10) {
            isbn_10 = isbn_9 + "X";
        }
        else {
            isbn_10 = isbn_9 + result;
        }

        //output
        System.out.println("ISBN 10 : "+isbn_10);

    }
}
