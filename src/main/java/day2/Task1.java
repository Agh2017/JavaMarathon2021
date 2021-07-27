package day2;

import com.sun.source.tree.NewArrayTree;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int numberOfFloors = in.nextInt();

            if (numberOfFloors >= 1 && numberOfFloors < 5) {
                System.out.println("Малоэтажный дом");
            }
            if (numberOfFloors >= 5 && numberOfFloors < 9) {
                System.out.println("Среднеэтажный дом");
            }
            if (numberOfFloors >= 9) {
                System.out.println("Многоэтажный дом");
            }
            if (numberOfFloors < 1) {
                System.out.println("Ошибка ввода");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
}
//1. Реализовать программу, которая принимает на вход через консоль с помощью класса Scanner, число, соответствующее количеству этажей в здании. Используя условный оператор if, необходимо вывести в консоль сообщение о типе такого дома.
//
//        Условия: если этажей 1-4 - “Малоэтажный дом”, 5-8 - “Среднеэтажный дом”, 9 и более - “Многоэтажный дом”. Также, необходимо учесть что может быть введено отрицательное значение, в таком случае сообщить “Ошибка ввода”.
