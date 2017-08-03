package com.hometask.ten;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask_10 {

    public static void main(String[] args) {

        System.out.println("Enter the number you want to reverse");
        String number = new Scanner(System.in).nextLine();
        char[] array = number.toCharArray();


        for(int i = 0; i < array.length / 2; i++)
        {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
