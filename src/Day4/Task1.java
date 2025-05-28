package Day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
*1. С клавиатуры вводится число n - размер массива.
* Необходимо создать массив указанного размера и заполнить
* его случайными числами от 0 до 10. Затем вывести содержимое
*  массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
* */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLenght = scanner.nextInt();

        Random random = new Random();

        int[] array = new int[arrayLenght];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);
        int counter8 = 0;
        int counter1 = 0;
        int counterEven = 0;
        int counterNotEven = 0;
        int counterSum = 0;
        for (int i = 0; i < array.length; i++) {
            counterSum += array[i];
            if (array[i] > 8) {
                counter8++;
            }
            if (array[i] == 1) {
                counter1++;
            }
            if (array[i] % 2 == 0) {
                counterEven++;
            } else {
                counterNotEven++;
            }

        }
        System.out.println(counter8);
        System.out.println(counter1);
        System.out.println(counterEven);
        System.out.println(counterNotEven);
        System.out.println(counterSum);
    }
}
