package com.sumet.ph;

import java.util.Scanner;

public class Five_17 {
    public static void main(String[] args) {
        //instance
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Add Singular noun : ");
        String word = scanner.nextLine();

        //process and output
        int ch = word.lastIndexOf("ch");
        int x = word.lastIndexOf("x");
        int s = word.lastIndexOf("s");
        int y = word.lastIndexOf("y");

        if (x == word.length() - 1) {
            System.out.println("Plural noun : " + word + "es");
        }
        else if (s == word.length() - 1) {
            System.out.println("Plural noun : " + word + "es");
        }
        else if (ch == word.length() - 2) {
            System.out.println("Plural noun : " + word + "es");
        }
        else if (y == word.length() - 1) {
            String vowel = "aeiou";
            String w = String.valueOf(word.charAt(y - 1));
            boolean b = vowel.contains(w);
            if (!b) {
                w = word.substring(0, y);
                System.out.println("Plural noun : " + w + "ies");
            }
            else {
                System.out.println("Plural noun : " + word + "s");
            }
        }
        else {
            System.out.println("Plural noun : " + word + "s");
        }
    }
}
