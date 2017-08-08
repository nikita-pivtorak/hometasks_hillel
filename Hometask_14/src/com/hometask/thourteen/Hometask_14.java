package com.hometask.thourteen;

import java.util.Random;
import java.util.Scanner;

public class Hometask_14 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomNumber(10, 21);
                System.out.print(array[i][j] + "; ");
            }
            System.out.println();
        }

        System.out.println("Enter numbers of columns you want to swap in above matrix, the 1st one: ");
        int columnOne = new Scanner(System.in).nextInt();
        columnOne -= 1;

        System.out.println("and the 2nd one: ");
        int columnTwo = new Scanner(System.in).nextInt();
        columnTwo -= 1;
        swapColumns(array, columnOne, columnTwo);

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "; ");
            }
            System.out.println();
        }

    }


    private static int[][] swapColumns(int[][] array, int columnOne, int columnTwo) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            temp = array[i][columnOne];
            array[i][columnOne] = array[i][columnTwo];
            array[i][columnTwo] = temp;
        }
        return array;
    }


    public static int getRandomNumber(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }
}