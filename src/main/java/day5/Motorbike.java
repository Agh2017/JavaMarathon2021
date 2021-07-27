package day5;

public class Motorbike {
    private int yearOfIssue;
    private String model;
    private String color;


    public Motorbike(int yearOfIssue, String color, String model) {
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
}