package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 10);
        }
        System.out.println(Arrays.toString(mass));

        int min = mass[0];
        int max = mass[0];
        int zeroCount = 0;
        if (zeroCount > 0) {
            System.out.println("Нулевых элементов: " + zeroCount);
        } else {
            System.out.println("Нулевых элементов в нет");
        }
        scanner.close();
    }
}

