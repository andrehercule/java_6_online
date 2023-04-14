package ua.paladiuc.hw4;
/*
4.
• Заполнить одномерный массив случайными целочисленными значениями.
• Все четные значения заменить на нули. Размер массива - 2000 элементов
 */

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        System.out.println(Arrays.toString(fillArray(array)));
        System.out.println(Arrays.toString(evenValue(array)));
    }

    public static int[] fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(1000);
        }
        return numbers;
    }

    public static int[] evenValue(int[] num) {
        int[] transposed = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            transposed[i] = num[i];
            if (transposed[i] % 2 == 0) {
                transposed[i] = 0;
            }
        }
        return transposed;
    }
}
