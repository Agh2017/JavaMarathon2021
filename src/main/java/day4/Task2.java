package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        int[] arrayRandom = new int[100];
        int minValue = 10000, maxValue = 0;
        int countValueEnd0 = 0, countSumElementsEnd0 = 0;
        try {
            for (int i = 0; i < 100; i++) {
                arrayRandom[i] = (int) Math.round(Math.random() * 10000);
            }
            System.out.println(Arrays.toString(arrayRandom));
            for (int arrayValue : arrayRandom) {
                if (minValue > arrayValue) {
                    minValue = arrayValue;
                }
                if (maxValue < arrayValue) {
                    maxValue = arrayValue;
                }
                if (arrayValue % 10 == 0) {
                    countValueEnd0++;
                    countSumElementsEnd0 += arrayValue;
                }
            }
            System.out.println(minValue);
            System.out.println(maxValue);
            System.out.println(countValueEnd0);
            System.out.println(countSumElementsEnd0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
