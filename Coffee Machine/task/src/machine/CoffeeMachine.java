package machine;

import java.util.Scanner;

public class CoffeeMachine {
    int water = 400;
    int milk = 540;
    int coffeeBeans = 120;
    int disposableCups = 9;
    int money = 550;

    public String toString() {
        return "The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                coffeeBeans + " of coffee beans\n" +
                disposableCups + " of disposable cups\n" +
                money + " of money";
    }

    public void buy() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String select;
        select = scanner.nextLine();
        switch (select) {
            case "1":
                if (water < 250 || coffeeBeans < 16 || disposableCups < 1) {
                    System.out.println("Not enough ingredients");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                water -= 250;
                coffeeBeans -= 16;
                money += 4;
                disposableCups--;
                break;
            case "2":
                if (water < 350 || milk < 75 || coffeeBeans < 20 || disposableCups < 1) {
                    System.out.println("Not enough ingredients");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                water -= 350;
                milk -= 75;
                coffeeBeans -= 20;
                money += 7;
                disposableCups--;
                break;
            case "3":
                if (water < 200 || milk < 100 || coffeeBeans < 12 || disposableCups < 1) {
                    System.out.println("Not enough ingredients");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                water -= 200;
                milk -= 100;
                coffeeBeans -= 12;
                money += 6;
                disposableCups--;
                break;
            case "back":
                break;
            }
        }
    public void fill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        water += addWater;
        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scanner.nextInt();
        milk += addMilk;
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffee = scanner.nextInt();
        coffeeBeans += addCoffee;
        System.out.println("Write how many disposable cups of coffee do you want to add");
        int addDisCups = scanner.nextInt();
        disposableCups += addDisCups;
        System.out.println();
    }
    public void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit) {
            System.out.println();
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.nextLine();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    System.out.println(toString());
                    break;
                case "exit":
                    exit = true;
                    break;
                default:
                    System.out.println("Wrong input. Try again");
                    break;
            }
        }


    }

    public static void main(String[] args) {
        CoffeeMachine cm = new CoffeeMachine();
        cm.start();



    }
}
