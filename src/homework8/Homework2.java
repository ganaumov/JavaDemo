package homework8;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Строка 1:");
        String str1 = scanner.nextLine();
        System.out.println("Строка 2:");
        String str2 = scanner.nextLine();
        System.out.println("Строка 3:");
        String str3 = scanner.nextLine();

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if (str2.length() > str3.length()) {
            String temp = str2;
            str2 = str3;
            str3 = temp;
        }

        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        System.out.println("Строки по возрастанию:");
        System.out.println(str1 + " " + str1.length());
        System.out.println(str2 + " " + str2.length());
        System.out.println(str3 + " " + str3.length());
    }

}

