package com.company;

import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input an hour of number 1 : ");
        int hour1 = kb.nextInt();
        System.out.print("Input an minute of number 1 : ");
        int minute1 = kb.nextInt();
        System.out.print("Input an hour of number 2 : ");
        int hour2 = kb.nextInt();
        System.out.print("Input an minute of number 2 : ");
        int minute2 = kb.nextInt();

        if(hour1 >= 12) hour1 -= 12;
        if(hour2 >= 12) hour2 -= 12;

        int sumHour = Math.abs(hour1-hour2);
        int sumMinute = Math.abs(minute1-minute2);

        System.out.println("\nผลต่างของเวลาทั้งสองจำนวนคือ "+sumHour+"ชั่วโมง "+sumMinute+"นาที");
    }
}
