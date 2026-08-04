package Loop;

import java.util.Scanner;

public class loopsactivity {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // SERVE 5 CUSTOMERS
        for (int customer = 1; customer <= 5; customer++) {

            // Reset order for every customer
            String meal = "None";
            String drink = "None";
            String dessert = "None";

            int mealPrice = 0;
            int drinkPrice = 0;
            int dessertPrice = 0;

            boolean orderMore;

            System.out.println("\n==============================");
            System.out.println("       CUSTOMER " + customer);
            System.out.println("==============================");

            do {

                orderMore = false;

                System.out.println("\n===== MENU =====");
                System.out.println("1. Meal");
                System.out.println("2. Drink");
                System.out.println("3. Dessert");
                System.out.print("Enter choice: ");
                int choice = input.nextInt();

                switch (choice) {

                    // ===================== MEAL =====================
                    case 1:

                        boolean anotherMeal;

                        do {

                            System.out.println("\n------ MEALS ------");
                            System.out.println("1. Tapsilog - 80");
                            System.out.println("2. Tocilog - 65");
                            System.out.println("3. Hotsilog - 45");
                            System.out.println("4. Longsilog - 55");
                            System.out.println("5. Chicksilog - 70");
                            System.out.println("6. Porksilog - 85");
                            System.out.print("Choose meal: ");
                            int mealChoice = input.nextInt();

                            switch (mealChoice) {
                                case 1:
                                    meal = "Tapsilog";
                                    mealPrice += 80;
                                    break;
                                case 2:
                                    meal = "Tocilog";
                                    mealPrice += 65;
                                    break;
                                case 3:
                                    meal = "Hotsilog";
                                    mealPrice += 45;
                                    break;
                                case 4:
                                    meal = "Longsilog";
                                    mealPrice += 55;
                                    break;
                                case 5:
                                    meal = "Chicksilog";
                                    mealPrice += 70;
                                    break;
                                case 6:
                                    meal = "Porksilog";
                                    mealPrice += 85;
                                    break;
                                default:
                                    System.out.println("Invalid meal.");
                            }

                            System.out.print("Would you like another meal? (Y/N): ");
                            char ansMeal = input.next().charAt(0);

                            anotherMeal = (ansMeal == 'Y' || ansMeal == 'y');

                        } while (anotherMeal);

                        break;

                    // ===================== DRINK =====================
                    case 2:

                        boolean anotherDrink;

                        do {

                            System.out.println("\n------ DRINKS ------");
                            System.out.println("1. Coke - 25");
                            System.out.println("2. Sprite - 25");
                            System.out.println("3. Royal - 25");
                            System.out.println("4. Coffee - 30");
                            System.out.println("5. Fruit Shake - 50");
                            System.out.println("6. Juice - 40");
                            System.out.print("Choose drink: ");
                            int drinkChoice = input.nextInt();

                            switch (drinkChoice) {
                                case 1:
                                    drink = "Coke";
                                    drinkPrice += 25;
                                    break;
                                case 2:
                                    drink = "Sprite";
                                    drinkPrice += 25;
                                    break;
                                case 3:
                                    drink = "Royal";
                                    drinkPrice += 25;
                                    break;
                                case 4:
                                    drink = "Coffee";
                                    drinkPrice += 30;
                                    break;
                                case 5:
                                    drink = "Fruit Shake";
                                    drinkPrice += 50;
                                    break;
                                case 6:
                                    drink = "Juice";
                                    drinkPrice += 40;
                                    break;
                                default:
                                    System.out.println("Invalid drink.");
                            }

                            System.out.print("Would you like another drink? (Y/N): ");
                            char ansDrink = input.next().charAt(0);

                            anotherDrink = (ansDrink == 'Y' || ansDrink == 'y');

                        } while (anotherDrink);

                        break;

                    // ===================== DESSERT =====================
                    case 3:

                        boolean anotherDessert;

                        do {

                            System.out.println("\n------ DESSERTS ------");
                            System.out.println("1. Cake - 60");
                            System.out.println("2. Ice Cream - 35");
                            System.out.println("3. Pudding - 40");
                            System.out.println("4. Halo-Halo - 50");
                            System.out.println("5. Cookies - 20");
                            System.out.print("Choose dessert: ");
                            int dessertChoice = input.nextInt();

                            switch (dessertChoice) {
                                case 1:
                                    dessert = "Cake";
                                    dessertPrice += 60;
                                    break;
                                case 2:
                                    dessert = "Ice Cream";
                                    dessertPrice += 35;
                                    break;
                                case 3:
                                    dessert = "Pudding";
                                    dessertPrice += 40;
                                    break;
                                case 4:
                                    dessert = "Halo-Halo";
                                    dessertPrice += 50;
                                    break;
                                case 5:
                                    dessert = "Cookies";
                                    dessertPrice += 20;
                                    break;
                                default:
                                    System.out.println("Invalid dessert.");
                            }

                            System.out.print("Would you like another dessert? (Y/N): ");
                            char ansDessert = input.next().charAt(0);

                            anotherDessert = (ansDessert == 'Y' || ansDessert == 'y');

                        } while (anotherDessert);

                        break;

                    default:
                        System.out.println("Invalid choice.");
                }

                System.out.print("\nWould you like to order anything else? (Y/N): ");
                char ans = input.next().charAt(0);

                if (ans == 'Y' || ans == 'y') {
                    orderMore = true;
                }

            } while (orderMore);

            int total = mealPrice + drinkPrice + dessertPrice;

            System.out.println("\n========== RECEIPT ==========");
            System.out.println("Customer : " + customer);
            System.out.println("-----------------------------");
            System.out.println("Meal     : " + meal);
            System.out.println("Drink    : " + drink);
            System.out.println("Dessert  : " + dessert);
            System.out.println("-----------------------------");
            System.out.println("Total    : " + total + " PHP");

            System.out.print("\nEnter Payment: ");
            int payment = input.nextInt();

            if (payment >= total) {

                int change = payment - total;

                System.out.println("\nPayment Accepted!");
                System.out.println("Change: " + change + " PHP");
                System.out.println("Please wait for your order.");
                System.out.println("Thank you!");

            } else {

                System.out.println("\nInsufficient payment.");
                System.out.println("You still need " + (total - payment) + " PHP.");
            }
        }

        input.close();
    }
}