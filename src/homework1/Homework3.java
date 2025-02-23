package homework1;

public class Homework3 {

    public static void main(String[] args) {
        int n = 126;
        int a = n % 10;
        int b = n / 10 % 10;
        int c = n / 100 % 10;
        System.out.println(a + b + c);
    }
}
