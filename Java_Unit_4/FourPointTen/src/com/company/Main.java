package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[] num = new int[10];

        for(int i = 0; i<10; i++) {
            System.out.print("ป้อนจำนวนที่ "+(i+1)+" : ");
            num[i] = kb.nextInt();
        }

        Arrays.sort(num);
        System.out.println("จำนวนที่มีค่ามากสุดเป็นอันดับที่สอง คือ "+num[8]);
    }
}
