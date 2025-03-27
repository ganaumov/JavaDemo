package homework8;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String result = input.replaceAll(".", "$0$0");

        System.out.println(result);
    }
}
