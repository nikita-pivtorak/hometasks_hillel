package com.hometask.one;

import java.util.Scanner;


public class Hometask_1 {

    public static void main(String[] args) {

        System.out.println("Input number 1");
        int numberOne = new Scanner(System.in).nextInt();

        System.out.println("Input number 2");
        int numberTwo = new Scanner(System.in).nextInt();

        int average = (numberOne + numberTwo) / 2 ;
        System.out.println("Average of number 1 and number 2 = " + average);


    }
}
