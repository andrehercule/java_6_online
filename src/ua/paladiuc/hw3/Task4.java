package ua.paladiuc.hw3;
/*
Программа "Угадай число"
Задача
Отгадать целое число, которое "загадал" компьютер в определенном диапазоне.

Решение
Описание переменных:

a – число, "загаданное" компьютером;
b – очередное число, вводимое пользователем.

Алгоритм решения задачи:

Программа генерирует псевдослучайное число, которое записывается в переменную a.

Пока число a не совпадет с числом b, пользователю будет предлагаться ввести очередное число. При этом,
если b > a, то на экран будет выдаваться сообщение "Много". Иначе будет проверяться условие b < a.
При его положительном значении появится сообщение "Мало", иначе сообщение "Угадал".

 */


import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a = (int) ((Math.random() * 100) + 1);
        System.out.println(a);
        while (true) {
            System.out.println("Введите число: ");
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            System.out.println(checkCondition(a, b));
            if (a == b) {
                System.out.println("Угадал");
                break;
            }
        }
    }

    public static int checkCondition(int a, int b) {
        if (b > a) {
            System.out.println("Ведите очередное число. Много");
        } else if (b < a) {
            System.out.println("Ведите очередное число. Мало");
        }
        return b;
    }
}
