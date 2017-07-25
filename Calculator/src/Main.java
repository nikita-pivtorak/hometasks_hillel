/**
 * Created by Nik on 25.07.2017.
 */

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            System.out.println("Input number 1");
            int numberOne = new Scanner(System.in).nextInt();

            System.out.println("Input number 2");
            int numberTwo = new Scanner(System.in).nextInt();

            System.out.println("Input type of operation");
            String operationType = new Scanner(System.in).nextLine();

            int result = -1000;
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
                    result = numberOne / numberTwo;
                    break;
                case "%":
                    result = numberOne % numberTwo;
                    break;
                default:
                    System.out.println("It's the wrong number!");
                    break;
            }

            String answer = "Your result is: " + result;
            System.out.println(answer);

        }
    }

