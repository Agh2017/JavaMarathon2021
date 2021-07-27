package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try {
            Scanner Number = new Scanner(System.in);
            int firstNumber = Number.nextInt();
            int secondNumber = Number.nextInt();
            if (firstNumber > secondNumber) {
                System.out.println("Некорректный ввод");
            } else {
                int i = firstNumber + 1;
                for (; i < secondNumber; i++) {
                    if (i % 5 == 0 && i % 10 != 0) {
                        System.out.print(i+" ");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}