package Day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
*  Реализовать программу, которая на вход принимает txt файл
*  с целыми числами (можно использовать файл из задания 1 дня 14) и
*  в качестве ответа выводит в консоль среднее арифметическое этих чисел.
Ответ будет являться вещественным числом. В консоль необходимо вывести
* полную запись вещественного числа (со всеми знаками после запятой) и
* сокращенную запись (с 3 знаками после запятой).
Детали реализации: В классе Task1создать публичный статический
*  метод printResult(File file), в котором реализовать вышеописанную
* логику. В методе main()класса Task1вызвать метод
* printResult(File file), передав ему в качестве аргумента объект
*  класса File(txt файл с целыми числами).
Пример:
Ч и с л а в t x t ф а й л е : 5 2 8 3 4 1 3 6 7 7 Ответ: 23.285714285714285 --> 23,286
* */
public class Task1 {
    public static void main(String[] args) {

        File file = new File("src/input.txt");
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            double result = sum / (double) numbers.length;
            System.out.printf(result + "--> %.3f", result);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

    }

}

