package com.hometask.three;

import java.util.Scanner;


public class Hometask_3 {

    public static void main(String[] args) {

        System.out.println("Input amount of money contribution");
        int moneyAmount = new Scanner(System.in).nextInt();

        System.out.println("Interest per annum");
        double percentByYear = new Scanner(System.in).nextInt();

        System.out.println("Input deposit duration");
        int depositDuration = new Scanner(System.in).nextInt();

        int percentAmount = 0;
        int year = 0;

        for (int i = 0; i < depositDuration; i++) {

            percentAmount = (int) (moneyAmount * (percentByYear / 100));
            moneyAmount = (moneyAmount + percentAmount);
            year++;

            System.out.println("Money for " + year + " year(s) = " + moneyAmount +
                    " / 10 percent for " + year + " year  = " + percentAmount);


        }

    }
}
