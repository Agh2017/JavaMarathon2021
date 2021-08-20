package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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
            System.out.println("Файл не найден");
        }
    }

    public static void printSumDigits(File file) throws FileNotFoundException, ArrayIndexOutOfBoundsException {
        try {
            Scanner scanner = new Scanner(file);
            String input = scanner.nextLine();
            String[] dataFile1 = input.split(" ");
            if (dataFile1.length != 10) {
                throw new ArrayIndexOutOfBoundsException(dataFile1.length);
            } else {
                int sum = 0;
                for (String number : dataFile1) {
                    sum += Integer.parseInt(number);
                }
                System.out.println(sum);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
/*
Создать .txt файл в папке проекта, как показано в видео (урок 36, время 15:30). Заполнить его вручную десятью произвольными
числами. Реализовать статический метод printSumDigits(File file), который считает сумму всех чисел в этом файле и выводит ее на экран.
Если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”. Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение “Некорректный входной файл”.
Вызвать данный метод в методе main().
 */