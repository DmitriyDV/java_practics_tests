package Day4;

import java.util.Random;

/*
*4. Создать новый массив размера 100 и заполнить
*  его случайными числами из диапазона от 0 до 10000.
Найти максимум среди сумм трех соседних элементов.
*  Для найденной тройки с максимальной суммой выведите
*  значение суммы и индекс первого элемента тройки.
* */
public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int maxSum3 = 0;
        int maxSumIdx = 0;
        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = 0; j < i + 3; j++)
                sum += array[j];
            if (sum > maxSum3) {
                maxSum3 = sum;
                maxSumIdx = i;
            }
        }

        System.out.println(maxSum3);
        System.out.println(maxSumIdx);

    }
}
