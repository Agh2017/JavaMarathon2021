package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int sumN = 3, sumValue, indexMaxSum = 0, maxSumValues = 0;
        int[] array = new int[6];

        try {
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) Math.round(Math.random() * 10000);
            }

            for (int i = 1; i < array.length - 1; i++) {
                sumValue = 0;
                for (int n = -1; n < (sumN - 1); n++) {
                    sumValue += array[i + n];
                }
                if (sumValue > maxSumValues) {
                    maxSumValues = sumValue;
                    indexMaxSum = i - 1;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println(maxSumValues);
            System.out.println(indexMaxSum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}