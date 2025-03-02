package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Введите температуру, что бы узнать погоду на улице:");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t >= -5 && t < 40) {
            System.out.println("Тепло");
        } else if (t >= -20 && t < -5) {
            System.out.println("Нормально");
        } else if (t < -20 && t > -35) {
            System.out.println("Холодно!");
        } else {
            System.out.println("Осторожно, опасная температура");
        }
    }
}
