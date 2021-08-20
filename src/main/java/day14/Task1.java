package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        try {
            /*String separator = File.separator;
            String path = separator + "C:" + separator + "JavaMarathon2021" + separator + "file1.txt";
            */
            String path = "file1.txt";
            File file = new File(path);
            printSumDigits(file);
        } catch (FileNotFoundException e) {
            System.out.print("Файл не найден");;
        }

    }

    public static void printSumDigits(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String input = scanner.nextLine();
        String[] dataFile1 = input.split(" ");
        System.out.println(Arrays.toString(dataFile1));
    }
}
