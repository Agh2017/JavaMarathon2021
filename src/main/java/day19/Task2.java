package day19;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
19-2

2. В папке resources находится файл taxi_cars.txt. Этот файл содержит в себе данные о местоположении 500 машин такси
(каждая машина такси находится на новой строке).

Формат данных в файле следующий:
id_машины координата_по_x координата_по_y

Каждая строка в файле содержит 3 целых числа, разделенных пробелами — уникальный идентификатор машины такси, координата
машины по оси X и координата машины такси по оси Y. Значения каждой из координат находятся в диапазоне от 0 до 99.

Для вашего удобства, в пакете task3 реализован класс - Point. Класс Point необходим для представления точек с
координатами x,y в нашей программе. Местоположение машины такси — объект класса Point.

Вам необходимо считать строки из файла taxi_cars.txt в HashMap<Integer, Point>. В качестве ключей используются id машин
из файла, а в качестве значений используется объект Point, созданный для двух координат текущей машины. После того, как
все машины будут лежать в объекте HashMap, вам необходимо запросить от пользователя 4 числа - координаты квадрата (x1,
y1, x2, y2). Первые два числа — координаты первой точки квадрата, вторые два числа — координаты второй точки квадрата
(см. картинку ниже).


see file  19-2.png in resources

На этой картинке видно, что квадрат задается двумя точками, которые вводятся пользователем с клавиатуры. Синими
квадратиками изображены машины такси, которые оказались внутри квадрата.

Для квадрата, введенного пользователем, вам необходимо, используя сформированный объект HashMap<Integer, Point>,
определить, какие машины попали внутрь этого квадрата.
Вам необходимо вывести в консоль идентификаторы машин, которые находятся внутри квадрата и общее количество машин в
квадрате. Машины, лежащие на грани квадрата, не учитываются.

Алгоритм должен работать для любого корректно введенного квадрата.

 */
public class Task2 {

    public static void main(String[] args) throws Exception {
        HashMap<Integer, java.awt.Point> mapLocationCars = new HashMap<>();
        getLocationCars(mapLocationCars, "src\\main\\resources\\taxi_cars.txt");

        int[] userCoordinate = getSearchLocation();
        System.out.println("Square: " + Arrays.toString(userCoordinate));

        countingCarsInsideSquare(mapLocationCars, userCoordinate);
    }

    private static void countingCarsInsideSquare(HashMap<Integer, java.awt.Point> mapLocationCars, int[] userCoordinate) {
        int count = 0;
        for (Map.Entry<Integer, java.awt.Point> currentValue : mapLocationCars.entrySet()) {
            java.awt.Point coordinate = currentValue.getValue();
            if (coordinate.getX() > userCoordinate[0] & coordinate.getX() < userCoordinate[2] & coordinate.getY() < userCoordinate[1] & coordinate.getY() > userCoordinate[3]) {
                count++;
                System.out.println("Car ID: " + currentValue.getKey());
            }
        }
        System.out.println("there are all cars in the square: " + count);


    }

    private static int[] getSearchLocation() {
        int[] searchLocation = new int[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Input " + (i + 1) + " coordinate: ");
            try {
                int coordinate = scanner.nextInt();
                if (coordinate <= 99 & coordinate >= 0) {
                    searchLocation[i] = coordinate;
                } else {
                    System.out.println("incorrect number");
                    getSearchLocation();
                }
            } catch (Exception e) {
                System.out.println("incorrect data entered -> InputMismatchException");
                System.out.println("not number entered, try again");
                break;
            }
        }
        if (searchLocation[0] >= searchLocation[2] || searchLocation[1] <= searchLocation[3]) {
            System.out.println("incorrect data entered, try again");
            getSearchLocation();
        }
        return searchLocation;
    }


    public static HashMap<Integer, java.awt.Point> getLocationCars(HashMap<Integer, java.awt.Point> mapLocationCars, String url) throws
            FileNotFoundException {

        File file = new File(url);
        Scanner scannerFile = new Scanner(file);
        while (scannerFile.hasNext()) {
            int numberCar = scannerFile.nextInt();
            int numberX = scannerFile.nextInt();
            int numberY = scannerFile.nextInt();
            mapLocationCars.put(numberCar, new Point(numberX, numberY));
        }
        return mapLocationCars;
    }
}
