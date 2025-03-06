package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework1 {

    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] mass = new int[size];
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 100);
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