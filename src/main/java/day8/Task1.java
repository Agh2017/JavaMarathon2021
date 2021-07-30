package day8;

import java.time.Duration;
import java.time.Instant;

public class Task1 {

    private static final int MAX_ELEMENTS = 20000;
    private static final String FILLER = " ";
    private static long elapsed1;
    private static long elapsed2;

    public static void main(String[] args) {

        stringBuilder();
        stringSum();
        System.out.println("\nМетод StringBuilder. Прошло времени, мс: " + elapsed1);
        System.out.print("Метод конкатенации строк. Прошло времени, мс: " + elapsed2);

    }

    private static long stringBuilder() {

        Instant start1 = Instant.now();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= MAX_ELEMENTS; i++) {
            sb.append(i).append(FILLER);
        }
        System.out.println(sb.toString());
        Instant finish1 = Instant.now();
        elapsed1 = Duration.between(start1, finish1).toMillis();

        return elapsed1;
    }

    private static long stringSum() {

        Instant start2 = Instant.now();

        String sumStrings = "";
        for (int i = 0; i <= MAX_ELEMENTS; i++) {
            sumStrings += i + FILLER;
        }
        System.out.println(sumStrings);

        Instant finish2 = Instant.now();
        elapsed2 = Duration.between(start2, finish2).toMillis();
        return elapsed2;
    }
}
