package homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework6 {
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
        boolean flag = true;
        for (int i = 1; i < mass.length; i++) {
            if(mass[i]<=mass[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив возрастающей последовательности");
        } else {
            System.out.println("Массив не возрастающей последовательности");
        }
        scanner.close();
    }
}
