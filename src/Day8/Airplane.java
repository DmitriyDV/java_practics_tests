package Day8;

public class Airplane {


    int fuel = 0;
    String producer;
    int year;
    int length;
    int weight;

    @Override
    public String toString() {
        return "Изготовитель: " + this.producer + " , год выпуска: " + this.year +
                " , длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel;
    }

    public int getLength() {
        return length;
    }

    public Airplane(String producer, int year, int length, int weight, int fuel) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }


    public void info() {
        System.out.println(
                "Изготовитель: " + this.producer + " , год выпуска: " + this.year +
                        " , длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }

    public void fillUp(int fuel) {
        this.fuel += fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        } else if (airplane1.getLength() < airplane2.getLength()) {
            System.out.println("Второй самолет длиннее");
        } else {
            System.out.println("Они равны по длине ");
        }
    }
}
