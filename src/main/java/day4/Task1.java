package day4;

import java.util.Arrays;
import java.util.Scanner;


public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countMore8 = 0, countEqually1 = 0, countOdd = 0, sumAll = 0;
        try {
            int arraySize = scanner.nextInt();
            int[] arrayTest = new int[arraySize];
            for (int i = 1; i < arrayTest.length; i++) {
                int randomValue = (int) Math.round(Math.random() * 10);
                sumAll += randomValue;
                if (randomValue == 1) {
                    countEqually1++;
                }
                if (randomValue > 8) {
                    countMore8++;
                }
                if (randomValue % 2 != 0) {
                    countOdd++;
                }
                arrayTest[i] = randomValue;
            }
            System.out.println(Arrays.toString(arrayTest));
            System.out.println(arrayTest.length);
            System.out.println(countMore8);
            System.out.println(countEqually1);
            System.out.println(arraySize - countOdd);
            System.out.println(countOdd);
            System.out.println(sumAll);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
