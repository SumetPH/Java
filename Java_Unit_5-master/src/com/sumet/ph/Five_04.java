package com.sumet.ph;

import java.util.Scanner;

public class Five_04 {
    public static void main(String[] args) {
        //instance
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Input word : ");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        //output
        for (int i = 0; i < words.length; i++) {
            System.out.println("Word " + (i + 1) + " : " + words[i]);
        }
    }
}
