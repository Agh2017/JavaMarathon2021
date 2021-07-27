package day4;

public class Task3 {
    public static void main(String[] args) {
        int[][] array2d = new int[8][12];
        int stringArray, columnArray, maxSumElementsString  = 0, indexString = 0, sumElementsString = 0;
        try {
            for (stringArray=0;stringArray<8;stringArray++){
                for (columnArray=0;columnArray<12;columnArray++) {
                    array2d[stringArray][columnArray]= (int) Math.round(Math.random()*50);
                    sumElementsString+=array2d[stringArray][columnArray];

                }
                if (sumElementsString>maxSumElementsString) {
                    maxSumElementsString=sumElementsString;
                    indexString = stringArray;
                    sumElementsString=0;
                }
            }
            System.out.println(indexString);
            System.out.println(maxSumElementsString);

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}