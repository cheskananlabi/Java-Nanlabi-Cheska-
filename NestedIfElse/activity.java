package NestedIfElse;

import java.util.Scanner;   

public class activity {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("MENU");
    System.out.println("1. Meal");
    System.out.println("2. Drinks");
    System.out.println("3. Dessert");
    System.out.print("Enter your choice (1-3): ");

    switch (scanner.nextLine()) {
        case "1":
            System.out.println("You selected Meal.");
            break;

                switch (scanner.nextLine()) {
                    case "1":
                        System.out.println("You selected Breakfast.");
                        break;
                    case "2":
                        System.out.println("You selected Lunch.");
                        break;
                    case "3":
                        System.out.println("You selected Dinner.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }
                    
        case "2":
            System.out.println("You selected Drinks.");
            break;

                switch (scanner.nextLine()) {
                    case "1":
                        System.out.println("You selected Soft Drinks.");
                        break;
                    case "2":
                        System.out.println("You selected Juice.");
                        break;
                    case "3":
                        System.out.println("You selected Water.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }

        case "3":
            System.out.println("You selected Dessert.");
            break;

                switch (scanner.nextLine()) {
                    case "1":
                        System.out.println("You selected Ice Cream.");
                        break;
                    case "2":
                        System.out.println("You selected Cake.");
                        break;
                    case "3":
                        System.out.println("You selected Pie.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid option.");
                }

        default:
            System.out.println("Invalid choice. Please select a valid option.");
    }
}
    scanner.close();
}

