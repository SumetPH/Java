package com.sumet.ph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Five_14 {
    public static void main(String[] args) throws FileNotFoundException {
        //instance
        Scanner scannerFile = new Scanner(new File("D:/example.txt"));
        Scanner scannerKb = new Scanner(System.in);

        //input
        System.out.print("คำที่คุณต้องการหาในไฟล์ example.txt : ");
        String word = scannerKb.nextLine();

        //convert
        String convert = "";
        while (scannerFile.hasNext()){
            convert += scannerFile.nextLine();
        }

        //process
        int position = -1;
        int count = 0;
         while(true){
             int i = convert.indexOf(word,position+1);
             position = i;
             if(i == -1){
                 break;
             }
             count++;
         }

         //output
        System.out.printf("คำว่า \"%s\" ในไฟล์ example.txt มีอยู่ทั้งหมด %d คำ ",word,count);
    }
}
