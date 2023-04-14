package ua.paladiuc.hw4;
/*
2.
• Заполнить одномерный массив случайными целочисленными значениями.
• Проверить сколько простых чисел присутствует в массиве. Размер массива 1000 элементов.
 */

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[5];
        fillArray(array);
        System.out.println(checkPrime(array));

    }

    public static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        if (number % 2 == 0) {
            return number == 2;
        }
        if (number % 3 == 0) {
            return number == 3;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static int checkPrime(int[] check) {
        int count = 0;
        for (int i = 0; i < check.length; i++) {
            if (isPrime(check[i])) {
                count++;
                System.out.println(check[i]);
            }
        }
        return count;
    }
}
