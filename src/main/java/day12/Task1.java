package day12;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
1. Создать список строк, добавить в него 5 марок автомобилей, вывести список в консоль. Добавить в середину еще 1
автомобиль, удалить самый первый автомобиль из списка. Вывести список в консоль.


 */
public class Task1 {

    private static List<String> brands = new ArrayList<>();


    public static void main(String[] args) {

        String[] array = {"Ford", "WV", "Toyota", "AUDI", "VAZ", "ZAZ"};

        for (int i = 0; i < array.length-1; i++) {
            int randomBrand = (int) Math.round(Math.random() * array.length);
            brands.add(array[randomBrand]);
        }
        System.out.println(brands);
        brands.set((int) Math.round((array.length-1)/2),array[(int) Math.round(Math.random() * array.length)]);
        brands.remove(0);
        System.out.println(brands);
    }
}
