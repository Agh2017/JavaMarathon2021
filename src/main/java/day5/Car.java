package day5;


public class Car {
    private int yearOfIssue;
    private String color;
    private String model;

    public void setYearOfIssue(int newYearOfIssue) {
        if (newYearOfIssue > 1800) {
            yearOfIssue = newYearOfIssue;
        } else {
            System.out.println("Некорректный год выпуска");
        }
    }

    public int getYearOfIssue() {
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
}
