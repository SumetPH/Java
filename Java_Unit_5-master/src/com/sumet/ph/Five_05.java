package com.sumet.ph;

import java.util.Scanner;

public class Five_05 {
    public static void main(String[] args) {
        //instance
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Add Word : ");
        String word = sc.nextLine();

        //process
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }

        //output
        System.out.println(result);
    }
}
