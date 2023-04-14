package ua.paladiuc.hw5;
/*
4. Удаление из массива k-го элемента со сдвигом всех расположенных справа от него
элементов на одну позицию влево.
*Необходимо создать новый массив, в котором удаляется элемент и вернуть его из метода.
Изначальный массив не должен измениться
[1, 2, 3, 4] -> [1, 2, 4]
 */

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(delete(array)));
    }

    public static int[] delete(int[] input) {
        int[] arr = new int[input.length];
        int curr = 0;
        for (int i = 0; i < input.length; i++) {
            if (i + 1 < input.length) {
                if (input[i] == input[i + 1]) {
                    arr[curr] = input[i];
                } else {
                    arr[curr + 1] = input[i + 1];
                    curr++;
                }
            }
        }
        return arr;
    }
}
