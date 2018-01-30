package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double xl = 0, xr = 0, x = 0, check = 0;
        System.out.print("Input Your Numbber : ");
        double num = kb.nextInt();
        xr = num;

        while (true) {
            x = ((xl + xr) / 2);
            if (Math.abs(Math.pow(x, 2) - num) < 1) {
                break;
            } else if (Math.pow(x, 2) > num) {
                xr = (xl + xr) / 2;
            } else {
                xl = (xl + xr) / 2;
            }
        }

        System.out.println("ค่า Square root ที่ใกล้เคียงของ " + num + " คือ " + x);
    }
}
