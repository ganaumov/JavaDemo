package homework7;

public class ExceptionHandler {

    public void simpleTryCatch(int a, int b) {
        try {
            System.out.println("Результат деления: " + (a / b));
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }

    public void multipleCatch(String str) {
        try {
            int number = Integer.parseInt(str);
            System.out.println("Число: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный формат числа!");
        } catch (NullPointerException e) {
            System.out.println("Ошибка: передан null вместо строки!");
        }
    }

    public void multiCatch(String str, int divisor) {
        try {
            int number = Integer.parseInt(str);
            System.out.println("Результат: " + (number / divisor));
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Ошибка при преобразовании строки в число!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль!");
        }
    }

    public void tryCatchFinally(String fileName) {
        java.io.FileWriter writer = null;
        try {
            writer = new java.io.FileWriter(fileName);
            writer.write("Пример записи в файл");
        } catch (java.io.IOException e) {
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (java.io.IOException e) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }

    public static void main(String[] args) {
        ExceptionHandler handler = new ExceptionHandler();

        System.out.println("1.try-catch:");
        handler.simpleTryCatch(10, 0);

        System.out.println("2.Try-catch blocks:");
        handler.multipleCatch("abc");

        System.out.println("3. Try-catch multi-catch:");
        handler.multiCatch("123", 0);

        System.out.println("4. Try-catch-finally:");
        handler.tryCatchFinally("example.txt");
    }
}

