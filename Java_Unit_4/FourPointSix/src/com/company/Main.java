package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("ป้อนจำนวนที่ 1 : ");
        int a = kb.nextInt();
        System.out.print("ป้อนจำนวนที่ 2 : ");
        int b = kb.nextInt();
        System.out.print("ป้อนจำนวนที่ 3 : ");
        int c = kb.nextInt();

        if(a == b){
            System.out.println("จำนวนที่ 1 กับ จำนวนที่ 2 มีค่าเท่ากัน");
        }
        else if(b == c){
            System.out.println("จำนวนที่ 2 กับ จำนวนที่ 3 มีค่าเท่ากัน");
        }
        else if(c == a){
            System.out.println("จำนวนที่ 3 กับ จำนวนที่ 1 มีค่าเท่ากัน");
        }
        else {
            System.out.println("จำนวนที่ป้อนเข้ามาไม่มีค่าที่เท่ากัน");
        }
    }
}
