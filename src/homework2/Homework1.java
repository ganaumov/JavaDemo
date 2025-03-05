package homework2;

//задание 1

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int c = a % 2;
        if (c == 0) {
            System.out.println("Число четное");
        } else System.out.println("Число не яляется четным");
        scanner.close();

    }
}
