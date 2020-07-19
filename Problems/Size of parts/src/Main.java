import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int maxLoop = scan.nextInt();

        int fix = 0;
        int no = 0;
        int good = 0;

        for (int i = 0; i < maxLoop; i++) {
            int value = scan.nextInt();
            if (value == 1) {
                fix = fix + 1;
            } else if (value == -1) {
                no = no + 1;
            } else {
                good = good + 1;
            }
        }

        System.out.print(good + " " + fix + " " + no);
    }
}