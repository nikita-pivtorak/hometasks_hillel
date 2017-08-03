package com.hometask.twelve;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask_12_V2 {


    public static void main(String[] args) {

        String number = new Scanner(System.in).nextLine();


        char[] initialArray = number.toCharArray();
        char[] reversedArray = getReversedArray(initialArray);

        if (Arrays.equals(initialArray, reversedArray)) {
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is NOT a palindrome");
        }
    }


    private static char[] getReversedArray(char[] array) {
        char[] reversedArray = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversedArray[j] = array[i];

        }
        System.out.println(Arrays.toString(reversedArray));
        System.out.println(Arrays.toString(array));
        return reversedArray;
    }
}

