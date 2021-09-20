package day18;
/*
 Вам дан числовой массив произвольного размера. Посчитайте сумму чисел в этом массиве не используя циклы (необходимо использовать рекурсивные вызовы).

Пример:
int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
System.out.println(recursionSum(...)); // 65346

*recursionSum(...) - это ваш рекурсивный метод, который вернет сумму чисел в массиве numbers.

 */
public class Task1 {

    private static int count;

    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        count = numbers.length-1;
        System.out.println(recursionSum(numbers, count));
    }

    public static int recursionSum(int[] array, int count) {
        if (count == -1) return 0;
        int sum = array[count]+recursionSum(array, count-1);
        return sum;
    }
}
