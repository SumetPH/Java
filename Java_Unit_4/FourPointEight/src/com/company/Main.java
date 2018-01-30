package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Input Number : ");
        int num = kb.nextInt();

        System.out.println(NumberFormat.getInstance(Locale.US).format(num));
    }
}
