package com.hometask.seven;

import java.util.Scanner;

public class Hometask_7 {

    public static void main(String[] args) {

        System.out.println("Input the number");
        int number = new Scanner(System.in).nextInt();

        int[] arrayModulo = new int[number];
        int modulo = 0;

        System.out.println("Number " + number + " is multiple of numbers:");

        for (int i = 0; i < number; i++) {

            arrayModulo[i] = i + 1;
            modulo = modulo + (number % arrayModulo[i]);
            if (modulo == 0) {
                System.out.println(arrayModulo[i]);
            }

            modulo = 0;
        }


    }
}