package ua.paladiuc.hw3;
/*
 Удалить из строки пробелы и определить, является ли она перевертышем (палиндромом)

Например, задание 2:
• Считать строку из консоли.
• Передать в метод, который удалит из нее все пробелы.
• Передать строку без пробелов в метод, который определит, является ли она палиндромом
(перевертышем), т.е. одинаково пишется как с начала, так и с конца.
• Вывести результат в main()
 */


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String str = scanner.nextLine();
        String space = withoutSpace(str);
        System.out.println(space);
        System.out.println(isPalindrome(space));
    }

    public static String withoutSpace(String space) {
        space = space.replaceAll(("\\s"), "");
        return space;
    }

    public static boolean isPalindrome(String space) {
        int length = space.length();
        for (int i = 0; i < (length / 2); i++) {
            if (space.charAt(i) != space.charAt(length - i - 1)) {
                System.out.println("Not palindrome");
                return false;
            }
        }
        System.out.println("Palindrome");
        return true;
    }

}
