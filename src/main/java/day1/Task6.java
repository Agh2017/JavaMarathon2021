package day1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        try {
            Scanner Number = new Scanner(System.in);
            int k = Number.nextInt();
            if (k > 9 || k <= 0) {
                System.out.println("Некорректный ввод");
            } else {
                for (int i = 1; i <= k; i++) {
                    int result = i * k;
                    System.out.println("1 x " + k + " = " + result);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
