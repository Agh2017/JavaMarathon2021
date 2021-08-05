package day12;

import java.util.ArrayList;

public class Task2 {

    private static final int MIN_COUNT1 = 0;
    private static final int MIN_COUNT2 = 300;
    private static final int MAX_COUNT1 = 30;
    private static final int MAX_COUNT2 = 350;

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        AddElements.addElements(list1, MIN_COUNT1, MAX_COUNT1);
        AddElements.addElements(list1, MIN_COUNT2, MAX_COUNT2);
        System.out.println(list1);
    }


    static class AddElements {

        private static void addElements(ArrayList<Integer> list1, int minCount1, int maxCount1) {
            for (int i = minCount1; i <= maxCount1; i++) {
                if (i % 2 == 0) {
                    list1.add(i);
                }
            }
        }
    }
}
