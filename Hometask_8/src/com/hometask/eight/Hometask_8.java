package com.hometask.eight;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask_8 {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        int number = new Scanner(System.in).nextInt();

        int[] array = new int[10];
        int i = 0;
        int result = 0;

        while (number > 0) {
            array[i] = number % 10;
            number = number / 10;
            result = result + array[i];
            i++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println("The sum of the digits in the number = " + result);
    }
}
