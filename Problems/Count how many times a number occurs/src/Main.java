import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt(); // read the next number of the array
        }

        int response = 0;

        int find = scanner.nextInt();
        for (int raw : array) {
            if (raw == find) {
                response++;
            }
        }
        System.out.println(response);
    }
}