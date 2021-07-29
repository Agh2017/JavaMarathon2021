package day7;

public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("Suhoi", 2020, 250, 20050);
        Airplane airplane2 = new Airplane("Suhoi", 2021, 275, 20350);
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}
