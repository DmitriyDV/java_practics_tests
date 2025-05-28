package Day4;

import java.util.Random;

/*
*2. Создать новый массив размера 100 и заполнить его случайными числами из диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.
* */
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = 0;
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println(max);

        int min = 10000;
        for (int element : array) {
            if (element < max) {
                max = element;
            }
        }
        System.out.println(min);

        int count = 0;
        for (int element : array) {
            if (element % 10 == 0) {
                count++;
            }
        }
        System.out.println(count);

        int sum = 0;
        for (int element : array) {
            if (element % 10 == 0) {
                sum += element;
            }
        }
        System.out.println(count);
    }
}
