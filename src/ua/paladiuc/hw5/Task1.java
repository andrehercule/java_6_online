package ua.paladiuc.hw5;
/*
1. Заполнение двумерного массива значениями индекса(от 1 и до кол-ва элементов в
массиве), при этом каждая вторая строка - отрицательными значениями.
Например
1 2 3
-4 -5 -6
7 8 9
-10 -11 -12
*Передать массив в метод, заполнить данный массив
 */

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        System.out.println(Arrays.deepToString(fillArray(arr)));
    }

    public static int[][] fillArray(int[][] numbers) {
        int n = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = n + 1;
                n++;
                if (i % 2 != 0)
                    numbers[i][j] = -1 * numbers[i][j];
            }
        }
        return numbers;
    }
}
