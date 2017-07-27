package com.hometask.five;

import java.util.Scanner;

public class Hometask_5 {

    public static void main(String[] args) {

        System.out.println("Input the number");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Choose the way you want to chek your number. Input modulo or bit");
        String operationType = new Scanner(System.in).nextLine();

        int check;

        switch(operationType) {

            case "modulo":
                check = number % 2;
                if (check == 0){
                    System.out.println("Number is pairwise");
                }
                else{
                    System.out.println("Number is not pairwise");
                }
                break;

            case "bit":
                check = (number & 1);
                if (check == 0){
                    System.out.println("Number is pairwise");
                }
                else{
                    System.out.println("Number is not pairwise");
                }
                break;
        }

    }
}