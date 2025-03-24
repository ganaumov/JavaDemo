package homework8;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка 1:");
        String str1 = scanner.nextLine();
        System.out.println("Строка 2:");
        String str2 = scanner.nextLine();
        System.out.println("Строка 3:");
        String str3 = scanner.nextLine();

        double averageLength = (str1.length() + str2.length() + str3.length()) / 3.0;

        System.out.println("Средняя длина строк: " + averageLength);

        if (str1.length() < averageLength) {
            System.out.println(str1 + " (длина: " + str1.length() + ")");
        }

        if (str2.length() < averageLength) {
            System.out.println(str2 + " (длина: " + str2.length() + ")");
        }

        if (str3.length() < averageLength) {
            System.out.println(str3 + " (длина: " + str3.length() + ")");
        }
    }
}

