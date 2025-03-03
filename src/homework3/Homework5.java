package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Homework5 {
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

        IntStream.range(0, mass.length / 2).forEach(i -> {
            int temp = mass[i];
            mass[i] = mass[mass.length - i - 1];
            mass[mass.length - i - 1] = temp;
        });

        System.out.println(Arrays.toString(mass));
        scanner.close();
    }
}


