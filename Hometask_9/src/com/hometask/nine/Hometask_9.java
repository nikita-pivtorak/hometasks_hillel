package com.hometask.nine;

import java.util.Scanner;

public class Hometask_9 {

    public static void main(String[] args) {

        System.out.println("Enter coordinates of the lower left corner ");
        System.out.println("x1 = ");
        int x1 = new Scanner(System.in).nextInt();
        System.out.println("y1 = ");
        int y1 = new Scanner(System.in).nextInt();

        System.out.println("Enter coordinates of the upper right corner ");
        System.out.println("x2 = ");
        int x2 = new Scanner(System.in).nextInt();
        System.out.println("y2 = ");
        int y2 = new Scanner(System.in).nextInt();

        System.out.println("Enter coordinates of the point ");
        System.out.println("x3 = ");
        int x3 = new Scanner(System.in).nextInt();
        System.out.println("y3 = ");
        int y3 = new Scanner(System.in).nextInt();

        if ((x3 >= x1 && y3 >= y1 && x3 <= x2 && y3 <= y2) || (x3 <= x1 && y3 <= y1 && x3 >= x2 && y3 >= y2)) {
            System.out.println("The point belongs to the rectangle");
        } else {
            System.out.println("The point DOES NOT belong to the rectangle");
        }

    }
}
