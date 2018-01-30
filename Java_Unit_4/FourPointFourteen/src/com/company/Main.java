package com.company;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("ป้อนวันที่ < 1-30 > : ");
        int day = kb.nextInt();
        System.out.print("ป้อนเดือน < 1-12 >: ");
        int month = kb.nextInt();
        System.out.print("ป้อนปี < พ.ศ > : ");
        int year = kb.nextInt();

        LocalDate ld = LocalDate.of(year-543,month,day);
        int date = ld.getDayOfYear();

        System.out.format(("วันที่ %d, เดือน %d, ปี %d เป็นวันที่ %d ของปี"),day,month,year,date);
    }
}
