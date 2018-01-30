package com.sumet.ph;

import java.util.Scanner;

public class Five_15 {
    public static void main(String[] args) {
        //instance
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Add sentence : ");
        String t = scanner.nextLine();
        System.out.print("What a word that you need replace in sentence : ");
        String from = scanner.nextLine();
        System.out.print("What a word that you need replace to: ");
        String to = scanner.nextLine();

        //process
        String resute = t.replace(from, to);

        //output
        System.out.println("Result : " + resute);
    }
}
