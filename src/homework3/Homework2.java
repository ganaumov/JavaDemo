package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 100);
        }
        System.out.println(Arrays.toString(mass));
        int min = mass[0];
        int max = mass[0];

        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
            }
            if (mass[i] < min) {
                min = mass[i];
            }
        }

        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
        scanner.close();
    }
}

