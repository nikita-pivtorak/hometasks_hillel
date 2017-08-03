package com.hometask.twelve;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask_12 {


    public static void main(String[] args) {

        System.out.println("Enter the number you want to reverse");
        String number = new Scanner(System.in).nextLine();

        StringBuilder string = new StringBuilder(number);
        if (string.toString().equals(string.reverse().toString())) {

            System.out.println("The number is palindrome");
        }
        else
            {
            System.out.println("The number is NOT a palindrome");
        }

    }

}
