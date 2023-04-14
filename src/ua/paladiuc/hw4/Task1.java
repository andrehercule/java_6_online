package ua.paladiuc.hw4;
/*
1.
• Заполнить одномерный массив случайными целочисленными значениями.
• Найти среднее арифметическое и среднее геометрическое элементов массива. Размер массива -
400 элементов.
P.S. значения элементов можно ограничить значениями 1-10 включительно
 */

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[4];
        fillArray(array);
        System.out.println("Среднее арифметическое: " + averageValue(array));
        System.out.println("Среднее геометрическое: " + geometricValue(array));
    }

    public static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static double averageValue(int[] value) {
        double arg = 0;
        for (int i = 0; i < value.length; i++) {
            arg += value[i];
        }
        arg /= value.length;
        return arg;
    }

    public static double geometricValue(int[] value) {
        double arg1 = 1;
        double arg2 = 1;
        for (int i = 0; i < value.length; i++) {
            arg1 *= value[i];
        }
        arg2 = Math.pow(arg1, 1d / value.length);
        return arg2;
    }
}
