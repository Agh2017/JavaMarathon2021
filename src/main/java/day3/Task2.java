package day3;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
            while (true) {
                double value1 = scanner.nextDouble();
                double value2 = scanner.nextDouble();
                if (value2 == 0) {
                    break;
                }
                System.out.println(value1 / value2);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}