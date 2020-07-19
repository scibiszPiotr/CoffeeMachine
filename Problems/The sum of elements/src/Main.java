import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        boolean value = true;
        while (value) {
            int raw = scanner.nextInt();

            if (raw == 0) {
                value = false;
            }

            sum += raw;
        }

        System.out.println(sum);
    }
}