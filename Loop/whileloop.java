package Loop;

import java.util.Scanner;

public class whileloop {
    
public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         String anotherCustomer;

         boolean reorder = false;
        
        do {
            System.out.println("\n================================");
            System.out.println("      WELCOME TO THE CANTEEN");
            System.out.println("================================");
            System.out.println("MENU");
            System.out.println("1. Fried Chicken with Rice - PHP 50");
            System.out.println("2. Spaghetti               - PHP 30");
            System.out.println("3. Menudo                  - PHP 50");
            System.out.println("Enter your order (in number or name)");
                int total = 0;

            // Order up to 3 items
            String food2 = scanner.nextLine().trim();

                switch (food2) {
                    case "1":
                    case "Fried Chicken with Rice":
                    case "fried chicken with rice":
                        System.out.println("Fried Chicken with Rice - PHP 50");
                        total += 50;
                        break;

                    case "2":
                    case "Spaghetti":
                    case "spaghetti":
                        System.out.println("Spaghetti - PHP 30");
                        total += 30;
                        break;

                    case "3":
                    case "Menudo":
                    case "menudo":
                        System.out.println("Menudo - PHP 50");
                        total += 50;
                        break;

                    default:
                        System.out.println("Invalid item.");

                }
            
                System.out.print("Do you want to order another item? (Y/N): ");
                    String ans = scanner.nextLine();

                    if (ans.equalsIgnoreCase("yes") || ans.equalsIgnoreCase("y")) {
                           reorder = true;
                    } else {
                           reorder = false;
                    } while (reorder);

            System.out.println("\nTotal Amount: PHP " + total);
            System.out.print("Enter Payment: PHP ");
            double payment = scanner.nextDouble();
            scanner.nextLine();

            if (payment < total) {
                System.out.println("Insufficient payment!");
                System.out.println("Balance: PHP " + (total - payment));
            } else if (payment == total) {
                System.out.println("Payment successful!");
                System.out.println("No change.");
            } else {
                System.out.println("Payment successful!");
                System.out.println("Change: PHP " + (payment - total));
            }

            System.out.print("\nNext another customer? (Y/N): ");
            anotherCustomer = scanner.nextLine();

        } while (anotherCustomer.equalsIgnoreCase("Y"));

        System.out.println("\nThank you for using the Canteen Ordering System!");
        scanner.close();
    
        }
    }