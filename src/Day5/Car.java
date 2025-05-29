package Day5;

public class Car {
    private int year;
    private String model;
    private String color;

    private int YEAR_CREATE_CAR = 2018;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void info() {
        System.out.println("Это автомобиль");
    }

    public int yearDifference(int diff) {
        return diff - YEAR_CREATE_CAR;
    }

}
