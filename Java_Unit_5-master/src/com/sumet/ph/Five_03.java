package com.sumet.ph;

import java.util.Scanner;

public class Five_03 {
    public static void main(String[] args) {
        //instance
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Input word : ");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        //process
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += " \" " + words[i] + " \" " + ",";
        }
        result = result.substring(0, result.length() - 2);

        //output
        System.out.println(result);
    }
}
