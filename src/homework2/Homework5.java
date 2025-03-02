package homework2;

//задание 5

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            System.out.println(sum += i);
        }
        if (a < 0) {
            System.out.println("Введенное число не подходит!");
        }
    }
}
