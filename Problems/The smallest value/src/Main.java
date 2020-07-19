import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        int n = 0;
        long value = 0;
        while (value <= m) {
            n = n + 1;
            value = factorialUsingForLoop(n);
        }

        System.out.print(n);
    }

    public static long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}