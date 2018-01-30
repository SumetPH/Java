package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double[] price = new double[4];

        System.out.print("สินค่าชิ่นที่ 1 ราคา : ");
        price[0] = kb.nextDouble();
        System.out.print("สินค่าชิ่นที่ 2 ราคา : ");
        price[1] = kb.nextDouble();
        System.out.print("สินค่าชิ่นที่ 3 ราคา : ");
        price[2] = kb.nextDouble();
        System.out.print("สินค่าชิ่นที่ 4 ราคา : ");
        price[3] = kb.nextDouble();

        Arrays.sort(price);
        double result = price[0]+price[1]+price[2]+price[3];
        double sum = price[1]+price[2]+price[3];

        System.out.println("\nราคาสินค้าทั้งหมด : "+result+" บาท");
        System.out.println("ราคาที่ต้องชำระ : "+sum+" บาท");
    }
}
