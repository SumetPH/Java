package com.company;

public class Main {

    public static void main(String[] args) {
        int round = calculate();
        calculateShow(round);
    }

    public static int calculate() {
        int checked = 0, round = 0;
        for (int i = 1; i <= 1000; i++) {
            int sum = i;
            int check = 0;
            while (true) {
                if (sum % 2 != 0) {
                    sum = (sum * 3) + 1;
                    check++;
                } else {
                    sum = sum / 2;
                    check++;
                }
                if (sum == 1) {
                    if(check > checked){
                        round = i;
                        checked = check;
                    }
                    break;
                }
            }
        }
        return round;
    }


    public static void calculateShow(int round) {
        System.out.print("รอบที่มีความยาวสูงสุดคือรอบที่ " + round + " : " + round + ",");
        while (true) {
            if (round % 2 != 0) {
                round = (round * 3) + 1;
                System.out.print(round + ",");
            } else {
                round = round / 2;
                System.out.print(round + ",");
            }
            if (round == 1) break;
        }
        System.out.print("\b");
    }
}
