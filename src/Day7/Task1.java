package Day7;
/*
*1. Для этого задания скопируйте класс Самолет из предыдущего дня в пакет текущего дня.
В классе Самолет создать статический метод compareAirplanes, который в качестве аргументов
*  принимает два объекта класса Airplane (два самолета) и выводит сообщение в консоль о том,
*  какой из самолетов длиннее.
* */
public class Task1 {
    public static void main(String[] args) {

        Airplane airplane1 = new Airplane("newline", 2010, 220,1000, 2000);
        Airplane airplane2 = new Airplane("newline", 2012, 222,1100, 2200);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}
