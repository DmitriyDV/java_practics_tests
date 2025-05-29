package Day6;

public class Motorbike {
    private int year;
    private String model;
    private String color;

    private int YEAR_CREATE_MOTORBIKE = 2016;


    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int diff) {
        return diff - YEAR_CREATE_MOTORBIKE;
    }
}
