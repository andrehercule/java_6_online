package ua.paladiuc.hw2;

import java.util.Scanner;

public class Module {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num1 = sc.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = sc.nextInt();
        moduleCheck(num1, num2, num3);

    }

    public static void moduleCheck(int num1, int num2, int num3) {
        int firstABS = num1 > 0 ? num1 : -num1;
        int secondABS = num2 > 0 ? num2 : -num2;
        int thirdABS = num3 > 0 ? num3 : -num3;
        int min = Math.min(thirdABS, Math.min(firstABS, secondABS));
        System.out.println("Меньшее число по модулю: " + min);
    }
}
