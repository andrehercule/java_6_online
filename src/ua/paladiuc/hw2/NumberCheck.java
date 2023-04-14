package ua.paladiuc.hw2;

public class NumberCheck {
    public static void main(String[] args) {
        int num = (int) ((Math.random() * 1000) + 1);
        System.out.println(num);

        NumberCheck.checkEven(num);
    }

    public static void checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }
}
