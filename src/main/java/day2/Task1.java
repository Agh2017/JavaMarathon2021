package day2;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int numberOfFloors = in.nextInt();

            if (numberOfFloors >= 1 && numberOfFloors < 5) {
                System.out.println("Малоэтажный дом");
            }
            if (numberOfFloors >= 5 && numberOfFloors < 9) {
                System.out.println("Среднеэтажный дом");
            }
            if (numberOfFloors >= 9) {
                System.out.println("Многоэтажный дом");
            }
            if (numberOfFloors < 1) {
                System.out.println("Ошибка ввода");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
