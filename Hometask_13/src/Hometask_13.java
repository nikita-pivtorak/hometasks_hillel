import java.util.Arrays;
import java.util.Random;

public class Hometask_13 {

    public static void main(String[] args) {

        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = getRandomNumber(-20, 21);
                System.out.print(array[i][j] + "; ");

            }
            System.out.println();
        }

        int arraySum = getSumm(array);
        System.out.println("Sum of all elements = " + getSumm(array));
        System.out.println("Average of all elements = " + getAverage(arraySum, array));
        System.out.println("Min elemet = " + getMinElement(array));
        System.out.println("Max element = " + getMaxElement(array));
        System.out.println("Positive elements amount = " + countPositiveElements(array));
        System.out.println("Sum of each row : " + Arrays.toString(sumForLine(array)));
    }

    private static int[] sumForLine(int[][] array) {
        int sumForLine = 0;
        int[] arraySumForLine = new int[array.length];
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                sumForLine = +array[i][j];
            }
            arraySumForLine[i] = sumForLine;
            sumForLine = 0;
        }
        return arraySumForLine;
    }

    private static int countPositiveElements(int[][] array) {
        int positiveElementsAmount = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    positiveElementsAmount++;
                }
            }
        }
        return positiveElementsAmount;
    }

    private static int getMaxElement(int[][] array) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (maxElement < array[i][j]) {
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;

    }

    private static int getMinElement(int[][] array) {

        int minElement = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (minElement > array[i][j]) {
                    minElement = array[i][j];
                }
            }
        }
        return minElement;
    }

    private static double getAverage(int arraySum, int[][] array) {
        double arrayAverage = (double) arraySum / array.length;
        return arrayAverage;
    }

    private static int getSumm(int[][] array) {
        int arraySum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 10; j++) {
                arraySum += array[i][j];
            }
        }
        return arraySum;
    }

    public static int getRandomNumber(int min, int max) {
        Random rnd = new Random();
        return rnd.nextInt(max - min) + min;
    }

}
