package day6;

public class Motorbike {
    private int yearOfIssue;
    private String model;
    private String color;


    public Motorbike(String model,  String color, int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
        this.color = color;
        this.model = model;
    }


    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public String getColor() {
        return color;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        if (inputYear < yearOfIssue) {
            return yearOfIssue - inputYear;
        }
        return inputYear - yearOfIssue;
    }
}
