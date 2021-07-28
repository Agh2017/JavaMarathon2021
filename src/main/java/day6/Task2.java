package day6;

public class Task2 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Sukhoi", 2020, 79, 19000);
        airplane1.setYear(2019);
        airplane1.setLength(119);
        airplane1.fillUp(550);
        airplane1.fillUp(150);
        airplane1.info();
    }
}
