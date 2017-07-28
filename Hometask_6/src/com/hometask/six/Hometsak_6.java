package com.hometask.six;

import java.util.Arrays;
import java.util.Scanner;

public class Hometsak_6 {

    public static void main(String[] args) {

        System.out.println("Input the number");
        int number = new Scanner(System.in).nextInt();

        int[] array = new int[number];
        int modulo = 0;

        for (int i = 1; i < number; i++) {

            array[i] = i + 1;
            modulo = modulo + (number % array[i]);
            if (modulo == 0) {
                System.out.println("It's a composite number");
                break;
            } else {
                System.out.println("It's a prime number");
                break;
            }


        }


    }
}