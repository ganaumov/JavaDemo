package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3 {
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
        Arrays.sort(mass);
        int min = mass[0];
        int max = mass[mass.length - 1];

        int minIndex = Arrays.binarySearch(mass, min);
        int maxIndex = Arrays.binarySearch(mass, max);

        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
        System.out.println("Минимальный индекс " + minIndex);
        System.out.println("Максимальный индекс " + maxIndex);
        scanner.close();
    }
}