package ua.paladiuc.hw3;
/*
Подсчитать количество слов в строке
• Вводится строка, состоящая из слов, разделенных пробелами. Требуется посчитать количество
слов в ней.
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text");
        String text = scanner.nextLine();
        String space = withoutSpace(text.trim());
        System.out.println(space);
        System.out.println("You entered " + wordsCount(space) + " words");
    }

    public static int wordsCount(String wordcount) {
        int count = 0;
        if (!wordcount.isBlank()) {
            count++;
            for (int i = 0; i < wordcount.length(); i++) {
                if (wordcount.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    public static String withoutSpace(String space) {
        space = space.replaceAll("\\s{2,}", " ");
        return space;
    }
}
