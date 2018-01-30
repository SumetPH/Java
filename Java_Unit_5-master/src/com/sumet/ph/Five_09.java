package com.sumet.ph;

import java.util.Scanner;

public class Five_09 {
    public static void main(String[] args) {
        //instance
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("ป้อนรหัสประชน 12 หลัก : ");
        String id12 = scanner.nextLine();

        //process
        int id13 = 0;
        for (int i = 0, j = 13; i <= 11; i++, j--) {
            id13 += j * Integer.parseInt(String.valueOf(id12.charAt(i)));
        }
        id13 = (11 - (id13 % 11) % 10);

        //output
        System.out.println("รหัสประชาชนตัวที่ 13 คือ " + id13);
    }
}
