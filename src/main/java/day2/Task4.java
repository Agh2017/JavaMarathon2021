package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            Scanner Number = new Scanner(System.in);
            double x = Number.nextDouble();
            double y;
            if (x <= -3) {
                y = 420.0;
            } else {
                if (x < 5 && x > -3) {
                    y = (x + 3) * (x * x - 2);
                } else {
                    y = (x * x - 10) / (x + 7);
                }
            }
            System.out.println(y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
