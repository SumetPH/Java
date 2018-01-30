package com.sumet.ph;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Five_16 {
    public static void main(String[] args) throws FileNotFoundException {
        //instance
        Scanner scannerKb = new Scanner(System.in);
        Scanner scannerFile = new Scanner(new File("D:/example.txt"));

        //input
        System.out.print("What a word that you need replace in \"example.txt\" : ");
        String from = scannerKb.nextLine();
        System.out.print("What w word that you need replace to : ");
        String to = scannerKb.nextLine();

        //process and output
        String file = "";
        while (scannerFile.hasNext()) {
            file += scannerFile.nextLine();
        }

        try {
            PrintStream printStream = new PrintStream("D:/example.txt");
            String result = file.replace(from, to);
            printStream.print(result);
            printStream.close();
            System.out.println("Success");
        }
        catch (IOException e) {
            System.out.println("Something Error !!!");
        }
    }
}
