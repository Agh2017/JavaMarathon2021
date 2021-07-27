package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {

        int arrayValue, sum3Value = 0, indexMaxSum=0, maxSum3Values=0;
        int[] array = new int[100];

        try {
            for (int i=0; i<array.length;i++) {
                array[i] = (int) Math.round(Math.random()*10000);
            }
            for (int i=1; i<array.length-1;i++) {
                sum3Value= array[i-1]+array[i]+array[i+1];
                if (sum3Value>maxSum3Values) {
                    maxSum3Values=sum3Value;
                    indexMaxSum=i-1;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println(maxSum3Values);
            System.out.println(indexMaxSum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}