package com.hometask.fifteen;

import java.util.Arrays;
import java.util.Random;

public class Hometask_15 {

    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomNumber(10, 21);
                System.out.print(array[i][j] + "; ");
            }
            System.out.println();
        }
        System.out.println("Sum for each column : ");
        int[] arraySumForColumn = countSumForColumn(array);
        System.out.println(Arrays.toString(arraySumForColumn));

        int biggestColumn = 0;
        int index = 0;
        for (int i = 0; i < arraySumForColumn.length; i++) {
            if (biggestColumn < arraySumForColumn[i]) {
                biggestColumn = arraySumForColumn[i];
                index = i + 1;
            }
        }

        System.out.println("The biggest is column №" + index + " = " + biggestColumn);

    }


    public static int[] countSumForColumn(int[][] array) {
        int sumForColumn = 0;
        int[] arraySumForColumn = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                sumForColumn += array[j][i];
            }
            arraySumForColumn[i] = sumForColumn;
            sumForColumn = 0;
        }
        return arraySumForColumn;
    }


    public static int getRandomNumber(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }
}