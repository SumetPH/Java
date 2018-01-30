package com.sumet.ph;

import java.util.Scanner;

public class Five_13 {
    public static void main(String[] args) {
        //instance
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("เพิ่มประโยค : ");
        String sentence = scanner.nextLine();
        System.out.print("คำที่ต้องการหา : ");
        String word = scanner.nextLine();

        //process
        int position = -1;
        int count = 0;
        while (true) {
            int i = sentence.indexOf(word, position + 1);
            position = i;
            if (i == -1) {
                break;
            }
            count++;
        }

        //output
        System.out.printf("ในประโยค \"%s\" มีคำว่า \"%s\" อยู่ %d คำ", sentence, word, count);
    }
}
