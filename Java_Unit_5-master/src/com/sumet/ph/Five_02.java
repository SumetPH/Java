package com.sumet.ph;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Five_02 {
    public static void main(String[] args) throws IOException {
        //instance
        Scanner sc = new Scanner(new File("D:/scores.txt"));
        PrintStream ps = new PrintStream(new File("D:/grades.txt"));

        //process and output
        int count = 2;
        while (sc.hasNext()) {
            if (count % 2 == 0) {
                ps.print(sc.next() + " ");
            } else {
                double score = Double.parseDouble(sc.next());
                String grade = "";
                if (score >= 80) grade = "A";
                else if (score >= 70) grade = "B";
                else if (score >= 60) grade = "C";
                else if (score >= 50) grade = "D";
                else grade = "F";
                ps.println(grade);
            }
            count++;
        }
        ps.close();
    }
}
