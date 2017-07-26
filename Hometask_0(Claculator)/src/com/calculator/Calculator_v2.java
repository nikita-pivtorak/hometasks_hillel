package com.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator_v2 {

    public static void main(String[] args) {


        System.out.println("Input number 1");
        int numberOne = inputAndCheckInt();
        System.out.println("Input number 2");
        int numberTwo = inputAndCheckInt();


        int result = -1000;
        boolean operationPassed;
        do {
            operationPassed = true;
            System.out.println("Input correct type of operation");
            String operationType = new Scanner(System.in).nextLine();
            switch (operationType) {
                case "+":
                    result = numberOne + numberTwo;
                    break;
                case "-":
                    result = numberOne - numberTwo;
                    break;
                case "*":
                    result = numberOne * numberTwo;
                    break;
                case "/":
                    if (numberTwo == 0) {
                        System.out.println("You cannot divide by zero.");
                        operationPassed = false;
                    } else {
                        result = numberOne / numberTwo;
                    }
                    break;
                case "%":
                    result = numberOne % numberTwo;
                    break;
                default:
                    System.out.println("It's the wrong operation!");
                    operationPassed = false;
                    break;
            }
        } while (!operationPassed);


        String answer = "Your result is: " + result;
        System.out.println(answer);

    }

    private static int inputAndCheckInt() {

        boolean ok = false;
        int num = 0;
        while (!ok) try {
            num = new Scanner(System.in).nextInt();
            ok = true;
        } catch (InputMismatchException notIntException) {
            System.out.println("You've entered number out of int value or not a number at all. Try again");
        }
        return num;
    }


}



