package day3;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);
            for (int i=1; i<=5; i++) {
                double dividend = scanner.nextDouble();
                double divisor = scanner.nextDouble();
                if (divisor==0){
                    System.out.println("Деление на 0");
                    continue;
                }
                System.out.println(dividend/divisor);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}