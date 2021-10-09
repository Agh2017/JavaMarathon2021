package day18;

public class Task2 {

    private static final int x = -112380;
    private static final int reference = 7;
    private static int count;

    public static void main(String[] args) {
        System.out.println(count7(x));
    }

    public static int count7(int n) {
        if (n % 10 == reference) count++;
        return n<1 ? count: count7(n / 10);
    }
}