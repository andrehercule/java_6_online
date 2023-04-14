package ua.paladiuc.hw5;
/*
3. Дан двумерный массив NxN(количество строк = количество столбцов), написать программу,
которая поменяет местами столбцы и строки.
*Необходимо создать новый массив, в котором выполняются превращения и вернуть его из метода.
Изначальный массив не должен измениться
 */

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        System.out.println(Arrays.deepToString(fillArray(arr)));
        System.out.println(Arrays.deepToString(rotateArray(arr)));
    }

    public static int[][] fillArray(int[][] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = random.nextInt(1000);
            }
        }
        return numbers;
    }

    public static int[][] rotateArray(int[][] array) {
        int[][] transposed = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                transposed[j][i] = array[i][j];
            }
        }
        return transposed;
    }
}
