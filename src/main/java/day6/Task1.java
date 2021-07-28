package day6;

public class Task1 {
    public static void main(String[] args) {

        Car newCar = new Car();
        newCar.setColor("red");
        newCar.setModel("mazda rx50");
        newCar.setYear(1998);
        newCar.info();
        System.out.println(newCar.yearDifference(2021));

        Motorbike newMoto = new Motorbike("harley","silver", 2021);
        newMoto.info();
        System.out.println(newMoto.yearDifference(2020));
    }
}
