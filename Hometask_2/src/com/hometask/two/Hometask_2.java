package com.hometask.two;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Hometask_2 {

    public static void main(String[] args) {

        int randomNumber = getRandomNumber(10, 40);


        int[] array = new int[randomNumber];
        for (int i = 0; i < randomNumber; i++) {
            array[i] = getRandomNumber(0, 100);

        }
        int arraySum = 0;
        for (int i = 0; i <array.length ; i++) {
            arraySum += array[i];
        }

        int average = (arraySum / array.length);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        System.out.println(average);
        }




    public static int getRandomNumber(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }
}
