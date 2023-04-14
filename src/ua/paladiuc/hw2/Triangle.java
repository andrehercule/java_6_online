package ua.paladiuc.hw2;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значение x1: ");
        double x1 = sc.nextDouble();
        System.out.println("Введите значение x2: ");
        double x2 = sc.nextDouble();
        System.out.println("Введите значение x3: ");
        double x3 = sc.nextDouble();
        System.out.println("Введите значение y1: ");
        double y1 = sc.nextDouble();
        System.out.println("Введите значение y2: ");
        double y2 = sc.nextDouble();
        System.out.println("Введите значение y3: ");
        double y3 = sc.nextDouble();

        triangleSquare(x1, x2, x3, y1, y2, y3);
    }

    public static void triangleSquare(double num1, double num2, double num3, double num4, double num5, double num6) {
        double a = Math.sqrt((num1 - num2) * (num1 - num2) + (num4 - num5) * (num4 - num5));
        double b = Math.sqrt((num1 - num3) * (num1 - num3) + (num4 - num6) * (num4 - num6));
        double c = Math.sqrt((num2 - num3) * (num2 - num3) + (num5 - num6) * (num5 - num6));
        double p = (a + b + c) / 2.0;
        double square = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Площадь треугольника : " + square);
    }
}
