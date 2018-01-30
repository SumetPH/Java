package com.sumet.ph;

import java.util.Scanner;

public class Five_10 {
    public static void main(String[] args) {
        //instance
        Scanner sc = new Scanner(System.in);
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";

        //input
        System.out.print("Add word : ");
        String word = sc.nextLine();
        String s1 = word.toLowerCase();

        //process
        String result1 = "";
        String result2 = "";
        for (int i = 0; i < word.length(); i++) {
            String s2 = String.valueOf(s1.charAt(i));
            boolean b = lowerCase.contains(s2);
            if (b) {
                result1 += s2;
            }
        }
        for (int i = result1.length() - 1; i >= 0; i--) {
            result2 += result1.charAt(i);
        }

        //output
        if (result1.equals(result2)) {
            System.out.println(word + " เป็น พาลินโดรม");
        } else {
            System.out.println(word + " ไม่เป็น พาลินโดรม");
        }
    }
}
