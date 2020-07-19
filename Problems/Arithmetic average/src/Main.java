import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        double sum = 0;
        int howMuch = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
                howMuch = howMuch + 1;
            }
        }

        System.out.println(sum/howMuch);
    }
}