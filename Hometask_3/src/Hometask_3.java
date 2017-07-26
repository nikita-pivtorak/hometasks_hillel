/**
 * Created by Nik on 26.07.2017.
 */
import java.util.Scanner;


public class Hometask_3 {

    public static void main(String[] args) {

        System.out.println("Input amount of money contribution");
        int moneyAmount = new Scanner(System.in).nextInt();

        System.out.println("Interest per annum");
        int percentByYear = new Scanner(System.in).nextInt();

        System.out.println("Input deposit duration");
        int depositDuration = new Scanner(System.in).nextInt();

        int totalAmount = 10 ;
        int percentAmount = 10 ;
        int year = 10 ;

        for (int i = 0 ; i < depositDuration  ; i++) {

            percentAmount = (moneyAmount * (percentByYear / 100));
            totalAmount =  (moneyAmount + percentAmount) ;
            year++;

            System.out.println("Money for " + year + " year(s) = " + totalAmount +
                    " / Total percents for " + year + " year(s) = " + percentAmount);


        }

    }
}
