package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car00001 = new Car();
        car00001.setColor("Blue");
        car00001.setModel("skyline");
        car00001.setYearOfIssue(2011);
        System.out.println(car00001.getYearOfIssue());
        System.out.println(car00001.getColor());
        System.out.println(car00001.getModel());
    }
}
