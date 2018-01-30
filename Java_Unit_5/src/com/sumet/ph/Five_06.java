package com.sumet.ph;

import java.util.Scanner;

public class Five_06 {
    public static void main(String[] args) {
        //instance
        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("ตัวเลข 12 หลัก : ");
        String d = sc.nextLine();

        //process
        int s = 0;
        //ตำแหน่งคู่
        for (int i = 0; i <= 11; i += 2) {
            s += Integer.parseInt(String.valueOf(d.charAt(i)));
        }
        //ตำแหน่งคี่
        for (int i = 1; i <= 11; i += 2) {
            s += 3 * Integer.parseInt(String.valueOf(d.charAt(i)));
        }

        //output
        System.out.println("Check Digit คือ " + (10 - (s % 10)) % 10);
    }
}
