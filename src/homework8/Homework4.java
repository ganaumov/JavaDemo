package homework8;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка 1:");
        String str1 = scanner.nextLine();
        System.out.println("Строка 2:");
        String str2 = scanner.nextLine();
        System.out.println("Строка 3:");
        String str3 = scanner.nextLine();

        String result = " ";

        if (check(str1)) {
            result = str1;
        } else if (check(str2)) {
            result = str2;
        } else if (check(str3)) {
            result = str3;
        }

        if (!result.isEmpty()) {
            System.out.println("Слово с различными символами: " + result);
        } else {
            System.out.println("Слов с различными символами не найдено");
        }
    }

    public static boolean check(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

