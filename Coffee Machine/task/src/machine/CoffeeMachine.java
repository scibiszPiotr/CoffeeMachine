package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int water = 400;
    private static int milk = 540;
    private static int coffee = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            printEmptyLine();

            switch (action) {
                case "buy":
                    bayAction(scanner);
                    break;
                case "fill":
                    fillAction(scanner);
                    break;
                case "take":
                    takeAction();
                    break;
                case "remaining":
                    remainingAction();
                    break;
                case "exit":
                    System.exit(0);
                    break;
            }
        }
    }

    private static void printEmptyLine() {
        System.out.println("");
    }

    private static void remainingAction() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println("$" + money + " of money");
        printEmptyLine();
    }

    private static void takeAction() {
        System.out.println("I gave you $" + money);
        money = 0;
        printEmptyLine();
    }

    private static void fillAction(Scanner scanner) {
        System.out.println("Write how many ml of water do you want to add:");
        water = scanner.nextInt() + water;
        System.out.println("Write how many ml of milk do you want to add:");
        milk = scanner.nextInt() + milk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffee = scanner.nextInt() + coffee;
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups = scanner.nextInt() + cups;

        printEmptyLine();
    }

    private static void bayAction(Scanner scanner) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        if (!scanner.hasNextInt()) {
            return;
        }

        int type = scanner.nextInt();

        switch (type) {
            case 1:
                if  (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    printEmptyLine();
                    return;
                }
                if (coffee < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    printEmptyLine();
                    return;
                }
                water = water - 250;
                coffee = coffee - 16;
                money = money + 4;
                break;
            case 2:
                if  (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    printEmptyLine();
                    return;
                }
                if  (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    printEmptyLine();
                    return;
                }
                if (coffee < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    printEmptyLine();
                    return;
                }
                water = water - 350;
                milk = milk - 75;
                coffee= coffee - 20;
                money = money + 7;
                break;
            case 3:
                if  (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    printEmptyLine();
                    return;
                }
                if  (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    printEmptyLine();
                    return;
                }
                if (coffee < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    printEmptyLine();
                    return;
                }
                water = water - 200;
                milk = milk - 100;
                coffee = coffee - 12;
                money = money + 6;
                break;
        }

        cups = cups - 1;

        System.out.println("I have enough resources, making you a coffee!");
        printEmptyLine();
    }
}
