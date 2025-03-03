package homework3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework1_2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            mass[i] = scanner.nextInt();
        }

        System.out.println("Массив в прямом порядке:");
        System.out.println(Arrays.toString(mass));

        System.out.println("Массив в обратном порядке:");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i] + " ");
        }
        scanner.close();
    }
}

