package homework4;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        char[][] array = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = ' ';
            }
        }
        System.out.println("Игра крестики-нолики, ячейки в поле 3х3");
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (count < 9) {
            System.out.println("Введите символ (X или O):");
            char symbol = scanner.next().charAt(0);
            if (symbol != 'X' && symbol != 'O') {
                System.out.println("Недопустимый символ. Введите 'X' или 'O'.");
                continue;
            }
            System.out.println("Введите номер строки и столбца (0-2):");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Неверный ввод. Введите значения от 0 до 2.");
                continue;
            }
            if (array[row][col] == ' ') {
                array[row][col] = symbol;
                count++;
                printArray(array);
                if (checkWin(array, symbol)) {
                    System.out.println("Победа");
                    return;
                }
            } else {
                System.out.println("Эта ячейка занята.");
            }
        }

        System.out.println("Ничья");
    }

    public static void printArray(char[][] array) {
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + array[i][j] + " ");
                if (j < 2) {
                    System.out.print(" ");
                }
            }
            System.out.print(" ");
            if (i < 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static boolean checkWin(char[][] array, char symbol) {
        for (int i = 0; i < 3; i++) {
            if ((array[i][0] == symbol && array[i][1] == symbol && array[i][2] == symbol) ||
                    (array[0][i] == symbol && array[1][i] == symbol && array[2][i] == symbol)) {
                return true;
            }

            if (array[0][0] == symbol && array[1][1] == symbol && array[2][2] == symbol) {
                return true;
            }
            if (array[0][2] == symbol && array[1][1] == symbol && array[2][0] == symbol) {
                return true;
            }
        }
        return false;
    }
}