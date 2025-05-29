package Day5;
/*
*1. Создать класс Автомобиль (англ. Car), с полями
*  “Год выпуска”, “Цвет”, “Модель”. Создать get и
*  set методы для каждого поля. Создать экземпляр
*  класса Автомобиль, задать сеттером каждое поле,
* вывести в консоль значение каждого поля геттером.
*  Созданный вами класс должен отвечать принципам инкапсуляции.
* */
public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("red");
        car.setModel("honda");
        car.setYear(2020);
        System.out.println("our car: "+car.getColor()+" color, "+car.getYear()+" year, "+car.getModel()+" model");
    }
}
