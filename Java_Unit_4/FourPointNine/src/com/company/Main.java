package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numHigh = 0;

        for(int i = 1; i<=10; i++){
            System.out.print("ป้อนจำนวนที่ "+i+" : ");
            int numIn = kb.nextInt();
            if(numIn > numHigh) numHigh = numIn;
        }

        System.out.println("\nจำนวนที่ป้อนเข้ามาและมีค่ามากที่สุดคือ "+numHigh);
    }
}
