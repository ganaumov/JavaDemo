package homework8;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка 1:");
        String str1 = scanner.nextLine();
        System.out.println("Строка 2:");
        String str2 = scanner.nextLine();
        System.out.println("Строка 3:");
        String str3 = scanner.nextLine();

        String longest = str1;
        String shortest = str1;

        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }

        System.out.println("Длинная строка: " + longest);
        System.out.println("Короткая строка: " + shortest);
    }
}
