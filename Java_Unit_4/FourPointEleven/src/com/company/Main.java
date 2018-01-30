package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> in = new ArrayList<>();
        for (int a = 1; a <= 500; a++) {
            for (int b = 1; b <= 500; b++) {
                for (int c = 1; c <= 500; c++) {

                    if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                        if (!in.contains(a) && !in.contains(b) && !in.contains(c)) {
                            System.out.println(a + "(^2) + " + b + "(^2) = " + c + "(^2)");
                            in.add(a);
                            in.add(b);
                            in.add(c);
                        }
                    }

                }
            }
        }
    }
}
