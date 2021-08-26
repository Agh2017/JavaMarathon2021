package day15;

/*
1. Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv). Это пример реальной выгрузки
остатков из 1С в csv файл (формат файла с разделителями, в качестве разделителя использован символ “;”). В этом файле
содержится информация о названии модели обуви, ее размер и оставшееся на складе количество.

До преобразования в csv это была таблица с тремя колонками:

Название                     Размер     Кол-во
Ботинки HS РАН-Р 400 чер. ЗП         45    4
Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.    37    1
...

Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt) с информацией о моделях и размерах обуви,
которой нет на складе (количество = 0). Для этого реализуйте программу, которая принимает на вход csv файл и создает
новый txt файл следующего содержания (должно получиться 11 строк):

Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0

...

Возникающие исключения обрабатывать (try-catch), а не пробрасывать в сигнатуре метода (throws).

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {

    private static final int COUNT = 0;


    public static void main(String[] args) {

        File file = new File("src/main/resources/shoes.csv");
        File fileOut = new File("src/main/resources/missing_shoes.txt");
        try {
            Scanner scanner = new Scanner(file);
            PrintWriter pw = new PrintWriter(fileOut);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] shoesData = line.split(";");
                if (Integer.parseInt(shoesData[2]) == COUNT) {
                    pw.println(shoesData[0] + ", " + shoesData[1] + ", " + Integer.parseInt(shoesData[2]));
                }
            }
            pw.close();
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            ;
        } catch (NumberFormatException e) {
            System.out.println("Неизвестное исключение");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ошибка в индексе массива");
            e.printStackTrace();
        }
    }
}