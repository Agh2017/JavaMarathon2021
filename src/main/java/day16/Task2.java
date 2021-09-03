package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;


public class Task2 {

    private static final int COUNT1 = 1000;
    private static final int COUNT2 = 20;
    private static final int MAX_NUMBER = 100;

    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("file1.txt");
        PrintWriter pw1 = new PrintWriter(file1);
        File file2 = new File("file2.txt");
        PrintWriter pw2 = new PrintWriter(file2);

        for (int i = 0; i < COUNT1; i++) {
            int currentNumber = new Random().nextInt(MAX_NUMBER);
            pw1.println(currentNumber);
        }
        pw1.close();

        Scanner scanner = new Scanner(file1);

        int counter = 0, sum = 0;
        while (scanner.hasNextLine()) {
            sum += Integer.parseInt(scanner.nextLine());
            counter++;
            if (counter == COUNT2) {
                pw2.println((double) sum / COUNT2);
                counter = 0;
                sum = 0;
            }
        }
        pw2.close();
        printResult(file2);
    }

    public static void printResult(File file) throws FileNotFoundException {
        Scanner scanner2 = new Scanner(file);
        double sum = 0;
        String line2 = scanner2.nextLine();
        String[] numbers = line2.split(" ");
        if (numbers.length > 1) {
            for (String currentNumber : numbers) {
                sum += Double.parseDouble(currentNumber);
            }
        } else {
            while (scanner2.hasNextLine()) {
                String line3 = scanner2.nextLine();
                sum += Double.parseDouble(line3);
            }
        }
        System.out.println((int) sum);
    }
}
