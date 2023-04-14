package ua.paladiuc.hw5;
/*
2. Проверить, заданный массив на упорядоченность по не возрастанию, т. е. определить,
верно ли, что каждый его элемент, начиная со второго, не больше предыдущего.
* Передать массив в метод, получить boolean
 */

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillArray(arr);
        System.out.println(isSorted(arr));
    }

    public static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static boolean isSorted(int[] a) {
        if (a == null || a.length <= 1) {
            return true;
        }
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
