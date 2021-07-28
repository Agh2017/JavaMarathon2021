package day6;


public class Car {
    private int yearOfIssue = 1800;
    private String color = "uncertain";
    private String model = "uncertain";

    public void setYear(int newYearOfIssue) {
        if (newYearOfIssue > 1800 && newYearOfIssue < 2022) {
            yearOfIssue = newYearOfIssue;
        } else {
            System.out.println("Некорректный год выпуска");
        }
    }

    public int getYear() {
        return yearOfIssue;
    }

    public void setColor(String newColor) {
        if (newColor.isEmpty()) {
            System.out.println("Не указан цвет автомобиля");
        } else {
            color = newColor;
        }
    }

    public String getColor() {
        return color;
    }

    public void setModel(String newModel) {
        if (newModel.isEmpty()) {
            System.out.println("Не указана модель автомобиля");
        } else {
            model = newModel;
        }
    }

    public String getModel() {
        return model;
    }


    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int inputYear) {
        if (inputYear < this.yearOfIssue) {
            return this.yearOfIssue - inputYear;
        }
        return inputYear-this.yearOfIssue;
    }
}