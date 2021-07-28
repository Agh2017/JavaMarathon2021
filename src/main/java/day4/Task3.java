package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array2d = new int[8][12];
        int stringArray, columnArray, maxSum = 0, indexString = 0, sumEl = 0;
        try {
            for (stringArray = 0; stringArray < array2d.length; stringArray++) {
                for (columnArray = 0; columnArray < array2d[0].length; columnArray++) {
                    array2d[stringArray][columnArray] = (int) Math.round(Math.random() * 50);
                    sumEl += array2d[stringArray][columnArray];

                }
                if (sumEl > maxSum) {
                    maxSum = sumEl;
                    indexString = stringArray;
                    sumEl = 0;
                }
            }
            System.out.println(indexString);
            System.out.println(maxSum);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}